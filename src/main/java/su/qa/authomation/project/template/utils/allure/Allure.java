package su.qa.authomation.project.template.utils.allure;

import com.codeborne.selenide.*;
import com.codeborne.selenide.ex.JavaScriptErrorsFound;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;
import su.qa.authomation.project.template.utils.allure.elements.impl.AllureCollection;
import su.qa.authomation.project.template.utils.allure.elements.impl.AllureElement;
import ru.yandex.qatools.allure.annotations.Step;

import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;


public class Allure {

    public static void open(Page page) {
        open(page.getUrl());
    }

    @Step("Перехожу по ссылке: {0}")
    public static void open(String relativeOrAbsoluteUrl) {
        Selenide.open(relativeOrAbsoluteUrl);
    }

    public static void open(URL absoluteUrl) {
        Selenide.open(absoluteUrl);
    }

    public static void open(String relativeOrAbsoluteUrl, String domain, String login, String password) {
        Selenide.open(relativeOrAbsoluteUrl, domain, login, password);
    }

    public static void open(URL absoluteUrl, String domain, String login, String password) {
        Selenide.open(absoluteUrl, domain, login, password);
    }

    public static void updateHash(String hash) {
        Selenide.updateHash(hash);
    }

    public static <PageObjectClass> PageObjectClass open(String relativeOrAbsoluteUrl, Class<PageObjectClass> pageObjectClassClass) {
        return Selenide.open(relativeOrAbsoluteUrl, pageObjectClassClass);
    }

    public static <PageObjectClass> PageObjectClass open(URL absoluteUrl, Class<PageObjectClass> pageObjectClassClass) {
        return Selenide.open(absoluteUrl, pageObjectClassClass);
    }

    public static <PageObjectClass> PageObjectClass open(String relativeOrAbsoluteUrl, String domain, String login, String password, Class<PageObjectClass> pageObjectClassClass) {
        return Selenide.open(relativeOrAbsoluteUrl, domain, login, password, pageObjectClassClass);
    }

    public static <PageObjectClass> PageObjectClass open(URL absoluteUrl, String domain, String login, String password, Class<PageObjectClass> pageObjectClassClass) {
        return Selenide.open(absoluteUrl, domain, login, password, pageObjectClassClass);
    }

    @Step("Закрываю браузер")
    public static void close() {
        Selenide.close();
    }

    @Step("Обновляю страницу")
    public static void refresh() {
        Selenide.refresh();
    }

    public static void back() {
        Selenide.back();
    }

    public static void forward() {
        Selenide.forward();
    }

    public static String title() {
        return Selenide.title();
    }

    @Step("Ожидаю {0} milliseconds")
    public static void sleep(long milliseconds) {
        Selenide.sleep(milliseconds);
    }

    public static String screenshot(String fileName) {
        return Selenide.screenshot(fileName);
    }

    public static AllureElement $(String cssSelector) {
        return new AllureElement(Selenide.$(cssSelector));
    }

    public static AllureElement $(SelenideElement selenideElement) {
        return new AllureElement(selenideElement);
    }

    public static AllureElement $(TypeElement typeElement, WebElement webElement) {
        return new AllureElement(Selenide.$(webElement), typeElement);
    }

    public static AllureElement $(TypeElement typeElement, SelenideElement selenideElement) {
        return new AllureElement(selenideElement, typeElement);
    }

    public static AllureElement $(TypeElement typeElement, SelenideElement selenideElement, String nameElement) {
        return new AllureElement(selenideElement, typeElement, nameElement);
    }

    public static AllureElement $(TypeElement typeElement, String cssSelector) {
        return new AllureElement(Selenide.$(cssSelector), typeElement);
    }

    public static AllureElement $(TypeElement typeElement, String cssSelector, String nameElement) {
        return new AllureElement(Selenide.$(cssSelector), typeElement, nameElement);
    }

    public static AllureElement $(TypeElement typeElement, By seleniumSelector) {
        return new AllureElement(getElement(seleniumSelector), typeElement);
    }

    public static AllureElement $(TypeElement typeElement, By seleniumSelector, int index) {
        return new AllureElement(getElement(seleniumSelector, index), typeElement);
    }


    public static AllureElement $(TypeElement typeElement, String cssSelector, int index) {
        return new AllureElement(Selenide.$(cssSelector, index), typeElement);
    }

    public static AllureCollection $$(Collection<? extends WebElement> elements) {
        ElementsCollection elementsCollection = Selenide.$$(elements);
        return new AllureCollection(elementsCollection);
    }

    public static AllureCollection $$(String cssSelector) {
        ElementsCollection elementsCollection = Selenide.$$(cssSelector);
        return new AllureCollection(elementsCollection);
    }

    public static AllureCollection $$(By seleniumSelector) {
        ElementsCollection elementsCollection = Selenide.$$(seleniumSelector);
        return new AllureCollection(elementsCollection);

    }

    public static SelenideElement getElement(By criteria) {
        return Selenide.getElement(criteria);
    }

    public static SelenideElement getElement(By criteria, int index) {
        return Selenide.getElement(criteria, index);
    }

    public static AllureCollection getElements(By criteria) {
        ElementsCollection elementsCollection = Selenide.getElements(criteria);
        return new AllureCollection(elementsCollection);

    }

    public static <T> T executeJavaScript(String jsCode, Object... arguments) {
        return Selenide.executeJavaScript(jsCode, arguments);
    }

    @Deprecated
    public static SelenideElement selectRadio(By radioField, String value) {
        return Selenide.selectRadio(radioField, value);
    }

    public static SelenideElement getSelectedRadio(By radioField) {
        return Selenide.getSelectedRadio(radioField);
    }

    public static void onConfirmReturn(boolean confirmReturnValue) {
        Selenide.onConfirmReturn(confirmReturnValue);
    }

    public static String confirm() {
        return confirm((String) null);
    }

    public static String confirm(String expectedDialogText) {
        return Selenide.confirm(expectedDialogText);
    }

    public static String dismiss() {
        return Selenide.dismiss();
    }

    public static String dismiss(String expectedDialogText) {
        return Selenide.dismiss(expectedDialogText);
    }

    public static SelenideTargetLocator switchTo() {
        return Selenide.switchTo();
    }

    public static WebElement getFocusedElement() {
        return Selenide.getFocusedElement();
    }

    public static <PageObjectClass> PageObjectClass page(Class<PageObjectClass> pageObjectClass) {
        return Selenide.page(pageObjectClass);
    }

    public static <PageObjectClass, T extends PageObjectClass> PageObjectClass page(T pageObject) {
        return Selenide.page(pageObject);
    }

    public static FluentWait<WebDriver> Wait() {
        return Selenide.Wait();
    }

    public static Actions actions() {
        return Selenide.actions();
    }

    public static List<String> getJavascriptErrors() {
        return Selenide.getJavascriptErrors();
    }

    public static void assertNoJavascriptErrors() throws JavaScriptErrorsFound {
        Selenide.assertNoJavascriptErrors();
    }

    public static void zoom(double factor) {
        Selenide.zoom(factor);
    }

    public static List<String> getWebDriverLogs(String logType) {
        return Selenide.getWebDriverLogs(logType);
    }

    public static List<String> getWebDriverLogs(String logType, Level logLevel) {
        return Selenide.getWebDriverLogs(logType, logLevel);
    }

    @Step("Проверяю что тайтл {0} в течении {1} миллисекунд")
    public static void checkTitle(String expectedTitle, int milliseconds) {
        for (int i = 0; i < milliseconds / 100; i++) {
            sleep(100);
            if (title().equals(expectedTitle)) {
                break;
            }
        }
        Assert.assertEquals(title(), expectedTitle);
    }


}