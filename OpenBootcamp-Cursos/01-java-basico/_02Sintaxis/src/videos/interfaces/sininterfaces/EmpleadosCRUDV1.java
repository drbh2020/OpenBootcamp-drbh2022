package videos.interfaces.sininterfaces;

import java.util.ArrayList;
import java.util.List;


/**
 * CREATE
 * RETRIEVE/READ
 * UPDATE
 * DELETE
 */
public class EmpleadosCRUDV1 {

    //Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD

    //CREATE - Guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleados;
    }

}
