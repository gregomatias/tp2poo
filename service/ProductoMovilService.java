package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Plan;
import dominio.ProductoMovil;

public class ProductoMovilService {

    private List<ProductoMovil> productosMovil = new ArrayList<ProductoMovil>();

    public void creaProductoMovil(int idLinea, String fechaDeActivacion, int idCuentaPropietaria, Plan plan) {
        int idAutoGenerado = productosMovil.size() + 1;
        productosMovil.add(new ProductoMovil(idLinea, idAutoGenerado, fechaDeActivacion, idCuentaPropietaria, plan));

    }

    public int creaIdLinea() {
        int max = 1123226456;
        for (ProductoMovil productoMovil : productosMovil) {
            if (productoMovil.getIdLinea() > max) {
                max = productoMovil.getIdLinea();
            }
        }
        max = max + 1;
        return max;

    }

}
