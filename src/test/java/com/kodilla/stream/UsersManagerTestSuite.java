package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    void testFilterChemistGroupUsernames() {
        List<String> result = UsersManager.filterChemistGroupUsernames();
        List<String> expected = new ArrayList<>();
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

    @Test
    void testFindMostActiveUsers(){
        List <String> importedList = UsersManager.findMostActiveUsers();
        List <Integer> extractedList = new ArrayList<>();
        for (String activeUser : importedList)
            extractedList.add(Integer.parseInt(activeUser.replaceAll("[^0-9]", "")));
        List<Integer> sortedList = new ArrayList<Integer>(extractedList);
        Collections.sort(sortedList);
        Collections.reverse(sortedList);

        assertEquals(extractedList,sortedList);
    }
}