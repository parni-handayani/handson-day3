// objek 1

public class Kompor implements Gas, Power{
    private String power;
    private Integer tabungGas;

    @Override
    public void setPower(String power){
        this.power = power;
    }

    @Override
    public void setTabungGas(Integer tabungGas){
        this.tabungGas = tabungGas;
    }

    public String getPower(){
        return power;
    }

    public Integer getTabungGas(){
        return tabungGas;
    }
}
