<%@ include file="/init.jsp" %>

<% 
String name = ParamUtil.getString(request,"name","");
String managerName = ParamUtil.getString(request,"managerName","");
String address = ParamUtil.getString(request,"address","");
String codigoPostal = ParamUtil.getString(request,"codigoPostal","");
String selectPaises = ParamUtil.getString(request,"selectPaises","");
String selectProvincias = ParamUtil.getString(request,"selectProvincias","");
String selectCiudades = ParamUtil.getString(request,"selectCiudades","");
 %>


<portlet:resourceURL id="/tienda/pais" var="mvcselectPaisResourceCommandUrl"/>
<portlet:resourceURL id="/tienda/provincia" var="mvcselectProvinciaResourceCommandUrl"/>
<portlet:resourceURL id="/tienda/ciudad" var="mvcselectCiudadResourceCommandUrl"/>
<portlet:actionURL name="/tienda/insertar" var="mvcenviarFormActionCommandUrl" />


<h3>
<b><liferay-ui:message key="tiendas.encabezado-alta"/></b>
</h3>

<form action="${mvcenviarFormActionCommandUrl}" method="POST" id="forml">
  <div class="row mb-4">
    <div class="col">
      <label class="form-label" for="<portlet:namespace />name"><liferay-ui:message key="tiendas.nombre"/> 
      	<span class="required"></span>
       	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label> 
        <input type="text" class="form-control" id="<portlet:namespace />name" name="<portlet:namespace />name" value="<%=name /* == null ? " " : name */%>" required="true" />
    </div>
    <div class="col">
      <label class="form-label" for="<portlet:namespace />managerName"><liferay-ui:message key="tiendas.nombre-gerente"/>
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label>
        <input type="text" class="form-control" id="<portlet:namespace />managerName" name="<portlet:namespace />managerName" value="<%=managerName /* == null ? " " : managerName */%>" required="true" />
    </div>
  </div>
  
  <div class="row mb-4">
    <div class="col">
  	<div class="form-outline">
      <label class="form-label" for="<portlet:namespace />address"><liferay-ui:message key="tiendas.direccion"/>
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label>
        <input type="text" class="form-control" id="<portlet:namespace />address" name="<portlet:namespace />address" value="<%=address /* == null ? " " : address */%>" required="true" />
    </div>
    </div>
	<div class="col">
  	<div class="form-outline">
      <label class="form-label" for="<portlet:namespace />codigoPostal"><liferay-ui:message key="tiendas.cp"/>
      <span class="required"></span>
      	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label>
        <input type="text" class="form-control" id="<portlet:namespace />codigoPostal" name="<portlet:namespace />codigoPostal" value="<%=codigoPostal /* == null ? " " : codigoPostal */%>" required="true" />
      </div>
    </div>
	</div> 
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />selectPaises"><liferay-ui:message key="tiendas.selectPaises"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label>
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectPaises" name="<portlet:namespace />selectPaises" required="true">
		</select>
	</div>
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />selectProvincias"><liferay-ui:message key="tiendas.selectProvincias"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label>
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectProvincias" name="<portlet:namespace />selectProvincias" required="true">
		</select>
	</div>
	<div class="row mb-4">
	<label class="form-label ml-2" for="<portlet:namespace />selectCiudades"><liferay-ui:message key="tiendas.selectCiudades"/>:
	<span class="required"></span>
	<span class="sr-only"><liferay-ui:message key="tiendas.campo-obligatorio"/></span></label>
		<select class="form-control ml-2 mr-2" id="<portlet:namespace />selectCiudades" name="<portlet:namespace />selectCiudades" required="true">
		</select>
	</div>
  <button type="submit" class="btn btn-outline-primary" onClick="${mvcselectResourceCommandUrl}"><liferay-ui:message key="tiendas.button-alta"/></button>
<button type="submit" class="btn btn-secondary" onclick="limpiarFormulario()" value="Limpiar formulario"><liferay-ui:message key="tiendas.button-clean"/></button>
</form>


<liferay-ui:success key="tablaCreada" message="tiendas.alerta.crear" />
<liferay-ui:success key="tablaActualizada" message="tiendas.alerta.actualizar" />


<script>
$(document).ready(function(){
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
	
	 /*	si idPais no esta vacio
	 <portlet:namespace />cargarPais();
	<portlet:namespace />cargarProvincia(idpais,idprovincia);
	fin si
	si idProvincia no esta vacio
	<portlet:namespace />cargarCiudad(idprovincia,idciudad);
	fin si */
});

function <portlet:namespace />cargarPais(defaultValue){
    $.ajax({
        // La URL para la petición
        url : '${mvcselectPaisResourceCommandUrl}',
    	async : false,
        // la información a enviar
        // (también es posible utilizar una cadena de datos)
        //  data : { pais : 123 },
        // especifica si será una petición POST o GET
        type : 'GET',
    
        // el tipo de información que se espera de respuesta
        dataType : 'json',
    
        // código a ejecutar si la petición es satisfactoria;
        // la respuesta es pasada como argumento a la función
        success : function(jsonPaises) {
        	var select = $("#<portlet:namespace />selectPaises");
        	select.empty();
        	
        	// Option vacío
        	/* var opcion = document.createElement('option');
        	var opcionValue = jsonPaises[i].value;
          	var opcionText = jsonPaises[i].option;
          	opcion.setAttribute("value", opcionValue);
          	opcion.setAttribute("disabled", true);
          	select.append(opcion); */
          	
        	for(var i in jsonPaises){
         		var opcion = document.createElement('option');
	          	var opcionValue = jsonPaises[i].value;
	          	var opcionText = jsonPaises[i].option;
	          	opcion.setAttribute("value", opcionValue);
	          	opcion.append(opcionText);
	          	select.append(opcion);
	          	
	          	//atribute selected cond ? si : no;
	          	if (defaultValue == opcionValue) {
	          		opcion.setAttribute('selected', true);
	          	}
        	} 
        	
            console.log("SUCCESS PAIS");  
         // hacer for del jsonPises     
         // acceder a un pais:   jsonPaises[i]
         // acceder a un campo de pais:   jsonPaises[i].option
         // crear dinamicamente elemento <option>
         // añadir option al select   $("#<portlet:namespace />selectPaises")
        },
        
        // código a ejecutar si la petición falla;
        // son pasados como argumentos a la función
        // el objeto de la petición en crudo y código de estatus de la petición
        error : function(xhr, status) {
            alert('Disculpe, existio un problema');
        }     
    });
}


function <portlet:namespace />cargarProvincia(idPais, defaultValue){
    console.log("Provincias de: " +idPais+ " " +defaultValue);
    $.ajax({
        url : '${mvcselectProvinciaResourceCommandUrl}',
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
        url : '${mvcselectCiudadResourceCommandUrl}',
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


function limpiarFormulario() {
    var name = document.getElementById("<portlet:namespace />name"); /* val().reset(); */
    name.reset(); 
  }
</script>