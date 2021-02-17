package com.patterns.creational.singleton.threadsafe;

public class DbConfiguration {

    static DbConfiguration singleton;

    private DbConfiguration(){}

    public static DbConfiguration getDBConfiguration(){

        return DbConfigurationHelper.configuration;
    }

    /*
     * CLASE HELPER
     */

    private static class DbConfigurationHelper{
        private static final DbConfiguration configuration = new DbConfiguration();
    }

}
