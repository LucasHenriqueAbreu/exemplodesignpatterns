package factorymethod;

public class IOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Sou um botão no padrão Cupertino");
    }
}
