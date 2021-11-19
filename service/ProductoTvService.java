package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Plan;
import dominio.ProductoTv;

public class ProductoTvService {
    private List<ProductoTv> productosTv = new ArrayList<ProductoTv>();

    public void creaProductoTv(String fechaDeInstalacion, String fechaDeBaja, int idCuentaPropietaria,
            Plan plan) {
                int idAutoGenerado = productosTv.size() + 1;
                productosTv.add(new ProductoTv(fechaDeInstalacion, fechaDeBaja, idAutoGenerado, idCuentaPropietaria, plan));

    }

    public List<ProductoTv> getProductosTv() {
        return productosTv;
    }

}
