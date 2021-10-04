package abstractfactory;

import abstractfactory.cliente.ClienteScreen;
import abstractfactory.factory.ScreenAndroidFactory;
import abstractfactory.factory.ScreenIosFactory;

public class Main {
    private static final String SO = "ios";

    public static void main(String[] args) {
        ClienteScreen clienteScreen = getClienteScreen(SO);
        clienteScreen.draw();
    }

    private static ClienteScreen getClienteScreen(String so) {
        if (so.equals("android")) {
            return new ClienteScreen(new ScreenAndroidFactory());
        }
        return new ClienteScreen(new ScreenIosFactory());
    }
}
