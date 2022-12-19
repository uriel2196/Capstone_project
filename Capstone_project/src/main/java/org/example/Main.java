package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","/Users/ul0122/Desktop/Repos/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");


        //SR-12111 When opening home page (https://www.demoblaze.com/)
        //there must be three categories displayed in the left:
        Thread.sleep(4000);
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Monitors")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Phones")).click();
        Thread.sleep(2000);

        //SR-12120 Clicking any of the products in the catalog displayed in the
        //homepage will display:
        driver.findElement(By.className("hrefch")).click();
        Thread.sleep(2000);

        //SR-12121
        //Clicking add to cart button will display browser alert with
        //below information:
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        //SR-12130
        //Clicking the cart link will display below information:
        //1. List of items added including picture, title, price and delete
        //link
        //2. Total of items prices
        //3. Place order button
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(1000);


        driver.close();
    }
}