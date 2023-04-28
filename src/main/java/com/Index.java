package com;

import com.VirtualMeeter.VirtualMeeter;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

public class Index {
    public static void main(String[] args) {
        Voicemeeter.init(true);
        Voicemeeter.login();
        VirtualMeeter.init();

        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new ProgramController());
    }
}
