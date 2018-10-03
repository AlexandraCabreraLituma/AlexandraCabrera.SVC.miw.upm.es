package p3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C31Test {

    private C31 c31;

    @BeforeEach
    void before() {
        c31 = new C31();
    }

    @Test
    void testm1() {
        assertEquals("m1", c31.m1());
    }
    @Test
    void testm2() {
        assertEquals("m2", c31.m2());
    }
    @Test
    void testmB() {
        assertEquals("mB", c31.mB());
    }

}