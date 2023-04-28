package com.VirtualMeeter;

import com.Voicemeeter;

public class Strip {
    private int index;
    public float A1;
    public float A2;
    public float A3;
    public float A4;
    public float A5;
    public float B1;
    public float B2;
    public float B3;

    public Strip(int i) {
        index = i;
        A1 = 0;
        A2 = 0;
        A3 = 0;
        A4 = 0;
        A5 = 0;
        B1 = 0;
        B2 = 0;
        B3 = 0;
    }

    public void setFloat(String param, float value) {
        System.out.println("Executing | Strip[" + index + "]." + param + "=" + value);
        Voicemeeter.setParameters("Strip[" + index + "]." + param + "=" + value);

        boolean bool = value > 0;
        switch (param) {
            case "A1": A1 = value;
            case "A2": A2 = value;
            case "A3": A3 = value;
            case "A4": A4 = value;
            case "A5": A5 = value;
            case "B1": B1 = value;
            case "B2": B2 = value;
            case "B3": B3 = value;
        }
    }
}
