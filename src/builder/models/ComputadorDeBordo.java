package builder.models;

public class ComputadorDeBordo {
    private Carro carro;

    private void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void mostrarQuantidadeCombustivel() {
        System.out.println("Nível de combustível: " + this.carro.getQuantidadeCombustivel());
    }

    public void status() {
        if (this.carro.getMotor().estaLigado()) {
            System.out.println("Carro está ligado");
        } else {
            System.out.println("Carro está desligado");
        }
    }
}
