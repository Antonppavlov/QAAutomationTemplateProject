package su.qa.authomation.project.template;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.google.common.io.Files;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Attachment;
import su.qa.authomation.project.template.utils.driver.ManagerDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Configuration {

    public static String browser;

    @BeforeClass
    public static void driverConfiguration() {
        ManagerDriver.getInstance();
    }

    @Attachment(type = "image/png")
    private static byte[] screenshot(byte[] dataForScreenshot) {
        return dataForScreenshot;
    }

    @Attachment(value = "{0}", type = "text/plain")
    private static String addLogs(String attachName, String textHtml) {
        return textHtml;
    }

    @AfterClass
    public static void postConditionsAllClass() {
        clearBrowserCache();
        // WebDriverRunner.getWebDriver().close();
    }

    private static String getInfo() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        String title = Selenide.title();
        String calendar = new SimpleDateFormat("'Дата:' E yyyy.MM.dd 'и время' hh:mm:ss a zzz").format(new Date());
        return currentUrl + "\n\n" + title + "\n\n" + calendar + "\n\n" + ManagerDriver.os + "\n\n" + browser;
    }

    @Before
    public void clearScreenshotList() {
        Screenshots.screenshots.getScreenshots().clear();
    }

    @After
    public void addInfo() throws IOException {
        File lastSelenideScreenshot = Screenshots.getLastScreenshot();
        if (lastSelenideScreenshot != null) {
            screenshot(Files.toByteArray(lastSelenideScreenshot));

            addLogs("Info", getInfo());

            String html = Selenide.$(By.tagName("html")).innerHtml();
            addLogs("HTML", html);

            String javascriptErrors = Selenide.getJavascriptErrors().toString();
            addLogs("Javascript Errors", javascriptErrors);
        }
    }
}
