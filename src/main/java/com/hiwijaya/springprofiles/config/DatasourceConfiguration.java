package com.hiwijaya.springprofiles.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Happy Indra Wijaya
 */
@Data
@Configuration
@ConfigurationProperties("spring.datasource")
public class DatasourceConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;


    @Bean
    @Profile("dev")
    public void devEnvironmentSetup(){
        System.out.println("[DEV] - Environment");
        System.out.println(driverClassName);
        System.out.println(url);
    }

    @Bean
    @Profile("prod")
    public void productionEnvironmentSetup(){
        System.out.println("[PRODUCTION] - Environment");
        System.out.println(driverClassName);
        System.out.println(url);
    }

}
