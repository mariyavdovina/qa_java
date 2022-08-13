package example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Feline felineTest;
    @Mock
    Lion lion;
    @Before
    public void init(){
        felineTest = new Feline();
    }
    @Test
    public void testGetKittens(){
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }
    @Test
    public void testGetFoodCall() throws Exception {
        lion.getFood();
        Mockito.verify(lion).getFood();
    }
    @Test
    public void testGetFoodFelineInvoked() throws Exception {
        Mockito.when(lion.getFeline()).thenReturn(felineTest);
        Feline tmp = lion.getFeline();
        Assert.assertEquals(tmp.getFood("Хищник"),List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void testDoesHaveMainCalledCorrectly(){
        Mockito.when(lion.isHasMane()).thenReturn(false);
        Boolean tmp = lion.doesHaveMane();
        Assert.assertEquals(tmp,lion.doesHaveMane());
    }


}