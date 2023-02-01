package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel;

import com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel.CompleteByRequestTask;
import com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel.CountDownTask;
import com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel.Task;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CodeComplianceTest {
    @Test
    void testTaskIsInterface() {
        assertTrue(Task.class.isInterface());
    }

    @Test
    void testImplementsTask() {
        assertTrue(Arrays.asList(CountDownTask.class.getInterfaces()).contains(Task.class));
        assertTrue(Arrays.asList(CompleteByRequestTask.class.getInterfaces()).contains(Task.class));
    }
}
