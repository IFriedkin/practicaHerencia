package razas;

/**
 * Clase Protoss, hereda de la clase Escuadron.
 * @author Ibrahim González Cabrera
 */
public class Protoss extends Escuadron {
    private int pilones;

    /**
     * Constructor parametrizado de la clase Protoss.
     * @param pilones
     * @param nombre
     * @param numVictorias
     * @param nvAtaque
     * @param nvDefensa 
     */
    public Protoss(int pilones, String nombre, int numVictorias, 
            double nvAtaque, double nvDefensa) {
        super(nombre, numVictorias, nvAtaque, nvDefensa);
        this.pilones = pilones;
    }

    //Getters
    public int getPilones() {return pilones;}

    //Setters
    public void setPilones(int pilones) {this.pilones = pilones;}

    /**
     * Calcula el nivel de ataque Protoss en base a los pilones que tienen 
     * construidos.
     * @return El poder de ataque del escuadrón Protoss.
     */
    @Override
    public double calcularAtaque() {
        return getNvAtaque() + (pilones * 0.5);
    }

    /**
     * Calcula el nivel de defensa Protoss en base a los pilones que tienen 
     * construidos.
     * @return La capacidad defensiva del escuadrón Protos.
     */
    @Override
    public double calcularDefensa() {
        return getNvDefensa() + (pilones * 0.5);
    }
}
