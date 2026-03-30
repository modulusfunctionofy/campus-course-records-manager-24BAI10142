package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * AppConfig Singleton
 * Author: Aryan Mauryakant
 */
public class AppConfig {
    private static AppConfig instance;
    private Path dataDir;

    private AppConfig() {
        this.dataDir = Paths.get("data");
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) instance = new AppConfig();
        return instance;
    }

    public Path getDataDir() { return dataDir; }
}
