package com.springAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {
// for all getName methods no matter in which class these are
	/*
	 * @Before("execution(public String getName())") public void loggingadvice() {
	 * System.out.println("Advice run ... Get Method Called"); } for a particular
	 * class
	 * 
	 * @Before("execution(public String com.aspect.model.Circle.getName())") public
	 * void loggingadviceClass() {
	 * System.out.println("Advice run ... Get Method Called for a particular class"
	 * ); }
	 */
	// for all getters we can use get*()
	/*
	 * @Before("allGetters()") public void loggingadvice(JoinPoint joinPoint) {
	 * System.out.println(joinPoint.toString());
	 * System.out.println("Advice run ... Get Method Called"); }
	 */
	/*
	 * @After("allGetters()") public void loggingadvice( JoinPoint joinPoint ) {
	 * //System.out.println(joinPoint.toString());
	 * System.out.println("Advice run ... Get Method Called"); }
	 */
	/*
	 * @After("execution(public * get*())") public void loggingadvice() {
	 * System.out.println("Advice run ... Get Method Called"); }
	 */

	  
	/*
	 * @After("args(name)") public void loggingAfterAdvice(String name) {
	 * System.out.
	 * println("A method that takes String argument has been called The Value  is"
	 * +name); }
	 */
	
	
	

	/*
	 * @AfterReturning("args(name)") public void loggingReturnAdvice(String name) {
	 * System.out.println(" A method is called with an exception "); }
	 */
	/*
	 * @AfterThrowing("args(name)") public void exceptionAdvice(String name) {
	 * System.out.println(" an exception han been thrown thrown"); }
	 */
	/*
	 * @AfterThrowing(pointcut = "args(name)",throwing="ex") public void
	 * exceptionAdvice(String name,Exception ex) {
	 * System.out.println(" an exception han been thrown thrown"+ex); }
	 */
	
	/*
	 * @Around("allGetters()") public Object myAroundAdvice(ProceedingJoinPoint
	 * proceedingJoinPoint) {
	 * 
	 * Object returnValue=null; try { System.out.println("before advice");
	 * 
	 * returnValue=proceedingJoinPoint.proceed();
	 * System.out.println("after returning"); } catch(Throwable e) {
	 * System.out.println("after throwing"); } System.out.println("after finally");
	 * return returnValue; }
	 */
	@Around("@annotation(com.springAspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		
		Object returnValue=null;
	try
	{
		System.out.println("before advice");
		
		returnValue=proceedingJoinPoint.proceed();
		System.out.println("after returning");
	}
	catch(Throwable e)
	{
		System.out.println("after throwing");
	}
	System.out.println("after finally");
	return returnValue;
	}
	
	  @Pointcut("execution(public * get*())") 
	  public void allGetters() { }
	/*
	 * @Pointcut("execution( *com.aspect.service.*.*(..))") public void allMethods()
	 * {}
	 */
	 
}
