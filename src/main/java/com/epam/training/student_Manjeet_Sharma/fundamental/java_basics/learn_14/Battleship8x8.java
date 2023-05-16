package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_14;

import java.util.Arrays;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }
    public boolean shoot(String shot) {
        StringBuilder mapShip = new StringBuilder("000000000000000000000000000000000000000");
        mapShip.insert(64 - Long.toBinaryString(ships).length(), Long.toBinaryString(ships));
        mapShip.setLength(64);
        char[] mapShot = new char[64];
        Arrays.fill(mapShot,'0');
        int first = shot.charAt(0)-65;
        int second = shot.charAt(1)-49;
        int index = first + second*8;
        mapShot[index] = '1';
        String stringShot = String.valueOf(mapShot);
        shots += Long.parseUnsignedLong(stringShot, 2);
        return mapShip.charAt(index) == '1';
    }

    public String state() {
        StringBuilder mapShip = new StringBuilder("000000000000000000000000000000000000000");
        mapShip.insert(64-Long.toBinaryString(ships).length(), Long.toBinaryString(ships));
        StringBuilder mapShot = new StringBuilder("000000000000000000000000000000000000000");
        mapShot.insert(64-Long.toBinaryString(shots).length(), Long.toBinaryString(shots));
        mapShip.setLength(64);
        mapShot.setLength(64);
        String mapShips = mapShip.toString();
        String mapShots = mapShot.toString();
        char[] newMap = mapShips.toCharArray();
        char[] newMapShot = mapShots.toCharArray();
        for (int i=0; i<newMapShot.length; i++) {
            if (newMap[i] == '1' && newMapShot[i] == '1') {
                newMap[i] = '☒';
            }
            if (newMap[i] == '1' && newMapShot[i] == '0') {
                newMap[i] = '☐';
            }
            if (newMap[i] == '0' && newMapShot[i] == '1') {
                newMap[i] = '×';
            }
            if (newMap[i] == '0' && newMapShot[i] == '0') {
                newMap[i] = '.';
            }
        }
        String mapString = new String(newMap);

        return (mapString.substring(0, 8) + "\n"
                + mapString.substring(8, 16) + "\n"
                + mapString.substring(16, 24) + "\n"
                + mapString.substring(24, 32) + "\n"
                + mapString.substring(32, 40) + "\n"
                + mapString.substring(40, 48) + "\n"
                + mapString.substring(48, 56) + "\n"
                + mapString.substring(56, 64));
    }
}
