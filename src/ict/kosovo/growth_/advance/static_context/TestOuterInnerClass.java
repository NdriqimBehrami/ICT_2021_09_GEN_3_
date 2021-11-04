package ict.kosovo.growth_.advance.static_context;

public class TestOuterInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        var privateClass = Outer.createInstance("Hello there");
        System.out.println(privateClass);
        System.out.println(inner.value);
    }
}
