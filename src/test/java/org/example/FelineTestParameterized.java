package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FelineTestParameterized {

    public String animalKind;
    public String exception;

    public List<String> list;

    public FelineTestParameterized(String animalKind, List<String> list, String exception){
        this.animalKind = animalKind;
        this.list = list;
        this.exception = exception;
    }

    @Parameterized.Parameters
    public static Object[][] getCities() {
        return new Object[][]{
                {("Травоядное"), (List.of("Трава", "Различные растения")), ("Бактерия")},
                {("Хищник"), (List.of("Животные", "Птицы", "Рыба")), ("Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(list, feline.getFood(animalKind));
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        boolean thrown = false;

        try {
            feline.getFood(exception);
        } catch (Exception e) {
            thrown = true;
        }

        assertTrue(thrown);
    }
}
