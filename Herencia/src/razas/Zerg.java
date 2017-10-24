package razas;

/**
 * Clase Zerg, hereda de la clase Escuadron.
 * @author Ibrahim González Cabrera
 */
public class Zerg extends Escuadron {
    private int esbirros;
    private int superAmo;

    /**
     * Constructor parametrizado de la clase Zerg.
     * @param esbirros
     * @param superAmo
     * @param nombre
     * @param numVictorias
     * @param nvAtaque
     * @param nvDefensa 
     */
    public Zerg(int esbirros, int superAmo, String nombre, int numVictorias, 
            double nvAtaque, double nvDefensa) {
        super(nombre, numVictorias, nvAtaque, nvDefensa);
        this.esbirros = esbirros;
        this.superAmo = superAmo;
    }

    //Getters
    public int getEsbirros() {return esbirros;}
    public int getSuperAmo() {return superAmo;}

    //Setters
    public void setEsbirros(int esbirros) {this.esbirros = esbirros;}
    public void setSuperAmo(int superAmo) {this.superAmo = superAmo;}

    /**
     * Calcula el nivel de ataque Zerg basándose en la cantidad de esbirros  y 
     * de superamos que tienen.
     * @return El poder de ataque del escuadrón Zerg.
     */
    @Override
    public double calcularAtaque() {
        return getNvAtaque() + (esbirros * 0.15) + (superAmo + 0.4);
    }

    /**
     * Calcula el nivel de defensa basándose en la cantidad de esbirros que 
     * tienen.
     * @return La capacidad defensiva del escuadrón Zerg.
     */
    @Override
    public double calcularDefensa() {
        return getNvDefensa() + (esbirros + 0.3);
    }
}
