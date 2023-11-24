import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import pages.*;


public class MovieDetailsPageTest {

    public WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    PopularPage popularPage;
    SearchPage searchPage;
    MovieDetailsPage movieDetailsPage;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        loginPage = new LoginPage(driver);
        homePage= new HomePage(driver);
        popularPage= new PopularPage(driver);
        searchPage= new SearchPage(driver);
        movieDetailsPage= new MovieDetailsPage(driver);

        loginPage.loginToApplication("rahul", "rahul@2021");

        String expectedUrl = "https://qamoviesapp.ccbp.tech/";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedUrl, "URLs do not match");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void movieDetails(){
        movieDetailsPage.homeImage().click();
        Assert.assertTrue(movieDetailsPage.name().isDisplayed(),"name is dsnt display");
        Assert.assertTrue(movieDetailsPage.review().isDisplayed(),"review dsnt dsiplay");
        Assert.assertTrue(movieDetailsPage.para().isDisplayed(),"para dsnt display");
        Assert.assertTrue(movieDetailsPage.play().isDisplayed(),"play buttondsnt display");
        movieDetailsPage.popularAnchor().click();
        movieDetailsPage.popularImage().click();
        Assert.assertTrue(movieDetailsPage.name().isDisplayed(),"name is dsnt display");
        Assert.assertTrue(movieDetailsPage.review().isDisplayed(),"review dsnt dsiplay");
        Assert.assertTrue(movieDetailsPage.para().isDisplayed(),"para dsnt display");
        Assert.assertTrue(movieDetailsPage.play().isDisplayed(),"play buttondsnt display");

    }
}
