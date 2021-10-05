package abstractfactory.input;

public class WebInput implements Input {

    @Override
    public void paint() {
        System.out.println("Aqui eu desenho um input no padrão WEB");
    }
}
