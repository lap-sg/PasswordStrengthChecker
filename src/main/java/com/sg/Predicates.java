package com.sg;

import java.util.function.IntPredicate;

public class Predicates {
    public static IntPredicate isUpperCase() { return new IsUpperCase(); }
    public static IntPredicate isLowerCase() { return new IsLowerCase(); }
}
