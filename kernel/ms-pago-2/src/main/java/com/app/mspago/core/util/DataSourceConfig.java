/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.core.util;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

  @Bean(name = "datasource")
  public DataSource datasource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    ResponseEntity<DataConnection> responseEntity = new RestTemplate().getForEntity("http://localhost:8084/mproperties/dataconnection", DataConnection.class);
    DataConnection response = responseEntity.getBody();
    dataSource.setDriverClassName(response.getDriverclassname());
    dataSource.setUrl(response.getUrl());
    dataSource.setPassword(response.getPassword());
    dataSource.setUsername(response.getUsername());
    return dataSource;
  }

}
