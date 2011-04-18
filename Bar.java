package tb.svndemo

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