package byorn.learning.behaviourparam;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBehaviourParam {


    /**
     * Behaviour Parameterised examples
     *
     * 1) Sorting with a Comparator
     * 2) Executing a block of code with Runnable
     *
     *          public interface Runnable{
                     public void run();
                }

                Thread t = new Thread(() -> System.out.println("Hello world"));

     *
     *
     * 3) GUI event handling
     *          button.setOnAction((ActionEvent event) -> label.setText("Sent!!"));
     });
     */

    @Test
    public void testComparator() {

        List<Apple> inventory = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setWeight(3);

        Apple apple2 = new Apple();
        apple2.setWeight(2);

        Apple apple3 = new Apple();
        apple3.setWeight(5);

        inventory.add(apple1);inventory.add(apple2); inventory.add(apple3);


        inventory.sort((Apple a1, Apple a2) ->  a1.getWeight().compareTo(a2.getWeight()));

        Assert.assertEquals(new Integer(2),inventory.get(0).getWeight());
        Assert.assertEquals(new Integer(5),inventory.get(2).getWeight());

        assert true;
    }


    @Test
    public void testFilterUtil() {
        List<Apple> inventory = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setWeight(3);

        Apple apple2 = new Apple();
        apple2.setWeight(2);

        Apple apple3 = new Apple();
        apple3.setWeight(5);

        inventory.add(apple1);inventory.add(apple2); inventory.add(apple3);


        List<Apple> filteredList = FilterUtil.filter(inventory,(Apple a) -> a.getWeight().equals(3));

        Assert.assertEquals(1,filteredList.size());
    }
}
