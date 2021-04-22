import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;

public class Test {

    Main main = new Main();

    @org.junit.jupiter.api.Test
    public void test() {
        Assertions.assertEquals("&","&");
    }

    @org.junit.jupiter.api.Test
    public void test_join(){

        ArrayList words_1 = new ArrayList();
        words_1.add("Hello"); words_1.add("world");

        String joined_test = String.join(" ", words_1);

        Assertions.assertEquals("Hello world", joined_test);

    }

    @org.junit.jupiter.api.Test
    public void test_moy1(){
        ArrayList intAL = new ArrayList();
        intAL.add(1); intAL.add(3); intAL.add(5);

        double moyenne = (new  Main()).moy(intAL);

        Assertions.assertEquals(3, moyenne);
    }

    @org.junit.jupiter.api.Test
    public void test_moy2(){
        ArrayList intAL = new ArrayList();
        intAL.add(0); intAL.add(98); intAL.add(0); intAL.add(0);

        double moyenne = (new  Main()).moy(intAL);

        Assertions.assertEquals(24.5, moyenne);
    }

    @org.junit.jupiter.api.Test
    public void test_moy3(){
        ArrayList intAL = new ArrayList();
        intAL.add(-100); intAL.add(100); intAL.add(30);

        double moyenne = (new  Main()).moy(intAL);

        Assertions.assertEquals(10, moyenne);
    }
    @org.junit.jupiter.api.Test
    public void test_moy4(){
        ArrayList intAL = new ArrayList();

        double moyenne = (new  Main()).moy(intAL);

        Assertions.assertEquals(Double.NaN, moyenne);
    }


}
