package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Spy
    Feline felineSpy;

    @Test
    public void getKittensWithTheParameterTest() {
        felineSpy.getKittens(1);
        assertEquals(1, felineSpy.getKittens());
    }

    @Test
    public void getKittensNotParameterTest() {
        Feline feline = new Feline();
        assertEquals(1,  feline.getKittens(1));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void eatMeatTest() throws Exception {
        felineSpy.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), felineSpy.eatMeat());
    }
}
