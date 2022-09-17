package runner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {
    @BeforeAll
    static void setUp() {
        WebDriverRunner.setWebDriver(BaseProperties.getDriver());
        Selenide.open(BaseProperties.getProperties().getProperty("base_url"));
    }

    @AfterAll
    static void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
