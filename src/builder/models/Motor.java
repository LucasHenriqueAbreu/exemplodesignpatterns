package builder.models;

public class Motor {
    private double volume;
    private double quilomentragem;
    private boolean ligado;

    public Motor(double volume, double quilomentragem) {
        this.volume = volume;
        this.quilomentragem = quilomentragem;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean estaLigado() {
        return this.ligado;
    }

    public void girar(double quilomentragem) {
        if (this.ligado) {
            this.quilomentragem += quilomentragem;
        } else {
            System.err.println("Não é possivel girar o motor, você precisa ligar ele antes");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getQuilomentragem() {
        return quilomentragem;
    }
}
