package com.bridgelabz;

import com.bridgelabz.junit.UserRegistration;
import org.junit.Assert;
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

    @Test
    public void  givenLastName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("Salunkhe");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenLastName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("salunkhe");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenEmailAddress_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("priyanka.chavan1408@gmail.com");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenEmailAddress_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("priya.chavan1408@");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenMobileNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("91 7066647330");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenMobileNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("917066647330");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_Having8Characters_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_Having8Characters_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("AV12@#");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("abc1234@df1");
        Assert.assertEquals(false,valid);
    }

}
