package it.sevenbits;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void doSwap() {
        List<String> list = new ArrayList<>(Arrays.asList("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"));
        Swap swap = new Swap();
        System.out.println(swap.doSwap(list));

//        List<String> result = new ArrayList<>(Arrays.asList("ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"));
//        assertEquals(result, swap.doSwap(list));
    }
}