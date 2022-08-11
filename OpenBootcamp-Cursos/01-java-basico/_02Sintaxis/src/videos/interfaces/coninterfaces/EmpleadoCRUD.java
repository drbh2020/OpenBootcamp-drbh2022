package videos.interfaces.coninterfaces;

import videos.interfaces.sininterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los métodos, no se implementan
 *
 * Actúa como un contrato, dice lo que hay que hacer pero no dice ni donde ni como
 */

public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
