/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.integration.resource;

import com.app.mspago.core.bussiness.bean.Servicio;
import com.app.mspago.core.interfaces.PagoServiceInterface;
import com.app.mspago.core.util.Transaction;
import com.app.mspago.integration.dto.ServicioDto;
import com.app.mspago.integration.util.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@RestController
public class PagoRestController {

  @Autowired
  private PagoServiceInterface pagoService;
  
  @Autowired
  private Environment enviroment;

  @PutMapping(path = "/servicio/pagar")
  public Transaction pagarServicio(@RequestBody ServicioDto servicioDto) {
    Transaction tx = new Transaction();
    try {
      Servicio servicio = Convert.passServicioDtoBeanToServicio(servicioDto);
      tx = pagoService.pagarServicio(servicio);
      tx.setBackendCode(enviroment.getProperty("local.server.port"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return tx;
  }
}
