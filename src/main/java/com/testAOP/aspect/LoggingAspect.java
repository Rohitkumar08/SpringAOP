/*
 * Copyright 2006-2019 (c) Care.com, Inc.
 * 1400 Main Street, Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 */
package com.testAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created 7/27/2019 12:23 PM
 *
 * @author Rohit Rawani
 */
@Aspect
public class LoggingAspect {

  /**
   * make advice method run before the execution of specified method
   */
//  @Before("execution(public * get*())")                //wildcard names
/*  @Before("execution(public String getName())")
  public void loggingAdvice(){
    System.out.println("Advice run. get method is called");
  }*/

//just refer to the allgetter pointcut to avoid code duplicacy
  @Before("allGetters() && allCircleMethods()")
  public void loggingAdvice(){
    System.out.println("Advice run. get method is called");
  }

  @Pointcut("execution(public * get*())")
  public void allGetters(){}

  /**
   * within all methods of Circle class
   */
  @Pointcut("within(com.testAOP.model.Circle)")
  public void allCircleMethods(){}

  @After("args(name)")
  public void afterCall(String name){
    System.out.println("Advice run. after is called");
  }

  //has to take an argument known as proceeding join point
//  @Around("allGetters()")
  @Around("@annotation(com.testAOP.aspect.Loggable)")
  public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
    /**
     * this is teh actual target method execution so write ur logic before or after this,
     * we can also decide whether we decide to execute the method at all
     */
    try {
      System.out.println("Before around logging");
      proceedingJoinPoint.proceed();
      System.out.println("After around logging");
    } catch (Throwable throwable) {
      System.out.println("After thrwoing");
    }
    System.out.println("After finally");
  }
}
