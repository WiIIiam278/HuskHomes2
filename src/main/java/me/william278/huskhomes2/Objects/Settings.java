package me.william278.huskhomes2.Objects;

import org.bukkit.configuration.file.FileConfiguration;

public class Settings {

    String language;
    String server;

    String storageType;

    String playerTable;
    String locationsTable;
    String homesTable;
    String warpsTable;

    boolean doBungee;

    private void setSettings(FileConfiguration configFile) {
        this.language = configFile.getString("language");
        this.doBungee = configFile.getBoolean("bungee_options.enable_bungee_mode");
        this.server = configFile.getString("bungee_options.server_id");

        this.storageType = configFile.getString("data_storage_option.storage_type");

        this.playerTable = configFile.getString("data_storage_options.table_names.player_data");
        this.locationsTable = configFile.getString("data_storage_options.table_names.location_data");
        this.homesTable = configFile.getString("data_storage_options.table_names.home_data");
        this.warpsTable = configFile.getString("data_storage_options.table_names.warp_data");

    }

    public Settings(FileConfiguration configFile) {
        setSettings(configFile);
    }

    public void reloadSettings(FileConfiguration configFile) {
        setSettings(configFile);
    }

    public String getStorageType() {
        return storageType;
    }

    public String getLanguage() {
        return language;
    }

    public String getServerID() {
        return server;
    }

    public boolean doBungee() {
        return doBungee;
    }

    public String getPlayerTable() {
        return playerTable;
    }

    public String getLocationsTable() {
        return locationsTable;
    }

    public String getHomesTable() {
        return homesTable;
    }

    public String getWarpsTable() {
        return warpsTable;
    }
}
