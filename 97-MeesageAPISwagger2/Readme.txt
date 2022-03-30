Swagger2 is an open source project used to generate REST APi documentation
It's also give you user interface to access your rest end point via browser
Following are the steps to be carried out in order to use swagger in application
	1. Add dependency in pom.xml
	2. Configure swagger
	3. Enable Swagger
	4. Adding more annotations for detailed customer requirement(optional)

http://localhost:8080/v2/api-docs

v2/api-docs
This end-point given by swagger which is rest endpoint which returns rest end-point documentation in json form
Idea is you can consume these end-points and create custom GUI
If you don't want to create custom GUI swagger gives you built in GUI
You can use this build in GUI to test your rest end points.
following dependencies
	 
http://localhost:8080/swagger-ui.html ->api user interfaceshown in broswer

@APIOpeartion-->
@APIModel-->