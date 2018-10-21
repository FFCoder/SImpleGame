package com.jonathonchambers.Models;

import com.jonathonchambers.Interfaces.Hurtable;

public class PlayerEntity extends PersonEntity implements Hurtable {

    public PlayerEntity(String name) {
        super(name);
        this.addAttribute(new Attribute("HP",100));
        this.addAttribute(new Attribute("ALIVE", 1));
    }

    public int getHP(){
        return this.getAttribute("HP").value;
    }

    public boolean isAlive(){
        if (this.getAttribute("ALIVE").value == 1){
            return true;
        }
        else return false;
    }

    @Override
    public void take_damage(int amt) {

        this.setAttribute("HP",getHP() - amt);
        if (getHP() <= 0){
            this.setAttribute("ALIVE",0);
        }
    }
}
