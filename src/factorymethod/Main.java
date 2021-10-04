package factorymethod;

public class Main {
    public static final String SO = "ANDASD";

    public static void main(String[] args) {
        Aplication aplication;
        if (SO.equals("IOS")) {
            aplication = new Aplication(new ScreenIosFactory());
        } else {
            aplication = new Aplication(new ScreenAndroidFactory());
        }
        aplication.paint();
    }
}
