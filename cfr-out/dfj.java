/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class dfj
extends fmn {
    private static final String d = "raids";
    public static final Codec<dfj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dfj$a.a.listOf().optionalFieldOf(d, List.of()).forGetter($$0 -> $$0.e.int2ObjectEntrySet().stream().map(a::a).toList()), (App)Codec.INT.fieldOf("next_id").forGetter($$0 -> $$0.f), (App)Codec.INT.fieldOf("tick").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dfj::new));
    public static final fmo<dfj> b = new fmo<dfj>("raids", dfj::new, a, bhz.m);
    public static final fmo<dfj> c = new fmo<dfj>("raids_end", dfj::new, a, bhz.m);
    private final Int2ObjectMap<dfh> e = new Int2ObjectOpenHashMap();
    private int f = 1;
    private int g;

    public static fmo<dfj> a(jd<esh> $$0) {
        if ($$0.a(esf.c)) {
            return c;
        }
        return b;
    }

    public dfj() {
        this.u();
    }

    private dfj(List<a> $$0, int $$1, int $$2) {
        for (a $$3 : $$0) {
            this.e.put($$3.b, (Object)$$3.c);
        }
        this.f = $$1;
        this.g = $$2;
    }

    public @Nullable dfh a(int $$0) {
        return (dfh)this.e.get($$0);
    }

    public OptionalInt a(dfh $$0) {
        for (Int2ObjectMap.Entry $$1 : this.e.int2ObjectEntrySet()) {
            if ($$1.getValue() != $$0) continue;
            return OptionalInt.of($$1.getIntKey());
        }
        return OptionalInt.empty();
    }

    public void a(axf $$0) {
        ++this.g;
        ObjectIterator $$1 = this.e.values().iterator();
        while ($$1.hasNext()) {
            dfh $$2 = (dfh)$$1.next();
            if (!$$0.U().a(eua.N).booleanValue()) {
                $$2.m();
            }
            if ($$2.d()) {
                $$1.remove();
                this.u();
                continue;
            }
            $$2.a($$0);
        }
        if (this.g % 200 == 0) {
            this.u();
        }
    }

    public static boolean a(dfi $$0) {
        return $$0.cb() && $$0.hd() && $$0.eP() <= 2400;
    }

    public @Nullable dfh a(axg $$02, is $$1) {
        is $$9;
        if ($$02.au()) {
            return null;
        }
        axf $$2 = $$02.A();
        if (!$$2.U().a(eua.N).booleanValue()) {
            return null;
        }
        if (!$$2.c().a(ceg.A, $$1).booleanValue()) {
            return null;
        }
        List<csy> $$3 = $$2.F().c($$0 -> $$0.a(bea.b), $$1, 64, csx.b.b).toList();
        int $$4 = 0;
        ftm $$5 = ftm.c;
        for (csy $$6 : $$3) {
            is $$7 = $$6.g();
            $$5 = $$5.b($$7.u(), $$7.v(), $$7.w());
            ++$$4;
        }
        if ($$4 > 0) {
            $$5 = $$5.c(1.0 / (double)$$4);
            is $$8 = is.a($$5);
        } else {
            $$9 = $$1;
        }
        dfh $$10 = this.a($$2, $$9);
        if (!$$10.i() && !this.e.containsValue((Object)$$10)) {
            this.e.put(this.b(), (Object)$$10);
        }
        if (!$$10.i() || $$10.l() < $$10.k()) {
            $$10.a($$02);
        }
        this.u();
        return $$10;
    }

    private dfh a(axf $$0, is $$1) {
        dfh $$2 = $$0.f($$1);
        return $$2 != null ? $$2 : new dfh($$1, $$0.av());
    }

    public static dfj a(uz $$0) {
        return a.parse((DynamicOps)vn.a, (Object)$$0).resultOrPartial().orElseGet(dfj::new);
    }

    private int b() {
        return ++this.f;
    }

    public @Nullable dfh a(is $$0, int $$1) {
        dfh $$2 = null;
        double $$3 = $$1;
        for (dfh $$4 : this.e.values()) {
            double $$5 = $$4.q().j($$0);
            if (!$$4.r() || !($$5 < $$3)) continue;
            $$2 = $$4;
            $$3 = $$5;
        }
        return $$2;
    }

    @bht
    public List<is> a(dvu $$0) {
        return this.e.values().stream().map(dfh::q).filter($$0::b).toList();
    }

    static final class a
    extends Record {
        final int b;
        final dfh c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.fieldOf("id").forGetter(a::a), (App)dfh.b.forGetter(a::b)).apply((Applicative)$$0, a::new));

        private a(int $$0, dfh $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static a a(Int2ObjectMap.Entry<dfh> $$0) {
            return new a($$0.getIntKey(), (dfh)$$0.getValue());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;raid", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;raid", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;raid", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public dfh b() {
            return this.c;
        }
    }
}

