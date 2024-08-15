package SistemaDeReservas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SistemaReservas {
	public static void main(String[] args) {
        Voo voo1234 = new Voo(1234, 10, "Guarulhos");

        System.out.println("Reservando assentos no voo para " + voo1234.getDestino());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 15; i++) {
            executorService.submit(new Reserva(voo1234));
        }
        executorService.shutdown();

        try {
        	TimeUnit segundos = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(30, segundos)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
