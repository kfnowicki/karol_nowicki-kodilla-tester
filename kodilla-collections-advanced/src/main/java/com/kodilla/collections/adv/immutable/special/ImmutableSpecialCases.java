package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 112;
        Integer b = 112;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("-----");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("-----");
        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c += 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;
        d = 10567;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        System.out.println("-----");
        String s1 = "text";
        String s2 = new String("text");
    }
}
