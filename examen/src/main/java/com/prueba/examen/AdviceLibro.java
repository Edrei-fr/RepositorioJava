package com.prueba.examen;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AdviceLibro {
	
	@Pointcut("execution(* com.prueba.examen.Libro.vender(..))")
	public void pointCutVenderLibro() {}

	@After("pointCutVenderLibro()")
	public void agradecer() {
		System.out.println("Gracias por su compra");
		}
}
