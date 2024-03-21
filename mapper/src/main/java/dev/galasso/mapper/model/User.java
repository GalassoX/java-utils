package dev.galasso.mapper.model;

public class User {
    String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printAge() {
        System.out.println(this.age);
    }
}
