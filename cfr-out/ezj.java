/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class ezj
extends exx<fay> {
    @dzq.b
    private static final int a = 19;

    public ezj(Codec<fay> $$0) {
        super($$0);
    }

    public static boolean b(dwu $$02, is $$1) {
        return $$02.a($$1, (eoh $$0) -> $$0.a(dzs.fN));
    }

    public static boolean c(dwu $$02, is $$1) {
        return $$02.a($$1, (eoh $$0) -> $$0.l() || $$0.a(bdp.M));
    }

    private static void b(dwv $$0, is $$1, eoh $$2) {
        $$0.a($$1, $$2, 19);
    }

    public static boolean d(dwu $$02, is $$1) {
        return $$02.a($$1, (eoh $$0) -> $$0.l() || $$0.a(bdp.cE));
    }

    private boolean a(dxn $$0, bgr $$1, is $$22, BiConsumer<is, eoh> $$3, BiConsumer<is, eoh> $$4, fbo.b $$5, fay $$6) {
        int $$72 = $$6.d.a($$1);
        int $$8 = $$6.f.a($$1, $$72, $$6);
        int $$9 = $$72 - $$8;
        int $$10 = $$6.f.a($$1, $$9);
        is $$11 = $$6.g.map($$2 -> $$2.a($$22, $$1)).orElse($$22);
        int $$12 = Math.min($$22.v(), $$11.v());
        int $$13 = Math.max($$22.v(), $$11.v()) + $$72 + 1;
        if ($$12 < $$0.K_() + 1 || $$13 > $$0.aw() + 1) {
            return false;
        }
        OptionalInt $$14 = $$6.h.c();
        int $$15 = this.a((dwu)$$0, $$72, $$11, $$6);
        if ($$15 < $$72 && ($$14.isEmpty() || $$15 < $$14.getAsInt())) {
            return false;
        }
        if ($$6.g.isPresent() && !$$6.g.get().a($$0, $$3, $$1, $$22, $$11, $$6)) {
            return false;
        }
        List<fbo.a> $$16 = $$6.d.a((dwu)$$0, $$4, $$1, $$15, $$11, $$6);
        $$16.forEach($$7 -> $$0.f.a((dwu)$$0, $$5, $$1, $$6, $$15, (fbo.a)$$7, $$8, $$10));
        return true;
    }

    private int a(dwu $$0, int $$1, is $$2, fay $$3) {
        is.a $$4 = new is.a();
        for (int $$5 = 0; $$5 <= $$1 + 1; ++$$5) {
            int $$6 = $$3.h.a($$1, $$5);
            for (int $$7 = -$$6; $$7 <= $$6; ++$$7) {
                for (int $$8 = -$$6; $$8 <= $$6; ++$$8) {
                    $$4.a($$2, $$7, $$5, $$8);
                    if ($$3.d.b($$0, $$4) && ($$3.j || !ezj.b($$0, $$4))) continue;
                    return $$5 - 2;
                }
            }
        }
        return $$1;
    }

    @Override
    protected void a(dwv $$0, is $$1, eoh $$2) {
        ezj.b($$0, $$1, $$2);
    }

    @Override
    public final boolean a(exz<fay> $$0) {
        final dxn $$12 = $$0.b();
        bgr $$22 = $$0.d();
        is $$32 = $$0.e();
        fay $$42 = $$0.f();
        HashSet $$5 = Sets.newHashSet();
        HashSet $$6 = Sets.newHashSet();
        final HashSet $$7 = Sets.newHashSet();
        HashSet $$8 = Sets.newHashSet();
        BiConsumer<is, eoh> $$9 = ($$2, $$3) -> {
            $$5.add($$2.j());
            $$12.a((is)$$2, (eoh)$$3, 19);
        };
        BiConsumer<is, eoh> $$10 = ($$2, $$3) -> {
            $$6.add($$2.j());
            $$12.a((is)$$2, (eoh)$$3, 19);
        };
        fbo.b $$11 = new fbo.b(){

            @Override
            public void a(is $$0, eoh $$1) {
                $$7.add($$0.j());
                $$12.a($$0, $$1, 19);
            }

            @Override
            public boolean a(is $$0) {
                return $$7.contains($$0);
            }
        };
        BiConsumer<is, eoh> $$122 = ($$2, $$3) -> {
            $$8.add($$2.j());
            $$12.a((is)$$2, (eoh)$$3, 19);
        };
        boolean $$13 = this.a($$12, $$22, $$32, $$9, $$10, $$11, $$42);
        if (!$$13 || $$6.isEmpty() && $$7.isEmpty()) {
            return false;
        }
        if (!$$42.i.isEmpty()) {
            fcy.a $$14 = new fcy.a($$12, $$122, $$22, $$6, $$7, $$5);
            $$42.i.forEach($$1 -> $$1.a($$14));
        }
        return ffg.a(Iterables.concat((Iterable)$$5, (Iterable)$$6, (Iterable)$$7, (Iterable)$$8)).map($$4 -> {
            ftv $$5 = ezj.a((dwp)$$12, $$4, (Set<is>)$$6, (Set<is>)$$8, $$5);
            fjq.a($$12, 3, $$5, $$4.h(), $$4.i(), $$4.j());
            return true;
        }).orElse(false);
    }

    /*
     * Unable to fully structure code
     */
    private static ftv a(dwp $$0, ffg $$1, Set<is> $$2, Set<is> $$3, Set<is> $$4) {
        $$5 = new ftp($$1.d(), $$1.e(), $$1.f());
        $$6 = 7;
        $$7 = Lists.newArrayList();
        for ($$8 = 0; $$8 < 7; ++$$8) {
            $$7.add(Sets.newHashSet());
        }
        for (is $$9 : Lists.newArrayList((Iterable)Sets.union($$3, $$4))) {
            if (!$$1.b($$9)) continue;
            $$5.c($$9.u() - $$1.h(), $$9.v() - $$1.i(), $$9.w() - $$1.j());
        }
        $$10 = new is.a();
        $$11 = 0;
        ((Set)$$7.get(0)).addAll($$2);
        block2: while (true) {
            if ($$11 < 7 && ((Set)$$7.get($$11)).isEmpty()) {
                ++$$11;
                continue;
            }
            if ($$11 >= 7) break;
            $$12 = ((Set)$$7.get($$11)).iterator();
            $$13 = (is)$$12.next();
            $$12.remove();
            if (!$$1.b($$13)) continue;
            if ($$11 != 0) {
                $$14 = $$0.a_($$13);
                ezj.b($$0, $$13, (eoh)$$14.b(eox.aG, $$11));
            }
            $$5.c($$13.u() - $$1.h(), $$13.v() - $$1.i(), $$13.w() - $$1.j());
            var12_14 = iz.values();
            var13_15 = var12_14.length;
            var14_16 = 0;
            while (true) {
                if (var14_16 < var13_15) ** break;
                continue block2;
                $$15 = var12_14[var14_16];
                $$10.a((jy)$$13, $$15);
                if ($$1.b($$10) && !$$5.b($$16 = $$10.u() - $$1.h(), $$17 = $$10.v() - $$1.i(), $$18 = $$10.w() - $$1.j()) && !($$20 = eei.r($$19 = $$0.a_($$10))).isEmpty() && ($$21 = Math.min($$20.getAsInt(), $$11 + 1)) < 7) {
                    ((Set)$$7.get($$21)).add($$10.j());
                    $$11 = Math.min($$11, $$21);
                }
                ++var14_16;
            }
            break;
        }
        return $$5;
    }

    public static List<is> a(fcy.a $$0) {
        ArrayList $$1 = Lists.newArrayList();
        ObjectArrayList<is> $$2 = $$0.e();
        ObjectArrayList<is> $$3 = $$0.c();
        if ($$2.isEmpty()) {
            $$1.addAll($$3);
        } else if (!$$3.isEmpty() && ((is)$$2.get(0)).v() == ((is)$$3.get(0)).v()) {
            $$1.addAll($$3);
            $$1.addAll($$2);
        } else {
            $$1.addAll($$2);
        }
        return $$1;
    }
}

