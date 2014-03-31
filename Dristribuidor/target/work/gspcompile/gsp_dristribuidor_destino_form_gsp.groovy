import dristribuidor.Destino
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dristribuidor_destino_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/destino/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: destinoInstance, field: 'estado', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("destino.estado.label"),'default':("Estado")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("estado"),'value':(destinoInstance?.estado)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: destinoInstance, field: 'municipio', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("destino.municipio.label"),'default':("Municipio")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("municipio"),'value':(destinoInstance?.municipio)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: destinoInstance, field: 'pais', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("destino.pais.label"),'default':("Pais")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("pais"),'value':(destinoInstance?.pais)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: destinoInstance, field: 'precio', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("destino.precio.label"),'default':("Precio")],-1)
printHtmlPart(7)
invokeTag('field','g',37,['name':("precio"),'value':(fieldValue(bean: destinoInstance, field: 'precio')),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396240728000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
