package parcial;

public class Carro extends Vehiculo{
	
	// se utiliza extends para tomar la herencia..//
    private int numeroDePuertas;

    public Carro(int numeroDePuertas, Colorenum color, String referencia, double velocidadMaxima) {
        super(color, referencia, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Carro() {
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    
    public String toString() {
        return "El CARRO CON LA REFERENCIA " + getReferencia() + " COLOR " + getColor() + " Y UNA VELOCIDAD MAXIMA DE  " + getVelocidadMaxima() + " CON  " + getNumeroDePuertas() + " PUERTAS";
    }
    
}

