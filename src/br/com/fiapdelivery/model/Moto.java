package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, double capacidade, boolean bau) {
        super(placa, capacidade);
        this.possuiBau = bau;
    }

    public boolean isPossuiBau() { return possuiBau; }
    public void setPossuiBau(boolean bau) { this.possuiBau = bau; }
}