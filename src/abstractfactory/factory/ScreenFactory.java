package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.input.Input;

public interface ScreenFactory {
    Button createButton();
    Checkbox createCheckbox();
    Input createInput();
}
