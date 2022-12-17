<%@ include file="/init.jsp"%>

<%
	long idPedido = ParamUtil.getLong(renderRequest, "id");
	Pedidos objPedido = (Pedidos) renderRequest.getAttribute("objPedido");

	if (objPedido == null) {
%>
<liferay-ui:error key="notFound" message="detallePedido.error.notfound" />
<%
	} else {
		
		double precio = objPedido.getPrecio();
		String precioStr = String.valueOf(precio);
		precioStr = precioStr.replaceAll("\\.", ",");
		%>
		<div class="container py-4">
			<div class="p-5 mb-4 bg-light rounded-3">
				<div class="container-fluid py-5">
					<h1 class="display-5 fw-bold"><liferay-ui:message key="detallePedido.encabezado" /> #<%=objPedido.getId()%></h1>
					<p class="col-md-8 fs-4"><b><liferay-ui:message key="detallePedido.descripcion" /></b></p>
					<p class="col-md-8 fs-4"><b><liferay-ui:message key="detallePedido.id" /></b>: <%=objPedido.getId()%></p>
				</div>
			</div>
			<div class="row align-items-md-stretch">
				<div class="col-md-6">
					<div class="h-100 pt-3 pl-3 text-white bg-dark rounded-3">
						<h2><b><liferay-ui:message key="detallePedido.encabezado.direccion" /></b></h2>
						<p><%=objPedido.getNombre()%></p>
						<p><%=objPedido.getDireccion()%>, <%=objPedido.getCiudad()%>. <%=objPedido.getCodipoPostal()%><br /> <%=objPedido.getProvincia()%>, <%=objPedido.getPais()%>.</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="h-80 pt-3 pl-3 bg-light border rounded-3">
						<h2><b><liferay-ui:message key="detallePedido.encabezado.producto" /></b></h2>
						<p><liferay-ui:message key="detallePedido.precio" />: <%=precioStr%>&euro;</p>
						<p><liferay-ui:message key="detallePedido.cantidad" />: <%=objPedido.getCantidad()%></p>
					</div>
				</div>
			</div>
		</div>
		<%
	}
%>

