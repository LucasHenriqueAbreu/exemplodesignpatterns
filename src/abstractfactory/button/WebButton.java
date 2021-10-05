package abstractfactory.button;

public class WebButton implements Button {
    @Override
    public void paint() {
        System.out.println("Aqui vou desenhar um button no padrão web");
    }
}
