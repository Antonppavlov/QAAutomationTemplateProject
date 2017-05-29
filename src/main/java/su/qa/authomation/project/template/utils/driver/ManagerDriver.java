package su.qa.authomation.project.template.utils.driver;


import java.io.File;

import static com.codeborne.selenide.Configuration.browser;

public class ManagerDriver {

    public static final String os = System.getProperty("os");

    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";

    private static final String WINDOWS = "windows";

    public static void getInstance() {
        String pathToDriver =
                        "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "driver" + File.separator +
                        os + File.separator +
                        browser + File.separator;
//TODO может быть косяк при запуске на Linux

        if (browser.equals(FIREFOX)) {
            pathToDriver += "geckodriver";
        } else if (browser.equals(CHROME)) {
            pathToDriver += "chromedriver";
        }

        if (os.equals(WINDOWS)) {
            pathToDriver += ".exe";
        }

        if (System.getProperty("remote") == null) {

            if (browser.equals(FIREFOX)) {
                browser = "marionette";
                System.setProperty("webdriver.gecko.driver", pathToDriver);
            } else if (browser.equals(CHROME)) {
                System.setProperty("webdriver.chrome.driver", pathToDriver);
            }

            System.out.println(
                            "Use: \n" +
                            "OS: " + os + "\n" +
                            "Browser: " + browser + "\n" +
                            "Path to driver: " + pathToDriver
            );


        } else {
            System.out.println(System.getProperty("remote"));
        }

    }

}
