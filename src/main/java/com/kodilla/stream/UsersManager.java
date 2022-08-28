package com.kodilla.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println("----------------");
        List <String> topUsers = findMostActiveUsers();
        System.out.println(topUsers);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<User> filterOlderUsernames(int age) {
        List<User> olderUsers = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return olderUsers;
    }

    public static List<String> findMostActiveUsers(){
        List <String> mostActiveUsers = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 0)
                .sorted(Comparator.comparingInt(User::getNumberOfPost).reversed())
                .map(UsersManager::showUserStats)
                .collect(Collectors.toList());
        return mostActiveUsers;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static String showUserStats (User user){
        return user.getUsername() + ": " + user.getNumberOfPost() ;
    }
}
