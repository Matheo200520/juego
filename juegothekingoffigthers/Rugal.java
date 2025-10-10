import java.util.Random;

public class Rugal extends PersonajeF {
    public Rugal(String nombre) {
        super(nombre);
    }
    public void ataque(PersonajeF oponente) {
        Random rand = new Random();
        int daño = rand.nextInt((maxDaño - minDaño) + 1) + minDaño;
        System.out.println(nombre + " lanza 'Genocide Cutter' causando " + daño + " puntos de daño.");
        oponente.recibirDaño(daño);
    }
}

