package p2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C22Test {

    private C22 c22;

    @BeforeEach
    void before() {
        c22 = new C22();
    }

    @Test
    void testm1() {
        assertEquals("mA", c22.mA());
    }


}
