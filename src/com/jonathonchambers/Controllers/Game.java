package com.jonathonchambers.Controllers;

import com.jonathonchambers.Models.Choice;
import com.jonathonchambers.Models.PlayerEntity;
import com.jonathonchambers.Models.Scene;

public class Game {
    private PlayerEntity player;
    private static Game ourInstance = new Game();
    private Scene currentScene = null;

    public static Game getInstance() {
        return ourInstance;
    }

    private Game() {

    }
    public void setPlayer(PlayerEntity p){
        this.player = p;
    }
    public Game start(){
        currentScene = new Scene("You have awoken in the backroom of a store. You don't remember anything " +
                "about what happened.");
        BackroomScene bs = new BackroomScene();
        currentScene.addChoice(new Choice("Look Around.",bs));
        currentScene.addChoice(new Choice("Sit and Wait",null));



        return this;

    }

    public Scene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(Scene currentScene) {
        this.currentScene = currentScene;
    }
}
