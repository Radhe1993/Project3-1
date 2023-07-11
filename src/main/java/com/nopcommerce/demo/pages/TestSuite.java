package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TestSuite extends Utility
{
    By computer = By.linkText("Computers");
    By deskTop = By.xpath("//ul[@class='sublist']/li/a[@href='/desktops']");
    ArrayList<String> before = new ArrayList<>();
    By zToA = By.xpath("//select[@id='products-orderby']/option[@value='6']");
    ArrayList<String> after = new ArrayList<>();
    By AToZ = By.name("products-orderby");

    By addToCart =By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By message = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By select = By.xpath("//select[@id='product_attribute_1']");
    By select1 = By.xpath("//select[@id='product_attribute_2']");
    By select2 = By.xpath("//input[@id='product_attribute_3_7']");
    By select3 = By.xpath("//input[@id='product_attribute_4_9']");
    By checkBox = By.xpath("product_attribute_5_10");
    By checkBox1 = By.xpath("//label[contains(text(),'Total Commander [+$5.00]')]");
    By price = By.xpath("//span[@id='price-value-1'][text()='$1,475.00']");
    By addToCart1 = By.xpath("//button[@id='add-to-cart-button-1']");
    By message1 = By.xpath("//body/div[@class='bar-notification-container']/div[1]");
    By shoppingCart = By.xpath("//ul/li/a[@class='ico-cart']/span[1]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By message2 = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By qty = By.xpath("//input[@id='itemquantity11225']");
    By cart = By.xpath("//button[@id='updatecart']");
    By total = By.xpath("//tbody/tr[1]/td[6]");
    By agreeWithTerms = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");
    By text = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By tab = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber =By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By radioButton = By.xpath("//input[@id='shippingoption_1']");
    By getContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By getContinueButton1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By masterCard = By.xpath("//option[contains(text(),'Master card')]");
    By carHolderName =By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By date = By.xpath("//option[contains(text(),'05')]");
    By year = By.xpath("//option[contains(text(),'05')]");
    By code = By.xpath("//input[@id='CardCode']");
    By getContinueButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");



    public void setComputer()
    {
        clickOnElement(computer);
    }
    public void setDeskTop()
    {
        clickOnElement(deskTop);
    }
    public void beforeProduct()
    {
        List<WebElement> products =  driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        System.out.println("Total produtc ="+products.size());
        for (WebElement e : products)
        {
            before.add(e.getText());
        }
        System.out.println("Product Name = "+before);
    }

    public void setZToA()
    {
        clickOnElement(zToA);

    }
    public void afterProduct()
    {
        List<WebElement> products1 = driver.findElements(By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]"));
        System.out.println("Total product ="+products1.size());
        for (WebElement p : products1)
        {
            after.add(p.getText());
        }
        System.out.println("Product Name = "+after);
    }
    public void setAToz()
    {
        //1.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(AToZ,"Name: A to Z");
    }

    public void AddToCart()
    {
        //2.4 Click on "Add To Cart"
        clickOnElement(addToCart);
    }
    public void message()
    {
        //2.5 Verify the Text "Build your own computer"
        getTextFromElement(message);
    }
    public void setSelect()
    {
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        clickOnElement(select);
    }
    public void setSelect1()
    {
        //2.7.Select "8GB [+$60.00]" using Select class.
        clickOnElement(select1);
    }
    public void selectHdd()
    {
        //2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(select2);
    }
    public void setSelect3()
    {
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(select3);
    }
    public void msOffice()
    {
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        clickOnElement(checkBox);
    }
    public void setCheckBox1()
    {
        // //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //        //[+$5.00]"
        clickOnElement(checkBox1);
    }
    public void setPrice()
    {
        //2.11 Verify the price "$1,475.00"
        getTextFromElement(price);
    }
    public void setAddToCart()
    {
        //2.12 Click on "ADD TO CARD" Button.
        clickOnElement(addToCart1);
    }
    public void setMessage()
    {
        //Verify the Message "The product has been added to your shopping cart" on Top
        getTextFromElement(message1);
    }
    public void setShoppingCart()
    {
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART
        mouseHoverToElement(shoppingCart);
    }
    public void goToCard()
    {
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART
        clickOnElement(goToCart);
    }
    public void verifyMessage()
    {
        //2.15 Verify the message "Shopping cart"
        getTextFromElement(message2);
    }
    public void changeqty()
    {
        //Change the Qty to "2" and Click on "Update shopping cart"
        remove(qty,"2");

    }
    public void Cart()
    {
        //"Update shopping cart"
        clickOnElement(cart);
    }
    public void totalPrice()
    {
        //2.17 Verify the Total"$2,950.00
        getTextFromElement(total);
    }
    public void setAgreeWithTerms()
    {
        //2.18 click on checkbox “I agree with the terms of service”
        clickOnElement(agreeWithTerms);
    }
    public void ousetCheckt()
    {
        //2.19 Click on “CHECKOUT”
        clickOnElement(checkout);
    }
    public void getText()
    {
        //2.20 Verify the Text “Welcome, Please Sign In!”
        getTextFromElement(text);
    }
    public void tab()
    {
        //In!”
        //2.21Click on “CHECKOUT AS GUEST” Tab
        clickOnElement(tab);
    }
       public void setFirstName()
       {
           //Fill the all mandatory field
           sendTextToElement(firstName,"Ram");

       }
       public void setLastName() {
           //Fill the all mandatory field
           sendTextToElement(lastName, "Sita");

       }
       public void setEmail()
       {
           //Fill the all mandatory field
           sendTextToElement(email,"prime@gmail.com");

       }
       public void setCountry()
       {
           clickOnElement(country);
       }
       public void setCity()
       {
           sendTextToElement(city,"surat");

       }
       public void setAddress()
       {
           sendTextToElement(address,"35,seragvilla");
       }
       public void setPostcode()
       {
           sendTextToElement(postcode,"678956");
       }
       public void setPhoneNumber()
       {
           sendTextToElement(phoneNumber,"9988675457");
       }
       public void setContinueButton()
       {
           //Click on “CONTINUE”
           clickOnElement(continueButton);
       }
       public void setRadioButton()
       {
           //Click on Radio Button “Next Day Air($0.00)”
           clickOnElement(radioButton);
       }
       public void setGetContinueButton()
       {
           //2.25 Click on “CONTINUE”
           clickOnElement(getContinueButton);
       }
       public void setCreditCard()
       {
           //2.26 Select Radio Button “Credit Card”
           clickOnElement(creditCard);
       }
       public void setGetContinueButton1()
       {
           clickOnElement(getContinueButton1);
       }
       public void setMasterCard()
       {
           clickOnElement(masterCard);
       }
       public void entercarHolderName()
       {
           sendTextToElement(carHolderName,"Radha");
       }
       public void enterCardNumber()
       {
           sendTextToElement(cardNumber,"6756");
       }
       public void setDate()
       {
           clickOnElement(date);
       }
       public void setYear()
       {
           clickOnElement(year);
       }
       public void setCode()
       {
           sendTextToElement(code,"235466");
       }
       public void setGetContinueButton2()
       {
           clickOnElement(getContinueButton2);
       }



}
