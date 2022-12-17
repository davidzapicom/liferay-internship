<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="selec.caption"/></b>
</p>

<portlet:resourceURL id="/select/pais" var="mvcselectResourceCommandUrl"/>
<portlet:resourceURL id="/select/provincia" var="mvcselectProvinciaCommandUrl"/>
<portlet:resourceURL id="/select/ciudad" var="mvcselectCiudadCommandUrl"/>

<aui:form>
    <aui:fieldset>
    <aui:select label="Selecciona el pais:" name="selectPaises" id="selectPaises" required="true" showEmptyOption="true">
    </aui:select>
  	<aui:select label="Selecciona la provincia:" name="selectProvincias" id="selectProvincias" required="true" showEmptyOption="true">
    </aui:select>
    <aui:select label="Selecciona la ciudad" name="selectCiudades" id="selectCiudades" required="true" showEmptyOption="true">
    </aui:select>
    </aui:fieldset>
</aui:form>
<aui:button name="mvcselectResourceCommandButton" type="submit" value="Seleccionar" onClick="${mvcselectResourceCommandUrl}"/>



<script>
$(document).ready(function(){
    cargarPais();
    
    $('#<portlet:namespace />selectPaises').on('change', function() {
    	cargarProvincia(this.value);
    });
    
    $('#<portlet:namespace />selectProvincias').on('change', function() {
    	cargarCiudad(this.value);
    });
});

function cargarPais(){
    $.ajax({
        // la URL para la petición
        url : '${mvcselectResourceCommandUrl}',
    
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
        	for(var i in jsonPaises){
         		var opcion = document.createElement('option');
	          	var opcionValue = jsonPaises[i].value;
	          	var opcionText = jsonPaises[i].option;
	          	opcion.setAttribute("value", opcionValue);
	          	opcion.append(opcionText);
	          	select.append(opcion);
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


function cargarProvincia(idPais){
    console.log("Provincias de: " +idPais);
    $.ajax({
        url : '${mvcselectProvinciaCommandUrl}',
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
            }
        },
        
    });
}

function cargarCiudad(idProvincia){
    console.log("Ciudades de: " +idProvincia);
    $.ajax({
        url : '${mvcselectCiudadCommandUrl}',
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
            }
        },
        
    });
}
</script>