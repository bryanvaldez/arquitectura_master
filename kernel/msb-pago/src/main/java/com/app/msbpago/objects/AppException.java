/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbpago.objects;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public class AppException extends Exception {

  private static final long serialVersionUID = 1L;

  public AppException(String message) {
    super(message);
  }

}
