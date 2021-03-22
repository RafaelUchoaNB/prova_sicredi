package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GenericsPage {

    public SelenideElement LOADING = $(byXpath("//*[@class='container-fluid gc-container']"));

    public SelenideElement MSG_SUCESSO = $(byXpath("//*[normalize-space(.)]"));
}
