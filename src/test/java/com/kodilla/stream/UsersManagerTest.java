package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames() {
        List<String> result = UsersManager.filterChemistGroupUsernames();
        List expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        assertEquals(result,expected);
    }

    @Test
    void testFilterOlderUsernames(){
        List <User> result = UsersManager.filterOlderUsernames(34);
        boolean expected = true;
        int counter = 0;
        for (User user : result){
            if (user.getAge() <= 34)
                expected = false;
            else
                counter++;
        }

        assert (expected);
        assertEquals(result.size(),counter);
    }
}