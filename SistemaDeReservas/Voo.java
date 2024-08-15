//Classe Voo:
//A classe Voo deve conter informações como número do voo, capacidade total e número de assentos 
//reservados.
//Deve ter métodos para verificar a disponibilidade de assentos e fazer uma reserva. 

package SistemaDeReservas;

public class Voo {
	private int numVoo;
    private int capacidade;
    private int assentosReservados;
    private String destino;

    public Voo (int numVoo, int capacidade, String destino) {
        this.numVoo = numVoo;
        this.capacidade = capacidade;
        this.assentosReservados = 0;
        this.destino = destino;
    }

    public synchronized boolean reservarAssento () {
        if (assentosReservados < capacidade) {
            assentosReservados++;
            return true;
        } else {
            return false;
        }
    }

    public int getAssentosDisponiveis () {
        return capacidade - assentosReservados;
    }

    public int getNumeroVoo () {
        return numVoo;
    }
    
    public String getDestino () {
        return destino;
    }
}
