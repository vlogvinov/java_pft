package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = new String[4];
        langs[0] = "Java";
        langs[1] = "C#";
        langs[2] = "Python";
        langs[3] = "PHP";


        String[] language = {"Java", "C#", "Python", "PHP"};

        for (int i = 0; i < language.length; i++){
            System.out.println("Я хочу выучить " + language[i]);
        }

        for (String l: language){
            System.out.println("Я хочу выучить " + l);
        }

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C#");
        list.add("Python");
        list.add("PHP");

        for (String l: list){
            System.out.println("я хочу выучить " + l);
        }

       List<String> alo =  Arrays.asList("Java", "C#", "Python", "PHP");

        for (int i = 0; i < alo.size(); i++){
            System.out.println(alo.get(i));
        }


    }
}
