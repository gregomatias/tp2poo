package base;


public abstract class Plan {

    protected String nombreDelPlan;
    protected int idDelPlan;
    protected double valorDelPLan;

    protected Plan(int idDelPlan,String nombreDelPlan,double valorDelPLan){
        this.idDelPlan=idDelPlan;
        this.nombreDelPlan=nombreDelPlan;
        this.valorDelPLan=valorDelPLan;
    }

    public abstract String getNombreDelPLan();
    public abstract double getValorDelPlan();
    public abstract int getIdDelPlan();
    


    
}
