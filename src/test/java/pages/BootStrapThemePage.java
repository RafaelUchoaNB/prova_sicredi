package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class BootStrapThemePage {

    public SelenideElement CMB_SELECTVERSION = $(byCssSelector("#switch-version-select"));
}
