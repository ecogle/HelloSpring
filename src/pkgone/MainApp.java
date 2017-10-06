package pkgone;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class MainApp {
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		path = path + "\\res\\Beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		System.gc();
	}

}
