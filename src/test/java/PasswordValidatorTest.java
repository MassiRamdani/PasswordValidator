import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PasswordValidatorTest {

    //test pour mot de passe simple
    @Test
    public void testLengthPassword() {
        assertFalse(PasswordValidator.isValidPassword("massi"));
    }

    @Test
    public void testNumberInPassword() {
        assertTrue(PasswordValidator.isValidPassword("ssss22"));
    }

    @Test
    public void testLetterInPassword() {
        assertFalse(PasswordValidator.isValidPassword("123654"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("massi6"));
    }
    //tests pour mot de passe admin
    @Test
    public void testLengthPasswordAdmin() {
        assertFalse(PasswordValidator.isValidPasswordAdmin("massi@123"));
    }
    @Test
    public void testNumberInPasswordAdmin() {
        assertFalse(PasswordValidator.isValidPasswordAdmin("ramdanic22"));
    }
    @Test
    public void testLetterInPasswordAdmin() {
        assertFalse(PasswordValidator.isValidPasswordAdmin("123654//*@++"));
    }
    @Test
    public void testSpecialCharInPasswordAdmin() {
        assertFalse(PasswordValidator.isValidPasswordAdmin("ramdaniM066"));
    }
    @Test
    public void testInvalideSpecialCharInPasswordAdmin() {
        assertFalse(PasswordValidator.isValidPasswordAdmin("massi)5263123"));
    }
    @Test
    public void testValidPasswordAdmin() {
        assertTrue(PasswordValidator.isValidPasswordAdmin("massinissa6@"));
    }

}