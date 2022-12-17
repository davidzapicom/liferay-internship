<%@ include file="/init.jsp"%>

<% 
String name = ParamUtil.getString(request,"name","");
String email = ParamUtil.getString(request,"email","");
String selectMotivo = ParamUtil.getString(request,"selectMotivo","");
String message = ParamUtil.getString(request,"message","");
 %>

<portlet:renderURL var="mvcEnviarPedidoFormRender">
	<portlet:param name="mvcRenderCommandName" value="/pedido" />
	<portlet:param name="id" value="<%=name%>" />
</portlet:renderURL>

<h2 class="mt-5">
	<b><liferay-ui:message key="contactform.encabezado" /></b>
</h2>

<form action="${mvcEnviarPedidoFormRender}" method="POST">
	<div class="row mb-4">
		<div class="col">
			<label class="form-label" for="<portlet:namespace />name"><liferay-ui:message key="contactform.nombre" /> <span class="required"></span> 
			<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio" /></span></label> 
			<input type="text" class="form-control" id="<portlet:namespace />name" name="<portlet:namespace />name" value="<%= name %>" required="true" />
		</div>
		<div class="col">
			<label class="form-label" for="<portlet:namespace />email"><liferay-ui:message key="contactform.email" /> <span class="required"></span> 
			<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio" /></span></label> 
			<input type="text" class="form-control" id="<portlet:namespace />email" name="<portlet:namespace />email" value="<%= email %>" required="true" />
		</div>
	</div>
	<div class="row mb-4">
		<label class="form-label ml-2" for="<portlet:namespace />selectMotivo"><liferay-ui:message key="contactform.selectMotivo" />: <span class="required"></span> 
		<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio" /></span></label> 
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectMotivo" name="<portlet:namespace />selectMotivo" required="true">
			<option value="<liferay-ui:message key="contactform.selectMotivo.option1" />"><liferay-ui:message key="contactform.selectMotivo.option1" /></option>
			<option value="<liferay-ui:message key="contactform.selectMotivo.option2" />"><liferay-ui:message key="contactform.selectMotivo.option2" /></option>
			<option value="<liferay-ui:message key="contactform.selectMotivo.option3" />"><liferay-ui:message key="contactform.selectMotivo.option3" /></option>
		</select>
	</div>
	<div class="row mb-4">
		<div class="col">
			<label class="form-label" for="<portlet:namespace />message"><liferay-ui:message key="contactform.mensaje" /> <span class="required"></span> 
			<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio" /></span></label> 
			<textarea class="form-control" id="<portlet:namespace />email" name="<portlet:namespace />message" value="<%= message %>" rows="3" required="true"></textarea>
		</div>
	</div>
	<button type="submit" class="btn btn-outline-primary"><liferay-ui:message key="contactform.button.enviar" /></button>
</form>

<liferay-ui:success key="mensajeEnviado" message="contactform.alerta.enviar.success" />
<liferay-ui:error key="mensajeNoEnviado" message="contactform.alerta.enviar.error" />

<script>
$(document).ready(function(){
	$('#<portlet:namespace />selectMotivo').on('change', function() {
		var idProvinciaDefecto = document.getElementById("<portlet:namespace />selectMotivo").options[0].value;
    })
});
</script>