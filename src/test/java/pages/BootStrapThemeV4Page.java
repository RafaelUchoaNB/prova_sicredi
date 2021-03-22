package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class BootStrapThemeV4Page {

    public SelenideElement BTN_ADDCUSTOMER = $(byCssSelector("a[href='/demo/bootstrap_theme_v4/add']"));

    public SelenideElement CMP_SEARCHNAME = $(byCssSelector("[placeholder='Search Name']"));

    public SelenideElement CKB_ACTIONS = $(byCssSelector("input.select-all-none"));

    public SelenideElement BTN_DELETE = $(byLinkText("Delete"));

    public SelenideElement BTN_DELETEMODAL = $(By.cssSelector(".delete-multiple-confirmation-button"));
}
