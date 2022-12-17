<%@ include file="/init.jsp" %>

<%!private static Log _log = LogFactoryUtil.getLog("PedpFormPortlet/view.jsp");%>

<%
List<Pedidos> listaPedido = (List<Pedidos>)renderRequest.getAttribute("listaPedido");

for (Pedidos p: listaPedido){
	double precio = p.getPrecio();
	String precioStr = String.valueOf(precio);
	precioStr = precioStr.replaceAll("\\.", ",");
%>
<div class="container py-4">
			<div class="p-5 mb-4 rounded-3" style="background-color: #9c6b5b;">
				<div class="container-fluid py-5">
					<h1 class="display-5 fw-bold"><liferay-ui:message key="detallePedido.encabezado" /> #<%=p.getId()%></h1>
					<p class="col-md-8 fs-4"><b><liferay-ui:message key="detallePedido.descripcion" /></b></p>
					<p class="col-md-8 fs-4"><b><liferay-ui:message key="detallePedido.id" /></b>: <%=p.getId()%></p>
					<h2><b><liferay-ui:message key="detallePedido.encabezado.direccion" /></b></h2>
						<p><%=p.getNombre()%></p>
						<p><%=p.getDireccion()%>, <%=p.getCiudad()%>. <%=p.getCodipoPostal()%><br /> <%=p.getProvincia()%>, <%=p.getPais()%>.</p>

						<h2><b><liferay-ui:message key="detallePedido.encabezado.producto" /></b></h2>
						<p><liferay-ui:message key="detallePedido.precio" />: <%=precioStr%>&euro;</p>
						<p><liferay-ui:message key="detallePedido.cantidad" />: <%=p.getCantidad()%></p>
				</div>
			</div>
		</div>

<%
}
%>
<%-- <%=idUsuario%>
<%=name%>
<%=email%>
<%=amount%> --%>