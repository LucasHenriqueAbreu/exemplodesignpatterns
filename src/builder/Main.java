package builder;

import builder.builders.CarroBuilder;
import builder.diretor.Diretor;
import builder.models.Carro;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        CarroBuilder carroBuilder = new CarroBuilder();
        diretor.constroiCarroEsportivo(carroBuilder);
        Carro carro = carroBuilder.getResult();
        System.out.println(carro.getTipo());
    }
}
