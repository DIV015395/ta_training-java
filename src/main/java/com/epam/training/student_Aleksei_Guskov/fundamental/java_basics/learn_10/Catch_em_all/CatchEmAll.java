package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_10.Catch_em_all;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatchEmAll {
    public static Exception exception = null;

    public static void riskyMethod() throws Exception {
        if (exception != null) {
            throw exception;
        }
    }
    public static void main(String[] args) throws Exception {

        try {
            riskyMethod();
        }
        catch(FileNotFoundException exceptionOfMissing){
            throw new IllegalArgumentException("Resource is missing", exceptionOfMissing);
        }
        catch(IOException exceptionOfResourceErr){
            throw new IllegalArgumentException("Resource error", exceptionOfResourceErr);
        }
        catch(ArithmeticException | NumberFormatException otherExceptions){
            String outStringOfException = String.valueOf(exception);
            Pattern numberPattern = Pattern.compile("java.lang.NumberFormatException: ");
            Matcher numberMatcher = numberPattern.matcher(outStringOfException);
            outStringOfException = numberMatcher.replaceAll("");
            Pattern arithmericPattern = Pattern.compile("java.lang.ArithmeticException: ");
            Matcher arithmeticMatcher = arithmericPattern.matcher(outStringOfException);
            outStringOfException = arithmeticMatcher.replaceAll("");
            System.err.println(outStringOfException);
        }
    }
}

