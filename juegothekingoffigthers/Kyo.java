import java.util.Random;

public class Kyo extends PersonajeF {
    public Kyo(String nombre) {
        super(nombre);
    }
    public void ataque(PersonajeF oponente) {
        Random rand = new Random();
        int daño = rand.nextInt((maxDaño - minDaño) + 1) + minDaño ; 
        System.out.println(nombre + " usa 'Orochinagi' causando " + daño + " puntos de daño.");
        oponente.recibirDaño(daño);
    }
}

