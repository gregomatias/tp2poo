package service;
import java.util.ArrayList;
import java.util.List;

import dominio.Plan;
import dominio.ProductoInternet;
import dominio.ProductoMovil;
import dominio.ProductoTv;
import inter.*;

public class ProductoService {


    
       private List<Producto> productos = new ArrayList<Producto>();
    
        public void creaProductointernet(String fechaDeInstalacion,String fechaDeBaja,int idCuentaPropietaria,Plan plan){
            int idProducto = productos.size()+1;
            productos.add(new ProductoInternet(fechaDeInstalacion, fechaDeBaja, idProducto, idCuentaPropietaria,plan) );
            
        }

        public void creaProductoMovil(int idLinea,String fechaActivacion,int idCuentaPropietaria,Plan plan){
            int idProducto = productos.size()+1;
            productos.add(new ProductoMovil(idLinea, idProducto, fechaActivacion, idCuentaPropietaria,plan) );
            
        }
        public void creaProductoTv(String fechaDeInstalacion,String fechaDeBaja,int idCuentaPropietaria,Plan plan){
            int idAutoGenerado = productos.size()+1;
            productos.add(new ProductoTv(fechaDeInstalacion, fechaDeBaja, idAutoGenerado, idCuentaPropietaria,plan) );
            
        }
        public List<Producto> getProductos() {
            return productos;
        }
        
    


    
}
