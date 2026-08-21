/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class jk<T> {
    private final List<T> a;
    private final List<jr.b> b;
    private final jr.b c;

    public jk(List<T> $$0) {
        this($$0, bhs.a(() -> {
            Object[] $$1 = new jr.b[$$0.size()];
            Arrays.fill($$1, jr.b);
            return Arrays.asList($$1);
        }));
    }

    private jk(List<T> $$0, List<jr.b> $$1) {
        this.a = List.copyOf($$0);
        this.b = List.copyOf($$1);
        this.c = new jr.c(jk.a($$1.stream())).e();
    }

    private int d(T $$0) {
        int $$1 = this.a.indexOf($$0);
        if ($$1 == -1) {
            throw new IllegalStateException("Can't find " + String.valueOf($$0) + " inside " + String.valueOf(this.a));
        }
        return $$1;
    }

    public jr.b a(T $$0) {
        int $$1 = this.d($$0);
        return this.b.get($$1);
    }

    public jr.b b(T $$0) {
        int $$1 = this.d($$0);
        return this.a(0, $$1);
    }

    public jr.b c(T $$0) {
        int $$1 = this.d($$0);
        return this.a($$1, this.b.size());
    }

    private jr.b a(int $$0, int $$1) {
        return new jr.c(jk.a(this.b.subList($$0, $$1).stream())).e();
    }

    public jk<T> a(T $$0, jr.b ... $$1) {
        return this.a($$0, Arrays.asList($$1));
    }

    public jk<T> a(T $$0, List<jr.b> $$1) {
        int $$2 = this.d($$0);
        if ($$1.size() > this.b.size() - $$2) {
            throw new IllegalStateException("Too many values to replace");
        }
        ArrayList<jr.b> $$3 = new ArrayList<jr.b>();
        for (int $$4 = 0; $$4 < $$2; ++$$4) {
            $$3.add(this.b.get($$4));
        }
        $$3.addAll($$1);
        while ($$3.size() < this.b.size()) {
            $$3.add(jr.b);
        }
        return new jk<T>(this.a, $$3);
    }

    public jr.b a() {
        return this.c;
    }

    private static Map<amt<? extends jq<?>>, jq<?>> a(Stream<? extends jr> $$0) {
        HashMap $$1 = new HashMap();
        $$0.forEach($$12 -> $$12.a().forEach($$1 -> {
            if ($$1.put($$1.a(), $$1.b()) != null) {
                throw new IllegalStateException("Duplicated registry " + String.valueOf($$1.a()));
            }
        }));
        return $$1;
    }
}

