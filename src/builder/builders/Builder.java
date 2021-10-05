package builder.builders;

import builder.models.*;

public interface Builder {
    void setTipoCarro(TipoCarro tipo);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
    void setGps(Gps gps);
}
