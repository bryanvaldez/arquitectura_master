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
public class Transaction {
  private String code;
  private String description;
  private String backendCode;

  public Transaction() {
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getBackendCode() {
    return backendCode;
  }

  public void setBackendCode(String backendCode) {
    this.backendCode = backendCode;
  }
  
  
  
}
