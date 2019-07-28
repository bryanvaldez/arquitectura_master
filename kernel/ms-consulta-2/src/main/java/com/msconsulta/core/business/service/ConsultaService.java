/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.core.business.service;

import com.msconsulta.core.business.bean.Servicio;
import com.msconsulta.core.dataaccess.repository.ConsultaDao;
import com.msconsulta.core.interfaces.ConsultaDaoInterface;
import com.msconsulta.core.interfaces.ConsultaServiceInterface;
import com.msconsulta.core.util.AppException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@Service
public class ConsultaService implements ConsultaServiceInterface{

  @Autowired
  private ConsultaDaoInterface consultaDao;
  
  @Override
  public List<Servicio> getServicios() throws AppException {
    return consultaDao.getServicios();
  }

  @Override
  public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException {
    return consultaDao.getServicios(idCliente, idEmpresa);
  }
  
}
