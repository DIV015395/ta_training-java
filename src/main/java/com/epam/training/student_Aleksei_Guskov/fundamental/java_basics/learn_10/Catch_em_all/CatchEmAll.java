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
        catch(FileNotFoundException e){
            throw new IllegalArgumentException("Resource is missing", e);
        }
        catch(IOException e){
            throw new IllegalArgumentException("Resource error", e);
        }
        catch(ArithmeticException | NumberFormatException e){
            String a = String.valueOf(exception);
            Pattern p1 = Pattern.compile("java.lang.NumberFormatException: ");
            Matcher m1 = p1.matcher(a);
            a = m1.replaceAll("");
            Pattern p2 = Pattern.compile("java.lang.ArithmeticException: ");
            Matcher m2 = p2.matcher(a);
            a = m2.replaceAll("");
            System.err.println(a);
        }
    }
}

