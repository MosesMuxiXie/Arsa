/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.stream.Stream;

public class esn<T> {
    private final dvu a;
    private final List<T> b;

    public esn(dvu $$0, List<T> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public dvu a() {
        return this.a;
    }

    public Stream<T> b() {
        return this.b.stream();
    }

    public boolean c() {
        return this.b.isEmpty();
    }
}

