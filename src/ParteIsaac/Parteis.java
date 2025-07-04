/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Parteis {
    public String Nombre; 
    public String cedula; 
    public int numeroTel; 

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return cedula.hashCode();
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Parteis(String Nombre, String cedula, int numeroTel) {
        this.Nombre = Nombre;
        this.cedula = cedula;
        this.numeroTel = numeroTel;
    }

    @Override
    public String toString() {
        return "ParteIsaac{" + "Nombre=" + Nombre + ", cedula=" + cedula + ", numeroTel=" + numeroTel + '}';
    }
    
    
}
