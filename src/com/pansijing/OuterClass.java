package com.pansijing;

/**
 * @author pighead4u
 * @time 2017/7/4-15:51.
 * @desc
 */
public class OuterClass {

    private String language = "en";
    private String region = "US";


    public class InnerClass {
        public void printOuterClassPrivateFields() {
            String fields = "language=" + language + ";region=" + region;
            System.out.println(fields);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printOuterClassPrivateFields();
    }

}
