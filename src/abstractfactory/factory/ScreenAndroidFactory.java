package abstractfactory.factory;

import abstractfactory.button.AndroidButton;
import abstractfactory.button.Button;
import abstractfactory.checkbox.AndroidCheckbox;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.input.AndroidInput;
import abstractfactory.input.Input;

public class ScreenAndroidFactory implements ScreenFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }

    @Override
    public Input createInput() {
        return new AndroidInput();
    }
}
