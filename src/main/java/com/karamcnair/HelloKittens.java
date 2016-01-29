package com.karamcnair;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mcnair on 2016-01-27.
 */
@SuppressWarnings("DefaultFileTemplate")
class HelloKittens {

    public String[] merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<>();

        sentence.addAll(Arrays.asList(words));
        sentence.addAll(Arrays.asList(more));

//        for (String w : words) sentence.add(w);
//        for (String w : more) sentence.add(w);

        String[] sentArr = new String[sentence.size()];
        sentArr = sentence.toArray(sentArr);

        return sentArr;
    }

    String joinWords(String[] words) {
        String sentence = "";
        for (String w : words) {
            sentence = sentence + w;
        }

        return sentence;
    }

    String joinWords2(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String w : words) {
            sentence.append(w);
        }
        return sentence.toString();
    }


    public static void main(String[] args) {
        System.out.println("howdy, fuzzballs!");
        System.out.println("holy cats! 'sout' is awesome!");
    }
}
