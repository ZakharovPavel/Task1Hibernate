package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("John", "Johnovich", (byte) 5);
        userService.saveUser("Mark", "Markovich", (byte) 7);
        userService.saveUser("Bill", "Billovich", (byte) 10);
        userService.saveUser("Chelovek", "Chelovekovich", (byte) 2);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
