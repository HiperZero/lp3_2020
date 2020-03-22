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
public class cliente extends persona {

    public cliente(String nombre,String apellido, int edad) {
        super(nombre,apellido, edad);
    }
    public void mostrarNombre(){
        System.out.println(getNombre());
    }
    public void mostrarEdad(){
        System.out.println(getEdad());
    }
}
