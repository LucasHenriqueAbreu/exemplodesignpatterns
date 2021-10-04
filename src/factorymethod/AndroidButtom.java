package factorymethod;

public class AndroidButtom implements Button {

    @Override
    public void paint() {
        System.out.println("Eu sou um botão no padrão MaterialDesign");
    }
}
