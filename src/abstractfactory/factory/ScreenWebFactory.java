package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.button.WebButton;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.checkbox.CheckboxWeb;
import abstractfactory.input.Input;
import abstractfactory.input.WebInput;

public class ScreenWebFactory implements ScreenFactory{
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxWeb();
    }

    @Override
    public Input createInput() {
        return new WebInput();
    }
}
