package com.Suresh.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ASpectDemo {

	/*
	 * @Before(value = "p1()") public void firstPoint(JoinPoint point) {
	 * 
	 * System.out.println("getSignature method called"
	 * +point.getSignature().getName()); String string =
	 * point.getTarget().toString(); System.out.println("target String displayed "
	 * +string); System.out.println("args " +point.getArgs());
	 * System.out.println("sourceLocation" + point.getSourceLocation());
	 * System.out.println("staticPart " + point.getStaticPart());
	 * System.out.println("getKind " +point.getKind());
	 * System.out.println("getThis " + point.getThis()); }
	 * 
	 * 
	 * @Pointcut("execution(public void service(String name))") public void p1() { }
	 */
	
	/*
	 * @AfterReturning("execution(public void service())") public void dis() {
	 * System.out.
	 * println(" display string will be successfully executes after the service method completion"
	 * ); }
	 */
	
	@AfterThrowing("execution(public void service())")
	public void disThrrow() {
		System.out.println(" display string will be successfully executes after the service method Thrwos exception");
	}

	/*
	 * @After(value = "execution(public void service())") public void kastPoint() {
	 * System.out.println(" i will be called lastly"); }
	 * 
	 * @Pointcut("execution(public void service())") public void p1() {
	 * 
	 * }
	 * 
	 * @Before(value = "pb()") public void runforAllMethodsBefore(JoinPoint point) {
	 * System.out.println("I will be called before all the methods in this package"
	 * ); System.out.println(point.getSignature().getName()); }
	 * 
	 * @Pointcut(value = "execution(* com.Suresh.bussiness..*())") public void pb()
	 * {
	 * 
	 * }
	 * 
	 * // replace the above code with the below perform the same task.
	 * 
	 * // within always deals wiht the Classnames whereas pointcut always deals with
	 * // method name // that is the reason we are using () in pointcut expressions
	 * 
	 * 
	 * @Pointcut(value = "within(com.Suresh.bussiness.*)") public void pb() { }
	 * 
	 * 
	 * @Before("beforeall() & afterall()") public void display() {
	 * System.out.println("I will be called before all methods");
	 * System.out.println("I will be called after all methods"); }
	 * 
	 * @Pointcut(value = "execution(public * com.Suresh.bussiness..*())") public
	 * void beforeall() {
	 * 
	 * }
	 * 
	 * 
	 * @Before("afterall()") public void displayafter() {
	 * System.out.println("I will be called after all methods"); }
	 * 
	 * 
	 * @Pointcut(value = "execution(public * com.Suresh.bussiness..*())") public
	 * void afterall(){
	 * 
	 * }
	 */
}
