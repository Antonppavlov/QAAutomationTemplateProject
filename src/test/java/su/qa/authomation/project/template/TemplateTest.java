package su.qa.authomation.project.template;


import com.codeborne.selenide.Condition;
import org.junit.Test;
import su.qa.authomation.project.template.utils.allure.Allure;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;
import su.qa.authomation.project.template.utils.allure.elements.impl.AllureElement;

public class TemplateTest extends Configuration {
    //запуск для mvn
    //clean install -Dos=mac -Dselenide.browser=chrome -DtestData=testDataMac site jetty:run -Dorg.eclipse.jetty.annotations.maxWait=120
    //запускается сервер джетти по http://localhost:8080/
    //для unix не забыть драйверам выставить chmod +x

    @Test
    public void name() throws Exception {
        Allure.open("https://www.open.ru/");
        Allure.$(TypeElement.BUTTON, ".b_search").click();
        AllureElement inputSearch = Allure.$(TypeElement.INPUT_FIELD, "[id='main_search_form'] [name='query']");
        inputSearch.sendKeys("ипотека");
        inputSearch.pressEnter();
        Allure.$(TypeElement.TEXT, ".search-in-news-label").should(Condition.exactText("По запросу «ипотека» найдено 11 результатов"));

    }
}
