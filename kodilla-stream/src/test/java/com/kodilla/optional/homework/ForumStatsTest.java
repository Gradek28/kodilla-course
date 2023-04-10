package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    Set<User> users = new HashSet<>();

    @Test
    public void testAvgNumOfPostsForUsersWithAgeLessThan40(){
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        double result = ForumStats.getAvgLessThan40(users);
        double expectedAverage = 2382;
        assertEquals(expectedAverage, result);
    }

    @Test
    public void testAvgNumOfPostsForUserWithAgeLessThan40Example(){
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 55, 46, "Sales"));
        users.add(new User("Tuco Salamanca", 43, 16, "Manager"));
        double result = ForumStats.getAvgLessThan40(users);
        double expectedAverage = -1.0;
        assertEquals(expectedAverage, result);

    }
    @Test
    public void testAverageNumberOfPostsForUsersWithAgeGraterOrEqual40(){
        users.add(new User("Walter White", 20, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 46, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        double result = ForumStats.getAvgGraterOrEquals40(users);
        double expectedAverage = 1162.5;
        assertEquals(expectedAverage, result);
    }
}
