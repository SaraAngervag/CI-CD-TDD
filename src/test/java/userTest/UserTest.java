package userTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUserName() {
        User user = new User("Staffan", "password");
    String expected = "Staffan";
    String actual = user.getUserName();

    assertEquals(expected, actual);
}
    @Test
    public void testPassword() {
        User user = new User("Staffan", "password");
        String expected = "password";
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetUserName() {
        User user = new User("Staffan", "password");
      user.setUserName("Alan");
        String expected = "Alan";
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }

}
