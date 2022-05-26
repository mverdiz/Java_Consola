package com.ipartek.formacion.presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.pojos.Coche;

public class Consola {

	
		static Scanner sc = new Scanner(System.in);
	 
	 //SE CREA UN ARRAYLIST DE LA CLASE COCHE QUE ALMACENA LOS OBJETOS COCHES
	    static ArrayList<Coche> coches = new ArrayList();
	
	
	    public static void main(String[] args) {
	    	System.out.println("Registro de Coches:");
	    	
	    	Menu();
			
	    } 
	    
	    private static void Menu() {
	    	
	    	leerCoches();
	        System.out.println("¿Deseas registrar otro coche?");
	        System.out.println("Pulsa s para continuar.En caso de haber finalizado pulsa cualquier otro carácter.");
	        String  opcion = sc.nextLine();
	
	        if(opcion.equalsIgnoreCase("s")) {
				
				
	        	Menu();
				
			
			}else {
				
				System.out.println("\nCoches registrados:");
				 mostrarCoches();
				
			}
	    	
	    }
	    
	    //SE HACE UN BUCLE QUE RECORA TODO EL ARRAY LIST
	    private static void mostrarCoches() {
	    	 for(int i = 0; i< coches.size(); i++)
	             System.out.println(coches.get(i)); 
			
		}

		public static void leerCoches(){
	    	 
	    	String matricula;
	        String marca;
	        String modelo;
	        String color;
	        int potencia;
	        int cilindrada;
	  
	        Coche carro;
	        
	        
	       
	        //SE RECOJE LA INFROMACION QUE USUARIO TECLEA POR CONSOLA
	            
	            System.out.println("Coche ");
	            
	            System.out.print("Matrícula: ");
	            matricula = sc.nextLine();    
	            
	           
	            System.out.print("Marca: ");
	            marca = sc.nextLine();
	            
	            System.out.print("Modelo: ");
	            modelo = sc.nextLine();
	            
	            System.out.print("Color: ");
	            color = sc.nextLine();
	            
	            System.out.print("Potencia: ");
	            potencia = sc.nextInt();
	            
	            System.out.print("Cilindrada: ");
	            cilindrada = sc.nextInt();
	            
	            
	            sc.nextLine(); 
	   
	            //SE CREA EL OBJETO CARRO CON TODA LA INFORMACION QUE SE INTRODUCE POR PANTALLA
	            carro = new Coche();                  
	   
	            carro.setMatricula(matricula);
	            carro.setMarca(marca);
	            carro.setModelo(modelo);
	            carro.setColor(color);
	            carro.setPotencia(potencia);
	            carro.setCilindrada(cilindrada);
	           
	            //SE AGREGA EL OBJETO CARRO AL ARRAY LIST CREADO AL INICIO 
	            coches.add(carro);
	        }
	    } 

