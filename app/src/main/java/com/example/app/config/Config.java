package com.example.app.config;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.configure().load();

    public static String getDbHost() {
        return dotenv.get("DB_HOST");
    }

    public static String getDbPort() {
        return dotenv.get("DB_PORT");
    }

    public static String getDbName() {
        return dotenv.get("DB_NAME");
    }

    public static String getDbUser() {
        return dotenv.get("DB_USER");
    }

    public static String getDbPassword() {
        return dotenv.get("DB_PASSWORD");
    }

    public static String getDbURL() {
        return dotenv.get("DB_URL");
    }

    public static String getDbDriver() {
        return dotenv.get("DB_DRIVER");
    }
}