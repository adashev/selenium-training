package ru.stqa.training.selenium;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCaseAdmin {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public WebDriver driver;
    public WebDriverWait wait;
    private List<WebElement> menu, podmenu;
    private int apps, countLi; // считаем кол-во элементов
    private int i,j;

    @Before
    public void start () {
        if (tlDriver.get() != null) {
            driver = tlDriver.get();
            wait = new WebDriverWait(driver, 10);
            return;
        }
        driver = new ChromeDriver();//конструирование объекта (инициализация драйвера и браузера)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tlDriver.set(driver);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void testCase() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        menu = driver.findElements(By.id("app-"));
        apps = menu.size();
        for (i = 0; i < apps; i++) {
            menu.get(i).click();
            driver.findElement(By.cssSelector("h1"));
            podmenu = driver.findElements(By.cssSelector("#app- > ul > li"));
            countLi = podmenu.size();
            for (j = 0; j < countLi; j++) {
                podmenu.get(j).click();
                driver.findElement(By.cssSelector("h1"));
                podmenu = driver.findElements(By.cssSelector("#app- > ul > li"));
            }
            menu = driver.findElements(By.id("app-"));
        }
    }
    @After
        public void stop() {
        driver.quit();
        driver = null;
        }
    }

