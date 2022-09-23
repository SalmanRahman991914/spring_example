package com.spel;



import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
public static void main(String[] args){
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spel/config.xml");
	Student student=(Student) context.getBean("student");
	System.out.println(student);

}
}
