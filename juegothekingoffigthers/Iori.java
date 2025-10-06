import java.util.Random;

public class Iori extends PersonajeF {
    public Iori(String nombre) {
        super(nombre);
    }
    public void ataque(PersonajeF oponente) {
        Random random = new Random();
        int daño = random.nextInt((maxDaño - minDaño) + 1) + minDaño;
        oponente.recibirDaño(daño);
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " causando " + daño + " puntos de daño.");
    }
}
