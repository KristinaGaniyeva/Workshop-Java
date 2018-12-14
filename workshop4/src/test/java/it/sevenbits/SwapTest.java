package it.sevenbits;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void testDoSwap() {
        List<String> list = new ArrayList<>(Arrays.asList("ax", "bx", "ay", "by"));
        Swap swap = new Swap();
        List<String> result = new ArrayList<>(Arrays.asList("ay", "by", "ax", "bx"));

        assertEquals(result, swap.doSwap(list));
    }

    @Test
    public void testDoSwapDouble() {
        List<String> list = new ArrayList<>(Arrays.asList("aaa", "bx", "ay", "by", "ai", "aaa", "bx", "by"));
        Swap swap = new Swap();
        List<String> result = new ArrayList<>(Arrays.asList("ay", "by", "aaa", "bx", "ai", "aaa", "bx", "by"));

        assertEquals(result, swap.doSwap(list));
    }
}