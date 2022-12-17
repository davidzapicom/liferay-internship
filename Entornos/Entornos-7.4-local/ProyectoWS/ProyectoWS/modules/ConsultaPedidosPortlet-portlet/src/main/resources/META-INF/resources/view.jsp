<%@ include file="/init.jsp" %>

<% 
List<Pedidos> listaPedidos = (List<Pedidos>)renderRequest.getAttribute("listaPedidos");
%>

<h2>
	<b><%=listaPedidos.size()%> <liferay-ui:message key="listadoPedido.encabezado"/><% if (listaPedidos.size() != 1) {%><liferay-ui:message key="listadoPedidos.encabezado"/><%}%></b>
</h2>


<%
for (Pedidos p: listaPedidos){
	long id = p.getId();
	double precio = p.getPrecio();
	String precioStr = String.valueOf(precio);
	precioStr = precioStr.replaceAll("\\.", ",");
	%>
	
<portlet:renderURL var="mvcdetallePedido">
	<portlet:param name="mvcRenderCommandName" value="/pedido/detalle" />
	<portlet:param name="id" value="<%=String.valueOf(id)%>" />
</portlet:renderURL>


<div class="container mt-5 mb-3">
<div class="row">
    <div class="col-md-4">
        <div class="card p-3 mb-2">
            <div class="d-flex justify-content-between">
                <div class="d-flex flex-row align-items-center">
                     <div class="ms-2 c-details">
                        <h6 class="mb-0">#<%=p.getId()%></h6> <span><p><a href="mailto:<%=p.getEmail()%>"><%=p.getEmail()%></a></p></span>
                    </div>
                </div>
                <div class="badge"> <span><%=precioStr%>&euro;</span> </div>
            </div>
            <div class="mt-5">
                <h3 class="heading"><a href="${mvcdetallePedido}"><%=p.getNombre()%></a></h3>
	           	<p><%=p.getVia()%>/<%=p.getDireccion()%>, <%=p.getCiudad()%>. <br /> <%=p.getProvincia()%>, <%=p.getPais()%>.</p>
            </div>
        </div>
    </div>
</div>
</div>
<%
}
%>