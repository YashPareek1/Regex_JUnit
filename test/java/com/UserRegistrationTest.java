package com;
import com.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

 //Test for firstname validation
    @Test
    void CheckFirstNameWhileCorrectReturnTrue() {
        UserRegistration fName = new UserRegistration();
        String ch = fName.firstName("Mouni");
        Assertions.assertEquals("HAPPY",ch);
        System.out.println(ch);
    }

    @Test
    void CheckLastnameWhileCorrectReturnTrue() {

        UserRegistration lName = new UserRegistration();
        String ch = lName.lastName("Roy");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void CheckEmailWhileCorrectReturnTrue() {

        UserRegistration eMail = new UserRegistration();
        String ch = eMail.email("mouniroy123@gmail.com");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }



    @Test
    void CheckNumberWhileCorrectReturnTrue() {

        UserRegistration number = new UserRegistration();
        String ch = number.phoneNumber("91 7880437890");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void CheckPasswordWhileCorrectReturnTrue() {
        UserRegistration pwd = new UserRegistration();
        String ch = pwd.password("Mouni@123");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

}

