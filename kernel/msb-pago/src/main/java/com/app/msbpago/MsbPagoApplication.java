package com.app.msbpago;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.app.msbpago.interfaces")
@EnableDiscoveryClient
public class MsbPagoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsbPagoApplication.class, args);
	}

    @Bean
    public Sampler defaultSampler(){
      return Sampler.ALWAYS_SAMPLE;
    }
}
