package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_6.Gradually_Decreasing_Carousel;

public class CarouselRun {
    final int[] array = DecrementingCarousel.carousel.clone();
    int position;
    int decrement;

    {
        position = 0;
        decrement = 1;
    }

    public int next() {
        int before;
        if (isFinished()) {
            return -1;
        } else {
            before = array[position];
            array[position] -= decrement;
            do {
                position ++;
                if (position == array.length) {
                    position = 0;
                }
            } while ((array[position] <=0) && !isFinished());
        }
        return before;
    }


    public boolean isFinished() {
        for (int el : array) {
            if (el>0){
                return false;
            }
        }
        return true;
    }
}

