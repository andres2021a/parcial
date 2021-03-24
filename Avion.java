package parcial;
public class Avion extends Vehiculo{
	// se utiliza extends para tomar la herencia..//
private double altitudMaxima;

public Avion(double altitudMaxima, Colorenum color, String referencia, double velocidadMaxima) {
    super(color, referencia, velocidadMaxima);
    this.altitudMaxima = altitudMaxima;
}
public  Avion () {
}
	 public double getAltitudMaxima() {
	        return altitudMaxima;
	    }

	    public void setAltitudMaxima(double altitudMaxima) {
	        this.altitudMaxima = altitudMaxima;
	    }
	    
	   
	    public String toString() {
	        return "EL AVION CON LA REFERENCIA " + getReferencia() + "  COLOR " + getColor() + " CON UNA VELOCIDAD MAXIMA DE  " + getVelocidadMaxima() + " Y CON UNA ALTURA MAXIMA DE  " + getAltitudMaxima() + " de altitud";
	    }
	    
	}


