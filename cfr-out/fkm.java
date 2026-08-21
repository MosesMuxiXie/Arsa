/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.jspecify.annotations.Nullable;

public abstract class fkm<M extends fkm<M>> {
    private static final int b = 2;
    private final long[] c = new long[2];
    private final @Nullable eql[] d = new eql[2];
    private boolean e;
    protected final Long2ObjectOpenHashMap<eql> a;

    protected fkm(Long2ObjectOpenHashMap<eql> $$0) {
        this.a = $$0;
        this.c();
        this.e = true;
    }

    public abstract M b();

    public eql a(long $$0) {
        eql $$1 = ((eql)this.a.get($$0)).b();
        this.a.put($$0, (Object)$$1);
        this.c();
        return $$1;
    }

    public boolean b(long $$0) {
        return this.a.containsKey($$0);
    }

    public @Nullable eql c(long $$0) {
        eql $$2;
        if (this.e) {
            for (int $$1 = 0; $$1 < 2; ++$$1) {
                if ($$0 != this.c[$$1]) continue;
                return this.d[$$1];
            }
        }
        if (($$2 = (eql)this.a.get($$0)) != null) {
            if (this.e) {
                for (int $$3 = 1; $$3 > 0; --$$3) {
                    this.c[$$3] = this.c[$$3 - 1];
                    this.d[$$3] = this.d[$$3 - 1];
                }
                this.c[0] = $$0;
                this.d[0] = $$2;
            }
            return $$2;
        }
        return null;
    }

    public @Nullable eql d(long $$0) {
        return (eql)this.a.remove($$0);
    }

    public void a(long $$0, eql $$1) {
        this.a.put($$0, (Object)$$1);
    }

    public void c() {
        for (int $$0 = 0; $$0 < 2; ++$$0) {
            this.c[$$0] = Long.MAX_VALUE;
            this.d[$$0] = null;
        }
    }

    public void d() {
        this.e = false;
    }
}

