package dominio;


public class ProductoInternet {

    private String fechaDeInstalacion;
    private String fechaDeBaja;
    private Plan plan;

    public ProductoInternet(String fechaDeInstalacion, String fechaDeBaja, Plan plan) {

        this.fechaDeInstalacion = fechaDeInstalacion;
        this.fechaDeBaja = fechaDeBaja;
        this.plan = plan;

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

}
