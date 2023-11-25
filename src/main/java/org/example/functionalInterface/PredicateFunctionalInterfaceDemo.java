package org.example.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceDemo   {

    public static void main(String[] args) {

       /* PredicateFunctionalInterfaceDemo functionalInterfaceDemo  = new PredicateFunctionalInterfaceDemo();
       boolean ans  = functionalInterfaceDemo.test(4);
        System.out.println("provided integer is even " + ans );*/
       Predicate<Integer> predicate  =  t->  t %2==0 ? true : false ;
        System.out.println(predicate.test(6));

        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7);
        al.stream().filter(t->  t %2==0 ? true : false ).forEach(System.out::println);
    }

  /*  @Override
    public boolean test(Integer integer) {
        if(integer %2==0){
          return   true;
        }
        return false;
    }*/
}
