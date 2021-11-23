package dominio;

public class ProductoInternet {

    private String fechaDeInstalacion;
    private String fechaDeBaja;
    private Plan plan;
    private Promocion promocion;

    public ProductoInternet(String fechaDeInstalacion, String fechaDeBaja) {

        this.fechaDeInstalacion = fechaDeInstalacion;
        this.fechaDeBaja = fechaDeBaja;

    }

    public Plan getPlan() {
        return plan;
    }

    public String getFechaDeInstalacion() {
        return fechaDeInstalacion;
    }

    public String getFechaDeBaja() {
        return fechaDeBaja;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
