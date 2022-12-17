<%@ include file="/init.jsp" %>

<%!private static Log _log = LogFactoryUtil.getLog("PedidoFormPortlet/view.jsp");%>

<%
long idUsuario = themeDisplay.getUserId();

String stock = (String) request.getAttribute("stock");
String precio = (String) request.getAttribute("precio");

_log.info("Stock: " +stock+ "| Precio: " +precio);

String name = ParamUtil.getString(request,"name",""); 
String email = ParamUtil.getString(request,"email","");
String selectVia = ParamUtil.getString(request,"selectVia","");
String address = ParamUtil.getString(request,"address","");
String codigoPostal = ParamUtil.getString(request,"codigoPostal","");
String selectPaises = ParamUtil.getString(request,"selectPaises","");
String selectProvincias = ParamUtil.getString(request,"selectProvincias","");
String selectCiudades = ParamUtil.getString(request,"selectCiudades","");
int amount = ParamUtil.getInteger(request, "amount", 1);
%>


<portlet:resourceURL id="/pedido/via" var="mvcSelectViaResource"/>
<portlet:resourceURL id="/pedido/pais" var="mvcSelectPaisResource"/>
<portlet:resourceURL id="/pedido/provincia" var="mvcSelectProvinciaResource"/>
<portlet:resourceURL id="/pedido/ciudad" var="mvcSelectCiudadResource"/>
<portlet:actionURL name="/pedido/tramitar" var="mvcEnviarFormAction"/>

<h3>
	<b><liferay-ui:message key="pedidoform.encabezado"/></b>
</h3>
<%=precio%>
<%=stock%>

<liferay-ui:success key="pedidoRealizado" message="pedidoform.alerta.success" />
<liferay-ui:error key="pedidoError" message="pedidoform.alerta.error" />

<form action="${mvcEnviarFormAction}" method="POST">
<input type="hidden" id="<portlet:namespace />idUsuario" name="<portlet:namespace />idUsuario" value="<%=idUsuario%>"/>
<input type="hidden" id="<portlet:namespace />stock" name="<portlet:namespace />stock" value="<%=stock%>"/>
<input type="hidden" id="<portlet:namespace />precio" name="<portlet:namespace />precio" value="<%=precio%>"/>
  <div class="row mb-4">
    <div class="col">
      <label class="form-label" for="<portlet:namespace />name"><liferay-ui:message key="pedidoform.input.nombre"/> 
      	<span class="required"></span>
       	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label> 
        <input type="text" class="form-control" id="<portlet:namespace />name" name="<portlet:namespace />name" value="<%=name%>" required="true" />
    </div>
    <div class="col">
      <label class="form-label" for="<portlet:namespace />email"><liferay-ui:message key="pedidoform.input.email"/>
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
        <input type="text" class="form-control" id="<portlet:namespace />email" name="<portlet:namespace />email" value="<%=email%>" required="true" />
    </div>
  </div>
  
  <div class="row mb-4">
  	<div class="col">
  	<div class="form-outline">
      <label class="form-label" for="<portlet:namespace />selectVia"><liferay-ui:message key="pedidoform.select.tipoDeVia"/>:
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
        <select class="form-control" id="<portlet:namespace />selectVia" name="<portlet:namespace />selectVia" required="true">
		</select>
    </div>
    </div>
    <div class="col">
  	<div class="form-outline">
      <label class="form-label" for="<portlet:namespace />address"><liferay-ui:message key="pedidoform.input.direccion"/>:
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
        <input type="text" class="form-control" id="<portlet:namespace />address" name="<portlet:namespace />address" value="<%=address%>" required="true" />
    </div>
    </div>
	<div class="col">
  	<div class="form-outline">
      <label class="form-label" for="<portlet:namespace />codigoPostal"><liferay-ui:message key="pedidoform.input.codigoPostal"/>:
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
        <input type="text" class="form-control" id="<portlet:namespace />codigoPostal" name="<portlet:namespace />codigoPostal" value="<%=codigoPostal%>" required="true" />
      </div>
    </div>
	</div> 
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />selectPaises"><liferay-ui:message key="pedidoform.select.pais"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectPaises" name="<portlet:namespace />selectPaises" required="true">
		</select>
	</div>
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />selectProvincias"><liferay-ui:message key="pedidoform.select.provincia"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectProvincias" name="<portlet:namespace />selectProvincias" required="true">
		</select>
	</div>
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />selectCiudades"><liferay-ui:message key="pedidoform.select.ciudad"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectCiudades" name="<portlet:namespace />selectCiudades" required="true">
		</select>
	</div>
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />amount"><liferay-ui:message key="pedidoform.input.cantidad"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="pedidoform.campo-obligatorio"/></span></label>
		 <input type="number" class="form-control ml-2 mr-2" id="<portlet:namespace />amount" name="<portlet:namespace />amount" value="<%=amount%>" min="1" max="<%=stock%>" required="true" />
	</div>
  <button type="submit" class="btn pedido"><liferay-ui:message key="pedidoform.input.tramitarPedido"/></button>
</form>


<script>
$(document).ready(function(){
	<portlet:namespace />cargarVia();
	
	$('#<portlet:namespace />selectPaises').on('change', function() {
    	<portlet:namespace />cargarProvincia(this.value,"");
    });
    
    $('#<portlet:namespace />selectProvincias').on('change', function() {
    	<portlet:namespace />cargarCiudad(this.value,"");
    });
    
    
	var idPais = '<%=selectPaises%>';
	var idProvincia = '<%=selectProvincias%>';
	var idCiudad = '<%=selectCiudades%>';
	console.log("códigos: " +idPais+ " " +idProvincia+ " " +idCiudad);
    
    
	if (idPais != "") {
		<portlet:namespace />cargarPais(idPais);
	} else {
		<portlet:namespace />cargarPais("");
	}
	if (idProvincia != "") {
		<portlet:namespace />cargarProvincia(idPais,idProvincia);
	} else {
		var idPaisDefecto = document.getElementById("<portlet:namespace />selectPaises").options[0].value;
		console.log(idPaisDefecto);
		<portlet:namespace />cargarProvincia(idPaisDefecto,idProvincia);
	}
	if (idCiudad != "") {
		<portlet:namespace />cargarCiudad(idProvincia,idCiudad);
	} else {
		var idProvinciaDefecto = document.getElementById("<portlet:namespace />selectProvincias").options[0].value;
		console.log(idProvinciaDefecto);
		<portlet:namespace />cargarCiudad(idProvinciaDefecto,idCiudad);
	}
});

function <portlet:namespace />cargarVia(){
	console.log("CARGANDO VIAS...");
    $.ajax({
        url : '${mvcSelectViaResource}',
    	async : false,
        type : 'GET',
        dataType : 'json',
    
        success : function(jsonVias) {
        	var select = $("#<portlet:namespace />selectVia");
        	select.empty();
          	
        	for(var i in jsonVias){
         		var opcion = document.createElement('option');
	          	var opcionValue = jsonVias[i].value;
	          	var opcionText = jsonVias[i].option;
	          	opcion.setAttribute("value", opcionValue);
	          	opcion.append(opcionText);
	          	select.append(opcion);
        	} 
        	
            console.log("SUCCESS PAIS"); 
        },
        error : function(xhr, status) {
            alert('Disculpe, existio un problema');
        }     
    });
}

function <portlet:namespace />cargarPais(defaultValue){
    $.ajax({
        url : '${mvcSelectPaisResource}',
    	async : false,
        type : 'GET',
        dataType : 'json',
    
        success : function(jsonPaises) {
        	var select = $("#<portlet:namespace />selectPaises");
        	select.empty();
          	
        	for(var i in jsonPaises){
         		var opcion = document.createElement('option');
	          	var opcionValue = jsonPaises[i].value;
	          	var opcionText = jsonPaises[i].option;
	          	opcion.setAttribute("value", opcionValue);
	          	opcion.append(opcionText);
	          	select.append(opcion);
	          	
	          	if (defaultValue == opcionValue) {
	          		opcion.setAttribute('selected', true);
	          	}
        	} 
        	
            console.log("SUCCESS PAIS"); 
            
        },
        error : function(xhr, status) {
            alert('Disculpe, existio un problema');
        }     
    });
}


function <portlet:namespace />cargarProvincia(idPais, defaultValue){
    console.log("Provincias de: " +idPais+ " " +defaultValue);
    $.ajax({
        url : '${mvcSelectProvinciaResource}',
        async: false,
        type : 'GET',
        data : { <portlet:namespace />pais : idPais },
        dataType : 'json',
        success : function(jsonProvincias) {
            var select = $("#<portlet:namespace />selectProvincias");
            select.empty();
            for(var i in jsonProvincias){
                var opcion = document.createElement('option');
                var opcionValue = jsonProvincias[i].value;
                var opcionText = jsonProvincias[i].option;
                opcion.append(opcionText);
                select.append(opcion);
                
              	//atribute selected cond ? si : no;
	          	if (defaultValue == opcionValue) {
	          		opcion.setAttribute('selected', true);
	          	}
            }
        },
    });
}

function <portlet:namespace />cargarCiudad(idProvincia, defaultValue){
    console.log("Ciudades de: " +idProvincia+ " " +defaultValue);
    $.ajax({
        url : '${mvcSelectCiudadResource}',
        async: false,
        type : 'GET',
        data : { <portlet:namespace />provincia : idProvincia },
        dataType : 'json',
        success : function(jsonCiudades) {
            var select = $("#<portlet:namespace />selectCiudades");
            select.empty();
            for(var i in jsonCiudades){
                var opcion = document.createElement('option');
                var opcionValue = jsonCiudades[i].value;
                var opcionText = jsonCiudades[i].option;
                opcion.append(opcionText);
                select.append(opcion);
                
              	//atribute selected cond ? si : no;
	          	if (defaultValue == opcionValue) {
	          		opcion.setAttribute('selected', true);
	          	}
            }
        },
    });
}
</script>