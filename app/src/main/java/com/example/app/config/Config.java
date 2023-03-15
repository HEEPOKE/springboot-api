package com.example.app.config;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.configure().load();

    private static String getEnv(String key) {
        return dotenv.get(key);
    }

    public static String getDbHost() {
        return getEnv("DB_HOST");
    }

    public static String getDbPort() {
        return getEnv("DB_PORT");
    }

    public static String getDbName() {
        return getEnv("DB_NAME");
    }

    public static String getDbUser() {
        return getEnv("DB_USER");
    }

    public static String getDbPassword() {
        return getEnv("DB_PASSWORD");
    }

    public static String getDbURL() {
        return getEnv("DB_URL");
    }

    public static String getDbDriver() {
        return getEnv("DB_DRIVER");
    }
}
