import java.util.Scanner;

public class JuegoLuchaF {
    private PersonajeF jugador1;
    private PersonajeF jugador2;

    public JuegoLuchaF(PersonajeF jugador1, PersonajeF jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {
        System.out.println("\nComienza la batalla entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");

        while (jugador1.estarVivo() && jugador2.estarVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estarVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estarVivo()) {
            System.out.println("\n" + jugador1.getNombre() + " (J1) Ha ganado la pelea.");
        } else {
            System.out.println("\n" + jugador2.getNombre() + " (J2) Ha ganado la pelea.");
        }
    }

    private void turno(PersonajeF atacante, PersonajeF defensor) {
        System.out.println("Turno de " + atacante.getNombre() + " (Vida: " + atacante.getPuntosDeVida() + ")");
        atacante.ataque(defensor);
        System.out.println("Vida restante de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida() + "\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== THE KING OF FIGHTERS ===\n");

        // Jugador 1
        System.out.println("Selecciona el personaje del Jugador 1:");
        System.out.println("1. Rugal");
        System.out.println("2. Iori");
        System.out.println("3. Kyo");
        System.out.print("Opción: ");
        int opcion1 = scanner.nextInt();

        PersonajeF jugar1 = crearPersonaje(opcion1);

        //Jugador 2
        System.out.println("Selecciona el personaje del jugador 2:");
        System.out.println("1. Rugal");
        System.out.println("2. Iori");
        System.out.println("3. Kyo");
        System.out.print("Opción: ");
        int opcion2 =scanner.nextInt();

        PersonajeF jugar2 = crearPersonaje(opcion2);
        
        JuegoLuchaF juego = new JuegoLuchaF(jugar1, jugar2);
        
        juego.iniciarPelea();

        scanner.close();

    }
    private static PersonajeF crearPersonaje(int opcion) {
        switch (opcion) {
            case 1:
                return new Rugal("Rugal");
            case 2:
                return new Iori("Iori");
            case 3:
                return new Kyo("Kyo");
            default:
                System.out.println("Opción inválida. Se seleccionará Kyo por defecto.");
                return new Kyo("Kyo");
        }
    }
}
