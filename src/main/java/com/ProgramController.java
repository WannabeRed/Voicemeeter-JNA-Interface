package com;

import com.Commands.ToggleInGameMic;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class ProgramController implements NativeKeyListener {

    public void nativeKeyPressed(NativeKeyEvent e) {
        // TODO command handler (copy from disc bot)
        if (ToggleInGameMic.getKeyBind().equals(e)){
            System.out.println("executing");
            ToggleInGameMic.execute();
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        //System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }
}
