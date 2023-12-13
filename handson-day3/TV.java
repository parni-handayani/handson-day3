// objek 2 

public class TV implements Power, Channel{
    private String power;
    private Integer number;

    @Override
    public void setPower(String power){
        this.power = power;
    }

    @Override
    public void setChannel(Integer number){
        this.number = number;
    }

    public String getPower(){
        return power;
    }

    public Integer getChannel(){
        return number;
    }
    
}
