package prototype;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.x = 1;
        circulo1.y = 2;
        circulo1.raio = 4;

        Circulo circulo2 = (Circulo) circulo1.clone();
        circulo2.raio = 100;

        validacaoIgualdadesCirculo(circulo1, circulo2);

    }

    private static void validacaoIgualdadesCirculo(Circulo circulo1, Circulo circulo2) {
        if (circulo1 != circulo2) {
            System.out.println("Os circulos não são os mesmos");
            if (circulo1.equals(circulo2)) {
                System.out.println("Porém são exatamente iguais");
            } else {
                System.out.println("E não são iguais");
            }
        } else {
            System.out.println("Os circulos são os mesmos");
            if (circulo1.equals(circulo2)) {
                System.out.println("Lógicamente possuem os mesmos valores");
            }
        }
    }
}
