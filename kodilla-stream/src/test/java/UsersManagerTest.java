import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void shouldReturnCorrectUsernamesForChemists(){
            Set<String> result = UsersManager.filterChemistGroupUsernames();
            Set<String> expectedList = new HashSet<>();
            expectedList.add("Gale Boetticher");
            expectedList.add("Walter White");
            assertEquals(expectedList, result);



        }

        @Test
        public void testFilterUsersOlderThanAge45(){
            final int limit = 45;
            Set<User> result = UsersManager.filterUsersOlderThanGivenAge(limit);
            Set<User> expectedList = new HashSet<>();
            expectedList.add(new User("Walter White", 50, 7, "Chemists"));
            expectedList.add(new User("Gus Firing", 49, 0, "Board"));
            expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
            assertEquals(expectedList, result);





    }
}
