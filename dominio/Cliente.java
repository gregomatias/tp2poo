package dominio;

public class Cliente {

    private int dni;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    public Cliente(int dni, String nombre, String apellido, Cuenta cuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;

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

    public Cuenta getCuenta() {
        return cuenta;
    }

}
