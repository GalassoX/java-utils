package dev.galasso.mapper;

import dev.galasso.mapper.model.User;
import dev.galasso.mapper.model.UserDTO;

public class Main {

    static Mapper mapper = new Mapper();

    public static void main(String[] args) {
        userToDTO();
        dtoToUser();
    }

    public static void userToDTO() {
        User user = new User();

        user.setName("Rafael");
        user.setAge(22);

        UserDTO userDTO = mapper.map(user, UserDTO.class);
        userDTO.printName();
    }

    public static void dtoToUser() {
        UserDTO userDTO = new UserDTO();

        userDTO.setName("Rafael");
        userDTO.setAge(22);

        User user = mapper.map(userDTO, User.class);
        user.printAge();
    }
}