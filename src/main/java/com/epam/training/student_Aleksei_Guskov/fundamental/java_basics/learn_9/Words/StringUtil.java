package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_9.Words;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (words == null) return 0;
        int wordsSample = 0;
        int zeroExam = 0;
        if (sample == null || sample == "") return 0;
        for (int i = 0; i <= words.length-1; i++) {
            if (words[i] != null && words[i] != "") zeroExam++;
            if (sample.trim().equalsIgnoreCase(words[i].trim())) {
                wordsSample++;
            }
            else continue;
        }
        if (zeroExam==0) {
            return 0;
        } else {
            return wordsSample;
        }
    }

    public static String[] splitWords(String text) {
        String exam = "";
        if (text == null) return null;
        if (text.equals(exam)) return null;
        else {
            text.trim();
            Pattern splitPat = Pattern.compile("\\W+");
            String[] newText = splitPat.split(text);
            if (newText.length == 0 || newText.toString().equals(exam)) return null;
            if (newText[0].equals(exam) || newText[0] == " " || newText[0] == ",") {
                String[] nextText = new String[newText.length-1];
                System.arraycopy(newText, 1, nextText, 0, newText.length-1);
                return nextText;
            }
            return newText;
        }
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == ""||path == null) return null;
        Pattern exam = Pattern.compile("(/.+\\\\)");
        Pattern exam2 = Pattern.compile("(.*\\\\.+/.*)");
        Pattern exam3 = Pattern.compile("(.*/~/.*)");
        Pattern exam4 = Pattern.compile("(.*//.*)");
        Pattern exam5 = Pattern.compile("(~\\\\.+)");
        Pattern exam6 = Pattern.compile("(~/?~)");
        Pattern exam7 = Pattern.compile("(.+\\\\C:\\\\)");
        Matcher examPath = exam.matcher(path);
        Matcher examPath2 = exam2.matcher(path);
        Matcher examPath3 = exam3.matcher(path);
        Matcher examPath4 = exam4.matcher(path);
        Matcher examPath5 = exam5.matcher(path);
        Matcher examPath6 = exam6.matcher(path);
        Matcher examPath7 = exam7.matcher(path);
        if (examPath.lookingAt() ||
                examPath2.lookingAt() ||
                examPath3.lookingAt() ||
                examPath4.lookingAt() ||
                examPath5.lookingAt() ||
                examPath6.lookingAt() ||
                examPath7.lookingAt()) return null;

        if (toWin){
            Pattern p1 = Pattern.compile("/");
            Matcher m1 = p1.matcher(path);
            path = m1.replaceAll("\\\\");
            Pattern p2 = Pattern.compile("~");
            Matcher m2 = p2.matcher(path);
            path = m2.replaceAll("C:\\\\User");
            if (path.charAt(0) == '\\') {
                path = "C:" + path;
            }
            return path;
        }
        if (!toWin){
            Pattern p1 = Pattern.compile("\\\\");
            Matcher m1 = p1.matcher(path);
            path = m1.replaceAll("/");
            Pattern p2 = Pattern.compile("C:/User");
            Matcher m2 = p2.matcher(path);
            path = m2.replaceAll("~");
            Pattern p3 = Pattern.compile("C:/");
            Matcher m3 = p3.matcher(path);
            path = m3.replaceAll("/");
            return path;
        }
        throw new UnsupportedOperationException();
    }

    public static String joinWords(String[] words) {
        String wordExam = "";
        int examNull = 0;
        if (words == null) return null;
        for (int i=0; i<words.length; i++){
            if (!(words[i].equals(wordExam))) examNull++;
        }
        if (examNull == 0) return null;
        String exam = "[\\[]?([,]?[\\s]?)([\\[]?[\\w]+[\\]]?)[\\s]?";
        String nextWords;
        String wordsString = Arrays.toString(words);
        StringBuilder newWords = new StringBuilder();
        Pattern pattern = Pattern.compile(exam);
        Matcher matcher = pattern.matcher(wordsString);
        while (matcher.find()){
            newWords.append(matcher.group());
        }
        if (newWords.charAt(0) != '[') {
            nextWords= "[" + String.valueOf(newWords) + "]";
        } else {
            nextWords = String.valueOf(newWords);
        }
        return nextWords;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String  text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}