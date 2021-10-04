package abstractfactory.cliente;

import abstractfactory.button.Button;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.factory.ScreenFactory;

public class ClienteScreen {
    private ScreenFactory screenFactory;

    public ClienteScreen(ScreenFactory screenFactory) {
        this.screenFactory = screenFactory;
    }

    public void draw() {
        Checkbox checkbox = this.screenFactory.createCheckbox();
        Button button = this.screenFactory.createButton();
        checkbox.paint();
        button.paint();
    }
}
