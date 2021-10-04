package factorymethod;

public class ScreenAndroidFactory implements ScreenFactory{
    @Override
    public Button createButton() {
        return new AndroidButtom();
    }
}
