/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;

public class fhk
extends ffn {
    public static final MapCodec<fhk> d = fhk.a(fhk::new);

    public fhk(ffo.c $$0) {
        super(fhj::new, 21, 21, $$0);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, fgd $$6) {
        Comparator $$7 = bhb.a(jy::i);
        for (ffs $$8 : $$6.c()) {
            if (!($$8 instanceof fhj)) continue;
            fhj $$9 = (fhj)$$8;
            $$7.addAll($$9.b());
            fhk.a($$4, $$0, $$9.c());
        }
        ObjectArrayList $$10 = new ObjectArrayList($$7.stream().toList());
        bgr $$11 = bgr.a($$0.J()).e().a($$6.b().g());
        bhs.c($$10, $$11);
        int $$12 = Math.min($$7.size(), $$11.b(5, 8));
        for (is $$13 : $$10) {
            if ($$12 > 0) {
                --$$12;
                fhk.a($$4, $$0, $$13);
                continue;
            }
            if (!$$4.b($$13)) continue;
            $$0.a($$13, dzs.L.m(), 2);
        }
    }

    private static void a(ffg $$0, dxn $$12, is $$2) {
        if ($$0.b($$2)) {
            $$12.a($$2, dzs.M.m(), 2);
            $$12.a($$2, eld.P).ifPresent($$1 -> $$1.a(fnv.bk, $$2.a()));
        }
    }

    @Override
    public ffx<?> e() {
        return ffx.b;
    }
}

