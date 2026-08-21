/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.stream.IntStream;

public class exg
extends exx<faj> {
    public exg(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        bgr $$1 = $$0.d();
        dxn $$2 = $$0.b();
        dvu $$3 = new dvu($$0.e());
        IntArrayList $$4 = bhs.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
        IntArrayList $$5 = bhs.a(IntStream.rangeClosed($$3.f(), $$3.h()), $$1);
        is.a $$6 = new is.a();
        for (Integer $$7 : $$4) {
            for (Integer $$8 : $$5) {
                $$6.d($$7, 0, $$8);
                is $$9 = $$2.a(euq.a.f, (is)$$6);
                if (!$$2.A($$9) && !$$2.a_($$9).g($$2, $$9).c()) continue;
                $$2.a($$9, dzs.cS.m(), 2);
                cdj.a($$2, $$1, $$9, fnv.a);
                eoh $$10 = dzs.cL.m();
                for (iz $$11 : iz.c.a) {
                    is $$12 = $$9.a($$11);
                    if (!$$10.a($$2, $$12)) continue;
                    $$2.a($$12, $$10, 2);
                }
                return true;
            }
        }
        return false;
    }
}

