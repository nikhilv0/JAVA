package com.xowrkz.staticAndencapsulation;

public class Build {
    private static String name;
    private static String plan;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Build.name = name;
    }

    public static String getPlan() {
        return plan;
    }

    public static void setPlan(String plan) {
        Build.plan = plan;
    }
    static {
        String name="Nikki";
        String plane="plan";
        System.out.println(name);
        System.out.println(plane);
    }
}
