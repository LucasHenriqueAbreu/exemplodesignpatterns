package abstractfactory.button;

public class IosButton implements Button {

    @Override
    public void paint() {
        System.out.println("Aqui vou desenhar no padrão IOS (cupertino)");
    }
}
