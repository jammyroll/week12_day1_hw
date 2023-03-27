import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {
    @Test
    public void notEnough(){
        Printer printer= new Printer();
        assertEquals("Add more pages",printer.print(8,10));
    }
    @Test
    public void printsNice(){
        Printer printer= new Printer();
        assertEquals("there are 2 pages left",printer.print(10,8));
    }

}
