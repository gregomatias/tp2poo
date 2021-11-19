package dominio;



public class ProductoTv  {
    private String fechaDeInstalacion;
    private String fechaDebaja;
    private Plan plan;

    public ProductoTv(String fechaDeInstalacion, String fechaDeBaja, Plan plan) {
        this.fechaDeInstalacion = fechaDeInstalacion;
        this.fechaDebaja = fechaDeBaja;
        this.plan = plan;

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

}
