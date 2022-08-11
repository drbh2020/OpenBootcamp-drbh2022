package videos.interfaces.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

/*        EmpleadosCRUDV1 empleadosCRUD = new EmpleadosCRUDV1();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        //Guardar empleados
        empleadosCRUD.save(juanito);
        empleadosCRUD.save(patricia);
        empleadosCRUD.save(roberto);

        //Consultar empleados
        List<Empleado> empleados = empleadosCRUD.findAll();
        System.out.println(empleados);*/

        //Usamos V2

        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        System.out.println(juanito);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUDV2.recuperarEmpleados();
        System.out.println(empleados);
    }
}
