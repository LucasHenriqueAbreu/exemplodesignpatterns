package builder.builders;

import builder.models.*;

public class CarroManualBuilder implements Builder {
    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private Gps gps;

    @Override
    public void setTipoCarro(TipoCarro tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setGps(Gps gps) {
        this.gps = gps;
    }

    @Override
    public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Manual getResult() {
        return new Manual(
                tipo,
                assentos,
                motor,
                transmissao,
                computadorDeBordo,
                gps
        );
    }
}
