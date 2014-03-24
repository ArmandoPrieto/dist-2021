<%@ page import="dristribuidor.Distribuidor" %>



<div class="fieldcontain ${hasErrors(bean: distribuidorInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="distribuidor.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${distribuidorInstance?.title}"/>

</div>

