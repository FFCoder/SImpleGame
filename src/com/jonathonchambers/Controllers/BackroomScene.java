package com.jonathonchambers.Controllers;

import com.jonathonchambers.Interfaces.NPC;
import com.jonathonchambers.Interfaces.withNPC;
import com.jonathonchambers.Models.Choice;
import com.jonathonchambers.Models.Scene;

import java.util.ArrayList;



public class BackroomScene extends Scene implements withNPC {
    public BackroomScene() {
        super();
        this.prompt = "You are in the backroom of this Store. Around you, there are steel bins full of merchandise.";
        this.addChoice(new Choice("Find somebody to help you out.", null));
    }

    @Override
    public ArrayList<NPC> getNPCs() {
        return null;
    }
}
