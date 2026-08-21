/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class enu {
    private static final Map<String, enu> l = new Object2ObjectArrayMap();
    public static final Codec<enu> a = Codec.stringResolver($$0 -> $$0.m, l::get);
    public static final enu b = new enu("oak", 0.1f, Optional.empty(), Optional.empty(), Optional.of(rx.g), Optional.of(rx.q), Optional.of(rx.F), Optional.of(rx.M));
    public static final enu c = new enu("spruce", 0.5f, Optional.of(rx.t), Optional.of(rx.u), Optional.of(rx.n), Optional.empty(), Optional.empty(), Optional.empty());
    public static final enu d = new enu("mangrove", 0.85f, Optional.empty(), Optional.empty(), Optional.of(rx.A), Optional.of(rx.B), Optional.empty(), Optional.empty());
    public static final enu e = new enu("azalea", Optional.empty(), Optional.of(rx.z), Optional.empty());
    public static final enu f = new enu("birch", Optional.empty(), Optional.of(rx.l), Optional.of(rx.J));
    public static final enu g = new enu("jungle", Optional.of(rx.s), Optional.of(rx.r), Optional.empty());
    public static final enu h = new enu("acacia", Optional.empty(), Optional.of(rx.m), Optional.empty());
    public static final enu i = new enu("cherry", Optional.empty(), Optional.of(rx.C), Optional.of(rx.O));
    public static final enu j = new enu("dark_oak", Optional.of(rx.h), Optional.empty(), Optional.empty());
    public static final enu k = new enu("pale_oak", Optional.of(rx.j), Optional.empty(), Optional.empty());
    private final String m;
    private final float n;
    private final Optional<amt<exi<?, ?>>> o;
    private final Optional<amt<exi<?, ?>>> p;
    private final Optional<amt<exi<?, ?>>> q;
    private final Optional<amt<exi<?, ?>>> r;
    private final Optional<amt<exi<?, ?>>> s;
    private final Optional<amt<exi<?, ?>>> t;

    public enu(String $$0, Optional<amt<exi<?, ?>>> $$1, Optional<amt<exi<?, ?>>> $$2, Optional<amt<exi<?, ?>>> $$3) {
        this($$0, 0.0f, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
    }

    public enu(String $$0, float $$1, Optional<amt<exi<?, ?>>> $$2, Optional<amt<exi<?, ?>>> $$3, Optional<amt<exi<?, ?>>> $$4, Optional<amt<exi<?, ?>>> $$5, Optional<amt<exi<?, ?>>> $$6, Optional<amt<exi<?, ?>>> $$7) {
        this.m = $$0;
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.t = $$7;
        l.put($$0, this);
    }

    private @Nullable amt<exi<?, ?>> a(bgr $$0, boolean $$1) {
        if ($$0.i() < this.n) {
            if ($$1 && this.t.isPresent()) {
                return this.t.get();
            }
            if (this.r.isPresent()) {
                return this.r.get();
            }
        }
        if ($$1 && this.s.isPresent()) {
            return this.s.get();
        }
        return this.q.orElse(null);
    }

    private @Nullable amt<exi<?, ?>> a(bgr $$0) {
        if (this.p.isPresent() && $$0.i() < this.n) {
            return this.p.get();
        }
        return this.o.orElse(null);
    }

    public boolean a(axf $$0, eqg $$1, is $$2, eoh $$3, bgr $$4) {
        amt<exi<?, ?>> $$11;
        jd $$6;
        amt<exi<?, ?>> $$5 = this.a($$4);
        if ($$5 != null && ($$6 = (jd)$$0.J_().f(mj.aY).a($$5).orElse(null)) != null) {
            for (int $$7 = 0; $$7 >= -1; --$$7) {
                for (int $$8 = 0; $$8 >= -1; --$$8) {
                    if (!enu.a($$3, $$0, $$2, $$7, $$8)) continue;
                    exi $$9 = (exi)$$6.a();
                    eoh $$10 = dzs.a.m();
                    $$0.a($$2.b($$7, 0, $$8), $$10, 260);
                    $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 260);
                    $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 260);
                    $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 260);
                    if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                    }
                    $$0.a($$2.b($$7, 0, $$8), $$3, 260);
                    $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 260);
                    $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 260);
                    $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 260);
                    return false;
                }
            }
        }
        if (($$11 = this.a($$4, this.a($$0, $$2))) == null) {
            return false;
        }
        jd $$12 = $$0.J_().f(mj.aY).a($$11).orElse(null);
        if ($$12 == null) {
            return false;
        }
        exi $$13 = (exi)$$12.a();
        eoh $$14 = $$0.b_($$2).g();
        $$0.a($$2, $$14, 260);
        if ($$13.a($$0, $$1, $$4, $$2)) {
            if ($$0.a_($$2) == $$14) {
                $$0.a($$2, $$3, $$14, 2);
            }
            return true;
        }
        $$0.a($$2, $$3, 260);
        return false;
    }

    private static boolean a(eoh $$0, dvt $$1, is $$2, int $$3, int $$4) {
        dzq $$5 = $$0.b();
        return $$1.a_($$2.b($$3, 0, $$4)).a($$5) && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5) && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5) && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
    }

    private boolean a(dwp $$0, is $$1) {
        for (is $$2 : is.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
            if (!$$0.a_($$2).a(bdp.Q)) continue;
            return true;
        }
        return false;
    }
}

