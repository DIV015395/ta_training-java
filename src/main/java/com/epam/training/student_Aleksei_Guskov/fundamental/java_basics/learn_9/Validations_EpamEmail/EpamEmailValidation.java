package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_9.Validations_EpamEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if (email == null) return false;
        Pattern colorPat = Pattern.compile("[a-z0-9]+_[a-z0-9]+@epam.com");
        Matcher colorMat = colorPat.matcher(email);
        return colorMat.matches();
    }
}

