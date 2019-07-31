/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.core.bussiness.service;

import com.app.mspago.core.bussiness.bean.Servicio;
import com.app.mspago.core.interfaces.PagoDaoInterface;
import com.app.mspago.core.interfaces.PagoServiceInterface;
import com.app.mspago.core.util.AppException;
import com.app.mspago.core.util.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@Service
public class PagoService implements PagoServiceInterface {

  @Autowired
  private PagoDaoInterface pagoDao;

  @Override
  public Transaction pagarServicio(Servicio servicio) throws AppException {
    return pagoDao.pagarServicio(servicio);
  }

}
