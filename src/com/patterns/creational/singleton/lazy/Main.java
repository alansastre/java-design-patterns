package com.patterns.creational.singleton.lazy;

public class Main {

    public static void main(String[] args) {


        DBConfiguration config1 = DBConfiguration.getDBConfiguration(
                "jdbc:mariadb://locahost:65129",
                "customers",
                "root",
                "admin");


        DBConfiguration config2 = DBConfiguration.getDBConfiguration(
                "jdbc:mariadb://locahost:65129",
                "customers",
                "root",
                "admin");

        if (config1 == config2)
            System.out.println("Mismo objeto");
    }
}
