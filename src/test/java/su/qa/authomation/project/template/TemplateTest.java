package su.qa.authomation.project.template;


import com.codeborne.selenide.Condition;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;
import su.qa.authomation.project.template.utils.allure.Allure;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;
import su.qa.authomation.project.template.utils.allure.elements.impl.AllureElement;

@Features("Функционал поиска по сайту")
@Stories("Тесты на проверку результатов")
public class TemplateTest extends Configuration {


    //запуск для mvn
    //jetty:stop clean install -Dos=mac -Dselenide.browser=chrome -DtestData=testDataMac site jetty:run -Dorg.eclipse.jetty.annotations.maxWait=120
    //запускается сервер джетти по http://localhost:8080/
    //для unix не забыть драйверам выставить chmod +x

    @TestCaseId(value = "001")
    @Title("Проверка поиска по слову 'Ипотека'")
    @Test
    public void test1() throws Exception {
        Allure.open("https://www.open.ru/");
        Allure.$(TypeElement.BUTTON, ".b_search","Поиск").click();
        AllureElement inputSearch = Allure.$(TypeElement.INPUT_FIELD, "[id='main_search_form'] [name='query']","Поиск");
        inputSearch.sendKeys("ипотека");
        inputSearch.pressEnter();
        Allure.$(TypeElement.TEXT, ".search-in-news-label").should(Condition.exactText("По запросу «ипотека» найдено 11 результатов"));

    }

    @TestCaseId(value = "001")
    @Title("Проверка поиска по слову 'Ипотека'")
    @Description("Тест для примера отображения ошибки в отчете")
    @Test
    public void test2(){
        Allure.open("https://www.open.ru/search?type=&except_type=news&query=%D0%B8%D0%BF%D0%BE%D1%82%D0%B5%D0%BA%D0%B0");
        Allure.$(TypeElement.TEXT, ".search-in-news-label").should(Condition.exactText("По запросу «ипотека» найдено 12 результатов"));
    }
}
