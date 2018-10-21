package com.jonathonchambers;

import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
import com.googlecode.lanterna.gui2.dialogs.TextInputDialog;
import com.googlecode.lanterna.gui2.dialogs.TextInputDialogBuilder;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.jonathonchambers.Controllers.Game;
import com.jonathonchambers.Models.PlayerEntity;
import com.jonathonchambers.Views.NameView;
import com.jonathonchambers.Views.SceneView;
import com.jonathonchambers.Views.uSceneView;

import java.io.IOException;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen);
        BasicWindow window = new BasicWindow();
        final Game game = Game.getInstance().start();
        String name = "Jonathon";
        //String name = NameView.getName(gui);
        // Exit Game if User Hits Cancel Button
        if (name == null){
            System.exit(33);
        }
        if (name.isEmpty()){
            name = "***";
        }
        PlayerEntity player = new PlayerEntity(name);

        while (player.isAlive()){
            //SceneView.showScene(game,gui);
            uSceneView.show(game,gui);
        }



        gui.addWindowAndWait(window);

    }
}
