package tb.svndemo

/**
 * Bars are fully operational widget sorters that are reliant upon a Foo
 * mechanism for widget-sexing.
 */
public class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        if (foo == null) {
            throw new IllegalArgumentException("Foo must not be null.");
        }

        this.foo = foo;
    }

    public Foo getFoo() {
        return this.foo;
    }
}