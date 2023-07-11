package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsTest;
import com.nopcommerce.demo.pages.TestSuite;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{

       TestSuite test = new TestSuite();
       ElectronicsTest eTest = new ElectronicsTest();
       @Test
       public void verifyProductArrangeInAlphaBaticalOrder()
       {
           test.setComputer();
           test.setDeskTop();
           test. beforeProduct();
           test.setZToA();
           test.afterProduct();
           String expected = "Lenovo IdeaCentre 600 All-in-One PC";
           String actual =getTextFromElement(By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]"));
           Assert.assertEquals(actual,expected);
           test.setAToz();
           test. AddToCart();
           test.message();
           test.setSelect();
           test.selectHdd();
           test.setSelect3();
           test.msOffice();
           test.setCheckBox1();
           test. setPrice();
           test.setAddToCart();
           test.setMessage();
           test.setShoppingCart();
           test. goToCard();
           test.verifyMessage();
           test.changeqty();
           test.Cart();
           test.totalPrice();
           test.setAgreeWithTerms();
           test.ousetCheckt();
           test.getText();
           test.tab();
           test.setFirstName();
           test.setLastName();
           test.setEmail();
           test. setCountry();
           test.setCity();
           test.setRadioButton();
           test.setGetContinueButton();
           test.setCreditCard();
           test.setGetContinueButton1();
           test.setMasterCard();
           test.entercarHolderName();
           test.enterCardNumber();
           test.setDate();
           test.setYear();
           test. setCode();
           test.setGetContinueButton2();

       }
       @Test
    public void  verifyUserShouldNavigateToCellPhonesPageSuccessfully()
       {
           eTest.electronics();
           eTest.cellPhone();
           eTest.getText();
           String expected = "Cell phones";
           String actual = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
           Assert.assertEquals(actual,expected);
           eTest.setListTab();
           eTest.setProductName();
           eTest.getTextNokia();
           String expected1 = "Nokia Lumia 1020";
           String actual1 =getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
           Assert.assertEquals(actual1,expected1);
           eTest.setVerifyPrice();
           String expected3 = "$349.00";
           String actual3 =getTextFromElement(By.xpath("//span[@id='price-value-20']"));
           Assert.assertEquals(actual3,expected3);

           eTest.setQty();
           eTest.setAddToCart();
           eTest. getMessage();
           eTest. setClose();
           eTest.setShoppingCart();
           eTest.gotocart();
           eTest.setMessage();
           eTest.setQty2();
           eTest. setTotal();
           eTest.setAgreeWith();
           eTest.setCheckOut();
           eTest.getWelcomeText();
           eTest.setRegister();
           eTest.registerText();
           eTest.setFirstname();
           eTest.setLastName();
           eTest.setEmail();
           eTest.setPassword();
           eTest.setConfirmPassword();
           eTest.setRegisterButton();
           eTest.setCompletedText();
           eTest.clickOnContinue();
           eTest.card();
           eTest.agreeWith();
           eTest.checkOut();
           eTest.setFirstName1();
       }

   }



