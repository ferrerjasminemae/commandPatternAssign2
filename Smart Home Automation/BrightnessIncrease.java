public class BrightnessIncrease implements Command{

    private Lights lights;

    public BrightnessIncrease(Lights lights){
        this.lights = lights;
    }
    @Override
    public String execute(){
        return lights.brightIncrease();
    }
}