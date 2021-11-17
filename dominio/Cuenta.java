package dominio;

public class Cuenta {

    private int idCuenta;
    private String domicilio;
    private int dniPropietario;

    public Cuenta(int idCuenta, String domicilio,int dniPropietario) {
        this.idCuenta = idCuenta;
        this.domicilio = domicilio;
        this.dniPropietario=dniPropietario;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getDniPropietario() {
        return dniPropietario;
    }

}
