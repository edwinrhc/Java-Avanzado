package com.edwinrhc.object;

public class MathUtils {
    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

}
