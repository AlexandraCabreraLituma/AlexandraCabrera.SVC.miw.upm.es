package p3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C32Test {

    private C32 c32;

    @BeforeEach
    void before() {
        c32 = new C32();
    }

    @Test
    void testm1() {
        assertEquals("mA", c32.mA());
    }


}
