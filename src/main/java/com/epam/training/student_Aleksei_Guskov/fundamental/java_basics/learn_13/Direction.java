package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_13;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);
    private int degrees;
    Direction(final int degrees) {
        this.degrees = degrees;
    }
    public static Direction ofDegrees(int degrees) {
        Direction[] directionSide = Direction.values();
        for (int i = 0; i < directionSide.length; i++) {
            if (directionSide[i] == null) {
                return null;
            }
            if (degrees >= 360) {
                degrees -=360;
            }
            if (degrees < 0) {
                degrees +=360;
            }
            if (directionSide[i].degrees == degrees) return directionSide[i];
        }
       return null;
    }

    public static Direction closestToDegrees(int degrees) {
        Direction[] directionSide = Direction.values();
        for (Direction direction : directionSide) {
            if (degrees >= 720) {
                degrees -= 720;
            }
            if (degrees >= 360) {
                degrees -= 360;
            }
            if (degrees < 0) {
                degrees += 360;
            }
            if (Math.abs(direction.degrees - degrees) < 22) {
                return direction;
            }
        }
        return null;
    }

    public Direction opposite() {
        Direction[] directionSide = Direction.values();
        int helperDegrees = degrees - 180;
        if (helperDegrees < 0) {
            helperDegrees +=360;
        }
        for (Direction direction : directionSide) {
            if (direction.degrees == helperDegrees) {
                return direction;
            }
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        int differenceOfDegrees = Math.abs(this.degrees - direction.degrees);
        if (differenceOfDegrees > 180) {
            differenceOfDegrees = 360 - differenceOfDegrees;
        }
        return differenceOfDegrees;
    }
}
