Implement CDN service in Spring using following steps:

Add following lines in dispatcher-servlet.xml (Your Spring Configuration)

<util:properties id="propertyConfigurer" location="classpath:/app.properties"/>
<context:property-placeholder properties-ref="propertyConfigurer" />
Of course, you need to add DOM for spring-util at the top of the file:

xmlns:util="http://www.springframework.org/schema/util"
xsi:schemaLocation="http://www.springframework.org/schema/util 
http://www.springframework.org/schema/util/spring-util-4.1.xsd"
Setup in app.properties

cdn.url=//cdn.domain.com/path/to/static/content
Use CDN in JSP files

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('cdn.url')" var="cdnUrl" />

<link rel="stylesheet" type="text/css" href="${cdnUrl}/css/semantic.min.css" />
<link rel="stylesheet" type="text/css" href="${cdnUrl}/css/font-awesome.min.css" />