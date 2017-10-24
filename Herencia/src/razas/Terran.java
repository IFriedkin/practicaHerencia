package razas;

/**
 * Clase Terran, hereda de la clase Escuadron.
 * @author Ibrahim González Cabrera
 */
public class Terran extends Escuadron {
    
    private int edificios;
    private int tecnologia;

    /**
     * Constructor parametrizado de la clase Terran.
     * @param edificios
     * @param tecnologia
     * @param nombre
     * @param numVictorias
     * @param nvAtaque
     * @param nvDefensa 
     */
    public Terran(int edificios, int tecnologia, String nombre, 
            int numVictorias, double nvAtaque, double nvDefensa) {
        super(nombre, numVictorias, nvAtaque, nvDefensa);
        this.edificios = edificios;
        this.tecnologia = tecnologia;
    }

    //Getters
    public int getEdificios() {return edificios;}
    public int getTecnologia() {return tecnologia;}

    //Setters
    public void setEdificios(int edificios) {this.edificios = edificios;}
    public void setTecnologia(int tecnologia) {this.tecnologia = tecnologia;}

    /**
     * Calcula el nivel de ataque Terran en base a la tecnología que tienen.
     * @return El poder de ataque del escuadron Terran.
     */
    @Override
    public double calcularAtaque() {
        return getNvAtaque() + (tecnologia * 0.5);
    }

    /**
     * Calcula el nivel de defensa Terran en base a los edificios que han 
     * construido.
     * @return La capacidad defensiva del escuadrón Terran.
     */
    @Override
    public double calcularDefensa(){
        return getNvDefensa() + ((edificios * 0.25) + 1);
    }
}