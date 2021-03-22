package actions;

import com.codeborne.selenide.SelenideElement;
import pages.GenericsPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class GenericsActions extends GenericsPage {

    protected GenericsActions selecionarCombobox(SelenideElement elemento, Object valor) {
        elemento.selectOption((String) valor);
        return this;
    }

    protected GenericsActions clicarBotao(SelenideElement elemento) {
        elemento.click();
        return this;
    }

    protected GenericsActions preencherCampo(SelenideElement elemento, Object valor) {
        elemento.sendKeys((String) valor);
        return this;
    }

    protected GenericsActions rolarBarraNavegadorPorEmelemento(SelenideElement elemento) {
        executeJavaScript("arguments[0].scrollIntoView();", elemento);
        return this;
    }

    protected void validarMensagem(SelenideElement elemento, Object msgEsperada) {
        elemento.shouldHave(text((String) msgEsperada));
    }

    protected void selecionarCheckBox(SelenideElement elemento) {
        elemento.setSelected(true);
    }

    protected GenericsActions loading() {
        LOADING.shouldBe(exist)
            .shouldBe(not(exist));
        return this;
    }

    protected GenericsActions aguardarElementoVisivel(SelenideElement elemento) {
        elemento.shouldBe(visible);
        return this;
    }
}
