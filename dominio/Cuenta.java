package dominio;

import dominio.*;

public class Cuenta{
    
    private int idCuenta;
    private int dniPropietario;

    public Cuenta(int idCuenta, int dniPropietario) {
        this.idCuenta = idCuenta;
        this.dniPropietario = dniPropietario;
        
    }


    public int getIdCuenta() {
        return idCuenta;
    }
    public int getDniPropietario() {
        return dniPropietario;
    }

}
