package br.com.fiapdelivery.model;

// Criei Veiculo para ser dentro da Herança a SUPERCLASSE MÃE
public class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        this.setPlaca(placa);
        this.setCapacidadeCarga(capacidadeCarga);
    }

    // Professor apliquei Get e Set 
    public String getPlaca() { return placa; }
    
    public void setPlaca(String placa) {
        if (placa != null && !placa.isEmpty()) {
            this.placa = placa;
        }
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga > 0) {
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("Erro: Capacidade deve ser positiva. Definindo 1.0 como padrão.");
            this.capacidadeCarga = 1.0;
        }
    }
}