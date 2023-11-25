package org.example.functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo {

    public static void main(String[] args) {
        Consumer consumer  = t -> System.out.println(" this is the implementation of accept method of consumer function " +
                    "and its input arguments is "+t);

        consumer.accept(25);

        List<Integer>  al =  Arrays.asList(1,2,3,4,5);
        al.stream().forEach(t -> System.out.println(" this is the implementation of accept method of consumer function " +
                "and its input arguments is "+t));

    }


}
