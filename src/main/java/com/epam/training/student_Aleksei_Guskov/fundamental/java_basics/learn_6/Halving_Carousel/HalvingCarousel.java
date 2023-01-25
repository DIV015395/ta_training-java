package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Halving_Carousel;

public class HalvingCarousel extends DecrementingCarousel {
       public HalvingCarousel(final int capacity) {
        super(capacity);

    }
    @Override
    public boolean addElement(int element) {
        return super.addElement(element);
    }

    public CarouselRun run(){
        //throw new UnsupportedOperationException();
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
    public class CarouselRun extends com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_6.Halving_Carousel.CarouselRun {
        @Override
        public int next() {
            int before;
            if (isFinished()){
                return -1;
            } else {
                before = array[position];
                array[position] = before / 2;
                do {
                    position ++;
                    if (position == array.length) {
                        position = 0;
                    }
                } while ((array[position] <=0) && !isFinished());
            }
            return before;
        }

        @Override
        public boolean isFinished() {
            return super.isFinished();
        }
    }

}
