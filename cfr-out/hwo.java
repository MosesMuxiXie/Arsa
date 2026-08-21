/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

public class hwo
implements bba {
    private Map<cgu<?>, hwp<?, ?>> e = ImmutableMap.of();
    private Map<ddp, icd<hne>> f = Map.of();
    private Map<ddp, icd<gij>> g = Map.of();
    public final ilr a;
    public @Nullable ger b;
    public cgk c;
    private final ihk h;
    private final hok i;
    private final hpw j;
    private final hof k;
    private final inl l;
    private final gio m;
    public final gfo d;
    private final Supplier<hdc> n;
    private final inq o;
    private final hou p;

    public <E extends cgk> int a(E $$0, float $$1) {
        return this.a((idf)((Object)$$0)).a($$0, $$1);
    }

    public hwo(gfj $$0, ilr $$1, ihk $$2, hok $$3, hpw $$4, inl $$5, gio $$6, gfo $$7, Supplier<hdc> $$8, inq $$9, hou $$10) {
        this.a = $$1;
        this.h = $$2;
        this.i = $$3;
        this.l = $$5;
        this.p = $$10;
        this.k = new hof($$0, this, $$2);
        this.j = $$4;
        this.m = $$6;
        this.d = $$7;
        this.n = $$8;
        this.o = $$9;
    }

    public <T extends cgk> hwp<? super T, ?> a(T $$0) {
        T t2 = $$0;
        Objects.requireNonNull(t2);
        T t3 = t2;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{hne.class, gij.class}, t3, n2)) {
            case 0 -> {
                hne $$1 = (hne)t3;
                yield this.a(this.f, $$1);
            }
            case 1 -> {
                gij $$2 = (gij)t3;
                yield this.a(this.g, $$2);
            }
            default -> this.e.get($$0.ay());
        };
    }

    public icd<hne> a(hne $$0) {
        return this.a(this.f, $$0);
    }

    private <T extends cgc> icd<T> a(Map<ddp, icd<T>> $$0, T $$1) {
        ddp $$2 = ((gih)((Object)$$1)).c().d();
        icd<T> $$3 = $$0.get($$2);
        if ($$3 != null) {
            return $$3;
        }
        return $$0.get(ddp.b);
    }

    public <S extends idf> hwp<?, ? super S> a(S $$0) {
        if ($$0 instanceof ick) {
            ick $$1 = (ick)$$0;
            ddp $$2 = $$1.a.d();
            hwp $$3 = this.f.get($$2);
            if ($$3 != null) {
                return $$3;
            }
            return this.f.get(ddp.b);
        }
        return this.e.get($$0.H);
    }

    public void a(ger $$0, cgk $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public <E extends cgk> boolean a(E $$0, htx $$1, double $$2, double $$3, double $$4) {
        hwp<?, E> $$5 = this.a((idf)((Object)$$0));
        return $$5.a($$0, $$1, $$2, $$3, $$4);
    }

    public <E extends cgk> idf b(E $$0, float $$1) {
        hwp<?, E> $$2 = this.a((idf)((Object)$$0));
        try {
            return $$2.b($$0, $$1);
        }
        catch (Throwable $$3) {
            m $$4 = m.a($$3, "Extracting render state for an entity in world");
            n $$5 = $$4.a("Entity being extracted");
            $$0.a($$5);
            n $$6 = this.a($$2, $$4);
            $$6.a("Delta", Float.valueOf($$1));
            throw new v($$4);
        }
    }

    public <S extends idf> void a(S $$0, ikp $$1, double $$2, double $$3, double $$4, fzm $$5, hpo $$6) {
        hwp<?, S> $$7 = this.a($$0);
        try {
            ftm $$8 = $$7.a($$0);
            double $$9 = $$2 + $$8.a();
            double $$10 = $$3 + $$8.b();
            double $$11 = $$4 + $$8.c();
            $$5.a();
            $$5.a($$9, $$10, $$11);
            $$7.a($$0, $$5, $$6, $$1);
            if ($$0.S) {
                $$6.a($$5, $$0, bgj.a(bgj.h, $$1.e, new Quaternionf()));
            }
            if ($$0 instanceof ick) {
                $$5.a(-$$8.a(), -$$8.b(), -$$8.c());
            }
            if (!$$0.aa.isEmpty()) {
                $$6.a($$5, $$0.Z, $$0.aa);
            }
            if (!($$0 instanceof ick)) {
                $$5.a(-$$8.a(), -$$8.b(), -$$8.c());
            }
            $$5.b();
        }
        catch (Throwable $$12) {
            m $$13 = m.a($$12, "Rendering entity in world");
            n $$14 = $$13.a("EntityRenderState being rendered");
            $$0.a($$14);
            this.a($$7, $$13);
            throw new v($$13);
        }
    }

    private <S extends idf> n a(hwp<?, S> $$0, m $$1) {
        n $$2 = $$1.a("Renderer details");
        $$2.a("Assigned renderer", $$0);
        return $$2;
    }

    public void a() {
        this.b = null;
    }

    public double b(cgk $$0) {
        return this.b.b().g($$0.dI());
    }

    public hof b() {
        return this.k;
    }

    @Override
    public void a(baz $$0) {
        hwq.a $$1 = new hwq.a(this, this.h, this.i, this.j, $$0, this.n.get(), this.o, this.l, this.m, this.p);
        this.e = hwr.a($$1);
        this.f = hwr.b($$1);
        this.g = hwr.b($$1);
    }
}

