package javaExamples;

import edu.emory.mathcs.backport.java.util.Arrays;


import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        String[] langs = {"Java", "C#", "Python", "PHP"};
        for (int i = 0; i < langs.length; i++) {
            System.out.println("Я хочу выучить " + langs[i]);
        }

        for (String l : langs) {
            System.out.println("Я хочу выучить " + l);
        }

        List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Ruby");

        for (String i : languages) {
            System.out.println("Языки программирования " + i);
        }


    }
}
