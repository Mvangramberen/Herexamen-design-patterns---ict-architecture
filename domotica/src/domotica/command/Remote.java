package domotica.command;

/**
 * Created by Micky on 30/08/2017.
 */
public class Remote {
    Command command;

    public void Remote(){}

    public void setCommand (Command command){
        this.command = command;
    }

    public void buttonPressed(){
        command.Execute();
    }
}
