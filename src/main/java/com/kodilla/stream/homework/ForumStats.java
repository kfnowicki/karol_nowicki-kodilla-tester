package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Average of users younger than 40: " + getYoungerAverage(UsersRepository.getUsersList()));
        System.out.println("Average of users 40 or older: " + getOlderrAverage(UsersRepository.getUsersList()));
    }
    public static Double getYoungerAverage(List<User> userList){
        Double avg = userList
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static Double getOlderrAverage(List<User> userList){
        Double avg = userList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }
}
