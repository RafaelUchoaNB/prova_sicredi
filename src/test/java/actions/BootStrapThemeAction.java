package actions;

import pages.BootStrapThemePage;

public class BootStrapThemeAction extends GenericsActions {

    private final BootStrapThemePage bstp;

    public BootStrapThemeAction() {
        bstp = new BootStrapThemePage();
    }

    public BootStrapThemeAction selecionarComboBoxSelectVersion(Object selectVersion) {
        selecionarCombobox(bstp.CMB_SELECTVERSION, selectVersion);
        return this;
    }
}
