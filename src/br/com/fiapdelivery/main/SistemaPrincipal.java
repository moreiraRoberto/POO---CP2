package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        System.out.println("=== FIAP DELIVERY: GESTÃO DE LOGÍSTICA ===");

        // Ajuste dos pacotes criados pelo estágiario
        Pacote pac1 = new Pacote("BR999", 10.5);
        Pacote pac2 = new Pacote("XP777", 2.0);

        // Com os contrutor professor consegui blindar o valor negativo, que antes era public
        // Quando é inserido um valor ele é enviado ao Construtor, e a partir daqui a classe mae assume e blinda em veiculo
        Caminhao caminhaoGrave = new Caminhao("ABC-1234", -500.0, 3);
        Moto motoAgil = new Moto("MOTO-2026", 50.0, true);

        // Criando a Rota para o Caminhão
        Rota rotaPesada = new Rota(pac1, caminhaoGrave);
        rotaPesada.iniciarEntrega();

        System.out.println("-------------------------------------------");

        // Criando a Rota para a Moto
        
        Rota rotaRapida = new Rota(pac2, motoAgil);
        
        // Atualizando status do pacote  
        pac2.atualizarStatus("Em Trânsito");
        rotaRapida.iniciarEntrega();
        
        // 5. Exibindo dados técnicos para conferência
        System.out.println("\n--- Auditoria de Frota ---");
        System.out.println("Veículo 1 (Placa): " + caminhaoGrave.getPlaca() + " | Eixos: " + caminhaoGrave.getQuantidadeEixos());
        System.out.println("Veículo 2 (Placa): " + motoAgil.getPlaca() + " | Tem Baú: " + (motoAgil.isPossuiBau() ? "Sim" : "Não"));
    }
}