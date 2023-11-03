
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User001
 */
public class UsuarioMicroempresario extends Usuario {

    public String getNombreMicro() {
        return NombreMicro;
    }

    public void setNombreMicro(String NombreMicro) {
        this.NombreMicro = NombreMicro;
    }

    public String getRUCMicro() {
        return RUCMicro;
    }

    public void setRUCMicro(String RUCMicro) {
        this.RUCMicro = RUCMicro;
    }

    public String getRazonSocialMiCro() {
        return RazonSocialMiCro;
    }

    public void setRazonSocialMiCro(String RazonSocialMiCro) {
        this.RazonSocialMiCro = RazonSocialMiCro;
    }
    private String NombreMicro;
    private String RUCMicro;
    private String RazonSocialMiCro;
    private List<MicroEmpresa> microempresas = new ArrayList<>();
    
     public void agregarMicroEmpresa(MicroEmpresa microempresa) {
        microempresas.add(microempresa);
    }

    public UsuarioMicroempresario (String NombreMicro, String RUCMicro, String RazonSocialMiCro){
    this.NombreMicro= NombreMicro;
    this.RUCMicro=RUCMicro;
    this.RazonSocialMiCro=RazonSocialMiCro;}
   
    
}
