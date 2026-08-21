/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public final class doj
extends Record
implements dpe {
    private final int d;
    public static final Codec<doj> a = bfm.l.xmap(doj::new, doj::a);
    public static final aao<ByteBuf, doj> b = aao.a(aam.g, doj::a, doj::new);
    public static final int c = -6265536;

    public doj(int $$0) {
        this.d = $$0;
    }

    public static int a(dlt $$0, int $$1) {
        doj $$2 = $$0.a(ki.R);
        return $$2 != null ? bel.g($$2.a()) : $$1;
    }

    public static dlt a(dlt $$0, List<dks> $$1) {
        if (!$$0.a(bdy.cj)) {
            return dlt.l;
        }
        dlt $$2 = $$0.c(1);
        int $$3 = 0;
        int $$4 = 0;
        int $$5 = 0;
        int $$6 = 0;
        int $$7 = 0;
        doj $$8 = $$2.a(ki.R);
        if ($$8 != null) {
            int $$9 = bel.c($$8.a());
            int $$10 = bel.d($$8.a());
            int $$11 = bel.e($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            ++$$7;
        }
        for (dks $$12 : $$1) {
            int $$13 = $$12.a().d();
            int $$14 = bel.c($$13);
            int $$15 = bel.d($$13);
            int $$16 = bel.e($$13);
            $$6 += Math.max($$14, Math.max($$15, $$16));
            $$3 += $$14;
            $$4 += $$15;
            $$5 += $$16;
            ++$$7;
        }
        int $$17 = $$3 / $$7;
        int $$18 = $$4 / $$7;
        int $$19 = $$5 / $$7;
        float $$20 = (float)$$6 / (float)$$7;
        float $$21 = Math.max($$17, Math.max($$18, $$19));
        $$17 = (int)((float)$$17 * $$20 / $$21);
        $$18 = (int)((float)$$18 * $$20 / $$21);
        $$19 = (int)((float)$$19 * $$20 / $$21);
        int $$22 = bel.b(0, $$17, $$18, $$19);
        $$2.b(ki.R, new doj($$22));
        return $$2;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        if ($$2.a()) {
            $$1.accept(yh.a("item.color", new Object[]{String.format(Locale.ROOT, "#%06X", this.d)}).a(l.h));
        } else {
            $$1.accept(yh.c("item.dyed").a(l.h, l.u));
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{doj.class, "rgb", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{doj.class, "rgb", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{doj.class, "rgb", "d"}, this, $$0);
    }

    public int a() {
        return this.d;
    }
}

