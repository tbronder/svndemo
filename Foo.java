package tb.svndemo

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