import java.util.Scanner;
public class ControlViewer{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //controller
        ControlHub hub= new ControlHub();

        Lights lights = new Lights();
        MusicPlayer musicPlayer = new MusicPlayer();
        
        Thermostat thermostat = new Thermostat();

        while(true){
            System.out.println("SMART HOME CONTROL PANEL");
            System.out.println("[1] Turn Lights On");
            System.out.println("[2] Turn Lights Off");
            System.out.println("[3] Increase Lights Brightness");
            System.out.println("[4] Decrease Lights Brightness");
            System.out.println("[5] Play Music");
            System.out.println("[6] Stop Music");
            System.out.println("[7] Increase Volume");
            System.out.println("[8] Decrease Volume");
            System.out.println("[9] Increase Temperature");
            System.out.println("[10] Decrease Temperatue");
            System.out.println("[0] Exit");
            Integer choice = input.nextInt();

            if(choice==0){
                System.out.println("Exiting program...");
                input.close();
                break;
            }

            switch(choice){
            case 1: 
                hub.setCommand(new TurnOn(lights));
                hub.clickButton();
                break;
            case 2: 
                hub.setCommand(new TurnOff(lights));
                hub.clickButton();
                break;
            case 3:
                hub.setCommand(new BrightnessIncrease(lights));
                hub.clickButton();
                break;   
            case 4:
                hub.setCommand(new BrightnessDecrease(lights));
                hub.clickButton();
                break;                    
            case 5:
                hub.setCommand(new PlayMusic(musicPlayer));
                break;                
            case 6:
                hub.setCommand(new StopMusic(musicPlayer));
                hub.clickButton();
                break;
            case 7:
                hub.setCommand(new VolumeIncrease(musicPlayer));
                hub.clickButton();
                break;
            case 8:
                hub.setCommand(new VolumeDecrease(musicPlayer));
                hub.clickButton();
                break;
            case 9:
                hub.setCommand(new IncreaseTemperature(thermostat));
                hub.clickButton();
                break;
            case 10:
                hub.setCommand(new DecreaseTemperature(thermostat));
                hub.clickButton();
                break;
        }
        System.out.println(hub.clickButton());
        System.out.println();
        }
        
    }
}