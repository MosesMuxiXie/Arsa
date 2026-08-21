/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.jspecify.annotations.Nullable;

public class eqd
implements AutoCloseable {
    private final dwp a;
    private final Long2ObjectMap<eqr> b = new Long2ObjectOpenHashMap();
    private @Nullable eqr c;
    private long d;

    public eqd(dwp $$0) {
        this.a = $$0;
    }

    public @Nullable eqr a(is $$0) {
        int $$1 = this.a.f($$0.v());
        if ($$1 < 0 || $$1 >= this.a.ax()) {
            return null;
        }
        long $$22 = jw.c($$0);
        if (this.c == null || this.d != $$22) {
            this.c = (eqr)this.b.computeIfAbsent($$22, $$2 -> {
                eqf $$3 = this.a.a(jw.a($$0.u()), jw.a($$0.w()));
                eqr $$4 = $$3.b($$1);
                $$4.a();
                return $$4;
            });
            this.d = $$22;
        }
        return this.c;
    }

    public eoh b(is $$0) {
        eqr $$1 = this.a($$0);
        if ($$1 == null) {
            return dzs.a.m();
        }
        int $$2 = jw.b($$0.u());
        int $$3 = jw.b($$0.v());
        int $$4 = jw.b($$0.w());
        return $$1.a($$2, $$3, $$4);
    }

    @Override
    public void close() {
        for (eqr $$0 : this.b.values()) {
            $$0.b();
        }
    }
}

