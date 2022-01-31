package com.pluralsight.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder order = builder
                .bread("wheat")
                .condiments("lettuce")
                .dressing("mayo")
                .meta("turkey").build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeta());
    }
}
