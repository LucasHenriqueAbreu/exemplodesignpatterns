package abstractfactory.checkbox;

public class IosCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Aqui vou desenhar um checkbox no padrão IOS");
    }
}
