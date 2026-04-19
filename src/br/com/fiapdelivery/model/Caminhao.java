package br.com.fiapdelivery.model;

// Este é a primeira filha de Veiculo e utilizei a teoria "É-um".

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.quantidadeEixos = eixos;
    }

    public int getQuantidadeEixos() { return quantidadeEixos; }
    public void setQuantidadeEixos(int eixos) { this.quantidadeEixos = eixos; }
}