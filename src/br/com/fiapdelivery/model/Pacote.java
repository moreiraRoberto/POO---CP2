package br.com.fiapdelivery.model;
// Fiz adaptacao dos nomes dos atributos que estavam como p,s,muda e não faziam sentido nenhum.

public class Pacote {
    private String codigoRastreio;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {
        this.codigoRastreio = codigo;
        this.peso = peso;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Pacote " + codigoRastreio + " alterado para: " + novoStatus);
    }

    // Getters para me trazer com segurança o que necessito
    public String getCodigoRastreio() { return codigoRastreio; }
    public double getPeso() { return peso; }
    public String getStatus() { return status; }
}