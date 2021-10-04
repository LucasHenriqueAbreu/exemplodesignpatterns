package factorymethod;

public class Aplication {
    private Button button;

    public Aplication(ScreenFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
