package com.sg;

import static com.sg.Predicates.isLowerCase;
import static com.sg.Predicates.isUpperCase;

public final class ContainsAlphabeticChars implements Rule {
    @Override
    public boolean isSatisfiedOn(String string) {
        return string.chars().anyMatch(isUpperCase().or(isLowerCase()));
    }
}