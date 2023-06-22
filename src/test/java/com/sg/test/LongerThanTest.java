package com.sg.test;

import static org.junit.Assert.*;

import com.sg.LongerThan;
import org.junit.Test;



public class LongerThanTest {

    @Test
    public void test() {
        assertTrue(new LongerThan(1).isSatisfiedOn("14"));
        assertFalse(new LongerThan(1).isSatisfiedOn("1"));
    }

}
