package razas;

/**
 *
 * @author Ibrahim Gonzáez Cabrera
 */
public abstract class Escuadron {
    protected String nombre;
    protected int numVictorias;
    protected double nvAtaque;
    protected double nvDefensa;

    /**
     * Constructor paraetrizado de la clase Escuadron.
     * @param nombre
     * @param numVictorias
     * @param nvAtaque
     * @param nvDefensa 
     */
    public Escuadron(String nombre, int numVictorias, double nvAtaque, double nvDefensa) {
        this.nombre = nombre;
        this.numVictorias = numVictorias;
        this.nvAtaque = nvAtaque;
        this.nvDefensa = nvDefensa;
    }
    
    //Getters
    public String getNombre() {return nombre;}
    public int getNumVictorias() {return numVictorias;}
    public double getNvAtaque() {return nvAtaque;}
    public double getNvDefensa() {return nvDefensa;}

    //Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setNumVictorias(int numVictorias) {
        this.numVictorias = numVictorias;}
    public void setNvAtaque(double nvAtaque) {this.nvAtaque = nvAtaque;}
    public void setNvDefensa(double nvDefensa) {this.nvDefensa = nvDefensa;}

    //número de v ictorias, niv el de ataque y niv el de defensa. 
}
