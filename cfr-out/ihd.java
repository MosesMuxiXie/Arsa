/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ihd
implements ihj {
    private static final Function<dlt, ijs> a = $$0 -> hpj.j();
    private static final Function<dlt, ijs> b = $$0 -> {
        dkb $$2;
        hth $$3;
        dlp $$1 = $$0.h();
        if ($$1 instanceof dkb && ($$3 = hoe.a(($$2 = (dkb)$$1).c().m())) != hth.c) {
            return hpj.i();
        }
        return hpj.k();
    };
    private final List<ggz> c;
    private final List<hqa> d;
    private final Supplier<Vector3fc[]> e;
    private final iho f;
    private final boolean g;
    private final Function<dlt, ijs> h;

    ihd(List<ggz> $$0, List<hqa> $$1, iho $$2, Function<dlt, ijs> $$3) {
        this.c = $$0;
        this.d = $$1;
        this.f = $$2;
        this.h = $$3;
        this.e = Suppliers.memoize(() -> ihd.a(this.d));
        boolean $$4 = false;
        for (hqa $$5 : $$1) {
            if (!$$5.l().e().a()) continue;
            $$4 = true;
            break;
        }
        this.g = $$4;
    }

    public static Vector3fc[] a(List<hqa> $$0) {
        HashSet<Vector3fc> $$1 = new HashSet<Vector3fc>();
        for (hqa $$2 : $$0) {
            for (int $$3 = 0; $$3 < 4; ++$$3) {
                $$1.add($$2.a($$3));
            }
        }
        return (Vector3fc[])$$1.toArray(Vector3fc[]::new);
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        ihm.b $$7 = $$0.a();
        if ($$1.C()) {
            ihm.a $$8 = ihd.a($$1) ? ihm.a.c : ihm.a.b;
            $$7.a($$8);
            $$0.c();
            $$0.a((Object)$$8);
        }
        int $$9 = this.c.size();
        int[] $$10 = $$7.a($$9);
        for (int $$11 = 0; $$11 < $$9; ++$$11) {
            int $$12;
            $$10[$$11] = $$12 = this.c.get($$11).a($$1, $$4, $$5 == null ? null : $$5.et());
            $$0.a((Object)$$12);
        }
        $$7.a(this.e);
        $$7.a(this.h.apply($$1));
        this.f.a($$7, $$3);
        $$7.b().addAll(this.d);
        if (this.g) {
            $$0.c();
        }
    }

    static Function<dlt, ijs> b(List<hqa> $$0) {
        Iterator<hqa> $$1 = $$0.iterator();
        if (!$$1.hasNext()) {
            return a;
        }
        amo $$2 = $$1.next().l().h();
        while ($$1.hasNext()) {
            hqa $$3 = $$1.next();
            amo $$4 = $$3.l().h();
            if ($$4.equals($$2)) continue;
            throw new IllegalStateException("Multiple atlases used in model, expected " + String.valueOf($$2) + ", but also got " + String.valueOf($$4));
        }
        if ($$2.equals(ilo.e)) {
            return a;
        }
        if ($$2.equals(ilo.d)) {
            return b;
        }
        throw new IllegalArgumentException("Atlas " + String.valueOf($$2) + " can't be usef for item models");
    }

    private static boolean a(dlt $$0) {
        return $$0.a(bdy.bO) || $$0.a(dlx.ta);
    }

    public record a(amo b, List<ggz> c) implements ihj.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("model").forGetter(a::b), (App)gha.a.listOf().optionalFieldOf("tints", List.of()).forGetter(a::c)).apply((Applicative)$$0, a::new));

        @Override
        public void a(ioe.a $$0) {
            $$0.markDependency(this.b);
        }

        @Override
        public ihj a(ihj.a $$0) {
            inw $$1 = $$0.a();
            iof $$2 = $$1.a(this.b);
            hqp $$3 = $$2.g();
            List<hqa> $$4 = $$2.a($$3, $$1, inm.a).a();
            iho $$5 = iho.a($$1, $$2, $$3);
            Function<dlt, ijs> $$6 = ihd.b($$4);
            return new ihd(this.c, $$4, $$5, $$6);
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "model;tints", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "model;tints", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "model;tints", "b", "c"}, this, $$0);
        }
    }
}

