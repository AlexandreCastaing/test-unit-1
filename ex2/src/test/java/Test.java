import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Test {

    @org.junit.jupiter.api.Test
    public void test_bissextile_1(){
        Assertions.assertEquals( false, (new Main()).isBissextile(0));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_2(){
        Assertions.assertEquals( false, (new Main()).isBissextile(1));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_3(){
        Assertions.assertEquals( false, (new Main()).isBissextile(100));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_4(){
        Assertions.assertEquals( false, (new Main()).isBissextile(101));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_5(){
        Assertions.assertEquals( true, (new Main()).isBissextile(104));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_6(){
        Assertions.assertEquals( true, (new Main()).isBissextile(2020));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_7(){
        Assertions.assertEquals( false, (new Main()).isBissextile(2021));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_8(){
        Assertions.assertEquals( false, (new Main()).isBissextile(2022));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_9(){
        Assertions.assertEquals( false, (new Main()).isBissextile(105));
    }
    @org.junit.jupiter.api.Test
    public void test_bissextile_10(){
        Assertions.assertEquals( false, (new Main()).isBissextile(103));
    }
}
