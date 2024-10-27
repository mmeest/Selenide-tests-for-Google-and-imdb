import com.codeborne.selenide.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class NewTest {

    @BeforeClass
    @Description("Test setup: open Firefox browser and maximize window")
    public void setup() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";  // Browser window
        Configuration.timeout = 10000; // Timeout

        Selenide.open();
        getWebDriver().manage().window().maximize();
    }


    @Test
    @Description("Search IMDb on Google and navigate to IMDb site")
    public void userCanSearchInGoogle(){
        openGoogleHomePage();
        verifyGoogleHomePage();
        searchForIMDb();
        clickIMDbLink();
        navigateToBornTodaySection();
        printBirthdayCelebrities();
    }

//------- 1. open google.com -----------------------------------------------------------------------

    @Step("Open Google homepage")
    private void openGoogleHomePage() {
        open("https://www.google.com/");
        WebDriverRunner.getWebDriver()
                .manage()
                .window()
                .maximize();
        sleep(2000);
    }

    @Step("Verify Google homepage URL and title")
    private void verifyGoogleHomePage() {
        String url = WebDriverRunner.url();
        assertEquals(url, "https://www.google.com/");
        String title = title();
        assertEquals(title, "Google");

        if ($(By.id("L2AGLb")).isDisplayed()) {
            $(By.id("L2AGLb"))
                    .click();
        }
    }

//------- 2. search for "imdb" ---------------------------------------------------------------------

    @Step("Search for 'imdb'")
    private void searchForIMDb() {
        $(By.name("q"))
                .shouldBe(visible)
                .setValue("imdb")
                .pressEnter();
        sleep(2000);
    }

//------- 3. click on correct search result that redirects to imdb.com -----------------------------

    @Step("Click on IMDb search result link")
    private void clickIMDbLink() {
        $("h3").shouldHave(text("IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV ..."))
                .click();
        String url = WebDriverRunner.url();
        assertEquals(url, "https://www.imdb.com/");
        sleep(2000);
    }

//------- 4. click on Menu button ------------------------------------------------------------------
//------- 5. click on "Born Today" -----------------------------------------------------------------

    @Step("Navigate to 'Born Today' section on IMDb")
    private void navigateToBornTodaySection() {
        $("button[data-testid='reject-button']")
                .shouldHave(text("Decline"))
                .click();
        $(By.xpath("/html/body/div[2]/nav/div[2]/label[1]/span"))
                .shouldBe(visible)
                .click();
        $("span.ipc-list-item__text")
                .scrollIntoView(true);
        $(By.xpath("/html/body/div[2]/nav/div[2]/aside[1]/div/div[2]/div/div[4]/span/div/div/ul/a[1]/span"))
                .shouldHave(text("Born Today"))
                .shouldBe(visible)
                .click();
        sleep(20000);
    }

//------- 6. print out 5 first celebrities who were born today -------------------------------------

    @Step("Print out first 5 celebrities born today")
    private void printBirthdayCelebrities() {
        List<SelenideElement> birthdayPeople = $$(".ipc-metadata-list-summary-item");
        for (int i = 0; i < Math.min(5, birthdayPeople.size()); i++) {
            String name = birthdayPeople.get(i).$(".ipc-title__text").getText();
            System.out.println("Born today: " + name);
        }
        sleep(2000);
    }
}

