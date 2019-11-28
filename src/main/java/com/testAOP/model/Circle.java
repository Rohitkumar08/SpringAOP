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
package com.testAOP.model;

/**
 * Created 7/27/2019 11:49 AM
 *
 * @author Rohit Rawani
 */
public class Circle {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    System.out.println("setter method of circle is called");
  }

}
