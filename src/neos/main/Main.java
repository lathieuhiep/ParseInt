package neos.main;

import neos.parseint.ParseInt;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 4, 5, 2, 5, 2, 4, 4, 0};
        ArrayList<Integer> arrayList = new ArrayList<>( Arrays.asList(array) );

        ParseInt parseInt = new ParseInt();

        parseInt.findDuplicates(arrayList);
        parseInt.sumLessThanFifty(arrayList);
        parseInt.sortASC(arrayList);
        parseInt.findPerfectNumber(arrayList);
    }
}