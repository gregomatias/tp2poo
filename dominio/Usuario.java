package dominio;

public class Usuario {
    private String nombreUsuario;
    private String clave;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getClave() {
        return clave;
    }
}
