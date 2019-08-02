/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbpago.interfaces;

import com.app.msbpago.objects.Transaction;
import com.app.msbpago.objects.AppException;
import com.app.msbpago.objects.ServicioDto;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public interface PayBusProxyInterface {

  public Transaction payService(ServicioDto servicio) throws AppException;
}
