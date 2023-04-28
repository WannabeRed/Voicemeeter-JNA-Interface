package com.Commands;

import com.utils.KeyBind;

public interface Command {
    KeyBind keyBind = null;

    static void execute() {

    }

    static KeyBind getKeyBind() {return keyBind;}
}
