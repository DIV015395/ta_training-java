package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Decrementing_Carousel_with_Limit;

import com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Gradually_Decreasing_Carousel.GraduallyDecreasingCarousel;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
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
    public class CarouselRun extends com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Decrementing_Carousel_with_Limit.CarouselRun {
        @Override
        public int next() {
            return super.next();
        }

        public boolean isFinished() {
            //throw new UnsupportedOperationException();
            if (decrementStep == actionLimit) {
                return true;
            } else {
                for (int el : array) {
                    if (el > 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

}
