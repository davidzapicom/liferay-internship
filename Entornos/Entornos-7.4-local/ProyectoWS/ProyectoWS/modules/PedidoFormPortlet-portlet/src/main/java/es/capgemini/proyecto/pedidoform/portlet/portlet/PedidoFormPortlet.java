package es.capgemini.proyecto.pedidoform.portlet.portlet;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.pedidoform.portlet.constants.PedidoFormPortletKeys;

/**
 * @author dzapicom
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=WECANBS",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.css-class-wrapper=pedidoform-portlet", "javax.portlet.display-name=PedidoForm",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PedidoFormPortletKeys.PEDIDOFORM, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class PedidoFormPortlet extends MVCPortlet {
	private static final Log _log = LogFactoryUtil.getLog(PedidoFormPortlet.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		_log.info(td);
		JournalArticle ja = (JournalArticle) renderRequest.getAttribute("INFO_ITEM");
		_log.info(ja);

		// setearString articleId = ja.getArticleId();
		String idProducto = ja.getArticleId();
		renderRequest.setAttribute("idProducto", idProducto);
		_log.info(idProducto);

		// conseguir el content
		String content = ja.getContentByLocale(td.getLanguageId());
		_log.info("Content: " + content);

		// recuperar campos y setear
		String stock = recuperarCampo(idProducto, content, "productStock");
		renderRequest.setAttribute("stock", stock);
		_log.info("Stock: " + stock);

		String precio = recuperarCampo(idProducto, content, "productPrice");
		renderRequest.setAttribute("precio", precio);
		_log.info("Precio: " + precio);

		super.doView(renderRequest, renderResponse);
	}

	public String recuperarCampo(String idProducto, String content, String campo) {
		String resultado = "";
		Document domContenido = null;
		try {
			domContenido = SAXReaderUtil.read(new StringReader(content));
		} catch (DocumentException e) {
			_log.error("Error sax al recuperar contenido de: " + idProducto + " " + e.getMessage());
		}
		List<Node> listaNodosParametros = null;
		Node node = null;
		if (domContenido != null) {
			listaNodosParametros = domContenido.selectNodes("/root/dynamic-element[@field-reference='" + campo + "']");

			for (int i = 0; i < listaNodosParametros.size(); i++) {
				node = listaNodosParametros.get(i)
						.selectSingleNode("/root/dynamic-element[@field-reference='" + campo + "']/dynamic-content");
				if (node != null && node.getText().length() > 0) {
					campo = node.getText();
				} else {
					campo = "";
				}
				resultado = campo;
			}
		}
		listaNodosParametros = null;
		domContenido = null;
		_log.info("Nombre: " + campo + "| Contenido: " + content);
		return resultado;
	}
}