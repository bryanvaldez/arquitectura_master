/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbpago.provider;

import com.app.msbpago.interfaces.PayBusFeignInterface;
import com.app.msbpago.interfaces.PayBusProxyInterface;
import com.app.msbpago.objects.AppException;
import com.app.msbpago.objects.ServicioDto;
import com.app.msbpago.objects.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@RestController
public class PayBusRestController {
  
  @Autowired
  private PayBusProxyInterface payBusProxy;
  
  @Autowired
  private PayBusFeignInterface PayBusFeign;
  
  @PutMapping(path="/servicio/pagar")
  public Transaction payService(@RequestBody ServicioDto servicioDto){
    Transaction tx = new Transaction();
    try {
      tx = payBusProxy.payService(servicioDto);
    } catch (AppException ape) {
      System.out.println(ape.getMessage());
    }
    return tx;
  }
  
  @PutMapping(path="/servicio/feign/pagar")
  public Transaction payServiceFeign(@RequestBody ServicioDto servicioDto){
    return PayBusFeign.payService(servicioDto);
  }  
  
}
