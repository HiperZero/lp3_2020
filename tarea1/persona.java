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

public  class persona {
    private String nombre;
    private int edad;
    private String apellido;
    
    public persona (String nombre,String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad =edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
   
    @Override
    public String toString() {
        return "NOMBRE: "+getNombre()+"\tAPELLIDO: "+getApellido()+"\tEDAD: "+getEdad();
    }
}
    
