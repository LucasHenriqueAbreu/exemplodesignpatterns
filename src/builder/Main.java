package builder;

import builder.builders.CarroBuilder;
import builder.builders.ManualCarroBuilder;
import builder.diretor.Diretor;
import builder.models.Carro;
import builder.models.Manual;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        CarroBuilder carroBuilder = new CarroBuilder();
        diretor.constroiCarroEsportivo(carroBuilder);
        Carro carro = carroBuilder.getResult();
        System.out.println(carro.getMotor().getVolume() + " - " + carro.getTipo());

        ManualCarroBuilder manualCarroBuilder = new ManualCarroBuilder();
        diretor.constroiCarroEsportivo(manualCarroBuilder);
        Manual manual = manualCarroBuilder.getResult();
        System.out.println(manual.print());
    }
}
