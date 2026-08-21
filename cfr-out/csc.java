/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class csc {
    private final chn a;
    private final IntSet b = new IntOpenHashSet();
    private final IntSet c = new IntOpenHashSet();

    public csc(chn $$0) {
        this.a = $$0;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public boolean a(cgk $$0) {
        int $$1 = $$0.aA();
        if (this.b.contains($$1)) {
            return true;
        }
        if (this.c.contains($$1)) {
            return false;
        }
        bzm $$2 = bzl.a();
        $$2.a("hasLineOfSight");
        boolean $$3 = this.a.G($$0);
        $$2.c();
        if ($$3) {
            this.b.add($$1);
        } else {
            this.c.add($$1);
        }
        return $$3;
    }
}

