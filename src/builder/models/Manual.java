package builder.models;

public class Manual {
    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private Gps gps;
    private double quantidadeCombustivel = 0;

    public Manual(TipoCarro tipo, int assentos, Motor motor, Transmissao transmissao, ComputadorDeBordo computadorDeBordo, Gps gps) {
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorDeBordo = computadorDeBordo;
        this.gps = gps;
    }

    public String print() {
        String informacoes = "";
        informacoes += "Tipo do carro: " + this.tipo + "\n";
        informacoes += "Quantidade de assentos" + this.assentos + "\n";
        informacoes += "Transmissão: " + this.transmissao + "\n";
        informacoes += "Motor: " + this.motor.getVolume() + "\n";
        informacoes += "Quilometragem: " + this.motor.getQuilomentragem();
        return informacoes;
    }

}
