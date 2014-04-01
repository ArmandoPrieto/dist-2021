<%@ page import="dristribuidor.OrdenEntrega" %>



<div class="fieldcontain ${hasErrors(bean: ordenEntregaInstance, field: 'destino', 'error')} required">
	<label for="destino">
		<g:message code="ordenEntrega.destino.label" default="Destino" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="destino" name="destino.id" from="${dristribuidor.Destino.list()}" optionKey="id" required="" value="${ordenEntregaInstance?.destino?.id}" class="many-to-one"/>

</div>

