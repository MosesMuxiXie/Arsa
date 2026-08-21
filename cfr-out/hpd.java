/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Map;

public class hpd
implements AutoCloseable {
    public static final int a = Arrays.stream(hth.values()).mapToInt(hth::b).sum();
    private final Map<hth, fzi> b = bhs.a(hth.class, $$0 -> new fzi($$0.b()));

    public fzi a(hth $$0) {
        return this.b.get((Object)$$0);
    }

    public void a() {
        this.b.values().forEach(fzi::b);
    }

    public void b() {
        this.b.values().forEach(fzi::c);
    }

    @Override
    public void close() {
        this.b.values().forEach(fzi::close);
    }
}

