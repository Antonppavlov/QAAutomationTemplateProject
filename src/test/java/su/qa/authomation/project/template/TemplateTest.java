package su.qa.authomation.project.template;


import com.codeborne.selenide.Condition;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.*;
import su.qa.authomation.project.template.utils.allure.Allure;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;
import su.qa.authomation.project.template.utils.allure.elements.impl.AllureElement;

@Features("Функционал поиска по сайту")
@Stories("Тесты на проверку результатов")
@RunWith(Parameterized.class)
public class TemplateTest extends Configuration {

    public String textSearch;

    public TemplateTest(String textSearch) {
        this.textSearch = textSearch;
    }

    @Parameterized.Parameters(name = "{index}: поиск по слову: {0}" )
    public static String[] data() {
        return  new String[]{"ипотека","икотека","игротека"};
    }

//запуск для mvn
    //jetty:stop clean install -Dos=mac -Dselenide.browser=chrome -DtestData=testDataMac site jetty:run -Dorg.eclipse.jetty.annotations.maxWait=120
    //запускается сервер джетти по http://localhost:8080/
    //для unix не забыть драйверам выставить chmod +x

//    @TestCaseId(value = "001")
  //  @Title("Проверка поиска по слову 'Ипотека'")
    @Test
    public void searchForText() throws Exception {
        Allure.open("https://www.open.ru/");
        Allure.$(TypeElement.BUTTON, ".b_search","Поиск").click();
        AllureElement inputSearch = Allure.$(TypeElement.INPUT_FIELD, "[id='main_search_form'] [name='query']","Поиск");
        inputSearch.sendKeys(textSearch);
        inputSearch.pressEnter();
        Allure.$(TypeElement.TEXT, ".search-in-news-label").should(Condition.exactText("По запросу «ипотека» найдено 11 результатов"));

    }

    //@TestCaseId(value = "001")
    //@Title("Проверка поиска по слову 'Ипотека' 2 ")
    //@Description("Тест для примера отображения ошибки в отчете")
    @Ignore
    @Test
    public void searchForUrl(){
        Allure.open("https://www.open.ru/search?type=&except_type=news&query="+textSearch);
        Allure.$(TypeElement.TEXT, ".search-in-news-label").should(Condition.exactText("По запросу «ипотека» найдено 12 результатов"));
    }
}
