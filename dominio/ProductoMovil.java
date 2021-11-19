package dominio;



public class ProductoMovil {
    private int idLinea;
    private String fechaActivacion;
    private Plan plan;

    public ProductoMovil(int idLinea, String fechaActivacion, Plan plan) {
        this.idLinea = idLinea;
        this.fechaActivacion = fechaActivacion;
        this.plan = plan;

    }

    public int getIdLinea() {
        return idLinea;
    }

    public String getFechaActivacion() {
        return fechaActivacion;
    }

    public Plan getPlan() {
        return plan;
    }

}
