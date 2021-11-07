package derivada;
import base.Plan;

public class PlanMovil extends Plan {



    public PlanMovil (String nombreDelPLan,double valorDelPLan){
        this.nombreDelPLan=nombreDelPLan;
        this.valorDelPLan=valorDelPLan;

    }

    @Override
    public String getNombreDelPLan() {
        return nombreDelPLan;
    }

    @Override
    public double getValorDelPLan() {
        return valorDelPLan;
    }


}
