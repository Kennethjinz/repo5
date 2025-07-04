/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pruebaWes;

/**
 *
 * @author Student
 */
public enum numero {
  OCUPADO("Ocupado"),
  LIBRE("Libre");
  
  private final String estado;

    public String getEstado() {
        return estado;
    }

    private numero(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "numero{" + "ordinal=" + ordinal() + ", name=" + name() + ", estado=" + estado + '}';
    }
}
