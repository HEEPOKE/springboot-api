package com.example.app.config;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {

    private String getUrl() {
        return System.getenv("MYSQL_URL");
    }

    private String getUsername() {
        return System.getenv("MYSQL_USER");
    }

    private String getPassword() {
        return System.getenv("MYSQL_PASSWORD");
    }

    private String getDriverClassName() {
        return "com.mysql.cj.jdbc.Driver";
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(getUrl())
                .username(getUsername())
                .password(getPassword())
                .driverClassName(getDriverClassName())
                .build();
    }
}
