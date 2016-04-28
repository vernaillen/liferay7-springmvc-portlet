# liferay7-springmvc-portlet
Example Spring MVC Portlet that can be deployed as a WAB on Liferay 7

## Includes
* Spring WebMVC Portlet version 4.2.5
* An Autowired Service class
* A model object being passed to the view
* A message with argument retrieved from resource bundle
* A call to the Liferay API (using PortalUtil) to retrieve the current authenticated user

## Tested on
* Liferay 7 GA1 Tomcat bundle, running on OSX 10.11.4 with MySQL Community Server 5.6.17
* Liferay 7 GA1 Tomcat bundle, running on Windows 7 with HSQL
* Liferay 7 GA1 Wildfly bundle, running on Windows 7 with HSQL
