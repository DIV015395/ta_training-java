package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_13;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);
    private int degrees;
    Direction(final int degrees) {
        this.degrees = degrees;
    }
    public static Direction ofDegrees(int degrees) {
        Direction[] derection = Direction.values();
        for (int i = 0; i < derection.length; i++) {
            if (derection[i] == null) return null;
            if (degrees >= 360) degrees -=360;
            if (degrees < 0) degrees +=360;
            if (derection[i].degrees == degrees) return derection[i];
        }
       return null;
    }

    public static Direction closestToDegrees(int degrees) {
        Direction[] derection = Direction.values();
        for (int i = 0; i < derection.length; i++) {
            if (degrees >= 720) degrees -= 720;
            if (degrees >= 360) degrees -=360;
            if (degrees < 0) degrees +=360;
            if (Math.abs(derection[i].degrees - degrees) < 22) return derection[i];
        }
        return null;
    }

    public Direction opposite() {
        Direction[] derection = Direction.values();
        int helper = degrees - 180;
        if (helper<0) helper +=360;
        for (int i = 0; i < derection.length; i++) {
            if (derection[i].degrees == helper) return derection[i];
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        int x = Math.abs(this.degrees - direction.degrees);
        if (x > 180) x = 360-x;
        return x;
    }
}
