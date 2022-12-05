package com.sg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sg.ContainsAlphabeticChars;

public class ContainsAlphabeticCharsTest {

    @Test
    public void test() {
        assertTrue(new ContainsAlphabeticChars().isSatisfiedOn("a"));
        assertTrue(new ContainsAlphabeticChars().isSatisfiedOn("A"));
        assertFalse(new ContainsAlphabeticChars().isSatisfiedOn("0"));
        assertFalse(new ContainsAlphabeticChars().isSatisfiedOn("!"));
    }

}
