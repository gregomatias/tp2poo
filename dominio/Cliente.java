package dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int dni;
    private String nombre;
    private String apellido;
    private List<Cuenta> cuentas = new ArrayList<Cuenta>();

    public Cliente(int dni, String nombre, String apellido, Cuenta cuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        cuentas.add(cuenta);

    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }



    public List<Cuenta> getCuentas() {
        return cuentas;
    }

}
