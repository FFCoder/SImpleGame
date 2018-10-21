package com.jonathonchambers.Views;

import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.gui2.dialogs.TextInputDialogBuilder;

public class NameView {
    public static String getName(WindowBasedTextGUI gui){
        return new TextInputDialogBuilder()
                .setTitle("Name")
                .setDescription("Please Enter Your Name")
                .build()
                .showDialog(gui);
    }
}
