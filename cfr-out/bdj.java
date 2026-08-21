/*
 * Decompiled with CFR 0.152.
 */
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class bdj<T>
implements Iterable<bdh<T>> {
    private final jq<T> a;
    private final Map<T, bdh<T>> b = new IdentityHashMap<T, bdh<T>>();
    private final yh c;
    private final aao<xq, bdh<T>> d;

    public bdj(jq<T> $$0, yh $$1) {
        this.a = $$0;
        this.c = $$1;
        this.d = aam.a($$0.g()).a(this::b, bdh::b);
    }

    public aao<xq, bdh<T>> a() {
        return this.d;
    }

    public boolean a(T $$0) {
        return this.b.containsKey($$0);
    }

    public bdh<T> a(T $$0, bdi $$12) {
        return this.b.computeIfAbsent($$0, $$1 -> new bdh<Object>(this, $$1, $$12));
    }

    public jq<T> b() {
        return this.a;
    }

    @Override
    public Iterator<bdh<T>> iterator() {
        return this.b.values().iterator();
    }

    public bdh<T> b(T $$0) {
        return this.a($$0, bdi.b);
    }

    public yh c() {
        return this.c;
    }
}

