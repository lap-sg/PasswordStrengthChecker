package com.sg;
import java.util.function.IntPredicate;

public final class ContainsDigits implements Rule {
    @Override
    public boolean isSatisfiedOn(String string) {
        return string.chars().anyMatch(new IsDigit());
    }

    private final class IsDigit implements IntPredicate {
        @Override
        public boolean test(int asciiValue) {
            return asciiValue >= 48 && asciiValue <= 57;
        }
    }
}