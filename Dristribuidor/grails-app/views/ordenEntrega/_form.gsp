<%@ page import="dristribuidor.OrdenEntrega" %>



<div class="fieldcontain ${hasErrors(bean: ordenEntregaInstance, field: 'estado', 'error')} ">
	<label for="estado">
		<g:message code="ordenEntrega.estado.label" default="Estado" />
		
	</label>
	<g:textField name="estado" value="${ordenEntregaInstance?.estado}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ordenEntregaInstance, field: 'tracking', 'error')} ">
	<label for="tracking">
		<g:message code="ordenEntrega.tracking.label" default="Tracking" />
		
	</label>
	<g:textField name="tracking" value="${ordenEntregaInstance?.tracking}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ordenEntregaInstance, field: 'destino', 'error')} required">
	<label for="destino">
		<g:message code="ordenEntrega.destino.label" default="Destino" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="destino" name="destino.id" from="${dristribuidor.Destino.list()}" optionKey="id" required="" value="${ordenEntregaInstance?.destino?.id}" class="many-to-one"/>

</div>

