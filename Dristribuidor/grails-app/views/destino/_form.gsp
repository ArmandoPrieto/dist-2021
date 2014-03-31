<%@ page import="dristribuidor.Destino" %>



<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'estado', 'error')} ">
	<label for="estado">
		<g:message code="destino.estado.label" default="Estado" />
		
	</label>
	<g:textField name="estado" value="${destinoInstance?.estado}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'municipio', 'error')} ">
	<label for="municipio">
		<g:message code="destino.municipio.label" default="Municipio" />
		
	</label>
	<g:textField name="municipio" value="${destinoInstance?.municipio}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'pais', 'error')} ">
	<label for="pais">
		<g:message code="destino.pais.label" default="Pais" />
		
	</label>
	<g:textField name="pais" value="${destinoInstance?.pais}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: destinoInstance, field: 'precio', 'error')} required">
	<label for="precio">
		<g:message code="destino.precio.label" default="Precio" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="precio" value="${fieldValue(bean: destinoInstance, field: 'precio')}" required=""/>

</div>

