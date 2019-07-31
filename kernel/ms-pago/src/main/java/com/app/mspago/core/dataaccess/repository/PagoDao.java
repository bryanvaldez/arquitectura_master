/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.core.dataaccess.repository;

import com.app.mspago.core.bussiness.bean.Servicio;
import com.app.mspago.core.interfaces.PagoDaoInterface;
import com.app.mspago.core.util.AppException;
import com.app.mspago.core.util.Connection;
import com.app.mspago.core.util.Transaction;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@Repository
public class PagoDao implements PagoDaoInterface {

  @Override
  public Transaction pagarServicio(Servicio servicio) throws AppException {
    Transaction tx = new Transaction();
    PreparedStatement pstmt = null;
    Connection con = null;
    String SQL = "UPDATE esqmicroservicios.TBL_CLIENTE_PRODUCTO SET estado = '1' where codigo=? and cliente=? and producto=?";
    try {
      con = new Connection();
      pstmt = con.getConnection().prepareStatement(SQL);
      pstmt.setInt(1, servicio.getCodigo());
      pstmt.setInt(2, servicio.getCliente().getCodigo());
      pstmt.setInt(3, servicio.getProducto().getCodigo());
      pstmt.executeUpdate();
      tx.setCode("0000");
      tx.setDescription("Proceso Conforme");
    } catch (SQLException sqle) {
      throw new AppException(sqle.getMessage());
    } catch (Exception e) {
      throw new AppException(e.getMessage());
    } finally {
      try {
        con.closeResources(con.getConnection(), null, null, null, pstmt);
      } catch (Exception e) {
        throw new AppException(e.getMessage());
      }
    }
    return tx;
  }
}
