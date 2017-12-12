package ru.stqa.training.selenium;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseAdmin {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        driver = new FirefoxDriver();//конструирование объекта (инициализация драйвера и браузера)
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void IDE()  {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        //
        driver.findElement(By.cssSelector("span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-logotype > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-product_groups > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-option_groups > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-manufacturers > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-suppliers > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-delivery_statuses > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-sold_out_statuses > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-quantity_units > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[3]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[4]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[5]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-newsletter > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[6]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[7]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-storage_encoding > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[8]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-customer > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-shipping > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-payment > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-order_total > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-order_success > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-order_action > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[9]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-order_statuses > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[10]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[11]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-most_sold_products > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-most_shopping_customers > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[12]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-defaults > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-general > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-listings > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-images > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-checkout > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-advanced > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-security > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[13]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[14]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-tax_rates > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[15]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-scan > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[16]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[17]")).click();
        driver.findElement(By.cssSelector("h1"));
    }
    @After
        public void stop() {
        driver.quit();
        driver = null;
        }
}
