package com.example.nguye.seg2505app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountMethodsTest {

    // Check if setType and getType methods work
    @Test
    public void checkType(){
        Account testAccount = new Account();
        testAccount.setType(2);
        assertEquals(testAccount.getType(), 2);
    }

    // Check if setId and getId methods work
    @Test
    public void checkId(){
        Account testAccount = new Account();
        testAccount.setId(20);
        assertEquals(testAccount.getId(), 20);
    }

    // Check if setEmail and getEmail methods work
    @Test
    public void checkEmail(){
        Account testAccount = new Account();
        testAccount.setEmail("test@test.test");
        assertEquals(testAccount.getEmail(), "test@test.test");
    }

    // Check if setPassword and getPassword methods work
    @Test
    public void checkPassword(){
        Account testAccount = new Account();
        testAccount.setPassword("Password");
        assertEquals(testAccount.getPassword(), "Password");
    }

    // Check if setFirstName and getFirstName methods work
    @Test
    public void checkFirstName(){
        Account testAccount = new Account();
        testAccount.setFirstName("Test");
        assertEquals(testAccount.getFirstName(), "Test");
    }

}