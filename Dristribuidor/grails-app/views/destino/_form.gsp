<%@ page import="dristribuidor.Destino" %>



<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'ciudad', 'error')} ">
	<label for="ciudad">
		<g:message code="destino.ciudad.label" default="Ciudad" />
		
	</label>
	<g:textField name="ciudad" value="${destinoInstance?.ciudad}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'codigoPostal', 'error')} ">
	<label for="codigoPostal">
		<g:message code="destino.codigoPostal.label" default="Codigo Postal" />
		
	</label>
	<g:textField name="codigoPostal" value="${destinoInstance?.codigoPostal}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'direccion', 'error')} ">
	<label for="direccion">
		<g:message code="destino.direccion.label" default="Direccion" />
		
	</label>
	<g:textField name="direccion" value="${destinoInstance?.direccion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'estado', 'error')} ">
	<label for="estado">
		<g:message code="destino.estado.label" default="Estado" />
		
	</label>
	<g:textField name="estado" value="${destinoInstance?.estado}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'local', 'error')} required">
	<label for="local">
		<g:message code="destino.local.label" default="Local" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="local" type="number" value="${destinoInstance.local}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'pais', 'error')} ">
	<label for="pais">
		<g:message code="destino.pais.label" default="Pais" />
		
	</label>
	<g:textField name="pais" value="${destinoInstance?.pais}"/>

</div>

