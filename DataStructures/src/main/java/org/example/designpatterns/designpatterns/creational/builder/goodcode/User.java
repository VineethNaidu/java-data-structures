package org.example.designpatterns.designpatterns.creational.builder.goodcode;

public class User {
    // Required parameters
    private final String name;
    private final int age;

    // Optional parameters
    private final String phone;
    private final String address;

    // Private constructor
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Static nested Builder class
    public static class UserBuilder {
        private final String name;
        private final int age;
        private String phone;
        private String address;

        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // For demonstration
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age +
                ", phone='" + phone + "', address='" + address + "'}";
    }
}

