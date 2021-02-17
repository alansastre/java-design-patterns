package com.patterns.creational.singleton.lazy;

/**
 * SINGLETON:
 *
 * Solo permite crear una instancia de esta clase
 */
public class DBConfiguration {

    // hardcoded

    private String url; // jdbc:mysql://127.0.0.1:3306/
    private String database; // vehicles
    private String user; // root
    private String password; // admin

    private static DBConfiguration configuration;

    private DBConfiguration(String url, String database, String user, String pass){
        this.url=url;
        this.database=database;
        this.user=user;
        this.password=pass;
    }

    public static DBConfiguration getDBConfiguration(String url, String database, String user, String pass){

        if (configuration == null)
            configuration = new DBConfiguration(url,database,user,pass);

        return configuration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
