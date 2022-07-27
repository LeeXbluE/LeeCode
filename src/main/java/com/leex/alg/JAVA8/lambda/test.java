package com.leex.alg.JAVA8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @title: test
 * @Author LeeX
 * @Date: 2022/7/17 22:32
 * @Version 1.0
 */
public class test {

    public static void main(String[] args) {
        Supplier<Mask> s = () -> new Mask("3","2");

        Consumer<Mask> c = mask -> System.out.println("hello");

        Predicate<Mask> p = new Predicate<Mask>() {
            @Override
            public boolean test(Mask mask) {
                return false;
            }
        };

        Function<Mask,String> f = mask -> mask.getBrand();
        Function<Mask,String> f2 = Mask::getBrand;



        List<Mask> maskList = new ArrayList<>();
        maskList.add(new Mask("3M", "KN95",17.8));
        maskList.add(new Mask("Honeywell", "KN95",18.8));
        maskList.add(new Mask("3M", "FFP2",19.8));
        maskList.add(new Mask("Honeywell", "N95",19.5));
        maskList.sort(Comparator.comparing(Mask::getBrand));

    }
}
