package com.kodilla.stream;

import java.util.Set;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();

        Set<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static Set<String> filterChemistGroupUsernames() {
        Set<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUsername)
                .collect(Collectors.toSet());
        return usernames;
    }

    private static void processUsersStream() {
        UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUsername)
                .forEach(username -> System.out.println(username));

    }

    public static String getUsername(User user) {
        return user.getUsername();
    }

    public static Set<User> filterUsersOlderThanGivenAge(int age) {
        return UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toSet());

    }
}

