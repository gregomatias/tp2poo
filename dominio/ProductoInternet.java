package dominio;

import inter.Producto;

public class ProductoInternet implements Producto {

    private String fechaDeInstalacion;
    private String fechaDeBaja;
    private int idProducto;
    private int idCuentaPropietaria;
    private Plan plan;

    public ProductoInternet(String fechaDeInstalacion, String fechaDeBaja, int idProducto,int idCuentaPropietaria, Plan plan) {

        this.fechaDeInstalacion = fechaDeInstalacion;
        this.fechaDeBaja = fechaDeBaja;
        this.idProducto = idProducto;
        this.idCuentaPropietaria=idCuentaPropietaria;
        this.plan = plan;

    }
    public Plan getPlan() {
        return plan;
    }
    public int getIdCuentaPropietaria() {
        return idCuentaPropietaria;
    }
    public String getFechaDeInstalacion() {
        return fechaDeInstalacion;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public String getFechaDeBaja() {
        return fechaDeBaja;
    }

}
