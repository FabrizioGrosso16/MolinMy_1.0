
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
public class MicroEmpresa {

    
    private String NombreMiEmp;
    private String DescripcionMiEmp;
    private EmpleadoMicro[] EmpleadoMiEmp = new EmpleadoMicro[10];
    private CategoriaMicroEmpresa CategoriaMiEmp;
    private List<Productos> listaDeProductos;
    private List<Promocion> listaDePromociones;

    public MicroEmpresa() {
        listaDeProductos = new ArrayList<>();
        listaDePromociones = new ArrayList<>();
    }
    public void agregarProductos(Productos productos) {
        listaDeProductos.add(productos);
    }

    // Métodos para agregar instancias de Promociones a la lista
    public void agregarPromociones(Promocion promociones) {
        listaDePromociones.add(promociones);
    }

    
    public MicroEmpresa(String NombreMiEmp, CategoriaMicroEmpresa CategoriaMiEmp) {
        this.NombreMiEmp = NombreMiEmp;
        this.CategoriaMiEmp = CategoriaMiEmp;
    }
    public String getNombreMiEmp() {
        return NombreMiEmp;
    }

    public void setNombreMiEmp(String NombreMiEmp) {
        this.NombreMiEmp = NombreMiEmp;
    }

    public String getDescripcionMiEmp() {
        return DescripcionMiEmp;
    }

    public void setDescripcionMiEmp(String DescripcionMiEmp) {
        this.DescripcionMiEmp = DescripcionMiEmp;
    }

    public EmpleadoMicro[] getEmpleadoMiEmp() {
        return EmpleadoMiEmp;
    }

    public void setEmpleadoMiEmp(EmpleadoMicro[] EmpleadoMiEmp) {
        this.EmpleadoMiEmp = EmpleadoMiEmp;
    }

    public CategoriaMicroEmpresa getCategoriaMiEmp() {
        return CategoriaMiEmp;
    }

    public void setCategoriaMiEmp(CategoriaMicroEmpresa CategoriaMiEmp) {
        this.CategoriaMiEmp = CategoriaMiEmp;
    }
    
}
