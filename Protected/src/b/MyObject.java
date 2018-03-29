package b;

import a.Test;

public class MyObject extends Test {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}