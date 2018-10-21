package com.jonathonchambers.Views;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import com.jonathonchambers.Controllers.Game;
import com.jonathonchambers.Models.Choice;

public class uSceneView {
    public static void show(Game game, WindowBasedTextGUI gui){
        BasicWindow window = new BasicWindow();
        Panel p = new Panel();
        p.setLayoutManager(new LinearLayout(Direction.VERTICAL));
        p.setPreferredSize(gui.getScreen().getTerminalSize());
        String prompt = game.getCurrentScene().prompt;

        for (int i = 0; i< prompt.length(); i+=80){
            p.addComponent(new Label(prompt.substring(i,Math.min(i+80,prompt.length()))));
        }
        for (Choice c: game.getCurrentScene().choices){
            p.addComponent(new Button(c.prompt, new Runnable() {
                @Override
                public void run() {
                    game.setCurrentScene(c.scene);
                    window.close();
                }
            }));
        }
        window.setComponent(p);
        gui.addWindowAndWait(window);
    }
}
