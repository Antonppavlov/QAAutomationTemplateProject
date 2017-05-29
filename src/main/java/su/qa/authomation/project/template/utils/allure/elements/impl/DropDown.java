package su.qa.authomation.project.template.utils.allure.elements.impl;

import com.codeborne.selenide.Condition;
import lombok.Getter;
import su.qa.authomation.project.template.utils.allure.Allure;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;
import su.qa.authomation.project.template.utils.allure.elements.interfaces.IDropDown;

@Getter
public class DropDown implements IDropDown {
    private final AllureElement element;
    private final AllureElement selectData;
    private final AllureCollection listTextData;
    private final AllureElement selectClear;
    private final AllureElement selectArrow;


    public DropDown(AllureElement element) {
        this.element = element;
        this.selectData = element.$("span [class='Select-value-label']");
        this.listTextData = element.$$("[id*='react-select-'][class*='Select-']");
        this.selectClear = element.$(".Select-clear");
        this.selectArrow = element.$(".Select-arrow");
    }


    @Override
    public void selectData(String textOption) {
//        selectArrow.click();
        AllureElement elementOption = new AllureElement(listTextData.find(Condition.exactText(textOption)), TypeElement.OPTION);
        elementOption.click();
        //  checkSelect(textOption);
    }

    @Override
    public void sendKeys(String textOption) {
        element.$("div input").sendKeys(textOption);
        Allure.sleep(500);
        element.$("div input").pressEnter();
        //  checkSelect(textOption);
    }

    @Override
    public void clear() {
        selectClear.click();
    }

    @Override
    public void checkSelect(String textOption) {
        selectData.shouldHave(Condition.exactText(textOption));
    }
}
