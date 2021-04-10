/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kagan.lambdatest;
import java.lang.String;
import java.util.*;

/**
 *
 * @author Daniel Kagan
 */
public class MainClass {
    public static void main(String[] args)
    {
        String[] theFirstString = {"abcdefgjsilfjgoidfjgoijfjojopijopiji", "you", "dick"};
        String[] theSecondString = {"million", "dollars"};
        String[] theThirdString = {"Greta", "Tuborg", "is", "dead", "inside"};
        List <String[]> forTheSort = new ArrayList<>();
        forTheSort.add(theFirstString);
        forTheSort.add(theSecondString);
        forTheSort.add(theThirdString);
        forTheSort.sort((o1, o2)->{int l1 = 0; int l2 = 0; for(String s: o1) {
            l1+=s.length();
        }
        for(String s: o2)
        {
            l2+=s.length();
        }
        return l1-l2;
            });
        /*forTheSort.sort(new Comparator<String[]>(){
        @Override
        public int compare(String[] o1, String[] o2){
            int lengthOfTheFirstString = 0;
            int lengthOfTheSecondString = 0;
            for(String s: o1)
                lengthOfTheFirstString += s.length();
            for(String s: o2)
                lengthOfTheSecondString += s.length();
                return lengthOfTheFirstString - lengthOfTheSecondString;
        }
    }
    );*/
       /* forTheSort.sort(new Comparator<String[]>(){
        @Override
        public int compare(String[] s1, String[] s2){
            return s1.length-s2.length;
        }
    });*/
       //вместо создания анонимного класса-компаратора используем лямбда-выражение
        Iterator<String[]> listIter = forTheSort.iterator();
        
     while(listIter.hasNext())
      {
          for(String s: listIter.next())
          {
          System.out.print(s + " ");
          }
          System.out.println();
      }
        
    }
}
















































