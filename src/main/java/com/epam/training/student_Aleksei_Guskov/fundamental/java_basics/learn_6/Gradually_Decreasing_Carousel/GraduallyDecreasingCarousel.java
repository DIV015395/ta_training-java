package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Gradually_Decreasing_Carousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public boolean addElement(int element) {
        return super.addElement(element);
    }
    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
    public class CarouselRun extends com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Gradually_Decreasing_Carousel.CarouselRun {
        @Override
        public int next() {
            int before;
            if (isFinished()){
                return -1;
            } else {
                before = array[position];
                array[position] -= decrement;
                do {
                    position ++;
                    if (position == array.length) {
                        position = 0;
                        decrement++;
                    }
                } while ((array[position] <= 0) && !isFinished());
            }
            return before;
        }
    }
}
