package fullnamequestion

class Person {
    String firstName
    String lastName

	/*
		"respond Person.get(params.id)" in PersonController will now no longer work
		
		response from "http://localhost:8080/person/1" is: {"lastName":"Lee","firstName":"Geddy"{"message":"Internal server error","error":500}
		
		stacktrace is:
		Microsoft Windows [Version 10.0.15063]
(c) 2017 Microsoft Corporation. All rights reserved.

C:\Users\amking>cd fullname\fullnamequestion

C:\Users\amking\fullname\fullnamequestion>gradlew server:bootRun

> Task :server:compileGroovy
Could not open/create prefs root node Software\JavaSoft\Prefs at root 0x80000002. Windows RegCreateKeyEx(...) returned error code 5.

> Task :server:bootRun
The Class-Path manifest attribute in C:\Users\amking\.gradle\caches\modules-2\files-2.1\org.glassfish.jaxb\jaxb-runtime\2.3.1\dd6dda9da676a54c5b36ca2806ff95ee017d8738\jaxb-runtime-2.3.1.jar referenced one or more files that do not exist: file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/org.glassfish.jaxb/jaxb-runtime/2.3.1/dd6dda9da676a54c5b36ca2806ff95ee017d8738/jaxb-api-2.3.1.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/org.glassfish.jaxb/jaxb-runtime/2.3.1/dd6dda9da676a54c5b36ca2806ff95ee017d8738/txw2-2.3.1.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/org.glassfish.jaxb/jaxb-runtime/2.3.1/dd6dda9da676a54c5b36ca2806ff95ee017d8738/istack-commons-runtime-3.0.7.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/org.glassfish.jaxb/jaxb-runtime/2.3.1/dd6dda9da676a54c5b36ca2806ff95ee017d8738/stax-ex-1.8.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/org.glassfish.jaxb/jaxb-runtime/2.3.1/dd6dda9da676a54c5b36ca2806ff95ee017d8738/FastInfoset-1.2.15.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/org.glassfish.jaxb/jaxb-runtime/2.3.1/dd6dda9da676a54c5b36ca2806ff95ee017d8738/javax.activation-api-1.2.0.jar
The Class-Path manifest attribute in C:\Users\amking\.gradle\caches\modules-2\files-2.1\com.sun.xml.bind\jaxb-impl\2.3.1\a1a12b85ba1435b4189e065f7dafcc3fb9410d38\jaxb-impl-2.3.1.jar referenced one or more files that do not exist: file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.3.1/a1a12b85ba1435b4189e065f7dafcc3fb9410d38/jaxb-runtime-2.3.1.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.3.1/a1a12b85ba1435b4189e065f7dafcc3fb9410d38/txw2-2.3.1.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.3.1/a1a12b85ba1435b4189e065f7dafcc3fb9410d38/istack-commons-runtime-3.0.7.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.3.1/a1a12b85ba1435b4189e065f7dafcc3fb9410d38/stax-ex-1.8.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.3.1/a1a12b85ba1435b4189e065f7dafcc3fb9410d38/FastInfoset-1.2.15.jar,file:/C:/Users/amking/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.3.1/a1a12b85ba1435b4189e065f7dafcc3fb9410d38/javax.activation-api-1.2.0.jar
Grails application running at http://localhost:8080 in environment: development
2019-08-21 13:18:20.500 ERROR --- [nio-8080-exec-1] o.g.web.errors.GrailsExceptionResolver   : NoSuchMethodError occurred when processing request: [GET] /person/1
fullnamequestion.Person.fullName()Ljava/lang/String;. Stacktrace follows:

java.lang.reflect.InvocationTargetException: null
        at org.grails.core.DefaultGrailsControllerClass$ReflectionInvoker.invoke(DefaultGrailsControllerClass.java:211)
        at org.grails.core.DefaultGrailsControllerClass.invoke(DefaultGrailsControllerClass.java:188)
        at org.grails.web.mapping.mvc.UrlMappingsInfoHandlerAdapter.handle(UrlMappingsInfoHandlerAdapter.groovy:90)
        at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1039)
        at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:942)
        at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1005)
        at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:897)
        at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:882)
        at org.grails.web.servlet.mvc.GrailsWebRequestFilter.doFilterInternal(GrailsWebRequestFilter.java:77)
        at org.grails.web.filters.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:67)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:748)
Caused by: grails.views.ViewRenderException: Error rendering view: Error rendering view: fullnamequestion.Person.fullName()Ljava/lang/String;
        at grails.views.AbstractWritableScript.writeTo(AbstractWritableScript.groovy:43)
        at grails.views.mvc.GenericGroovyTemplateView.renderMergedOutputModel(GenericGroovyTemplateView.groovy:73)
        at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        at grails.views.mvc.renderer.DefaultViewRenderer.render(DefaultViewRenderer.groovy:117)
        at grails.artefact.controller.RestResponder$Trait$Helper.internalRespond(RestResponder.groovy:192)
        at grails.artefact.controller.RestResponder$Trait$Helper.respond(RestResponder.groovy:98)
        at fullnamequestion.PersonController.show(PersonController.groovy:5)
        ... 13 common frames omitted
Caused by: grails.views.ViewRenderException: Error rendering view: fullnamequestion.Person.fullName()Ljava/lang/String;
        at grails.views.AbstractWritableScript.writeTo(AbstractWritableScript.groovy:43)
        at grails.plugin.json.view.api.internal.DefaultGrailsJsonViewHelper$6.writeTo(DefaultGrailsJsonViewHelper.groovy:829)
        at grails.plugin.json.view.JsonViewWritableScript.json(JsonViewWritableScript.groovy:126)
        at grails.plugin.json.view.JsonViewWritableScript.json(JsonViewWritableScript.groovy:149)
        at server_person_show_gson.run(server_person_show_gson:7)
        at grails.plugin.json.view.JsonViewWritableScript.doWrite(JsonViewWritableScript.groovy:27)
        at grails.views.AbstractWritableScript.writeTo(AbstractWritableScript.groovy:40)
        ... 19 common frames omitted
Caused by: java.lang.NoSuchMethodError: fullnamequestion.Person.fullName()Ljava/lang/String;
        at server_person__person_gson$_run_closure1.doCall(server_person__person_gson:10)
        at grails.plugin.json.builder.StreamingJsonBuilder$StreamingJsonDelegate.cloneDelegateAndGetContent(StreamingJsonBuilder.java:793)
        at grails.plugin.json.builder.StreamingJsonBuilder$StreamingJsonDelegate.access$000(StreamingJsonBuilder.java:478)
        at grails.plugin.json.builder.StreamingJsonBuilder.call(StreamingJsonBuilder.java:238)
        at grails.plugin.json.view.JsonViewWritableScript.json(JsonViewWritableScript.groovy:72)
        at server_person__person_gson.run(server_person__person_gson:7)
        at grails.plugin.json.view.JsonViewWritableScript.doWrite(JsonViewWritableScript.groovy:27)
        at grails.views.AbstractWritableScript.writeTo(AbstractWritableScript.groovy:40)
        ... 25 common frames omitted

<==========---> 83% EXECUTING [5m 7s]
> :server:bootRun

	*/
    def fullName(){
        return "$firstName $lastName"
    }
}
