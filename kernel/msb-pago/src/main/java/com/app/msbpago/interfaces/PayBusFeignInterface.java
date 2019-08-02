/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbpago.interfaces;

import com.app.msbpago.objects.ServicioDto;
import com.app.msbpago.objects.Transaction;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
//@FeignClient(name="ms-pago", url="http://localhost:8085")
@FeignClient(name="apigateway")
@RibbonClient(name="ms-pago")
public interface PayBusFeignInterface {

  @PutMapping(path="/ms-pago/mspago/servicio/pagar")
  public Transaction payService(@RequestBody ServicioDto servicioDto);

}
