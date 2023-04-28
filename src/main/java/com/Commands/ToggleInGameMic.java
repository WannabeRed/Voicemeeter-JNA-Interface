package com.Commands;

import com.CustomVariables;
import com.VirtualMeeter.VirtualMeeter;
import com.utils.Key;
import com.utils.KeyBind;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

public class ToggleInGameMic implements Command {
    static KeyBind keyBind = new KeyBind(
            new Key[]{
                    new Key(3662, NativeKeyEvent.KEY_LOCATION_NUMPAD)
            }
    );

    public static KeyBind getKeyBind() {
        return keyBind;
    }

    public static void execute() {
        // if noise-canceling on
        if (CustomVariables.NoiseCanceling) {
            VirtualMeeter.strip(3).setFloat("B2",
                    (VirtualMeeter.strip(3).B2 + 1) % 2
                    );
        } else {

        }

    }


}
