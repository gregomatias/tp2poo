package dominio;


public class ProductoMovil {
    private int idLinea;
    private int idProducto;
    private String fechaActivacion;
    private int idCuentaPropietaria;
    private Plan plan;

    public ProductoMovil(int idLinea,int idProducto,String fechaActivacion,int idCuentaPropietaria,Plan plan){
        this.idLinea=idLinea;
        this.idProducto=idProducto;
        this.fechaActivacion=fechaActivacion;
        this.idCuentaPropietaria=idCuentaPropietaria;
        this.plan=plan;

    }
    public int getIdLinea() {
        return idLinea;
    }

}

