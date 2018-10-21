package com.jonathonchambers.Views;

import com.googlecode.lanterna.gui2.TextGUI;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import com.jonathonchambers.Controllers.Game;
import com.jonathonchambers.Models.Choice;

public class SceneView{
    public static void showScene(Game game, WindowBasedTextGUI gui){
        ActionListDialogBuilder builder = new ActionListDialogBuilder()
                .setTitle("Scene")
                .setDescription(game.getCurrentScene().prompt);
        for (Choice c : game.getCurrentScene().choices){
            builder.addAction(c.prompt, new Runnable() {
                @Override
                public void run() {
                    game.setCurrentScene(c.scene);
                }
            });
        }
        builder.build().showDialog(gui);



    }
}
