/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        List<String> vehiculos ;
        String nombreFichero = "vehiculos.csv";
        vehiculos = leerFichero(nombreFichero);
        List<Vehiculo> listaVehiculos = añadirVehiculo(vehiculos);
        
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
        
        System.out.println("------------------------");
        System.out.println("Estructura Map: ");
        System.out.println(mostrarListaPalabrasContadas(vehiculos));
//        List<Vehiculo> vehiculos2 
                
//        
//        vehiculos.forEach(linea->{;int numerosPalabras = contarPalabrasPorLinea(linea);
//            System.out.println(linea+"-->"+numerosPalabras);
//        });
//        
    }
//    public static int contarPalabrasPorLinea(String linea){
//        // En java para escapar la barra invertida hay que añadir otra
//        // barra adicional 
//        linea = linea.trim();
////        String[] array = linea.split("\\s+");
//        List array = new ArrayList<>();
//        for(int i = 0;i<array.size();i++){
//            
//        }
//        
//        
//        return array.size();
//   
    public static List<String> leerFichero(String nombreFichero){
        List<String> lista = new ArrayList<>();
        try{
           lista =  Files.readAllLines(Paths.get(nombreFichero));
           lista.remove(0);
        }catch(IOException ex){
            System.out.println("Error");
        }
        
        return lista;
    }
    public static List<Vehiculo> añadirVehiculo(List<String> lista){
        List<Vehiculo> vehiculos = new ArrayList();
        
        for (String string : lista) {
            String[] array = string.split(",");
            vehiculos.add(new Vehiculo(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], array[5])
            );
        }
                
        return vehiculos;
    }
    public static Map<Integer,Integer> mostrarListaPalabrasContadas(List<String> lista){
        Map<Integer,Integer> listaMap = new TreeMap();
        int contadorLineas = 2;
        int contadorPalabras = 0;
        for(String linea : lista){
            String[] array = linea.split(",");
            for(String palabra : array){
                String[] palabras = palabra.split("\\n+");
                contadorPalabras += palabras.length;
            }
            listaMap.put(contadorLineas, contadorPalabras);
            contadorLineas++;
            contadorPalabras = 0; // lo reseto para no afectar la siguiente linea
        }
        
        return listaMap;
    }
}
