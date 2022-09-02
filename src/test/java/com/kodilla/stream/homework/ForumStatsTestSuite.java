package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {
    User fox = new User("Fox Mulder", 39,1000,"Agents");
    User dana = new User("Dana Scully", 35,222,"Agents");
    User skinner = new User("Walter Skinner", 45,0,"Directors");
    User cigarette = new User("Cigatette Smoking Man", 50,200,"Government");
    User john = new User("John Dogget", 40,45,"Agents");
    User fitzgerald = new User("John Fitzgerald", 40, 522,"Lone Gunmen");
    User frohike = new User("Melvin Frohike", 41, 0,"Lone Gunmen");
    User richard = new User(    "Richard Langly", 37, 100,"Lone Gunmen");


    @Test
    void testRegulaarValues() {
        List<User> usersList = new ArrayList<>();
        usersList.add(dana);
        usersList.add(skinner);
        usersList.add(cigarette);
        usersList.add(richard);

        double expectedYounger = 161.0;
        double expectedOlder = 100;

        assertEquals(expectedOlder,ForumStats.getOlderrAverage(usersList));
        assertEquals(expectedYounger,ForumStats.getYoungerAverage(usersList));

    }

    @Test
    void testCornerValues() {
        List<User> usersList = new ArrayList<>();
        usersList.add(skinner);
        usersList.add(frohike);

        double expectedOlder = 0.0;

        assertEquals(expectedOlder,ForumStats.getOlderrAverage(usersList));
    }

    @Test
    void testIfZerosAvgZero() {
        List<User> usersList = new ArrayList<>();
        usersList.add(fox);
        usersList.add(john);
        usersList.add(frohike);
        usersList.add(richard);

        double expectedYounger = 550.0;
        double expectedOlder = 22.5;

        assertEquals(expectedOlder,ForumStats.getOlderrAverage(usersList));
        assertEquals(expectedYounger,ForumStats.getYoungerAverage(usersList));
    }
}