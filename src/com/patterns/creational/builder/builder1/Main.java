package com.patterns.creational.builder.builder1;

public class Main {

    public static void main(String[] args) {

        User usuario1 = new User.Builder().setAge(23).setFirstName("Juan").setMarried(true)
                .build();

        User usuario2 = new User.Builder()
                .setAge(23)
                .setMarried(true)
                .build();
    }
}
