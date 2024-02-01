package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String nombre;
        String cedula;
        Integer opcion;
        Integer cantidadProducto;
        Double costoTotal=0.0;
        Double sumaCantidad=0.0;
        Scanner leerDato= new Scanner(System.in);


        //PROCESO
        //1. CREAR UN MENU DE OPCIONES

        System.out.println("******PELUCHITOS SAS*****");
        System.out.println("1. Cumpleaños");
        System.out.println("2. Dia de la Mujer");
        System.out.println("3. Baby showers");
        System.out.println("4. SALIR");

        //CONSTRUIR UN CICLO PARA PERMITIR QUE EL USUARIO ESCOJA

        do{System.out.println("Digita la opcion que deseas: ");
            opcion=leerDato.nextInt();

            //EVALUANDO OPCIONES DEL MENÚ
            if (opcion==1){
                System.out.println("Digita cuantos kit de cumpleaños:");
                cantidadProducto=leerDato.nextInt();
                costoTotal=180000.00*cantidadProducto;
                sumaCantidad=sumaCantidad+costoTotal;

            }else if(opcion==2){
                System.out.println("Digita cuantos kit de mujer deseas: ");
                cantidadProducto=leerDato.nextInt();
                costoTotal=60000.00*cantidadProducto;
                sumaCantidad=sumaCantidad+costoTotal;
            } else if(opcion==3){
                System.out.println("Digita cuantos kit de bebe deseas: ");
                cantidadProducto=leerDato.nextInt();
                costoTotal=250000.00*cantidadProducto;
                sumaCantidad=sumaCantidad+costoTotal;
            }else if(opcion==4){
                System.out.println("Gracias, hasta pronto ");
            }else {
                System.out.println("Digita una opcion valida");
            }

        }while (opcion!=4);

        System.out.println("El costo es de: " +sumaCantidad);

        //2.PERMITIR QUE EL USUARIO ESCOJA













    }
}