package dominio;

import inter.Producto;

public class ProductoTv implements Producto {
    private String fechaDeInstalacion;
    private String fechaDebaja;
    private int idProducto;
    private int idCuentaPropietaria;
    private Plan plan;

    public ProductoTv(String fechaDeInstalacion,String fechaDeBaja,int idProducto, int idCuentaPropietaria,Plan plan){
        this.fechaDeInstalacion=fechaDeInstalacion;
        this.fechaDebaja=fechaDeBaja;
        this.idCuentaPropietaria=idCuentaPropietaria;
        this.idProducto=idProducto;
        this.plan=plan;


    }
    public String getFechaDeInstalacion() {
        return fechaDeInstalacion;
    }
    public String getFechaDebaja() {
        return fechaDebaja;
    }
    public int getIdCuentaPropietaria() {
        return idCuentaPropietaria;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public Plan getPlan() {
        return plan;
    }

    

    
}
