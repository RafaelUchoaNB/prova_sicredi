package tests;

import actions.BootStrapThemeV4AddAction;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import supports.Browser;
import supports.LeitorJson;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWindow;

public class BootStrapThemeTest extends Browser {
    BootStrapThemeV4AddAction name;
    private LeitorJson lj;
    private JSONObject jo;

    @BeforeMethod
    @Parameters({"browser", "abrirBrowser"})
    public void setUpMethod(String browser, boolean abrirBrowser) throws IOException, ParseException {
        iniciarBrowser(browser, abrirBrowser);
        lj = new LeitorJson();
        lj.getJsonFileName("BootStrapThemeJson.json");
        jo = new JSONObject();
    }

    @Test(groups = {"Fluxo Básico"})
    public void CT0001_cadastrarSucesso() {
        jo = lj.getJsonDataObject("CT0001_cadastrarSucesso");
        bstp.selecionarComboBoxSelectVersion(jo.get("selectVersion"));
        bstpV4.clicarBotaoAddCustomer();
        bstpAddV4.preencherCampoName(jo.get("name"))
                .preencherCampoLastName(jo.get("lastName"))
                .preencherCampoContactFirstName(jo.get("contactFirstName"))
                .preencherCampoPhone(jo.get("phone"))
                .preencherCampoAddressLine1(jo.get("addressLine1"))
                .preencherCampoAddressLine2(jo.get("addressLine2"))
                .preencherCampoCity(jo.get("city"))
                .preencherCampoState(jo.get("state"))
                .preencherCampoPostalCode(jo.get("postalcode"))
                .preencherCampoCountry(jo.get("country"))
                .selecionarComboBoxFromEmployeer(jo.get("fromEmployeer"))
                .preencherCampoCreditLimit(jo.get("creditLimit"))
                .clicarBotaoSave()
                .validarMensagemCadastroSucesso(jo.get("msgCadastroSucesso"));
    }

    @Test(groups = {"Fluxo Básico"})
    public void CT0002_deletarCadastro() {
        jo = lj.getJsonDataObject("CT0002_deletarCadastro");
        bstp.selecionarComboBoxSelectVersion(jo.get("selectVersion"));
        bstpV4.clicarBotaoAddCustomer();
        bstpAddV4.preencherCampoName(jo.get("name"))
            .preencherCampoLastName(jo.get("lastName"))
            .preencherCampoContactFirstName(jo.get("contactFirstName"))
            .preencherCampoPhone(jo.get("phone"))
            .preencherCampoAddressLine1(jo.get("addressLine1"))
            .preencherCampoAddressLine2(jo.get("addressLine2"))
            .preencherCampoCity(jo.get("city"))
            .preencherCampoState(jo.get("state"))
            .preencherCampoPostalCode(jo.get("postalcode"))
            .preencherCampoCountry(jo.get("country"))
            .selecionarComboBoxFromEmployeer(jo.get("fromEmployeer"))
            .preencherCampoCreditLimit(jo.get("creditLimit"))
            .clicarBotaoSave()
            .clicarLinkGoBachToList();
        bstpV4.preencherCampoSearchName(jo.get("name"))
            .selecionarCheckBoxActions()
            .clicarBotaoDelete()
            .clicarbotaoDeleteModal()
            .validarMensagemExclusaoSucesso(jo.get("msgExclusaoSucesso"));
    }

    @AfterMethod
    private void tearDownMethod() {
        closeWindow();
    }
}
