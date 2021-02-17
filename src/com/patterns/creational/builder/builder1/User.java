package com.patterns.creational.builder.builder1;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String nif;
    private Boolean married;

    private User(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.nif = builder.nif;
        this.married = builder.married;
    }

    public static class Builder{
        private Long id;
        private String firstName;
        private String lastName;
        private Integer age;
        private String nif;
        private Boolean married;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setNif(String nif) {
            this.nif = nif;
            return this;
        }

        public Builder setMarried(Boolean married) {
            this.married = married;
            return this;
        }

        User build(){
            return new User(this);
        }
    }
}
