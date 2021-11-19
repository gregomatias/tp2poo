package dominio;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private String domicilio;
    private List<ProductoInternet> productosInternet = new ArrayList<ProductoInternet>();
    private List<ProductoMovil> productosMovil = new ArrayList<ProductoMovil>();
    private List<ProductoTv> productosTv = new ArrayList<ProductoTv>();
    

    public Cuenta(String domicilio) {

        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public List<ProductoInternet> getProductosInternet() {
        return productosInternet;
    }
    public List<ProductoMovil> getProductosMovil() {
        return productosMovil;
    }
    public List<ProductoTv> getProductosTv() {
        return productosTv;
    }
    public void setProductosInternet(ProductoInternet productoInternet) {
        this.productosInternet.add(productoInternet);
    }
    public void setProductosMovil(ProductoMovil productoMovil) {
        this.productosMovil.add(productoMovil);
    }
    public void setProductosTv(ProductoTv productoTv) {
        this.productosTv.add(productoTv);
    }

}
