package dominio;

public class Promocion {
    private int idPromocion;
    private String nombrePromocion;
    private double porcentajeDescuento;
    private int familiaDeProducto;

    public Promocion (int idPromocion,String nombrePromocion,double porcentajeDescuento, int familiaDeProducto){
        this.idPromocion=idPromocion;
        this.nombrePromocion=nombrePromocion;
        this.porcentajeDescuento=porcentajeDescuento;
        this.familiaDeProducto=familiaDeProducto;

    }
    public int getIdPromocion() {
        return idPromocion;
    }
    public String getNombrePromocion() {
        return nombrePromocion;
    }
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public int getFamiliaDeProducto() {
        return familiaDeProducto;
    }
    
}
