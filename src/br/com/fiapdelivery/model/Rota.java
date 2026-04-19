package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        System.out.println("\n--- Iniciando Logística FiapDelivery ---");
        System.out.println("Levando pacote: " + pacote.getCodigoRastreio());
        System.out.println("Veículo de entrega: " + veiculo.getPlaca());
        System.out.println("Status atual: " + pacote.getStatus());
    }
}