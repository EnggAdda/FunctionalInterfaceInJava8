package org.example.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierFunctionalInterfaceDemo   {




    public static void main(String[] args) {
       /* SupplierFunctionalInterfaceDemo  demo = new SupplierFunctionalInterfaceDemo();
       Integer var =  demo.get();
        System.out.println(var);*/

      /* Supplier<String>  supplier= ()-> "Ram";
       String var  =  supplier.get();
        System.out.println(var);*/

       // Supplier<Integer>  supplier =()->200;

        List<Integer> al  = Arrays.asList(1,2,3,4,5);
       Integer var  =  al.stream().findAny().orElseGet(()->2000);
        System.out.println(var);




    }
}
