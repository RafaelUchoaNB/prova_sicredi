package actions;

import pages.BootStrapThemeV4AddPage;

public class BootStrapThemeV4AddAction extends GenericsActions {

    private final BootStrapThemeV4AddPage bstpAddV4;

    public BootStrapThemeV4AddAction() {
        bstpAddV4 = new BootStrapThemeV4AddPage();
    }

    public BootStrapThemeV4AddAction preencherCampoName(Object name) {
        preencherCampo(bstpAddV4.CMP_NAME, name);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoLastName(Object lastName) {
        preencherCampo(bstpAddV4.CMP_LASTNAME, lastName);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoContactFirstName(Object contactFirstName) {
        preencherCampo(bstpAddV4.CMP_CONTACTFIRSTNAME, contactFirstName);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoPhone(Object phone) {
        preencherCampo(bstpAddV4.CMP_PHONE, phone);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoAddressLine1(Object addressLine1) {
        preencherCampo(bstpAddV4.CMP_ADDRESSLINE1, addressLine1);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoAddressLine2(Object addressLine2) {
        preencherCampo(bstpAddV4.CMP_ADDRESSLINE2, addressLine2);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoCity(Object city) {
        preencherCampo(bstpAddV4.CMP_CITY, city);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoState(Object state) {
        preencherCampo(bstpAddV4.CMP_STATE, state);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoPostalCode(Object postalCode) {
        preencherCampo(bstpAddV4.CMP_POSTALCODE, postalCode);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoCountry(Object country) {
        preencherCampo(bstpAddV4.CMP_COUNTRY, country);
        return this;
    }

    public BootStrapThemeV4AddAction selecionarComboBoxFromEmployeer(Object fromEmployeer) {
        rolarBarraNavegadorPorEmelemento(bstpAddV4.BTN_SAVE)
            .clicarBotao(bstpAddV4.BTN_FROMEMPLOYEER)
            .preencherCampo(bstpAddV4.CMP_FROMEMPLOYEER, fromEmployeer)
            .clicarBotao(bstpAddV4.RES_FROMEMPLOYEER);
        return this;
    }

    public BootStrapThemeV4AddAction preencherCampoCreditLimit(Object crediLimite) {
        preencherCampo(bstpAddV4.CMP_CREDITLIMIT, crediLimite);
        return this;
    }

    public BootStrapThemeV4AddAction clicarBotaoSave() {
        clicarBotao(bstpAddV4.BTN_SAVE);
        return this;
    }

    public void validarMensagemCadastroSucesso(Object msgCadastroSucesso) {
        validarMensagem(MSG_SUCESSO, msgCadastroSucesso);
    }

    public BootStrapThemeV4AddAction clicarLinkGoBachToList() {
        clicarBotao(bstpAddV4.LNK_GOBACKTOLIST);
        return this;
    }
}
