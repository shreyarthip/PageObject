package org.example;

import org.testng.annotations.Test;

import java.awt.print.Book;

import static java.awt.SystemColor.desktop;

public class TestSuit extends BaseTest{
    //create Object of HomePage
    HomePage homePage = new HomePage();
    //create Object of  RegisterPage
   RegisterPage registerPage = new RegisterPage();
   //create Object of  RegisterSuccessPage
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    //create Object of Computer
    Computer computer= new Computer();
    //create Object of Desktop
    Desktop desktop = new Desktop();
    BookCart bookCart = new BookCart();

    @Test( priority= 1)
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        //verify user is on homepage
       // homePage.verifyUserOnHomePage();
        //click on register button
        homePage.clickOnRegisterButton();
        //user Enter Registration Details
        registerPage.userEnterRegistrationDetails();
        //user Click On Register Submit-Button
        registerPage.userClickOnRegisterSubmitButton();
    }

    @Test(priority = 2)
    public void userShouldBeAbleToEmailAFriendSuccessfully() {
        //click on RegisterButton
        homePage.clickOnRegisterButton();
        //user Enter Register Details
        registerPage.userEnterRegistrationDetails();
        //user click on Register SubmitButton
        registerPage.userClickOnRegisterSubmitButton();
        homePage.ClickOnComputer();
        // user Click On Desktop
        computer.userClickOnDesktop();
        //user click on Email friend
        desktop.ClickOnEmailFriend();
    }

    @Test(priority = 3)
    public void userShouldBeAbleToAddTheItemInCartSuccessfully(){
        //click on Books
        homePage.clickOnBooks();
        //user Enter Add to cart
        bookCart.userEnterItemAddToCart();














    }

    }

