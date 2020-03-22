/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author HiperZero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cliente cliente1= new cliente("luis","hernandez",32);
        cliente cliente2= new cliente("axel","jara",24);
        cliente cliente3= new cliente("matias","rivas",41);
        vendedor vendedor1=new vendedor("pedro","alfonso",20);
        vendedor vendedor2=new vendedor("Me quede","Sin ideas",2000);
        System.out.println("CLIENTES");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());
        System.out.println("VENDEDORES");
        System.out.println(vendedor1.toString());
        System.out.println(vendedor2.toString());
    }
    
}
