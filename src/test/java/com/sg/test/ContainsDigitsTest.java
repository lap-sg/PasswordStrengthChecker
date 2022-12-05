package com.sg.test;

import static org.junit.Assert.*;

import com.sg.ContainsDigits;
import org.junit.Test;

public class ContainsDigitsTest {

    @Test
    public void test() {
        assertTrue(new ContainsDigits().isSatisfiedOn("1"));
        assertFalse(new ContainsDigits().isSatisfiedOn("a"));
    }

}
