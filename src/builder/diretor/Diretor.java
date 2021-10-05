package builder.diretor;

import builder.builders.Builder;
import builder.models.*;

public class Diretor {

    public void constroiCarroEsportivo(Builder builder) {
        builder.setTipoCarro(TipoCarro.CARRO_ESPORTIVO);
        builder.setAssentos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmissao(Transmissao.SEMI_AUTOMATICA);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setGps(new Gps("Goiânia"));
    }

    public void  constroiCarroUrbano(Builder builder) {
        builder.setTipoCarro(TipoCarro.CARRO_URBANO);
        builder.setAssentos(5);
        builder.setMotor(new Motor(1.4, 0));
        builder.setTransmissao(Transmissao.AUTOMATICA);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setGps(new Gps("Cidade"));
    }

    public void  constroiCarroSUV(Builder builder) {
        builder.setTipoCarro(TipoCarro.SUV);
        builder.setAssentos(8);
        builder.setMotor(new Motor(2.8, 0));
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setGps(new Gps("Cidade"));
    }
}
