package abstractfactory.input;

public class AndroidInput implements Input {
    @Override
    public void paint() {
        System.out.println("Aqui eu desenho um input no padrão do Android");
    }
}
