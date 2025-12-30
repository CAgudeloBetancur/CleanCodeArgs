package com.app.args.current.marshalers;

import com.app.args.current.exceptions.ArgsException;

import java.util.Iterator;

public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
