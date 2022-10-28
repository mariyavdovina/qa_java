package example;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal animal;

    @Before
    public void init() {
        animal = new Animal();
    }

    @Test
    public void testConditionalGetFoodPredator() throws Exception {
        Assert.assertEquals(animal.getFood("Хищник"), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void testConditionalGetFoodHerbivore() throws Exception {
        Assert.assertEquals(animal.getFood("Травоядное"), List.of("Трава", "Различные растения"));
    }

    @Test
    public void testConditionalGetFoodOther() throws Exception {
        String msg = "";
        try {
            animal.getFood("dfvfdv");
        } catch (Exception e) {
            msg = e.getMessage();
        }
        Assert.assertEquals(msg, "Неизвестный вид животного, используйте значение Травоядное или Хищник");
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals(animal.getFamily(), "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }
}