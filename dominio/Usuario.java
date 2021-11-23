package dominio;

public class Usuario {
    private String nombreUsuario;
    private int clave;

    public Usuario(String nombreUsuario, int clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public int getClave() {
        return clave;
    }
}
