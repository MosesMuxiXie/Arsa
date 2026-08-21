/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 */
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class iri
extends irg {
    private static final long a = iri.a(Runtime.getRuntime().maxMemory());
    private final LongList b = new LongArrayList();
    private final LongList c = new LongArrayList();
    private final LongList d = new LongArrayList();

    @Override
    public void a(ira $$0) {
        if (gfj.V().H()) {
            super.a($$0);
        }
    }

    private void g() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    @Override
    public void f() {
        this.b.add((long)gfj.V().s());
        this.h();
        this.c.add(gfj.V().t());
    }

    private void h() {
        long $$0 = Runtime.getRuntime().totalMemory();
        long $$1 = Runtime.getRuntime().freeMemory();
        long $$2 = $$0 - $$1;
        this.d.add(iri.a($$2));
    }

    @Override
    public void b(ira $$02) {
        $$02.send(irb.c, $$0 -> {
            $$0.a(ird.r, new LongArrayList(this.b));
            $$0.a(ird.s, new LongArrayList(this.c));
            $$0.a(ird.t, new LongArrayList(this.d));
            $$0.a(ird.u, this.e());
            $$0.a(ird.v, gfj.V().k.aY());
            $$0.a(ird.w, (int)a);
        });
        this.g();
    }

    private static long a(long $$0) {
        return $$0 / 1000L;
    }
}

