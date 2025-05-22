package login;

import login.Login;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testCheckUserName_Valid() {
        Login l = new Login();
        assertTrue(l.checkUserName("abc_1"));
    }

    @Test
    public void testCheckUserName_Invalid() {
        Login l = new Login();
        assertFalse(l.checkUserName("longname"));
    }

    @Test
    public void testCheckPassword_Valid() {
        Login l = new Login();
        assertTrue(l.checkPasswordComplexity("Test@123"));
    }

    @Test
    public void testCheckPassword_Invalid() {
        Login l = new Login();
        assertFalse(l.checkPasswordComplexity("password"));
    }

    @Test
    public void testCheckCellPhone_Valid() {
        Login l = new Login();
        assertTrue(l.checkCellPhoneNumber("+27839123456"));
    }

    @Test
    public void testCheckCellPhone_Invalid() {
        Login l = new Login();
        assertFalse(l.checkCellPhoneNumber("0831234567"));
    }

    @Test
    public void testRegisterUser_Success() {
        Login l = new Login();
        String result = l.registerUser("abc_1", "Test@123", "+27839123456");
        assertEquals("User registered successfully.", result);
    }

    @Test
    public void testRegisterUser_FailUsername() {
        Login l = new Login();
        String result = l.registerUser("longname", "Test@123", "+27839123456");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", result);
    }

    @Test
    public void testRegisterUser_FailPassword() {
        Login l = new Login();
        String result = l.registerUser("abc_1", "pass", "+27839123456");
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", result);
    }

    @Test
    public void testRegisterUser_FailCell() {
        Login l = new Login();
        String result = l.registerUser("abc_1", "Test@123", "0831234567");
        assertEquals("Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.", result);
    }

    @Test
    public void testLoginUser_Success() {
        Login l = new Login("abc_1", "Test@123", "+27839123456");
        assertTrue(l.loginUser("abc_1", "Test@123"));
    }

    @Test
    public void testLoginUser_Failure() {
        Login l = new Login("abc_1", "Test@123", "+27839123456");
        assertFalse(l.loginUser("abc_1", "wrong"));
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String number = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String cellNumber = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password, cellNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String inputUsername = "";
        String inputPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(inputUsername, inputPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginSuccess = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(loginSuccess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}