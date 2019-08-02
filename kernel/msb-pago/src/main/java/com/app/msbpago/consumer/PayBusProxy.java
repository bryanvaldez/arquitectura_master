/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbpago.consumer;

import com.app.msbpago.interfaces.PayBusProxyInterface;
import com.app.msbpago.objects.AppException;
import com.app.msbpago.objects.ServicioDto;
import com.app.msbpago.objects.Transaction;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@Component
public class PayBusProxy implements PayBusProxyInterface {

  private static final String URL = "http://localhost:8085/mspago/servicio/pagar";

  @Override
  public Transaction payService(ServicioDto servicio) throws AppException {
    Transaction tx = new Transaction();
    HttpEntity<ServicioDto> requestEntity = new HttpEntity<>(servicio, null);
    ResponseEntity<Transaction> responseEntity = new RestTemplate().exchange(URL, HttpMethod.PUT, requestEntity, Transaction.class);
    if (responseEntity != null && responseEntity.hasBody()) {
      tx = responseEntity.getBody();
    }
    return tx;
  }

}
