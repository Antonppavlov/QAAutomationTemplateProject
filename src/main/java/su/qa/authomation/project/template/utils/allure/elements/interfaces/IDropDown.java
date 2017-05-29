package su.qa.authomation.project.template.utils.allure.elements.interfaces;


public interface IDropDown {
    void selectData(String option);

    void sendKeys(String option);

    void clear();

    void checkSelect(String option);
}
