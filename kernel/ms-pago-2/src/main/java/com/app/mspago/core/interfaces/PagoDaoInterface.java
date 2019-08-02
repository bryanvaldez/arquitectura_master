/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.core.interfaces;

import com.app.mspago.core.bussiness.bean.Servicio;
import com.app.mspago.core.util.AppException;
import com.app.mspago.core.util.Transaction;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public interface PagoDaoInterface {

  public Transaction pagarServicio(Servicio servicio) throws AppException;
}
