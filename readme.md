直接运行boot。启动之后访问http://localhost:8080/demo/user?wsdl
之后在test的service目录下有测试的mian方法执行测试


spring boot结合webservice 
在创建过程中出现如下报错：
	Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2018-11-20 10:10:15.451 ERROR 230600 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 
***************************
APPLICATION FAILED TO START
***************************
Description:
Parameter 1 of constructor in org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration required a bean of type 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath' that could not be found.
The following candidates were found but could not be injected:
    - Bean method 'dispatcherServletRegistration' in 'DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration' not loaded because DispatcherServlet Registration found non dispatcher servlet dispatcherServlet
Action:
Consider revisiting the entries above or defining a bean of type 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath' in your configuration.
	
	
	出现如下报错一般是因为webservice版本和boot版本不匹配：
		parent版本是1.4.5，同时jaxws版本是3.1.7时；
		parent版本是1.4.5，同时jaxws版本是3.1.11时；
		parent版本是1.5.6，同时jaxws版本是3.1.11时；
		parent版本是1.5.8，同时jaxws版本是3.1.12时；
		parent版本是1.5.9，同时jaxws版本是3.1.11时；
		parent版本是1.5.9，同时jaxws版本是3.1.12时；
		parent版本是2.0.3，同时jaxws版本是3.2.6时；是可以的
		
		
		解决此问题参考博文：https://blog.csdn.net/Jerry_liu20080504/article/details/84287009
		