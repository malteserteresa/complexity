package structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicHashMapTest {

    private static BasicHashMap map = new BasicHashMap(5);


    @Test
    public void getReturnsCorrectValue() {
        addChocolates();

        assertTrue(map.get("Almond Praline").equals("Smooth almond praline in a milk chocolate cup"));
    }
    

    private static void addChocolates() {
        map.put("Almond Praline", "Smooth almond praline in a milk chocolate cup");
        map.put("Toffee Baton", "A smooth toffee flavour truffle with little pieces of toffee");
        map.put("Strawberry Dream", "A classic combination of real strawberries and double cream");
    }
}
