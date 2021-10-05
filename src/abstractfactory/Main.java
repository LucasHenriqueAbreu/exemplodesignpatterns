package abstractfactory;

import abstractfactory.cliente.ClienteScreen;
import abstractfactory.factory.ScreenAndroidFactory;
import abstractfactory.factory.ScreenIosFactory;
import abstractfactory.factory.ScreenWebFactory;

public class Main {
    private static final String SO = "android";

    public static void main(String[] args) {
        ClienteScreen clienteScreen = getClienteScreen(SO);
        clienteScreen.draw();
    }

    private static ClienteScreen getClienteScreen(String so) {
        if (so.equals("android")) {
            return new ClienteScreen(new ScreenAndroidFactory());
        }
        if (so.equals("web")) {
            return  new ClienteScreen(new ScreenWebFactory());
        }
        return new ClienteScreen(new ScreenIosFactory());
    }
}
