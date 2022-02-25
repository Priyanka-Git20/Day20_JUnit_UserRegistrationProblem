package com.bridgelabz;

import com.bridgelabz.junit.UserRegistration;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void  givenFirstName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("Siya");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenFirstName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("siya");
        Assert.assertEquals(false,valid);
    }


}
