/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.List;

public class awi {
    private final List<awg> a = new ArrayList<awg>();
    private int b;

    public void a(axf $$0, Runnable $$1) {
        axc $$2 = $$0.p();
        LongOpenHashSet $$3 = new LongOpenHashSet();
        $$2.d();
        $$2.a.a(erj.n).forEach(arg_0 -> awi.b((LongSet)$$3, arg_0));
        $$1.run();
        $$2.d();
        $$2.a.a(erj.n).forEach(arg_0 -> this.a((LongSet)$$3, arg_0));
    }

    public int a() {
        return this.b - this.b();
    }

    public int b() {
        this.a.removeIf($$0 -> $$0.u() == erj.n);
        return this.a.size();
    }

    public int c() {
        return this.b;
    }

    private /* synthetic */ void a(LongSet $$0, awg $$1) {
        if (!$$0.contains($$1.r().b())) {
            this.a.add($$1);
            ++this.b;
        }
    }

    private static /* synthetic */ void b(LongSet $$0, awg $$1) {
        $$0.add($$1.r().b());
    }
}

