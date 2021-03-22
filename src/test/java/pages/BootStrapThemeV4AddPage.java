package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class BootStrapThemeV4AddPage {

    public SelenideElement CMP_NAME = $(byCssSelector("#field-customerName"));

    public SelenideElement CMP_LASTNAME = $(byCssSelector("#field-contactLastName"));

    public SelenideElement CMP_CONTACTFIRSTNAME = $(byCssSelector("#field-contactFirstName"));

    public SelenideElement CMP_PHONE = $(byCssSelector("#field-phone"));

    public SelenideElement CMP_ADDRESSLINE1 = $(byCssSelector("#field-addressLine1"));

    public SelenideElement CMP_ADDRESSLINE2 = $(byCssSelector("#field-addressLine2"));

    public SelenideElement CMP_CITY = $(byCssSelector("#field-city"));

    public SelenideElement CMP_STATE = $(byCssSelector("#field-state"));

    public SelenideElement CMP_POSTALCODE = $(byCssSelector("#field-postalCode"));

    public SelenideElement CMP_COUNTRY = $(byCssSelector("#field-country"));

    public SelenideElement BTN_FROMEMPLOYEER = $(byCssSelector(".chosen-default"));

    public SelenideElement CMP_FROMEMPLOYEER = $(byCssSelector("input[autocomplete=off]"));

    public SelenideElement RES_FROMEMPLOYEER = $(byCssSelector(".active-result"));

    public SelenideElement CMP_CREDITLIMIT = $(byCssSelector("#field-creditLimit"));

    public SelenideElement BTN_SAVE = $(byCssSelector("#form-button-save"));

    public SelenideElement LNK_GOBACKTOLIST = $(byLinkText("Go back to list"));
}
