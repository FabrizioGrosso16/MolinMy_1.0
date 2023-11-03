/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User001
 */
public class UsuarioCiudadano extends Usuario{
    private String Nombre;
    private String Apellido;
    public UsuarioCiudadano(String Nombre, String Apellido)
    {
        this.Nombre= Nombre;
        this.Apellido= Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
 
}
