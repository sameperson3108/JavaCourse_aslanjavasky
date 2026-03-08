package mod2_oop.lesson17_inner_class;

public class InnerDemo {
    static void main() {
        var outerClass = new OuterClass();
        outerClass.outerMethod();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod();
    }
}
