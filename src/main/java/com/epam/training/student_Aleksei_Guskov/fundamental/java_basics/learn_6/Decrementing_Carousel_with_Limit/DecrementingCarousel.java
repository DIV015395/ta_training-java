package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Decrementing_Carousel_with_Limit;

public class DecrementingCarousel {
    private final int capacity;
    static int[] carousel;
    int index;
    boolean isRun;

    {
        index = 0;
        isRun = false;
    }

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        //throw new UnsupportedOperationException();
        if (element > 0 && index < capacity && !isRun) {
            carousel[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        //throw new UnsupportedOperationException();
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }

}

