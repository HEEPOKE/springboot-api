package com.example.app.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfiguration {
    public EnvConfiguration() {
        Dotenv.load();
    }
}
