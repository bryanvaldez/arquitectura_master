/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.core.dataaccess.repository;

import com.msconsulta.core.business.bean.Cliente;
import com.msconsulta.core.business.bean.Producto;
import com.msconsulta.core.business.bean.Servicio;
import com.msconsulta.core.interfaces.ConsultaDaoInterface;
import com.msconsulta.core.util.AppException;
import com.msconsulta.core.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public class ConsultaDao implements ConsultaDaoInterface {

  public ConsultaDao() {
  }

  @Override
  public List<Servicio> getServicios() throws AppException {
    List<Servicio> servicios = new ArrayList();
    Conexion con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      con = new Conexion();
    } catch (Exception e) {
      throw new AppException(e.getMessage());
    }
    String SQL = "SELECT"
            + " c.codigo as cliente ,"
            + " c.nombres as nombres,"
            + " p.codigo as producto,"
            + " p.descripcion as descripcion,"
            + " p.precio as precio, "
            + " cp.codigo as recibo, "
            + " cp.monto as deuda, "
            + " cp.estado as estado "
            + " FROM esqmicroservicios.TBL_CLIENTE c"
            + " INNER JOIN esqmicroservicios.TBL_CLIENTE_PRODUCTO cp on c.codigo = cp.cliente"
            + " INNER JOIN esqmicroservicios.TBL_PRODUCTO p on p.codigo = cp.producto";
    try {
      con.getConexion().setAutoCommit(false);
      pstmt = con.getConexion().prepareStatement(SQL);
      rs = pstmt.executeQuery();
      con.getConexion().commit();
      while (rs.next()) {
        Servicio servicio = new Servicio();
        servicio.setCodigo(rs.getInt("recibo"));
        servicio.setEstado(rs.getString("estado"));
        servicio.setCliente(new Cliente(rs.getInt("cliente"), rs.getString("nombres")));
        servicio.setProducto(new Producto(rs.getInt("producto"), rs.getString("descripcion")));
        servicio.setMonto(rs.getInt("deuda"));
        servicios.add(servicio);
        servicio = null;
      }
    } catch (Exception e) {
      throw new AppException(e.getMessage());
    } finally {
      try {
        con.closeResources(con.getConexion(), rs, null, null, pstmt);
      } catch (Exception e) {
        // TODO Auto generated catch block e.printStackTrace
      }
    }
    return servicios;
  }

}
