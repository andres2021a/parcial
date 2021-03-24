package parcial;
import java.util.Scanner;

import parcial.Avion;
import parcial.Carro;
import parcial.color;
import parcial.Vehiculo;
import parcial.Yate;

public class examen {
	 public static void main(String[] args) {

	        Scanner M = new Scanner(System.in);
	        Vehiculo[] garaje = new Vehiculo[10];
	        int opcion = 0, opcion2 = 0, lleno = 0;

	        while (opcion != 3) {
	            System.out.println("Seleccione una opcion:  ");
	            System.out.println("    1. AGREGAR VEHICULO");
	            System.out.println("    2. REVISAR GARAJE");
	            System.out.println("    3. SALIR");
	            System.out.print("> ");
	            opcion = M.nextInt();
	            System.out.println("");
	            M.nextLine();

	            switch (opcion) {
	                case 1:
	                    if (lleno != 10) {
	                        System.out.println("¿Cual es el tipo de vehiculo?");
	                        System.out.println("    1. Avion.");
	                        System.out.println("    2. Yate.");
	                        System.out.println("    3. Carro.");
	                        System.out.println("    4. Salir.");
	                        System.out.print("> ");
	                        opcion2 = M.nextInt();
	                        M.nextLine();
	                        System.out.println("");
	                        String Ref = "";
	                        System.out.println("Digite la referencia: ");
	                        System.out.print("> ");
	                        Ref = M.nextLine();
	                        System.out.println("");
	                        String col = "";
	                        System.out.println("Digite el color (NEGRO, BLANCO, AZUL, VERDE, GRIS): ");
	                        System.out.print("> ");
	                        col = M.nextLine().toUpperCase().trim().replaceAll(" ", "");
	                        System.out.println("");
	                        double Vel = 0;
	                        System.out.println("Digite la velocidad maxima: ");
	                        System.out.print("> ");
	                        Vel = M.nextDouble();
	                        System.out.println("");
	                        Vehiculo vehi = null;
	                        switch (opcion2) {
	                            case 1:
	                                double X = 0;
	                                System.out.println("Digite la altitud maxima del avion: ");
	                                System.out.print("> ");
	                                X = M.nextDouble();
	                                vehi = new Avion(X, Enum.valueOf(Colorenum.class, col), Ref, Vel);
	                                break;

	                            case 2:
	                                double Y = 0;
	                                System.out.println("Digite el peso maximo del vehiculo: ");
	                                System.out.print("> ");
	                                 Y= M.nextDouble();
	                                vehi = new Yate(Y, Enum.valueOf(Colorenum.class, col), Ref, Vel);
	                                break;

	                            case 3:
	                                double Z = 0;
	                                System.out.println("Digite el numero de puertas del carro: ");
	                                System.out.print("> ");
	                                Z = M.nextDouble();
	                                vehi = new Carro((int) Z, Enum.valueOf(Colorenum.class, col), Ref, Vel);
	                                break;

	                            case 4:
	                                System.out.println("Volver al menu");
	                                break;
	                            default:
	                                System.out.println("Opcion no valida");
	                        }
	                        System.out.println("");
	                        if (vehi != null) {
	                            garaje[lleno] = vehi;
	                            lleno++;
	                        }

	                    }
	                    break;

	                case 2:
	                    System.out.println("Vehiculos del garaje: ");
	                    for (int i = 0; i < lleno; i++) {
	                        System.out.println(garaje[i]);
	                    }
	                    break;

	                case 3:
	                    System.out.println("finalizar");
	                    break;
	                default:
	                    System.out.println("Error");
	            }
	            System.out.println("");
	        }
	    }

	}



