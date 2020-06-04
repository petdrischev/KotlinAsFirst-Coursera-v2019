package lesson1.task1

import org.junit.Assert
import org.junit.Test

class SimpleTest {
    @Test
    fun quadraticEquationRoot() {
        Assert.assertEquals(
            2.0,
            quadraticEquationRoot(
                1.0, -3.0, 2.0
            ),
            1e-13
        )
    }
}