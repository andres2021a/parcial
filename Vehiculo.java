package parcial;

public class Vehiculo {
	 private Colorenum color;

	    private String referencia;

	    private double velocidadMaxima;

	    public Vehiculo(Colorenum color, String referencia, double velocidadMaxima) {
	        this.color = color;
	        this.referencia = referencia;
	        this.velocidadMaxima = velocidadMaxima;
	    }

	    public Vehiculo() {
	    }

	    public Colorenum getColor() {
	        return color;
	    }

	    public void setColor(Colorenum color) {
	        this.color = color;
	    }

	    public String getReferencia() {
	        return referencia;
	    }

	    public void setReferencia(String referencia) {
	        this.referencia = referencia;
	    }

	    public double getVelocidadMaxima() {
	        return velocidadMaxima;
	    }

	    public void setVelocidadMaxima(double velocidadMaxima) {
	        this.velocidadMaxima = velocidadMaxima;
	    }

	    
	    public String toString() {
	        return "Vehiculo{" + "color=" + color + ", referencia=" + referencia + ", velocidadMaxima=" + velocidadMaxima + '}';
	    }
	    
	    
	}



