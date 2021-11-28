package dominio;

public class EventoTelevisivo {
    private int idEvento;
    private String nombreEvento;
    private String generoEvento;

    public EventoTelevisivo(int idEvento, String nombreEvento, String generoEvento) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.generoEvento = generoEvento;

    }
    public int getIdPelicula() {
        return idEvento;
    }
    public String getNombrePelicula() {
        return nombreEvento;
    }
    public String getGeneroPelicula() {
        return generoEvento;
    }
}
