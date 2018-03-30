import junit.framework.TestCase;

public class HelloTest extends TestCase {
    public void test1() {}
    public void test2() {
        new Hello.Foo();
    }
    public void test3() {
        new Hello().foo();
    }
}
