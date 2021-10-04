package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.checkbox.Checkbox;

public interface ScreenFactory {
    Button createButton();
    Checkbox createCheckbox();
}
