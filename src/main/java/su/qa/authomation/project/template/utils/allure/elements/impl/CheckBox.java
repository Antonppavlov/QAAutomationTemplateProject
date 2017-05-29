package su.qa.authomation.project.template.utils.allure.elements.impl;


import com.codeborne.selenide.Condition;
import lombok.Getter;
import su.qa.authomation.project.template.utils.allure.elements.interfaces.ICheckBox;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;

@Getter
public class CheckBox implements ICheckBox {

    private final AllureElement box;
    private final AllureElement label;

    public CheckBox(AllureElement box, AllureElement label) {
        this.box = box;
        this.label = label;
    }

    @Override
    public void selected() {
        if (box.is(not(Condition.selected))) {
            box.click();
        }
        //  checkSelected();
    }

    @Override
    public void disabled() {
        if (box.is(Condition.selected)) {
            box.click();
        }
        //  checkDisabled();
    }

    @Override
    public void checkSelected() {
        box.parent().$("[class='step__checkbox_true']").shouldHave(visible);
    }

    @Override
    public void checkDisabled() {
        box.parent().$("[class='step__checkbox_false']").shouldHave(visible);
    }


}
