package supports;


import actions.BootStrapThemeAction;
import actions.BootStrapThemeV4Action;
import actions.BootStrapThemeV4AddAction;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.open;

public class Browser {

    protected static final String URL = "https://www.grocerycrud.com/demo/bootstrap_theme";
    protected static BootStrapThemeAction bstp;
    protected static BootStrapThemeV4Action bstpV4;
    protected static BootStrapThemeV4AddAction bstpAddV4;

    public Browser() {
        bstp = new BootStrapThemeAction();
        bstpV4 = new BootStrapThemeV4Action();
        bstpAddV4 = new BootStrapThemeV4AddAction();
    }

    @Parameters({"browser", "abrirBrowser"})
    protected void iniciarBrowser(String browser, boolean abrirBrowser) {
        Configuration.headless = abrirBrowser;
        Configuration.browser = browser;
        Configuration.startMaximized = true;
        open(URL);
    }
}