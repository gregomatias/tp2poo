package dominio;


public  class Plan {

    private String nombreDelPlan;
    private int idDelPlan;
    private double valorDelPLan;
    private int familiaDeProducto;

    public Plan(int idDelPlan,String nombreDelPlan,double valorDelPLan,int familiaDeProducto){
        this.idDelPlan=idDelPlan;
        this.nombreDelPlan=nombreDelPlan;
        this.valorDelPLan=valorDelPLan;
        this.familiaDeProducto=familiaDeProducto;
    }

    public int getFamiliaDeProducto() {
        return familiaDeProducto;
    }
    public String getNombreDelPlan() {
        return nombreDelPlan;
    }
    public double getValorDelPLan() {
        return valorDelPLan;
    }
    public int getIdDelPlan() {
        return idDelPlan;
    }
}
