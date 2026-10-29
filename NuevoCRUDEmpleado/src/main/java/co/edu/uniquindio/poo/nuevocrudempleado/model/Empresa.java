package co.edu.uniquindio.poo.nuevocrudempleado.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

        private String nombre;
        private Collection<Empleado> empleados;

        public Empresa(String nombre) {
            this.nombre = nombre;
            empleados = new LinkedList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Collection<Empleado> getEmpleados() {
            return empleados;
        }

        public void setEmpleados(Collection<Empleado> empleados) {
            this.empleados = empleados;
        }

        public boolean agregarEmpleado(Empleado empleado) {
            boolean centinela = false;
            if (!verificarEmpleado(empleado.getCedula())) {
                empleados.add(empleado);
                centinela = true;
            }
            return centinela;
        }

        public boolean eliminarEmpleado(String cedula) {
            boolean centinela = false;
            for (Empleado empleado : empleados) {
                if (empleado.getCedula().equals(cedula)) {
                    empleados.remove(empleado);
                    centinela = true;
                    break;
                }
            }
            return centinela;
        }

        public boolean actualizarEmpleado(String cedula, Empleado actualizado) {
            boolean centinela = false;
            for (Empleado empleado: empleados) {
                if (empleado.getCedula().equals(cedula)) {
                    empleado.setCedula(actualizado.getCedula());
                    empleado.setNombre(actualizado.getNombre());
                    empleado.setApellido(actualizado.getApellido());
                    centinela = true;
                    break;
                }
            }
            return centinela;
        }

        public boolean verificarEmpleado(String cedula) {
            boolean centinela = false;
            for (Empleado empleado : empleados) {
                if (empleado.getCedula().equals(cedula)) {
                    centinela = true;
                }
            }
            return centinela;
        }
}


