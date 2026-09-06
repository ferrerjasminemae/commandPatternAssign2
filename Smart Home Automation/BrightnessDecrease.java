public class BrightnessDecrease implements Command{

    private Lights lights;

    public BrightnessDecrease (Lights lights){
        this.lights=lights;
    }
    @Override
    public String execute(){
         return lights.brightDecrease();
    }
}