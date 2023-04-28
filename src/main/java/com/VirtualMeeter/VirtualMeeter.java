package com.VirtualMeeter;

public class VirtualMeeter {
    private static final Strip[] strips = new Strip[8]; //TODO this should change depending on version

    public static void init() {
        for (int i = 0; i < strips.length; i++) {
            strips[i] = new Strip(i);
        }
    }

    public static Strip[] getStrips() {
        return strips;
    }

    public static Strip strip(int i) {
        return strips[i];
    }
}
