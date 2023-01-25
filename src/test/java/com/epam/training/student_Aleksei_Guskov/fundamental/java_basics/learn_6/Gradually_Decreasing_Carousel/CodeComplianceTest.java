package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Gradually_Decreasing_Carousel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeComplianceTest {

    @Test
    void testInheritance() {
        assertEquals(DecrementingCarousel.class, GraduallyDecreasingCarousel.class.getSuperclass());
    }
}
