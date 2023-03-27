import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    @Test
    public void startsFull(){
        Water_bottle waterBottle= new Water_bottle();
        assertEquals(100,waterBottle.getWater());
    }
    @Test
    public void canDrink(){
        Water_bottle waterBottle= new Water_bottle();
        assertEquals(90,waterBottle.drink());
    }
    @Test
    public void canEmpty(){
        Water_bottle waterBottle= new Water_bottle();
        assertEquals(0,waterBottle.empty());
    }
    @Test
    public void canRefill(){
        Water_bottle waterBottle= new Water_bottle();
        assertEquals(100,waterBottle.refillWater());
    }

}
