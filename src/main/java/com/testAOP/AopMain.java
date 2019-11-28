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
package com.testAOP;

import com.testAOP.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created 7/27/2019 11:39 AM
 *
 * @author Rohit Rawani
 */
public class AopMain {

  public static void main(String[] args


  ) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    ShapeService service = context.getBean("shapeService", ShapeService.class);
//    System.out.println(service.getCircle().getName());
//    service.getCircle().setName("Dummy name");
    service.getCircle();

  }
}
