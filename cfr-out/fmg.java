/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public class fmg
extends fml {
    private final Deque<is> b = new ArrayDeque<is>();
    private final Deque<is> c = new ArrayDeque<is>();
    private final Object2IntMap<is> d = new Object2IntLinkedOpenHashMap();

    public fmg(egb $$0) {
        super($$0);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable fmj $$3, boolean $$4) {
        fmj $$5 = fmg.a($$0, $$3);
        this.a($$0, $$1, $$5);
        ObjectIterator $$6 = this.d.object2IntEntrySet().iterator();
        boolean $$7 = true;
        while ($$6.hasNext()) {
            Object2IntMap.Entry $$8 = (Object2IntMap.Entry)$$6.next();
            is $$9 = (is)$$8.getKey();
            int $$10 = $$8.getIntValue();
            int $$11 = fmg.b($$10);
            eoh $$12 = $$0.a_($$9);
            if ($$12.a(this.a) && !$$12.c(egb.f).equals($$11)) {
                int $$13 = 2;
                if (!$$4 || !$$7) {
                    $$13 |= 0x80;
                }
                $$0.a($$9, (eoh)$$12.b(egb.f, $$11), $$13);
            } else {
                $$6.remove();
            }
            $$7 = false;
        }
        this.a($$0);
    }

    private void a(dwo $$0) {
        axf $$12;
        this.d.forEach(($$1, $$2) -> {
            fmj $$3 = fmg.a($$2);
            eoh $$4 = $$0.a_((is)$$1);
            for (iz $$5 : $$3.f()) {
                if (!fmg.a($$4, $$5)) continue;
                is $$6 = $$1.a($$5);
                eoh $$7 = $$0.a_($$6);
                fmj $$8 = $$3.c($$5);
                $$0.a($$7, $$6, this.a, $$8, false);
                if (!$$7.d($$0, $$6)) continue;
                for (iz $$9 : $$8.f()) {
                    if ($$9 == $$5.g()) continue;
                    $$0.b($$6.a($$9), this.a, $$8.c($$9));
                }
            }
        });
        if ($$0 instanceof axf && ($$12 = (axf)$$0).W().a(bxf.j)) {
            this.d.forEach(($$1, $$2) -> $$12.W().a((is)$$1, bxf.j, fmg.a($$2)));
        }
    }

    private static boolean a(eoh $$0, iz $$1) {
        epf<epm> $$2 = egb.g.get($$1);
        if ($$2 == null) {
            return $$1 == iz.a;
        }
        return $$0.c($$2).a();
    }

    private static fmj a(dwo $$0, @Nullable fmj $$1) {
        fmj $$3;
        if ($$1 != null) {
            fmj $$2 = $$1;
        } else {
            $$3 = fmj.a($$0.y);
        }
        return $$3.a(iz.b).a(fmj.a.a);
    }

    private void a(dwo $$0, is $$1, fmj $$2) {
        eoh $$3 = $$0.a_($$1);
        if ($$3.a(this.a)) {
            this.a($$1, $$3.c(egb.f), $$2);
            this.b.add($$1);
        } else {
            this.a($$0, $$1, 0, $$2, true);
        }
        while (!this.b.isEmpty()) {
            int $$12;
            int $$9;
            is $$4 = this.b.removeFirst();
            int $$5 = this.d.getInt((Object)$$4);
            fmj $$6 = fmg.a($$5);
            int $$7 = fmg.b($$5);
            int $$8 = this.a($$0, $$4);
            int $$10 = Math.max($$8, $$9 = this.b($$0, $$4));
            if ($$10 < $$7) {
                if ($$8 > 0 && !this.c.contains($$4)) {
                    this.c.add($$4);
                }
                boolean $$11 = false;
            } else {
                $$12 = $$10;
            }
            if ($$12 != $$7) {
                this.a($$4, $$12, $$6);
            }
            this.a($$0, $$4, $$12, $$6, $$7 > $$10);
        }
        while (!this.c.isEmpty()) {
            is $$13 = this.c.removeFirst();
            int $$14 = this.d.getInt((Object)$$13);
            int $$15 = fmg.b($$14);
            int $$16 = this.a($$0, $$13);
            int $$17 = this.b($$0, $$13);
            int $$18 = Math.max($$16, $$17);
            fmj $$19 = fmg.a($$14);
            if ($$18 > $$15) {
                this.a($$13, $$18, $$19);
            } else if ($$18 < $$15) {
                throw new IllegalStateException("Turning off wire while trying to turn it on. Should not happen.");
            }
            this.a($$0, $$13, $$18, $$19, false);
        }
    }

    private static int a(fmj $$0, int $$1) {
        return $$0.i() << 4 | $$1;
    }

    private static fmj a(int $$0) {
        return fmj.a($$0 >> 4);
    }

    private static int b(int $$0) {
        return $$0 & 0xF;
    }

    private void a(is $$0, int $$1, fmj $$22) {
        this.d.compute((Object)$$0, ($$2, $$3) -> {
            if ($$3 == null) {
                return fmg.a($$22, $$1);
            }
            return fmg.a(fmg.a($$3), $$1);
        });
    }

    private void a(dwo $$0, is $$1, int $$2, fmj $$3, boolean $$4) {
        for (iz $$5 : $$3.g()) {
            is $$6 = $$1.a($$5);
            this.b($$0, $$6, $$2, $$3.b($$5), $$4);
        }
        for (iz $$7 : $$3.h()) {
            is $$8 = $$1.a($$7);
            boolean $$9 = $$0.a_($$8).d($$0, $$8);
            for (iz $$10 : $$3.g()) {
                is $$11 = $$1.a($$10);
                if ($$7 == iz.b && !$$9) {
                    is $$12 = $$8.a($$10);
                    this.b($$0, $$12, $$2, $$3.b($$10), $$4);
                    continue;
                }
                if ($$7 != iz.a || $$0.a_($$11).d($$0, $$11)) continue;
                is $$13 = $$8.a($$10);
                this.b($$0, $$13, $$2, $$3.b($$10), $$4);
            }
        }
    }

    private void b(dwo $$0, is $$1, int $$2, fmj $$3, boolean $$4) {
        eoh $$5 = $$0.a_($$1);
        if ($$5.a(this.a)) {
            int $$6 = this.a($$1, $$5);
            if ($$6 < $$2 - 1 && !this.c.contains($$1)) {
                this.c.add($$1);
                this.a($$1, $$6, $$3);
            }
            if ($$4 && $$6 > $$2 && !this.b.contains($$1)) {
                this.b.add($$1);
                this.a($$1, $$6, $$3);
            }
        }
    }

    @Override
    protected int a(is $$0, eoh $$1) {
        int $$2 = this.d.getOrDefault((Object)$$0, -1);
        if ($$2 != -1) {
            return fmg.b($$2);
        }
        return super.a($$0, $$1);
    }
}

