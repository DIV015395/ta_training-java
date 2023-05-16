package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_9.Validations_ColorCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) return false;
        if (color.length() == 4) {
            Pattern colorPat = Pattern.compile("[#]{1}[0-9a-fA-F]{3}");
            Matcher colorMat = colorPat.matcher(color);
            return colorMat.matches();
        }
        if (color.length() == 7) {
            Pattern colorPat = Pattern.compile("[#]{1}[0-9a-fA-F]{6}");
            Matcher colorMat = colorPat.matcher(color);
            return colorMat.matches();
        }
        return false;
    }

}