/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User001
 */
public abstract class Usuario {

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public Usuario (){}

    public Usuario(String CorreoElectronico, String Contraseña) {
        this.CorreoElectronico = CorreoElectronico;
        this.Contraseña = Contraseña;
    }
    private String CorreoElectronico;
    private String Contraseña;
}
