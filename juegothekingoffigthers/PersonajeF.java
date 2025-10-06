
// Clase abstracta base para todos los personajes
abstract class PersonajeF {

    protected String nombre;
    protected int puntosDeVida;
    protected int minDaño = 10;
    protected int maxDaño = 30;

    // Constructor para inicializar el personaje
    public PersonajeF(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // todos inician con 100 puntos de vida
    }

    // Método abstracto (cada personaje ataca distinto)
    public abstract void ataque(PersonajeF oponente);

    // Método común para recibir daño
    public void recibirDaño(int daño) {
        this.puntosDeVida -= daño;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verificar si el personaje sigue con vida
    public boolean estarVivo() {
        return this.puntosDeVida > 0;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
