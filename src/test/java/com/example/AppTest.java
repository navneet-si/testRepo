package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals("Adding 2 + 3 should equal 5", 5, app.add(2, 3));
    }
}
