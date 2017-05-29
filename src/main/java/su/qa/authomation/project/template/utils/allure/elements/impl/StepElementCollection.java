package su.qa.authomation.project.template.utils.allure.elements.impl;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import ru.yandex.qatools.allure.annotations.Step;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;

public class StepElementCollection {

    @Step
    public static void shouldHaveSize(TypeElement typeCollection, String nameCollection, int expectedSize) {
    }

    @Step
    public static void shouldBe(TypeElement typeCollection, String nameCollection, CollectionCondition... conditions) {
    }

    @Step
    public static void shouldHave(TypeElement typeCollection, String nameCollection, CollectionCondition... conditions) {
    }

    @Step
    public static void filter(TypeElement typeCollection, String nameCollection, Condition condition) {
    }

    @Step
    public static void filterBy(TypeElement typeCollection, String nameCollection, Condition condition) {
    }

    @Step
    public static void exclude(TypeElement typeCollection, String nameCollection, Condition condition) {
    }

    @Step
    public static void excludeWith(TypeElement typeCollection, String nameCollection, Condition condition) {
    }

    @Step
    public static void find(TypeElement typeCollection, String nameCollection, Condition condition) {
    }

    @Step
    public static void findBy(TypeElement typeCollection, String nameCollection, Condition condition) {
    }

    @Step
    public static void get(TypeElement typeCollection, String nameCollection, int index) {
    }

    @Step
    public static void first(TypeElement typeCollection, String nameCollection) {
    }

    @Step
    public static void last(TypeElement typeCollection, String nameCollection) {
    }
}
