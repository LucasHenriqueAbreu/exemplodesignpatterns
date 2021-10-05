package abstractfactory.input;

public class IosInput implements Input {
    @Override
    public void paint() {
        System.out.println("Aqui eu desenho um input no padrão IOS");
    }
}
