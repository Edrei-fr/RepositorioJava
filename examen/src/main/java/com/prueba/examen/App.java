package com.prueba.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configbeans.xml");

		Libro libro = (Libro) (context.getBean("libro"));

		System.out.println(libro.toString());
		System.out.println("Vendiendo...");
		libro.vender();
		

		((ClassPathXmlApplicationContext) context).close();
    }
}
