/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class eey
extends dzq
implements ehg {
    public static final MapCodec<eey> b = eey.b(eey::new);
    public static final eoy c = eox.I;
    private static final Map<iz, eoy> a = efm.h;
    protected static final iz[] d = iz.values();
    private final Function<eoh, fug> e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    protected MapCodec<? extends eey> a() {
        return b;
    }

    public eey(eog.d $$0) {
        super($$0);
        this.l(eey.a(this.C));
        this.e = this.q();
        this.f = iz.c.a.a().allMatch(this::a);
        this.g = iz.c.a.a().filter(iz.a.a).filter(this::a).count() % 2L == 0L;
        this.h = iz.c.a.a().filter(iz.a.c).filter(this::a).count() % 2L == 0L;
    }

    private Function<eoh, fug> q() {
        Map<iz, fug> $$0 = fud.d(dzq.c(16.0, 0.0, 1.0));
        return this.a((eoh $$1) -> {
            fug $$2 = fud.a();
            for (iz $$3 : d) {
                if (!eey.a($$1, $$3)) continue;
                $$2 = fud.a($$2, (fug)$$0.get($$3));
            }
            return $$2.c() ? fud.b() : $$2;
        }, c);
    }

    public static Set<iz> p(eoh $$0) {
        if (!($$0.b() instanceof eey)) {
            return Set.of();
        }
        EnumSet<iz> $$1 = EnumSet.noneOf(iz.class);
        for (iz $$2 : iz.values()) {
            if (!eey.a($$0, $$2)) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public static Set<iz> a(byte $$0) {
        EnumSet<iz> $$1 = EnumSet.noneOf(iz.class);
        for (iz $$2 : iz.values()) {
            if (($$0 & (byte)(1 << $$2.ordinal())) <= 0) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public static byte a(Collection<iz> $$0) {
        byte $$1 = 0;
        for (iz $$2 : $$0) {
            $$1 = (byte)($$1 | 1 << $$2.ordinal());
        }
        return $$1;
    }

    protected boolean a(iz $$0) {
        return true;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        for (iz $$1 : d) {
            if (!this.a($$1)) continue;
            $$0.a(new epk[]{eey.b($$1)});
        }
        $$0.a(new epk[]{c});
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if (!eey.r($$0)) {
            return dzs.a.m();
        }
        if (!eey.a($$0, $$4) || eey.a($$1, $$4, $$5, $$6)) {
            return $$0;
        }
        return eey.a($$0, eey.b($$4));
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.e.apply($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        boolean $$3 = false;
        for (iz $$4 : d) {
            if (!eey.a($$0, $$4)) continue;
            if (!eey.a((dvt)$$1, $$2, $$4)) {
                return false;
            }
            $$3 = true;
        }
        return $$3;
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        return !$$1.n().a(this.h()) || eey.s($$0);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        eoh $$32 = $$1.a_($$2);
        return Arrays.stream($$0.f()).map($$3 -> this.c($$32, (dvt)$$1, $$2, (iz)$$3)).filter(Objects::nonNull).findFirst().orElse(null);
    }

    public boolean a(dvt $$0, eoh $$1, is $$2, iz $$3) {
        if (!this.a($$3) || $$1.a(this) && eey.a($$1, $$3)) {
            return false;
        }
        is $$4 = $$2.a($$3);
        return eey.a($$0, $$3, $$4, $$0.a_($$4));
    }

    public @Nullable eoh c(eoh $$0, dvt $$1, is $$2, iz $$3) {
        eoh $$6;
        if (!this.a($$1, $$0, $$2, $$3)) {
            return null;
        }
        if ($$0.a(this)) {
            eoh $$4 = $$0;
        } else if ($$0.y().a(flc.c)) {
            eoh $$5 = (eoh)this.m().b(eox.I, true);
        } else {
            $$6 = this.m();
        }
        return (eoh)$$6.b(eey.b($$3), true);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        if (!this.f) {
            return $$0;
        }
        return this.a($$0, $$1::a);
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        if ($$1 == eev.c && !this.g) {
            return $$0;
        }
        if ($$1 == eev.b && !this.h) {
            return $$0;
        }
        return this.a($$0, $$1::b);
    }

    private eoh a(eoh $$0, Function<iz, iz> $$1) {
        eoh $$2 = $$0;
        for (iz $$3 : d) {
            if (!this.a($$3)) continue;
            $$2 = (eoh)$$2.b(eey.b($$1.apply($$3)), $$0.c(eey.b($$3)));
        }
        return $$2;
    }

    public static boolean a(eoh $$0, iz $$1) {
        eoy $$2 = eey.b($$1);
        return $$0.a($$2, false);
    }

    public static boolean a(dvt $$0, is $$1, iz $$2) {
        is $$3 = $$1.a($$2);
        eoh $$4 = $$0.a_($$3);
        return eey.a($$0, $$2, $$3, $$4);
    }

    public static boolean a(dvt $$0, iz $$1, is $$2, eoh $$3) {
        return dzq.a($$3.h($$0, $$2), $$1.g()) || dzq.a($$3.g($$0, $$2), $$1.g());
    }

    private static eoh a(eoh $$0, eoy $$1) {
        eoh $$2 = (eoh)$$0.b($$1, false);
        if (eey.r($$2)) {
            return $$2;
        }
        return dzs.a.m();
    }

    public static eoy b(iz $$0) {
        return a.get($$0);
    }

    private static eoh a(eoi<dzq, eoh> $$0) {
        eoh $$1 = (eoh)$$0.b().b(c, false);
        for (eoy $$2 : a.values()) {
            $$1 = (eoh)$$1.c($$2, false);
        }
        return $$1;
    }

    protected static boolean r(eoh $$0) {
        for (iz $$1 : d) {
            if (!eey.a($$0, $$1)) continue;
            return true;
        }
        return false;
    }

    private static boolean s(eoh $$0) {
        for (iz $$1 : d) {
            if (eey.a($$0, $$1)) continue;
            return true;
        }
        return false;
    }
}

