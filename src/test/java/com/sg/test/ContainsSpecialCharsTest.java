package com.sg.test;

import static org.junit.Assert.*;

import com.sg.ContainsSpecialChars;
import org.junit.Test;

public class ContainsSpecialCharsTest {

    @Test
    public void test() {
        assertTrue(new ContainsSpecialChars().isSatisfiedOn("!"));
        assertFalse(new ContainsSpecialChars().isSatisfiedOn("A"));
        assertFalse(new ContainsSpecialChars().isSatisfiedOn("1"));
    }

}
