package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "rocinante";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        //Matcher numFollowingLargestMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+)").matcher(question);
        //if (sumMatcher.matches()) {
        //    return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        //}

        Matcher mayorMatcher = Pattern.compile(".*which of the following numbers is the largest:.*").matcher(question);
        if (mayorMatcher.matches()){
            String[] digitosPregunta = question.split(".*:");
            Matcher digitos = Pattern.compile("(\\d+)").matcher(digitosPregunta[1]);
            Integer mayor = 0;
            while (digitos.find()){
                int iter = Integer.parseInt(digitos.group());
                if (mayor < Integer.parseInt(digitos.group())){
                    mayor = iter;
                }
            }
            return mayor.toString();
        }


        return "";
    }

}