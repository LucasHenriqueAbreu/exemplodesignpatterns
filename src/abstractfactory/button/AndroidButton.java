package abstractfactory.button;

public class AndroidButton implements Button {
    @Override
    public void paint() {
        System.out.println("Aqui vou desenhar um botão no padrão android (Material Design");
    }
}
