package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.button.IosButton;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.checkbox.IosCheckbox;

public class ScreenIosFactory implements ScreenFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new IosCheckbox();
    }
}
