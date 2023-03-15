package com.example.app.config;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class Database {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    private String getDriverClassName() {
        return "com.mysql.cj.jdbc.Driver";
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(dataSourceProperties.getUrl())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .driverClassName(getDriverClassName())
                .build();
    }
}
