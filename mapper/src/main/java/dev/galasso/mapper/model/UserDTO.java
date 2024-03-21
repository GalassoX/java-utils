package dev.galasso.mapper.model;

public class UserDTO {
    String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printName() {
        System.out.println(this.name);
    }
}
