/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class ggr {
    private static final int c = -1;
    public static final int a = -14647248;
    public static final int b = -9321636;
    private final jj<ggq> d = new jj(32);
    private final Map<dzq, Set<epk<?>>> e = Maps.newHashMap();

    public static ggr a() {
        ggr $$02 = new ggr();
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return dwm.a();
            }
            return hns.a($$1, $$0.c(ecb.b) == epd.a ? $$2.e() : $$2);
        }, dzs.jA, dzs.jz);
        $$02.a(ecb.b, dzs.jA, dzs.jz);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return dwm.a();
            }
            return hns.a($$1, $$2);
        }, dzs.i, dzs.bB, dzs.bA, dzs.gR, dzs.bD);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$3 != 0) {
                if ($$1 == null || $$2 == null) {
                    return dwm.a();
                }
                return hns.a($$1, $$2);
            }
            return -1;
        }, dzs.tY, dzs.tZ);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> -10380959, dzs.aL);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> -8345771, dzs.aM);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -12012264;
            }
            return hns.b($$1, $$2);
        }, dzs.aK, dzs.aN, dzs.aO, dzs.aQ, dzs.fN, dzs.aS);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -10732494;
            }
            return hns.c($$1, $$2);
        }, dzs.ua);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -1;
            }
            return hns.d($$1, $$2);
        }, dzs.J, dzs.oa, dzs.gj);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> egb.b($$0.c(egb.f)), dzs.cT);
        $$02.a(egb.f, dzs.cT);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -1;
            }
            return hns.a($$1, $$2);
        }, dzs.ev);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> -2046180, dzs.fK, dzs.fJ);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            int $$4 = $$0.c(eib.c);
            return bel.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
        }, dzs.fM, dzs.fL);
        $$02.a(eib.c, dzs.fM, dzs.fL);
        $$02.a((eoh $$0, dvq $$1, is $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -9321636;
            }
            return -14647248;
        }, dzs.fV);
        return $$02;
    }

    public int a(eoh $$0, dwo $$1, is $$2) {
        ggq $$3 = this.d.a(mi.e.a($$0.b()));
        if ($$3 != null) {
            return $$3.getColor($$0, null, null, 0);
        }
        flf $$4 = $$0.a((dvt)$$1, $$2);
        return $$4 != null ? $$4.ak : -1;
    }

    public int a(eoh $$0, @Nullable dvq $$1, @Nullable is $$2, int $$3) {
        ggq $$4 = this.d.a(mi.e.a($$0.b()));
        return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
    }

    public void a(ggq $$0, dzq ... $$1) {
        for (dzq $$2 : $$1) {
            this.d.a($$0, mi.e.a($$2));
        }
    }

    private void a(Set<epk<?>> $$0, dzq ... $$1) {
        for (dzq $$2 : $$1) {
            this.e.put($$2, $$0);
        }
    }

    private void a(epk<?> $$0, dzq ... $$1) {
        this.a((Set<epk<?>>)ImmutableSet.of($$0), $$1);
    }

    public Set<epk<?>> a(dzq $$0) {
        return (Set)this.e.getOrDefault($$0, (Set<epk<?>>)ImmutableSet.of());
    }
}

