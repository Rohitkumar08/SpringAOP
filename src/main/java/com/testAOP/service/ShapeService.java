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
package com.testAOP.service;

import com.testAOP.aspect.Loggable;
import com.testAOP.model.Circle;
import com.testAOP.model.Triangle;

/**
 * Created 7/27/2019 11:49 AM
 *
 * @author Rohit Rawani
 */
public class ShapeService {

  private Circle circle;
  private Triangle triangle;

  /**
   * custom annotation based advice used to the top of method fro which we need the advice
   * @return
   */
 @Loggable
  public Circle getCircle() {
    return circle;
  }

  public void setCircle(Circle circle) {
    this.circle = circle;
  }

  public Triangle getTriangle() {
    return triangle;
  }

  public void setTriangle(Triangle triangle) {
    this.triangle = triangle;
  }

}
