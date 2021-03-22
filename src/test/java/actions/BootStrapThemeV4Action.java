package actions;

import pages.BootStrapThemeV4Page;

public class BootStrapThemeV4Action extends GenericsActions {

    private final BootStrapThemeV4Page bstpV4;

    public BootStrapThemeV4Action() {
        bstpV4 = new BootStrapThemeV4Page();
    }

    public BootStrapThemeV4Action clicarBotaoAddCustomer() {
        clicarBotao(bstpV4.BTN_ADDCUSTOMER);
        return this;
    }

    public BootStrapThemeV4Action preencherCampoSearchName(Object valor) {
        preencherCampo(bstpV4.CMP_SEARCHNAME, valor);
        return this;
    }

    public BootStrapThemeV4Action selecionarCheckBoxActions() {
        loading()
                .selecionarCheckBox(bstpV4.CKB_ACTIONS);
        return this;
    }

    public BootStrapThemeV4Action clicarBotaoDelete() {
        clicarBotao(bstpV4.BTN_DELETE);
        return this;
    }

    public BootStrapThemeV4Action clicarbotaoDeleteModal() {
        aguardarElementoVisivel(bstpV4.BTN_DELETEMODAL)
            .clicarBotao(bstpV4.BTN_DELETEMODAL);
        return this;
    }

    public void validarMensagemExclusaoSucesso(Object msgExclusaoSucesso) {
        validarMensagem(MSG_SUCESSO, msgExclusaoSucesso);
    }
}
