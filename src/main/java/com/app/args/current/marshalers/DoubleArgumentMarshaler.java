package com.app.args.current.marshalers;

import com.app.args.current.exceptions.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleArgumentMarshaler implements ArgumentMarshaler{
    private double doubleValue = 0;
    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            doubleValue = Double.parseDouble(parameter);
        }
        catch (NoSuchElementException | NumberFormatException e) {
            throw new ArgsException();
        }
    }

    public Object get() {
        return doubleValue;
    }
}
