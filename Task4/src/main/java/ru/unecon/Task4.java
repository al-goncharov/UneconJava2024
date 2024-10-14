package ru.unecon;

import java.util.List;
import java.util.regex.Pattern;

public class Task4 {
    public static List<String> phoneNumbers(List<String> list) {

        Pattern numberPattern = Pattern.compile("(?:\\+7|8)?(\\(\\d{3}\\))?\\d{3}-?\\d{2}-?\\d{2}");

        return list.stream()
                .filter(number -> numberPattern.matcher(number).matches())
                .map(number -> number.replaceAll("^(8|\\+7)", "").replaceAll("\\D", ""))
                .filter(number -> number.length() == 7 || number.length() == 10)
                .toList();
    }
}
