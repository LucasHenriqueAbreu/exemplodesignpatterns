package factorymethod;

public class ScreenIosFactory implements ScreenFactory {
    @Override
    public Button createButton() {
        return new IOsButton();
    }
}
