/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumo;

/**
 *
 * @author aguadulce
 */
public class Main {
    public static void main(String[] args) {
        Zumo UnDeposito;
        int relleno = 0 ;
        /*Creación de un depósito con zumo de pomelo, inicialmente contiene 20 litros, su capacidad máxima es de 40 litros
        el precio del litro es 2€*/
        UnDeposito= new Zumo(20,2,"Pomelo",40);
        
        acciones_Zumo(UnDeposito, 0);
    }

    public static void acciones_Zumo(Zumo UnDeposito, double Peso) {
        int relleno = 0;
        
        try {
            System.out.println("Vamos a tomar zumo");
            UnDeposito.sacarZumo(5, 20);//Se intentan comprar 5 litros de zumo con 20€
        } catch (Exception e) {
            System.out.println("Error al sacar zumo");
        }
        try {
            System.out.println("Rellenando depósito");
            UnDeposito.rellenar(30);//Se intenta rellenar el deposito añadiendo 30 litros
        } catch (Exception e) {
            System.out.println("Fallo al rellenar el depósito");
        }
        relleno = UnDeposito.obtenerLitros();
        System.out.println("El depósito contiene " + relleno + " litros");
    }
}
