import org.junit.jupiter.api.Assertions;
public class Test {

    private SwimmingPool swimmingPool_1 = new SwimmingPool(26, new double[]{21, 22, 23, 24, 26, 26, 26});
    private SwimmingPool swimmingPool_2 = new SwimmingPool(0, new double[]{1, 2, 3, 4, 5, 7, 9});
    private SwimmingPool swimmingPool_3 = new SwimmingPool(24, new double[]{20, 20, 20, 20, 20, 20, 21});
    private SwimmingPool swimmingPool_4 = new SwimmingPool(26, new double[]{20, 20, 20, 20, 20, 20, 19});

    @org.junit.jupiter.api.Test
    public void trigger_On() {
        Assertions.assertEquals("ON", swimmingPool_1.trigger());
    }

    @org.junit.jupiter.api.Test
    public void trigger_Off_1() {
        Assertions.assertEquals("OFF", swimmingPool_2.trigger());
    }

    @org.junit.jupiter.api.Test
    public void trigger_Off_2() {
        Assertions.assertEquals("OFF", swimmingPool_3.trigger());
    }

    @org.junit.jupiter.api.Test
    public void trigger_Off_3() {
        Assertions.assertEquals("OFF", swimmingPool_4.trigger());
    }

}