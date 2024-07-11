package org.gatech.henryapiclient;


import lombok.Data;
import org.gatech.henryapiclient.client.HenryClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("henryapi.client")
@Data
@ComponentScan
public class HenryApiConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public HenryClient yuApiClient() {
        return new HenryClient(accessKey, secretKey);
    }
}
