package XPATH_Axes;

import org.openqa.selenium.By;

public class XPATH_Examples {


    //Immediately available above parent
    private final By parentDiv = By.xpath("//*[@class='wp-block-button__link']/parent::div");

    //Get the list of all ancestor elements above div to till now (Example: 1 to 11)
    private final By ancestorDiv = By.xpath("//*[@class='wp-block-button__link']/ancestor::div");

    //Get and finds all the child of div
    private final By allBelowDiv = By.xpath("//div/child::div");

    //selects every h2 descendant of that h2 at any depth
    private final By selectsEveryH2 = By.xpath("//*[@id=\"post-61\"]/descendant::h2");

    //following document order at any depth
    private final By selectsBelowEverydiv = By.xpath("//*[@id=\"post-61\"]/following::div");

    //at any depth
    private final By selectAboveAllDiv = By.xpath("//*[text()='Shop Now']/preceding::div");

    private final By selectFollowingSubling = By.xpath("//label[text()='Email']/following-sibling::input");

    //input[@id='pwd']/preceding-sibling::label




}
