package org.example.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo  {


   /* @Override
    public Integer apply(Integer x) {
        return 10*x;
    }*/

    public static void main(String[] args) {
      /*  FunctionFunctionalInterfaceDemo  demo = new FunctionFunctionalInterfaceDemo();
       Integer var = demo.apply(20);

        System.out.println(var);*/

      Function<Integer, Integer>  function =   t-> 100*t ;
       Integer var  = function.apply(30);
      // System.out.println(var);

       List<Integer> al  = Arrays.asList(1,2,3,4,5,6);
       al.stream().map(t-> 100*t).forEach(System.out::println);

    }
}
