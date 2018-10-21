package com.jonathonchambers.Models;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;

public class Scene {
    public String prompt;
    public ArrayList<Choice> choices;
    public Scene(String p){
        choices = new ArrayList<>();
        prompt = p;
    }

    public Scene() {
        choices = new ArrayList<>();
    }

    public Scene addChoice(Choice c){
        choices.add(c);
        return this;
    }
    public Scene pickChoice(Choice c){
        return c.scene;
    }
}
