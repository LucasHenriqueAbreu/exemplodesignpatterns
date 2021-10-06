package prototype;

import java.util.Objects;

public class Circulo extends Forma{

    int raio;

    public Circulo() {}

    public Circulo(Circulo circulo) {
        super(circulo);
        if (circulo != null) {
            this.raio = circulo.raio;
        }
    }

    @Override
    public Forma clone() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circulo) || (!super.equals(obj))) return false;
        Circulo circulo2 = (Circulo) obj;
        return circulo2.x == this.x &&
                circulo2.y == this.y &&
                Objects.equals(circulo2.cor, this.cor) &&
                circulo2.raio == this.raio;
    }
}
