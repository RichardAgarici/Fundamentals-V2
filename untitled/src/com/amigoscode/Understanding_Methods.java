package com.amigoscode;

import java.util.Arrays;

public class Understanding_Methods {

    public static void main(String[] args) {
        char[] letters = {'A','A', 'B', 'C','D','D','D' };
        int count = countOccurrences(letters, 'z');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter){
      int count = 0;
        for (char letter : letters) {
          if (letter==searchLetter) {
              count++;
          }
      }
        return count;
    }
}
