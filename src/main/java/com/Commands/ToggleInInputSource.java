package com.Commands;

import com.utils.Key;
import com.utils.KeyBind;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

public class ToggleInInputSource implements Command {
    KeyBind keyBind = new KeyBind(
            new Key[]{
                    new Key(3662, NativeKeyEvent.KEY_LOCATION_NUMPAD)
            }
    );

    public static void execute() {

    }
}
