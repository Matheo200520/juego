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
    
}
