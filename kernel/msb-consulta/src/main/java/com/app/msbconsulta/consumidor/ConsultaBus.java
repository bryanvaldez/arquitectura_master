/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbconsulta.consumidor;

import com.app.msbconsulta.interfaces.ConsultaBusProxyInterface;
import com.app.msbconsulta.objetos.ServicioDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author bvaldez
 */
@Component
public class ConsultaBus implements ConsultaBusProxyInterface{
  
  private static String URL ="http://localhost:8081/msconsulta/servicios/consulta";

  @Override
  public List<ServicioDto> getServicios() {    
    List<ServicioDto> servicios = new ArrayList<>();
    Map<String, Integer> uriVariables = new HashMap<>();
    ResponseEntity<List<ServicioDto>> responseEntity = new RestTemplate().exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<ServicioDto>>(){}, uriVariables);
    
    if(responseEntity != null && responseEntity.hasBody()){
      servicios = responseEntity.getBody();
    }
    return servicios;
  }
  
}
