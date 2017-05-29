package su.qa.authomation.project.template.utils.allure.elements.impl;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import su.qa.authomation.project.template.utils.allure.Allure;
import su.qa.authomation.project.template.utils.allure.elements.TypeElement;


public class AllureCollection extends ElementsCollection {


    private final TypeElement typeCollection;
    private final String nameCollection;
    private final ElementsCollection elementsCollection;

    public AllureCollection(ElementsCollection elementsCollection) {
        super(null);
        this.elementsCollection = elementsCollection;
        this.typeCollection = TypeElement.ELEMENT;
        this.nameCollection = "'Без имени'";
    }

    public AllureCollection(ElementsCollection elementsCollection, String nameCollection) {
        super(null);
        this.elementsCollection = elementsCollection;
        this.typeCollection = TypeElement.ELEMENT;
        this.nameCollection = nameCollection;
    }

    public AllureCollection(ElementsCollection elementsCollection, TypeElement typeCollection, String nameCollection) {
        super(null);
        this.elementsCollection = elementsCollection;
        this.typeCollection = typeCollection;
        this.nameCollection = nameCollection;
    }


    public AllureCollection shouldHaveSize(int expectedSize) {
        StepElementCollection.shouldHaveSize(typeCollection, nameCollection, expectedSize);
        this.elementsCollection.shouldHaveSize(expectedSize);
        return this;
    }


    public AllureCollection shouldBe(CollectionCondition... conditions) {
        StepElementCollection.shouldBe(typeCollection, nameCollection, conditions);
        this.elementsCollection.shouldBe(conditions);
        return this;
    }


    public AllureCollection shouldHave(CollectionCondition... conditions) {
        StepElementCollection.shouldHave(typeCollection, nameCollection, conditions);
        this.elementsCollection.shouldHave(conditions);
        return this;
    }


    public AllureCollection filter(Condition condition) {
        StepElementCollection.filter(typeCollection, nameCollection, condition);
        this.elementsCollection.filter(condition);
        return this;
    }


    public AllureCollection filterBy(Condition condition) {
        StepElementCollection.filterBy(typeCollection, nameCollection, condition);
        this.elementsCollection.filterBy(condition);
        return this;
    }


    public AllureCollection exclude(Condition condition) {
        StepElementCollection.exclude(typeCollection, nameCollection, condition);
        this.elementsCollection.exclude(condition);
        return this;
    }


    public AllureCollection excludeWith(Condition condition) {
        StepElementCollection.excludeWith(typeCollection, nameCollection, condition);
        this.elementsCollection.excludeWith(condition);
        return this;
    }


    public AllureElement find(Condition condition) {
        StepElementCollection.find(typeCollection, nameCollection, condition);
        return Allure.$(this.elementsCollection.find(condition));
    }


    public AllureElement findBy(Condition condition) {
        StepElementCollection.findBy(typeCollection, nameCollection, condition);
        return Allure.$(this.elementsCollection.findBy(condition));
    }


    public AllureElement get(int index) {
        StepElementCollection.get(typeCollection, nameCollection, index);
        return Allure.$(this.elementsCollection.get(index));
    }


    public AllureElement first() {
        StepElementCollection.first(typeCollection, nameCollection);
        return Allure.$(this.elementsCollection.first());
    }


    public AllureElement last() {
        StepElementCollection.last(typeCollection, nameCollection);
        return Allure.$(this.elementsCollection.last());
    }
}
