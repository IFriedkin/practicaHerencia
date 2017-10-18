package razas;

/**
 *
 * @author Ibrahim González Cabrera
 */
public class Terran extends Escuadron {
    
    private int Edificios;

    /**
     * Constructor parametrizado de la clase Terran.
     * @param Edificios
     * @param nombre
     * @param numVictorias
     * @param nvAtaque
     * @param nvDefensa 
     */
    public Terran(int Edificios, String nombre, int numVictorias, 
            double nvAtaque, double nvDefensa) {
        super(nombre, numVictorias, nvAtaque, nvDefensa);
        this.Edificios = Edificios;
    }

    /**
     * Get the value of Edificios
     *
     * @return the value of Edificios
     */
    public int getEdificios() {
        return Edificios;
    }

    /**
     * Set the value of Edificios
     *
     * @param Edificios new value of Edificios
     */
    public void setEdificios(int Edificios) {
        this.Edificios = Edificios;
    }

}
