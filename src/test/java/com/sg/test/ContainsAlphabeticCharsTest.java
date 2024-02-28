package com.sg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sg.ContainsAlphabeticChars;

public class ContainsAlphabeticCharsTest {

    @Test
    public void test() {
        assertTrue(new ContainsAlphabeticChars().isSatisfiedOn("bbcdhgfjhgjkhj"));

    }

    @Test
    public void testFalseCase() {

        assertFalse(new ContainsAlphabeticChars().isSatisfiedOn("!"));
    }

}
