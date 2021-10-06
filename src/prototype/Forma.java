package prototype;

import java.util.Objects;

public abstract class Forma {
    public int x;
    public int y;
    public String cor;

    public Forma() {}

    public Forma(Forma forma) {
        if (forma != null) {
            this.y = forma.y;
            this.x = forma.x;
            this.cor = forma.cor;
        }
    }

    public abstract Forma clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Forma)) return false;
        Forma forma2 = (Forma) obj;
        return forma2.x == this.x && forma2.y == this.y && Objects.equals(this.cor, forma2.cor);
    }
}
