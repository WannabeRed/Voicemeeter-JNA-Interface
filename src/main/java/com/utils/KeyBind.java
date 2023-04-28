package com.utils;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

import java.util.Arrays;

public class KeyBind {
    Key[] keys;

    public KeyBind(Key[] keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyBind keyBind = (KeyBind) o;
        return Arrays.equals(keys, keyBind.keys);
    }

    public boolean equals(NativeKeyEvent e) {
        return (e.getKeyCode() == keys[0].keyCode && e.getKeyLocation() == keys[0].keyLocation);
    }
}
