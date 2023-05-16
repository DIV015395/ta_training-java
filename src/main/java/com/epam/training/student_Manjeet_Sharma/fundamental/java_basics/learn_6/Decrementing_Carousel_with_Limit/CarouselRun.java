package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_6.Decrementing_Carousel_with_Limit;

public class CarouselRun {
    final int[] array = DecrementingCarousel.carousel.clone();
    int position;
    int decrement;
    int decrementStep;

    {
        position = 0;
        decrement = 1;
        decrementStep = 0;
    }

    public int next() {
        int before;
        if (isFinished()){
            return -1;
        } else {
            before = array[position];
            array[position] -= decrement;
            decrementStep ++;
            do {
                position ++;
                if (position == array.length) {
                    position = 0;
                    //decrementStep++;
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

