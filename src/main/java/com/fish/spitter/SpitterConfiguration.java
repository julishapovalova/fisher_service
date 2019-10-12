package com.fish.spitter;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:spitter.properties")
public class SpitterConfiguration {


    @Bean
    public DataSource dataSource() {
        return new BasicDataSource();
    }

    @Bean
    public SpitterDB spitterDB(DataSource dataSource) {
        return new SpitterDB(dataSource);
    }

}
