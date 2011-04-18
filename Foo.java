package tb.svndemo

/**
 * The Foo class models the real-world Foo system, with the exception of the
 * Frob subcomponent, which is assumed to be using the Cashman-Knut pass-through.
 */
public class Foo {
    Bar bar;

    public void setBar(Bar bar) {
        if (bar == null) {
            throw new IllegalArgumentException("Bar must not be null.");
        }

        this.bar = bar;
    }

    public Bar getBar() {
        return this.bar;
    }
}