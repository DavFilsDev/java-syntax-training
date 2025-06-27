package _training.advanced.user_authentification_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    private AuthService authService;

    @BeforeEach
    void setUp() {
        authService = new AuthService();
    }

    @Test
    void testRegisterAndAuthenticateUser() {
        authService.register("alice", "password123", Role.USER);
        assertTrue(authService.authenticate("alice", "password123"));
    }

    @Test
    void testAuthenticationFailsWithWrongPassword() {
        authService.register("bob", "securePass", Role.USER);
        assertFalse(authService.authenticate("bob", "wrongPass"));
    }

    @Test
    void testUserRoleVerification() {
        authService.register("admin1", "root", Role.ADMIN);
        assertTrue(authService.hasRole("admin1", Role.ADMIN));
        assertFalse(authService.hasRole("admin1", Role.USER));
    }

    @Test
    void testDuplicateUserRegistrationThrowsException() {
        authService.register("carol", "1234", Role.USER);
        assertThrows(IllegalArgumentException.class, () -> authService.register("carol", "newpass", Role.USER));
    }

    @Test
    void testAuthenticateUnknownUser() {
        assertFalse(authService.authenticate("ghost", "none"));
    }
}
