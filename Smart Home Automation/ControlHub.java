public class ControlHub{
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }
    public String clickButton(){
        return command.execute();
    }
}