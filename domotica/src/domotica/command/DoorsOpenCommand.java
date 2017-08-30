package domotica.command;

import domotica.model.*;

/**
 * Created by Micky on 30/08/2017.
 */
public class DoorsOpenCommand implements Command {

    Bathroom bathroom;
    Kitchen kitchen;
    Living living;
    Bedroom bedroom;

    public void DoorsOpenCommand(Bathroom bathroom, Bedroom bedroom, Kitchen kitchen, Living living){
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.living = living;
    }

    @Override
    public void Execute() {
        bathroom.openRoom();
        bedroom.openRoom();
        kitchen.openRoom();
        living.openRoom();
    }
}
