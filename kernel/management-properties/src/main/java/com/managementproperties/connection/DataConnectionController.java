/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managementproperties.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class DataConnectionController {

  @Autowired
  private ConfigurationDatasource service;

  @GetMapping(path="/dataconnection")
  public DataConnection getDataConnection() {
    DataConnection dataConnection = new DataConnection(
            service.getDriverclassname(),
            service.getUrl(),
            service.getUsername(),
            service.getPassword()
    );
    return dataConnection;
  }

}
