package dominio;

public class ProductoMovil {
    private int idLinea;
    private String fechaActivacion;
    private Plan plan;
    private Promocion promocion;

    public ProductoMovil(int idLinea, String fechaActivacion) {
        this.idLinea = idLinea;
        this.fechaActivacion = fechaActivacion;

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

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

}
