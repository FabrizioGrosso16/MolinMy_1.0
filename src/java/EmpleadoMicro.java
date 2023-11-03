/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User001
 */
public class EmpleadoMicro {
    private String Nombre;
    private String DNI;
    private String Horario;
    private EmpleadoMicro Jefe;
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public EmpleadoMicro getJefe() {
        return Jefe;
    }

    public void setJefe(EmpleadoMicro Jefe) {
        this.Jefe = Jefe;
    }
  
    

    public EmpleadoMicro(String Nombre, String DNI, String Horario) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Horario = Horario;
    }
    
    
}
