//	Classe Reserva:
//	A classe Reserva deve representar uma tarefa de reserva que implementa Runnable.
//	Deve tentar reservar um assento em um voo específico.

package SistemaDeReservas;

import java.lang.Runnable;

public class Reserva implements Runnable {
	
	private Voo voo;

    public Reserva(Voo voo) {
        this.voo = voo;
    }

    @Override
    public void run() {
        if (voo.reservarAssento()) {
            System.out.println("Reserva bem-sucedida no voo " + voo.getNumeroVoo() + " para " + voo.getDestino()
            + ". Assentos restantes: " + voo.getAssentosDisponiveis());
        } else {
            System.out.println("Não foi possível fazer a reserva no voo " + voo.getNumeroVoo() + ". Voo lotado.");
        }
    }
}
