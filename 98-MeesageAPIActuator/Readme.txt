Actuator:
		It helps you to monitor and manage application
		Spring Boot Actuator gives you number o built-in end-points and let's you add own end-points
		Optionally you can enable or disable each your end-point

Steps to use Actuator:
	1. Add the dependencies in pom.xml
	2. Optionally, add properties in application.properties file

http://localhost:8080/actuator/
This is a default endpoint given by actuator
This end points tells you all the end points given by default
General syntax of end-points as follows 
/actuator/id
id is a buit-in end-point given by actuator
example: /actuator/health (health is a value of id)
this endpoint gives a health information of the application whether application is up or down
Enabling the actuator end points 
management.endpoint.id.enabled=true
/actuator/beans->this end-point displays complete beans available in application


 
		