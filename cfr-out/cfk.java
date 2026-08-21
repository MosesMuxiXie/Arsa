/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class cfk
implements dgw {
    public static final Codec<jd<cfk>> a = mi.d.r();
    public static final aao<xq, jd<cfk>> b = aam.b(mj.ae);
    private static final int c = bgj.b(38.25f);
    private final Map<jd<cin>, a> d = new Object2ObjectOpenHashMap();
    private final cfl e;
    private final int f;
    private final Function<cfm, lw> g;
    private @Nullable String h;
    private int i;
    private int j;
    private int k;
    private Optional<bcz> l = Optional.empty();
    private dgz m = dhb.g;

    protected cfk(cfl $$0, int $$12) {
        this.e = $$0;
        this.f = $$12;
        this.g = $$1 -> {
            int $$2 = $$1.f() ? c : 255;
            return lq.a(ly.v, bel.f($$2, $$12));
        };
    }

    protected cfk(cfl $$0, int $$12, lw $$2) {
        this.e = $$0;
        this.f = $$12;
        this.g = $$1 -> $$2;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }

    public int d() {
        return this.k;
    }

    public boolean a(axf $$0, chl $$1, int $$2) {
        return true;
    }

    public void a(axf $$0, @Nullable cgk $$1, @Nullable cgk $$2, chl $$3, int $$4, double $$5) {
        this.a($$0, $$3, $$4);
    }

    public boolean a(int $$0, int $$1) {
        return false;
    }

    public void a(chl $$0, int $$1) {
    }

    public void b(chl $$0, int $$12) {
        this.l.ifPresent($$1 -> $$0.ao().a(null, $$0.dP(), $$0.dR(), $$0.dV(), (bcz)$$1, $$0.dB(), 1.0f, 1.0f));
    }

    public void a(axf $$0, chl $$1, int $$2, cgk.e $$3) {
    }

    public void a(axf $$0, chl $$1, int $$2, cex $$3, float $$4) {
    }

    public boolean a() {
        return false;
    }

    protected String e() {
        if (this.h == null) {
            this.h = bhs.a("effect", mi.d.b(this));
        }
        return this.h;
    }

    public String f() {
        return this.e();
    }

    public yh g() {
        return yh.c(this.f());
    }

    public cfl h() {
        return this.e;
    }

    public int i() {
        return this.f;
    }

    public cfk a(jd<cin> $$0, amo $$1, double $$2, ciq.a $$3) {
        this.d.put($$0, new a($$1, $$2, $$3));
        return this;
    }

    public cfk a(int $$0) {
        return this.a($$0, $$0, $$0);
    }

    public cfk a(int $$0, int $$1, int $$2) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        return this;
    }

    public void a(int $$0, BiConsumer<jd<cin>, ciq> $$1) {
        this.d.forEach(($$2, $$3) -> $$1.accept((jd<cin>)$$2, $$3.a($$0)));
    }

    public void a(cip $$0) {
        for (Map.Entry<jd<cin>, a> $$1 : this.d.entrySet()) {
            cio $$2 = $$0.a($$1.getKey());
            if ($$2 == null) continue;
            $$2.c($$1.getValue().a());
        }
    }

    public void a(cip $$0, int $$1) {
        for (Map.Entry<jd<cin>, a> $$2 : this.d.entrySet()) {
            cio $$3 = $$0.a($$2.getKey());
            if ($$3 == null) continue;
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
        }
    }

    public boolean j() {
        return this.e == cfl.a;
    }

    public lw a(cfm $$0) {
        return this.g.apply($$0);
    }

    public cfk a(bcz $$0) {
        this.l = Optional.of($$0);
        return this;
    }

    public cfk a(dgx ... $$0) {
        this.m = dhb.e.a($$0);
        return this;
    }

    @Override
    public dgz k() {
        return this.m;
    }

    record a(amo a, double b, ciq.a c) {
        public ciq a(int $$0) {
            return new ciq(this.a, this.b * (double)($$0 + 1), this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;amount;operation", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;amount;operation", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;amount;operation", "a", "b", "c"}, this, $$0);
        }
    }
}

