<%@ include file="/init.jsp" %>

<h2>
	<b><liferay-ui:message key="listadotiendas.encabezado"/></b>
</h2>


<% 
List<Tienda> listaTiendas = (List<Tienda>)renderRequest.getAttribute("listaTiendas");
%>

<p>
	<b><liferay-ui:message key="listadotiendas.numero"/>: <%=listaTiendas.size()%></b>
</p>

<%
for (Tienda t: listaTiendas){
	long id = t.getId();
	%>
	
<portlet:renderURL var="mvcdetalleTienda">
	<portlet:param name="mvcRenderCommandName" value="/tienda/detalle" />
	<portlet:param name="id" value="<%=String.valueOf(id)%>" />
</portlet:renderURL>


<div class="container mt-5 mb-3">
<div class="row">
    <div class="col-md-4">
        <div class="card p-3 mb-2">
            <div class="d-flex justify-content-between">
                <div class="d-flex flex-row align-items-center">
                     <div class="ms-2 c-details">
                        <h6 class="mb-0"><%=t.getGerente()%></h6> <span><p><%=t.getCodipoPostal()%></p></span>
                    </div>
                </div>
                <div class="badge"> <span><%=t.getId()%></span> </div>
            </div>
            <div class="mt-5">
                <h3 class="heading"><a href="${mvcdetalleTienda}"><%=t.getNombre()%></a></h3>
	           	<p><%=t.getDireccion()%>, <%=t.getCiudad()%>. <br /> <%=t.getProvincia()%>, <%=t.getPais()%>.</p>
            </div>
        </div>
    </div>
</div>
</div>
<%
}
%>