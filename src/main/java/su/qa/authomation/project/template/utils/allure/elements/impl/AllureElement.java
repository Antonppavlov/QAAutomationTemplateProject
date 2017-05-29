package su.qa.authomation.project.template.utils.allure.elements.impl;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.Coordinates;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

@Getter
@Setter
public class AllureElement implements SelenideElement {

    public static final String TEXT_EMPTY = "%Название елемента не указанно%";

    private final SelenideElement selenideElement;
    private final TypeElement typeElement;
    private  String nameElement;

    public AllureElement(SelenideElement selenideElement) {
        this.selenideElement = selenideElement;
        this.typeElement = TypeElement.ELEMENT;
        this.nameElement=TEXT_EMPTY;
    }

    public AllureElement(SelenideElement selenideElement, String nameElement) {
        this.selenideElement = selenideElement;
        this.typeElement = TypeElement.ELEMENT;
        this.nameElement = nameElement;
    }

    public AllureElement(SelenideElement selenideElement, TypeElement typeElement) {
        this.selenideElement = selenideElement;
        this.typeElement = typeElement;
        this.nameElement=TEXT_EMPTY;
    }

    public AllureElement(SelenideElement selenideElement, TypeElement typeElement, String nameElement) {
        this.selenideElement = selenideElement;
        this.typeElement = typeElement;
        this.nameElement = nameElement;
    }

    public AllureElement(String css, TypeElement typeElement, String nameElement) {
        this(Selenide.$(css), typeElement, nameElement);
    }


    private String generateElementName() {
        if (this.nameElement.equals(TEXT_EMPTY)) {
            if (selenideElement.is(Condition.visible)) {
                String elementText = selenideElement.getText();
                if (!"".equals(elementText)) {
                    this.nameElement = elementText;
                }
            }
        }
        return this.nameElement;
    }


    @Override
    public void followLink() {
        StepSelenideElement.followLink(typeElement, generateElementName());
        this.selenideElement.followLink();
    }

    @Override
    public AllureElement val(String s) {
        StepSelenideElement.val(typeElement, generateElementName(), s);
        selenideElement.val(s);
        return this;
    }

    @Override
    public AllureElement append(String s) {
        StepSelenideElement.append(typeElement, generateElementName(), s);
        this.selenideElement.append(s);
        return this;
    }

    @Override
    public AllureElement pressEnter() {
        StepSelenideElement.pressEnter(typeElement, generateElementName());
        this.selenideElement.pressEnter();
        return this;
    }

    @Override
    public AllureElement pressTab() {
        StepSelenideElement.pressTab(typeElement, generateElementName());
        this.selenideElement.pressTab();
        return this;
    }

    @Override
    public AllureElement pressEscape() {
        StepSelenideElement.pressEscape(typeElement, generateElementName());
        this.selenideElement.pressEscape();
        return this;
    }

    @Override
    public String getText() {
        StepSelenideElement.getText(typeElement, generateElementName());
        return this.selenideElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        StepSelenideElement.findElements(typeElement, generateElementName(), by);
        return this.selenideElement.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        StepSelenideElement.findElement(typeElement, generateElementName(), by);
        return this.selenideElement.findElement(by);
    }

    @Override
    public String text() {
        StepSelenideElement.text(typeElement, generateElementName());
        return this.selenideElement.text();
    }

    @Override
    public String innerText() {
        StepSelenideElement.innerText(typeElement, generateElementName());
        return this.selenideElement.innerText();
    }

    @Override
    public String innerHtml() {
        StepSelenideElement.innerHtml(typeElement, generateElementName());
        return this.selenideElement.innerHtml();
    }

    @Override
    public String attr(String s) {
        StepSelenideElement.attr(typeElement, generateElementName(), s);
        return this.selenideElement.attr(s);
    }

    @Override
    public String name() {
        StepSelenideElement.name(typeElement, generateElementName());
        return this.selenideElement.name();
    }

    @Override
    public String val() {
        StepSelenideElement.val(typeElement, generateElementName());
        return this.selenideElement.val();
    }

    @Override
    public String getValue() {
        StepSelenideElement.getValue(typeElement, generateElementName());
        return this.selenideElement.getValue();
    }

    @Override
    public AllureElement setValue(String s) {
        StepSelenideElement.setValue(typeElement, generateElementName(), s);
        this.selenideElement.setValue(s);
        return this;
    }

    @Override
    public AllureElement selectRadio(String s) {
        StepSelenideElement.selectRadio(typeElement, generateElementName(), s);
        SelenideElement selenideElement = this.selenideElement.selectRadio(s);
        return new AllureElement(selenideElement);
    }


    @Override
    public String data(String s) {
        StepSelenideElement.data(typeElement, generateElementName(), s);
        return this.selenideElement.data(s);
    }


    @Override
    public boolean exists() {
        StepSelenideElement.exists(typeElement, generateElementName());
        return this.selenideElement.exists();
    }


    @Override
    public boolean isDisplayed() {
        StepSelenideElement.isDisplayed(typeElement, generateElementName());
        return this.selenideElement.isDisplayed();
    }


    @Override
    public Point getLocation() {
        StepSelenideElement.getLocation(typeElement, generateElementName());
        return this.selenideElement.getLocation();
    }


    @Override
    public Dimension getSize() {
        StepSelenideElement.getSize(typeElement, generateElementName());
        return this.selenideElement.getSize();
    }


    @Override
    public Rectangle getRect() {
        StepSelenideElement.getRect(typeElement, generateElementName());
        return this.selenideElement.getRect();
    }


    @Override
    public String getCssValue(String s) {
        StepSelenideElement.getCssValue(typeElement, generateElementName(), s);
        return this.selenideElement.getCssValue(s);
    }


    @Override
    public boolean is(Condition condition) {
        StepSelenideElement.is(typeElement, generateElementName(), condition);
        return this.selenideElement.is(condition);
    }


    @Override
    public boolean has(Condition condition) {
        StepSelenideElement.has(typeElement, generateElementName(), condition);
        return this.selenideElement.has(condition);
    }

    @Override
    public AllureElement should(Condition... conditions) {
        StepSelenideElement.should(typeElement, generateElementName(), conditions);
        SelenideElement should = this.selenideElement.should(conditions);
        return new AllureElement(should);
    }

    @Override
    public AllureElement shouldHave(Condition... conditions) {
        StepSelenideElement.shouldHave(typeElement, generateElementName(), conditions);
        SelenideElement selenideElement = this.selenideElement.shouldHave(conditions);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement shouldBe(Condition... conditions) {
        StepSelenideElement.shouldBe(typeElement, generateElementName(), conditions);
        SelenideElement selenideElement = this.selenideElement.shouldBe(conditions);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement shouldNot(Condition... conditions) {
        StepSelenideElement.shouldNot(typeElement, generateElementName(), conditions);
        SelenideElement selenideElement = this.selenideElement.shouldNot(conditions);
        return new AllureElement(selenideElement);

    }

    @Override
    public AllureElement shouldNotHave(Condition... conditions) {
        StepSelenideElement.shouldNotHave(typeElement, generateElementName(), conditions);
        SelenideElement selenideElement = this.selenideElement.shouldNotHave(conditions);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement shouldNotBe(Condition... conditions) {
        StepSelenideElement.shouldNotBe(typeElement, generateElementName(), conditions);
        SelenideElement selenideElement = this.selenideElement.shouldNotBe(conditions);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement waitUntil(Condition condition, long l) {
        StepSelenideElement.waitUntil(typeElement, generateElementName(), condition, l);
        this.selenideElement.waitUntil(condition, l);
        return this;
    }

    @Override
    public AllureElement waitUntil(Condition condition, long l, long l1) {
        StepSelenideElement.waitUntil(typeElement, generateElementName(), condition, l, l1);
        this.selenideElement.waitUntil(condition, l, l1);
        return this;
    }

    @Override
    public AllureElement waitWhile(Condition condition, long l) {
        StepSelenideElement.waitWhile(typeElement, generateElementName(), condition, l);
        this.selenideElement.waitWhile(condition, l);
        return this;
    }

    @Override
    public AllureElement waitWhile(Condition condition, long l, long l1) {
        StepSelenideElement.waitWhile(typeElement, generateElementName(), condition, l, l1);
        this.selenideElement.waitWhile(condition, l, l1);
        return this;
    }

    @Override
    public AllureElement parent() {
        StepSelenideElement.parent(typeElement, generateElementName());
        SelenideElement parent = selenideElement.parent();
        return new AllureElement(parent);
    }

    @Override
    public AllureElement closest(String s) {
        StepSelenideElement.closest(typeElement, generateElementName(), s);
        SelenideElement closest = selenideElement.closest(s);
        return new AllureElement(closest);
    }

    @Override
    public AllureElement find(String s) {
        StepSelenideElement.find(typeElement, generateElementName(), s);
        SelenideElement selenideElement = this.selenideElement.find(s);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement find(String s, int i) {
        StepSelenideElement.find(typeElement, generateElementName(), s, i);
        SelenideElement selenideElement = this.selenideElement.find(s, i);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement find(By by) {
        StepSelenideElement.find(typeElement, generateElementName(), by);
        SelenideElement selenideElement = this.selenideElement.find(by);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement find(By by, int i) {
        StepSelenideElement.find(typeElement, generateElementName(), by, i);
        SelenideElement selenideElement = this.selenideElement.find(by, i);
        return new AllureElement(selenideElement);
    }

    @Override
    public AllureElement $(String s) {
        return new AllureElement(selenideElement.$(s), typeElement);
    }

    public AllureElement $(TypeElement typeElement, String s) {
        return new AllureElement(selenideElement.$(s), typeElement);
    }

    public AllureElement $(TypeElement typeElement, String s, int i) {
        return new AllureElement(selenideElement.$(s, i), typeElement);
    }

    public AllureElement $(TypeElement typeElement, String s, String nameElement) {
        return new AllureElement(selenideElement.$(s), typeElement, nameElement);
    }

    public AllureElement $(TypeElement typeElement, String s, int i, String nameElement) {
        return new AllureElement(selenideElement.$(s, i), typeElement, nameElement);
    }

    @Override
    public AllureElement $(String s, int i) {
        return new AllureElement(selenideElement.$(s, i), typeElement);
    }

    @Override
    public AllureElement $(By by) {
        return new AllureElement(selenideElement.$(by), typeElement);
    }

    @Override
    public AllureElement $(By by, int i) {
        return new AllureElement(selenideElement.$(by, i), typeElement);
    }

    @Override
    public AllureCollection findAll(String s) {
        AllureCollection allureCollection = new AllureCollection(selenideElement.findAll(s));
        return allureCollection;
    }

    @Override
    public AllureCollection findAll(By by) {
        AllureCollection allureCollection = new AllureCollection(selenideElement.findAll(by));
        return allureCollection;
    }

    @Override
    public AllureCollection $$(String s) {
        return new AllureCollection(selenideElement.$$(s));
    }

    @Override
    public AllureCollection $$(By by) {
        return new AllureCollection(selenideElement.$$(by));
    }

    @Override
    public File uploadFromClasspath(String... strings) {
        StepSelenideElement.uploadFromClasspath(typeElement, generateElementName(), strings);
        return this.selenideElement.uploadFromClasspath(strings);
    }

    @Override
    public File uploadFile(File... files) {
        StepSelenideElement.uploadFile(typeElement, generateElementName(), files);
        return selenideElement.uploadFile(files);
    }

    @Override
    public void selectOption(int... ints) {
        StepSelenideElement.selectOption(typeElement, generateElementName(), ints);
        this.selenideElement.selectOption(ints);
    }

    @Override
    public void selectOption(String... strings) {
        StepSelenideElement.selectOption(typeElement, generateElementName(), strings);
        this.selenideElement.selectOption(strings);
    }

    @Override
    public void selectOptionContainingText(String s) {
        // StepSelenideElement.selectOptionContainingText(s);
        this.selenideElement.selectOptionContainingText(s);
    }

    @Override
    public void selectOptionByValue(String... strings) {
        StepSelenideElement.selectOptionByValue(typeElement, generateElementName(), strings);
        this.selenideElement.selectOptionByValue(strings);
    }

    @Override
    public AllureElement getSelectedOption() throws NoSuchElementException {
        StepSelenideElement.getSelectedOption(typeElement, generateElementName());
        return new AllureElement(selenideElement.getSelectedOption());
    }

    @Override
    public AllureCollection getSelectedOptions() {
        StepSelenideElement.getSelectedOptions(typeElement, generateElementName());
        return new AllureCollection(this.selenideElement.getSelectedOptions());
    }

    @Override
    public String getSelectedValue() {
        StepSelenideElement.getSelectedValue(typeElement, generateElementName());
        return this.selenideElement.getSelectedValue();
    }

    @Override
    public String getSelectedText() {
        StepSelenideElement.getSelectedText(typeElement, generateElementName());
        return this.selenideElement.getSelectedText();
    }

    @Override
    public AllureElement scrollTo() {
        StepSelenideElement.scrollTo(typeElement, generateElementName());
        this.selenideElement.scrollTo();
        return this;
    }

    @Override
    public File download() throws FileNotFoundException {
        StepSelenideElement.download(typeElement, generateElementName());
        return this.selenideElement.download();
    }

    @Override
    public WebElement toWebElement() {
        StepSelenideElement.toWebElement(typeElement, generateElementName());
        return this.selenideElement.toWebElement();
    }

    @Override
    public WebElement getWrappedElement() {
        StepSelenideElement.getWrappedElement(typeElement, generateElementName());
        return this.selenideElement.getWrappedElement();
    }

    @Override
    public void click() {
        //TODO Убрать
        Selenide.sleep(200);
        StepSelenideElement.click(typeElement, generateElementName());
        this.selenideElement.click();
    }

    @Override
    public void submit() {
        StepSelenideElement.submit(typeElement, generateElementName());
        this.selenideElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        StepSelenideElement.sendKeys(typeElement, generateElementName(), charSequences);
        this.selenideElement.sendKeys(charSequences);
    }

    @Override
    public void clear() {
        StepSelenideElement.clear(typeElement, generateElementName());
        this.selenideElement.clear();
    }

    @Override
    public String getTagName() {
        StepSelenideElement.getTagName(typeElement, generateElementName());
        return this.selenideElement.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        StepSelenideElement.getAttribute(typeElement, generateElementName(), s);
        return this.selenideElement.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        StepSelenideElement.isSelected(typeElement, generateElementName());
        return this.selenideElement.isSelected();
    }

    @Override
    public AllureElement setSelected(boolean b) {
        StepSelenideElement.setSelected(typeElement, generateElementName(), b);
        this.selenideElement.setSelected(b);
        return this;
    }

    @Override
    public boolean isEnabled() {
        StepSelenideElement.isEnabled(typeElement, generateElementName());
        return this.selenideElement.isEnabled();
    }


    @Override
    public AllureElement contextClick() {
        StepSelenideElement.contextClick(typeElement, generateElementName());
        this.selenideElement.contextClick();
        return this;
    }


    @Override
    public AllureElement doubleClick() {
        StepSelenideElement.doubleClick(typeElement, generateElementName());
        this.selenideElement.doubleClick();
        return this;
    }


    @Override
    public AllureElement hover() {
        StepSelenideElement.hover(typeElement, generateElementName());
        this.selenideElement.hover();
        return this;
    }


    @Override
    public AllureElement dragAndDropTo(String s) {
        StepSelenideElement.dragAndDropTo(typeElement, generateElementName(), s);
        this.selenideElement.dragAndDropTo(s);
        return this;
    }


    @Override
    public AllureElement dragAndDropTo(WebElement webElement) {
        StepSelenideElement.dragAndDropTo(typeElement, generateElementName(), webElement);
        this.selenideElement.dragAndDropTo(webElement);
        return this;
    }


    @Override
    public boolean isImage() {
        StepSelenideElement.isImage(typeElement, generateElementName());
        return this.selenideElement.isImage();
    }


    @Override
    public File screenshot() {
        StepSelenideElement.screenshot(typeElement, generateElementName());
        return this.selenideElement.screenshot();
    }


    @Override
    public BufferedImage screenshotAsImage() {
        StepSelenideElement.screenshotAsImage(typeElement, generateElementName());
        return this.selenideElement.screenshotAsImage();
    }


    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return selenideElement.getScreenshotAs(outputType);

    }


    @Override
    public WebElement findElementByClassName(String s) {
        StepSelenideElement.findElementByClassName(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByClassName(s);
    }


    @Override
    public List<WebElement> findElementsByClassName(String s) {
        StepSelenideElement.findElementsByClassName(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByClassName(s);
    }


    @Override
    public WebElement findElementByCssSelector(String s) {
        StepSelenideElement.findElementByCssSelector(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByCssSelector(s);
    }


    @Override
    public List<WebElement> findElementsByCssSelector(String s) {
        StepSelenideElement.findElementsByCssSelector(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByCssSelector(s);
    }


    @Override
    public WebElement findElementById(String s) {
        StepSelenideElement.findElementById(typeElement, generateElementName(), s);
        return this.selenideElement.findElementById(s);
    }


    @Override
    public List<WebElement> findElementsById(String s) {
        StepSelenideElement.findElementsById(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsById(s);
    }


    @Override
    public WebElement findElementByLinkText(String s) {
        StepSelenideElement.findElementByLinkText(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByLinkText(s);
    }


    @Override
    public List<WebElement> findElementsByLinkText(String s) {
        StepSelenideElement.findElementsByLinkText(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByLinkText(s);
    }


    @Override
    public WebElement findElementByPartialLinkText(String s) {
        StepSelenideElement.findElementByPartialLinkText(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByPartialLinkText(s);
    }


    @Override
    public List<WebElement> findElementsByPartialLinkText(String s) {
        StepSelenideElement.findElementsByPartialLinkText(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByPartialLinkText(s);
    }


    @Override
    public WebElement findElementByName(String s) {
        StepSelenideElement.findElementByName(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByName(s);
    }


    @Override
    public List<WebElement> findElementsByName(String s) {
        StepSelenideElement.findElementsByName(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByName(s);
    }


    @Override
    public WebElement findElementByTagName(String s) {
        StepSelenideElement.findElementByTagName(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByTagName(s);
    }


    @Override
    public List<WebElement> findElementsByTagName(String s) {
        StepSelenideElement.findElementsByTagName(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByTagName(s);
    }


    @Override
    public WebElement findElementByXPath(String s) {
        StepSelenideElement.findElementByXPath(typeElement, generateElementName(), s);
        return this.selenideElement.findElementByXPath(s);
    }


    @Override
    public List<WebElement> findElementsByXPath(String s) {
        StepSelenideElement.findElementsByXPath(typeElement, generateElementName(), s);
        return this.selenideElement.findElementsByXPath(s);
    }


    @Override
    public Coordinates getCoordinates() {
        StepSelenideElement.getCoordinates(typeElement, generateElementName());
        return this.selenideElement.getCoordinates();
    }


    @Override
    public WebDriver getWrappedDriver() {
        StepSelenideElement.getWrappedDriver(typeElement, generateElementName());
        return this.selenideElement.getWrappedDriver();
    }


}
