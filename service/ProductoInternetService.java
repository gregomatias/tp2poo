package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Plan;
import dominio.ProductoInternet;

public class ProductoInternetService {

   private List<ProductoInternet> productosDeInternet = new ArrayList<ProductoInternet>();

    public void creaProductointernet(String fechaDeInstalacion,String fechaDeBaja,int idCuentaPropietaria,Plan plan){
        int idAutoGenerado = productosDeInternet.size()+1;
        productosDeInternet.add(new ProductoInternet(fechaDeInstalacion, fechaDeBaja, idAutoGenerado, idCuentaPropietaria,plan) );
        
    }
    public List<ProductoInternet> getProductosDeInternet() {
        return productosDeInternet;
    }
    
}
