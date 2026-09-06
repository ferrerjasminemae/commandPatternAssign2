public class TurnOn implements Command{

    private Lights lights;

    public TurnOn (Lights lights){
        this.lights = lights;

    }
    @Override
    public String execute() {
        return lights.turnOn();
    }
}