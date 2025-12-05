package dev.asejas.bigosamples;


import dev.asejas.bigosamples.constant.ConstantAlg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstantAlgTest {
    @Test
    public void testValidResult(){
        ConstantAlg alg = new ConstantAlg();
        int sum = alg.sum(5, 4);
        assertEquals(9, sum);
    }
}
