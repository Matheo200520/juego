import java.util.Random;

public class Iori extends PersonajeF {
    public Iori(String nombre) {
        super(nombre);
    }
    public void ataque(PersonajeF oponente) {
        Random random = new Random();
        int daño = random.nextInt((maxDaño - minDaño) + 1) + minDaño;
        System.out.println(nombre + " usa 'Shiki Oniyaki' causando " + daño + " puntos de daño.");
        oponente.recibirDaño(daño);
    }
}
