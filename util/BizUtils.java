package tb.svndemo.util

import tb.svndemo.Bar;
import tb.svndemo.Foo;

public class BizUtils {
    /**
     * A private constructor to prevent instantiation.
     */
    private BizUtils {}

    public static boolean getTrue() { return true; }

    /**
     * The Foo and Bar classes are linked to each other,
     * so this util method will create a new instance of each,
     * link them together, and then return the Foo.
     */
    public static Foo createFooBar() {
        Bar bar = new Bar(new Foo());
        Foo foo = bar.getFoo();
        foo.setBar(bar);
        return foo;
    }
}