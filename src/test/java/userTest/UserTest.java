package userTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUserName() {
        User user = new User("Anna", "password");
        String expected = "Anna";
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }

    @Test
    public void testPassword() {
        User user = new User("Anna", "password");
        String expected = "password";
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName() {
        User user = new User("Anna", "password");
        user.setUserName("Klara");
        String expected = "Klara";
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }

}
