package domotica.command;

import domotica.model.*;

/**
 * Created by Micky on 30/08/2017.
 */
public class DoorsClosedCommand implements Command {
    Bathroom bathroom;
    Kitchen kitchen;
    Living living;
    Bedroom bedroom;

    public DoorsClosedCommand(Bathroom bathroom, Bedroom bedroom, Kitchen kitchen, Living living){
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.living = living;
    }

    @Override
    public void Execute() {
        bathroom.closeRoom();
        bedroom.closeRoom();
        kitchen.closeRoom();
        living.closeRoom();
    }
}
