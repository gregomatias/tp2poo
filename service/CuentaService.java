package service;

import java.util.ArrayList;
import java.util.List;
import dominio.Cuenta;

public class CuentaService {
    private List<Cuenta> cuentas = new ArrayList<Cuenta>();

    public void crearCuenta(int dniPropietario){
      int idAutoGenerado = cuentas.size()+1;
        cuentas.add(new Cuenta(idAutoGenerado, dniPropietario));

    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    
}