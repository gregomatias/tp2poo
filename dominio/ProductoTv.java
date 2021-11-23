package dominio;

public class ProductoTv {
    private String fechaDeInstalacion;
    private String fechaDebaja;
    private Plan plan;
    private Promocion promocion;

    public ProductoTv(String fechaDeInstalacion, String fechaDeBaja) {
        this.fechaDeInstalacion = fechaDeInstalacion;
        this.fechaDebaja = fechaDeBaja;

    }

    public String getFechaDeInstalacion() {
        return fechaDeInstalacion;
    }

    public String getFechaDebaja() {
        return fechaDebaja;
    }

    public Plan getPlan() {
        return plan;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

}
