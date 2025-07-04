/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ParteIsaac;

/**
 *
 * @author Student
 */
public enum Prueba {
    ACTIVO("Activo"),
    INACTIVO("Inactivo");
    
    private final String estado; 

    private Prueba(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Prueba{" + "ordinal=" + ordinal() + ", name=" + name() + ", estado=" + estado + '}';
    }

  
    
}
