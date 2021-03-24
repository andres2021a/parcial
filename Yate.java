package parcial;
public class Yate extends Vehiculo{
	
	// se utiliza extends para tomar la herencia..//
    private double pesoMaximo;
public Yate(double pesoMaximo, Colorenum color, String referencia, double velocidadMaxima) {
    super(color, referencia, velocidadMaxima);
    this.pesoMaximo = pesoMaximo;
}

public Yate ()  {
}
	

	   
	        
	        public double getPesoMaximo() {
	            return pesoMaximo;
	        }

	        public void setPesoMaximo(double pesoMaximo) {
	            this.pesoMaximo = pesoMaximo;
	        }
	        
	        
	        public String toString() {
	            return "El YATE CON LA REFERENCIA " + getReferencia() + "  COLOR " + getColor() + " Y CON UNA VELOCIDAD MAXIMA DE " + getVelocidadMaxima() + " Y CON UN PESO MAXIMO DE  " + getPesoMaximo() + " de peso";
	        }
	        
	    


}
