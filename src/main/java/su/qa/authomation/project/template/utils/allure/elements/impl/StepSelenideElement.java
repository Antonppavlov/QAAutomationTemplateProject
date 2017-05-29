package su.qa.authomation.project.template.utils.allure.elements.impl;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;

import java.io.File;
import java.io.FileNotFoundException;

public class StepSelenideElement {
    @Step("Перехожу по href в {0} {1}")
    public static void followLink(TypeElement typeElement, String nameElement) {
    }

    @Step("Очищаю {0} {1} и ввожу: {2}")
    public static void setValue(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("Очищаю {0} {1} и ввожу: {2}")
    public static void val(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("В {0} {1} ввожу: {2}")
    public static void append(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("На {0} {1} нажимаю кнопку Enter")
    public static void pressEnter(TypeElement typeElement, String nameElement) {
    }

    @Step("На {0} {1} нажимаю кнопку Tab")
    public static void pressTab(TypeElement typeElement, String nameElement) {
    }

    @Step("На {0} {1} нажимаю кнопку Escape")
    public static void pressEscape(TypeElement typeElement, String nameElement) {
    }

    // @Step("Из {0} {1} получаю текст")
    public static void getText(TypeElement typeElement, String nameElement) {
    }

    @Step("Из {0} {1} по условию {3} получаю List<WebElement>")
    public static void findElements(TypeElement typeElement, String nameElement, By by) {
    }

    @Step("Из {0} {1} по условию {3} получаю WebElement")
    public static void findElement(TypeElement typeElement, String nameElement, By by) {
    }

    //  @Step("Из {0} {1} получаю текст")
    public static void text(TypeElement typeElement, String nameElement) {
    }

    @Step("Получаю текстовый код {0} {1} с детьми")
    public static void innerText(TypeElement typeElement, String nameElement) {
    }

    @Step("Получить HTML код {0} {1} с детьми")
    public static void innerHtml(TypeElement typeElement, String nameElement) {
    }

    @Step("Получить атрибут {2} из {0} {1}")
    public static void attr(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("Получить атрибут name из {0} {1}")
    public static void name(TypeElement typeElement, String nameElement) {
    }

    @Step("Получить атрибут value из {0} {1}")
    public static void val(TypeElement typeElement, String nameElement) {
    }

    @Step("Получить атрибут value из {0} {1}")
    public static void getValue(TypeElement typeElement, String nameElement) {
    }

    @Step("Выбраю в {0} {1} радиокнопку {2}")
    public static void selectRadio(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("Получить data из {0} {1} по атрибуту {2}")
    public static void data(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("Проверяю что {0} {1} существует на странице")
    public static void exists(TypeElement typeElement, String nameElement) {
    }

    @Step("Проверяю что {0} {1} отображается на странице")
    public static void isDisplayed(TypeElement typeElement, String nameElement) {
    }

    @Step("Получаю Location {0} {1}")
    public static void getLocation(TypeElement typeElement, String nameElement) {
    }

    @Step("Получаю Size {0} {1}")
    public static void getSize(TypeElement typeElement, String nameElement) {
    }

    @Step("Получаю location and size {0} {1}")
    public static void getRect(TypeElement typeElement, String nameElement) {
    }

    @Step("Получить из {0} {1} значение {2} CSS свойства")
    public static void getCssValue(TypeElement typeElement, String nameElement, String s) {
    }

    @Step("Проверяю соответвует ли {0} {1} условию {2}")
    public static void is(TypeElement typeElement, String nameElement, Condition condition) {
    }

    @Step("Проверяю соответвует ли {0} {1} условию {2}")
    public static void has(TypeElement typeElement, String nameElement, Condition condition) {
    }

    @Step("Выбираю {3} на флажке в елементе {0} {1}")
    public static void setSelected(TypeElement typeElement, String nameElement, boolean b) {
    }

    @Step("{0} {1} должен: {2}")
    public static void should(TypeElement typeElement, String nameElement, Condition... conditions) {
    }

    @Step("{0} {1} должен иметь: {2}")
    public static void shouldHave(TypeElement typeElement, String nameElement, Condition... conditions) {
    }

    @Step("{0} {1} должен быть: {2}")
    public static void shouldBe(TypeElement typeElement, String nameElement, Condition... conditions) {
    }

    @Step("{0} {1} не должен:  {2}")
    public static void shouldNot(TypeElement typeElement, String nameElement, Condition... conditions) {
    }

    @Step("{0} {1} не должен иметь: {2}")
    public static void shouldNotHave(TypeElement typeElement, String nameElement, Condition... conditions) {
    }

    @Step("{0} {1} не должен быть: {2}")
    public static void shouldNotBe(TypeElement typeElement, String nameElement, Condition... conditions) {
    }


    @Step("{0} {1} должен стать: {2} в течении {3} мс")
    public static void waitUntil(TypeElement typeElement, String nameElement, Condition condition, long l) {
    }

    @Step("{0} {1} должен соответсвовать: {2} в течении {3} мс")
    public static void waitUntil(TypeElement typeElement, String nameElement, Condition condition, long l, long l1) {
    }


    @Step("{0} {1} должен НЕ соответсвовать: {2} в течении {3} мс")
    public static void waitWhile(TypeElement typeElement, String nameElement, Condition condition, long l) {
    }

    @Step("{0} {1} должен НЕ соответсвовать: {2} в течении {3} мс")
    public static void waitWhile(TypeElement typeElement, String nameElement, Condition condition, long l, long l1) {
    }

    //  @Step("Из {0} {1} получаю элемент родителя")
    public static void parent(TypeElement typeElement, String nameElement) {
    }

    //@Step("Из {0} {1} получаю билжайшие элемент")
    public static void closest(TypeElement typeElement, String nameElement, String s) {
    }

    // @Step
    public static void find(TypeElement typeElement, String nameElement, String cssSelector) {
    }

    //    @Step
    public static void find(TypeElement typeElement, String nameElement, String cssSelector, int i) {
    }

    //  @Step
    public static void find(TypeElement typeElement, String nameElement, By by) {
    }

    //   @Step
    public static void find(TypeElement typeElement, String nameElement, By by, int i) {
    }

    // @Step
    public static void $(TypeElement typeElement, String nameElement, String s) {
    }

    //   @Step
    public static void $(TypeElement typeElement, String nameElement, String s, int i) {
    }

    //  @Step
    public static void $(TypeElement typeElement, String nameElement, By by) {
    }

    //  @Step
    public static void $(TypeElement typeElement, String nameElement, By by, int i) {
    }

    //  @Step
    public static void findAll(TypeElement typeElement, String nameElement, String s) {
    }

    //   @Step
    public static void findAll(TypeElement typeElement, String nameElement, By by) {
    }

    // @Step
    public static void $$(TypeElement typeElement, String nameElement, String s) {
    }

    //   @Step
    public static void $$(TypeElement typeElement, String nameElement, By by) {
    }

    //  @Step
    public static void uploadFromClasspath(TypeElement typeElement, String nameElement, String... strings) {
    }

    //  @Step
    public static void uploadFile(TypeElement typeElement, String nameElement, File... files) {
    }

    @Step("В {0} {1} выбираю {2} пункт")
    public static void selectOption(TypeElement typeElement, String nameElement, int... ints) {
    }

    @Step("В {0} {1} выбираю {2}")
    public static void selectOption(TypeElement typeElement, String nameElement, String... strings) {
    }

    @Step("В {0} {1} выбираю {2}")
    public static void selectOptionByValue(TypeElement typeElement, String nameElement, String... strings) {
    }

    //@Step("из {0} {1} получаю выбранный пункт")
    public static void getSelectedOption(TypeElement typeElement, String nameElement) throws NoSuchElementException {
    }

    //@Step("из {0} {1} получаю  список выбранных пунктов")
    public static void getSelectedOptions(TypeElement typeElement, String nameElement) {
    }

    //@Step("из {0} {1} получаю текст value пункта")
    public static void getSelectedValue(TypeElement typeElement, String nameElement) {
    }

    //@Step("из {0} {1} получаю текст выбранного пункта")
    public static void getSelectedText(TypeElement typeElement, String nameElement) {
    }

    @Step("скролю к {0} {1}")
    public static void scrollTo(TypeElement typeElement, String nameElement) {
    }


    @Step
    public static void download(TypeElement typeElement, String nameElement) throws FileNotFoundException {
    }

    @Step
    public static void toWebElement(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void getWrappedElement(TypeElement typeElement, String nameElement) {
    }

    @Step("Нажжимаю на {0} {1}")
    public static void click(TypeElement typeElement, String nameElement) {
    }

    @Step("Выбираю {0} {1}")
    public static void submit(TypeElement typeElement, String nameElement) {
    }

    @Step("Вожу в {0} {1} текст: {2}")
    public static void sendKeys(TypeElement typeElement, String nameElement, CharSequence... charSequences) {
    }

    @Step("Очищаю {0} {1}")
    public static void clear(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void getTagName(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void getAttribute(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void isSelected(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void isEnabled(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void contextClick(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void doubleClick(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void hover(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void dragAndDropTo(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void dragAndDropTo(TypeElement typeElement, String nameElement, WebElement webElement) {
    }

    @Step
    public static void isImage(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void screenshot(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void screenshotAsImage(TypeElement typeElement, String nameElement) {
    }

    //    @Step
//    public <X> X getScreenshotAs(TypeElement typeElement, String nameElement, OutputType<X> outputType) throws WebDriverException {}
    @Step
    public static void findElementByClassName(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByClassName(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementByCssSelector(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByCssSelector(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementById(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsById(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementByLinkText(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByLinkText(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementByPartialLinkText(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByPartialLinkText(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementByName(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByName(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementByTagName(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByTagName(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementByXPath(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void findElementsByXPath(TypeElement typeElement, String nameElement, String s) {
    }

    @Step
    public static void getCoordinates(TypeElement typeElement, String nameElement) {
    }

    @Step
    public static void getWrappedDriver(TypeElement typeElement, String nameElement) {
    }
}

