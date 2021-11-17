package service;

import java.util.ArrayList;



import dominio.Cuenta;

public class CuentaService {

    private ArrayList<Cuenta> cuentas  = new ArrayList<Cuenta>();

   public  void creaCuenta(String domicilio,int dniPropietario ){
    int idCuentaNueva = cuentas.size()+1;
        cuentas.add(new Cuenta(idCuentaNueva, domicilio,dniPropietario));
    }


    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

  public void  obtieneProductos(){
      
  }

    
    

    
}