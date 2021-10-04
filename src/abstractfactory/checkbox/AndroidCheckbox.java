package abstractfactory.checkbox;

public class AndroidCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Aqui vou desenhar um checkbox no padrão android");
    }
}
