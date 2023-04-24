package com.ust.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Login login = new Login();
//		login.setUserName("johndoe");
//		login.setPassword("winnyminny");
//		String result = login.validate();
//		System.out.println(result);

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Object obj = factory.getBean("connection");
		Connection con = (Connection) obj;
		System.out.println(obj);
		Object obj2 = factory.getBean("login");
		Login login = (Login) obj2;
		login.validate();
		System.out.println(obj);
		// all beans are auto promoted to object type

	}

}
