<%@ include file="/init.jsp"%>

<h2>
	<b><liferay-ui:message key="detalletienda.encabezado" /></b>
</h2>


<%
	long idTienda = ParamUtil.getLong(renderRequest, "id");
	Tienda objTienda = (Tienda) renderRequest.getAttribute("objTienda");

	if (objTienda == null) {
%>
<liferay-ui:error key="notFound" message="detalletienda.error.notfound" />
<%
	} else {
		%>
		<div class="container py-4">
			<div class="p-5 mb-4 bg-light rounded-3">
				<div class="container-fluid py-5">
					<h1 class="display-5 fw-bold"><%=objTienda.getNombre()%></h1>
					<p class="col-md-8 fs-4"><b><liferay-ui:message key="detalletienda.descripcion" /></b></p>
					<p class="col-md-8 fs-4"><b><liferay-ui:message key="detalletienda.id" /></b>: <%=objTienda.getId()%></p>
				</div>
			</div>
			<div class="row align-items-md-stretch">
				<div class="col-md-6">
					<div class="h-100 pt-3 pl-3 text-white bg-dark rounded-3">
						<h2><b><liferay-ui:message key="detalletienda.encabezado.direccion" /></b></h2>
						<p><%=objTienda.getDireccion()%>, <%=objTienda.getCiudad()%>. <%=objTienda.getCodipoPostal()%><br /> <%=objTienda.getProvincia()%>, <%=objTienda.getPais()%>.</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="h-80 pt-3 pl-3 bg-light border rounded-3">
						<h2><b><liferay-ui:message key="detalletienda.encabezado.manager" /></b></h2>
						<p><%=objTienda.getGerente()%></p>
					</div>
				</div>
			</div>
		</div>
		<%
	}
%>

