package com.ovchingus.service;

import com.ovchingus.persistence.settings.DaoSettings;

public class Settings {

    public static void setSourceMySQL() {
        DaoSettings.setSourceMySQL();
    }

    public static void setSourceCSV() {
        DaoSettings.setSourceCSV();
    }

    public static boolean isSourceMySQL() {
        return DaoSettings.isSourceMySQL();
    }

    public static boolean isSourceCSV() {
        return DaoSettings.isSourceCSV();
    }

    public static String getCsvFilePath() {
        return DaoSettings.getCsvFilePath();
    }

    public static void setCsvFilePath(String path) {
        DaoSettings.setCsvFilePath(path);
    }

    public static void setStepsToUpdateCsv(int count) {
        DaoSettings.setCleanFileAfterNumberOfOperations(count);
    }

    public static int getStepsToUpdateCsv() {
        return DaoSettings.getCleanFileAfterNumberOfOperations();
    }
}
