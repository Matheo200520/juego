import java.util.Scanner;

public class EjecutarJuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear personajes disponibles
        PersonajeF objIori = new Iori("Iori");
        PersonajeF objKyo = new Kyo("Kyo");
        PersonajeF objRugal = new Rugal("Rugal");

        // Mostrar menú
        System.out.println("=== THE KING OF FIGHTERS ===\n");
        System.out.println("Personajes disponibles:");
        System.out.println("1. Iori");
        System.out.println("2. Kyo");
        System.out.println("3. Rugal");

        // Elegir jugador 1
        System.out.print("\nSelecciona el personaje del Jugador 1: ");
        int opcion1 = scanner.nextInt();
        PersonajeF jugador1 = seleccionarPersonaje(opcion1, objIori, objKyo, objRugal);

        // Elegir jugador 2
        System.out.print("Selecciona el personaje del Jugador 2: ");
        int opcion2 = scanner.nextInt();
        PersonajeF jugador2 = seleccionarPersonaje(opcion2, objIori, objKyo, objRugal);

        // Iniciar la pelea
        JuegoLuchaF juego = new JuegoLuchaF(jugador1, jugador2);
        juego.iniciarPelea();

        scanner.close();
    }

    // Método para devolver el personaje según la opción elegida
    private static PersonajeF seleccionarPersonaje(int opcion, PersonajeF objIori, PersonajeF objKyo, PersonajeF objRugal) {
        switch (opcion) {
            case 1:
                return new Iori("Iori");
            case 2:
                return new Kyo("Kyo");
            case 3:
                return new Rugal("Rugal");
            default:
                System.out.println("Opción inválida. Se seleccionará Kyo por defecto.");
                return new Kyo("Kyo");
        }
    }
}
