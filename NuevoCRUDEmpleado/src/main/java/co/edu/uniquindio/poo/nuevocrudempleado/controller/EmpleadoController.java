package co.edu.uniquindio.poo.nuevocrudempleado.controller;

import co.edu.uniquindio.poo.nuevocrudempleado.model.Empleado;
import co.edu.uniquindio.poo.nuevocrudempleado.model.Empresa;

import java.util.Collection;

public class EmpleadoController {


        Empresa empresa;

        public EmpleadoController(Empresa empresa) {
            this.empresa = empresa;
        }

        public boolean crearEmpleado(Empleado empleado) {
            return empresa.agregarEmpleado(empleado);
        }

        public Collection<Empleado> obtenerListaEmpleados() {
            return empresa.getEmpleados();
        }

        public boolean eliminarEmpleado(String cedula) {
            return empresa.eliminarEmpleado(cedula);
        }

        public boolean actualizarEmpleado(String cedula, Empleado empleado) {
            return empresa.actualizarEmpleado(cedula, empleado);
        }
}

