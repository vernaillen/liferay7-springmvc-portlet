# liferay7-springmvc-portlet
Example Spring MVC Portlet that can be deployed as a WAB on Liferay 7

In this project you find an example of:
* Maven build using maven-bundle-plugin
* Maven profile for deploying to a local Liferay instance (requires maven properties to be set up as described [GitHub](https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/deploying-liferay-plugins-with-maven) )
* Spring WebMVC Portlet version 4.2.5
* An Autowired Service class
* Apache Commons Logger
* A call to the Liferay API (using PortalUtil) to retrieve the current authenticated user
* A model object to pass to the view
* A jsp as view using a liferay-ui:message tag with argument

## Tested on
* Liferay 7 GA1 Tomcat bundle, running on OSX 10.11.4 with MySQL Community Server 5.6.17
* Liferay 7 GA1 Tomcat bundle, running on Windows 7 with HSQL
* Liferay 7 GA1 Wildfly bundle, running on Windows 7 with HSQL
