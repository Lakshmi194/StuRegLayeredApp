package com.xyz.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.xyz.controller.MainController;
import com.xyz.vo.StudentVO;

public class StudentTest {
 public static void main(String[] args) {
	String sname=null;
	String sm1=null,sm2=null,sm3=null;
	StudentVO vo=null;
	DefaultListableBeanFactory factory = null;
	XmlBeanDefinitionReader reader = null;
	MainController controller = null;
	String result = null;
	Scanner sc=null;
	//read inputs
sc=new Scanner(System.in);
System.out.println("enter student name");
sname=sc.next();
System.out.println("enter m1");
sm1=sc.next();
System.out.println("enter m2");
sm2=sc.next();
System.out.println("enter m3");
sm3=sc.next();
//store inputs into vo
vo=new StudentVO();
vo.setSname(sname);
vo.setM1(sm1);
vo.setM2(sm2);
vo.setM3(sm3);
//create BEanFacory IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/xyz/cfgs/applicationContext.xml");
		// get Controller Bean class object..
		controller = factory.getBean("controller", MainController.class);
		// invoke the method
		try {
			result = controller.processStudent(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}

	
	
}
}
