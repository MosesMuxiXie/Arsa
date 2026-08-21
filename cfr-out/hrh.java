/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class hrh
implements bba {
    private Map<eld<?>, hri<?, ?>> a = ImmutableMap.of();
    private final gio b;
    private final Supplier<hdc> c;
    private ftm d;
    private final hpw e;
    private final ihk f;
    private final hxp g;
    private final hwo h;
    private final inu i;
    private final hou j;

    public hrh(gio $$0, Supplier<hdc> $$1, hpw $$2, ihk $$3, hxp $$4, hwo $$5, inu $$6, hou $$7) {
        this.g = $$4;
        this.f = $$3;
        this.h = $$5;
        this.b = $$0;
        this.c = $$1;
        this.e = $$2;
        this.i = $$6;
        this.j = $$7;
    }

    public <E extends elb, S extends hsm> @Nullable hri<E, S> a(E $$0) {
        return this.a.get($$0.s());
    }

    public <E extends elb, S extends hsm> @Nullable hri<E, S> a(S $$0) {
        return this.a.get($$0.h);
    }

    public void a(ger $$0) {
        this.d = $$0.b();
    }

    public <E extends elb, S extends hsm> @Nullable S a(E $$0, float $$1, @Nullable igi.a $$2) {
        hri<E, E> $$3 = this.a((S)((Object)$$0));
        if ($$3 == null) {
            return null;
        }
        if (!$$0.n() || !$$0.s().a($$0.o())) {
            return null;
        }
        if (!$$3.a($$0, this.d)) {
            return null;
        }
        ftm $$4 = this.d;
        E $$5 = $$3.e();
        $$3.a($$0, $$5, $$1, $$4, $$2);
        return (S)$$5;
    }

    public <S extends hsm> void a(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        hri $$4 = this.a($$0);
        if ($$4 == null) {
            return;
        }
        try {
            $$4.a($$0, $$1, $$2, $$3);
        }
        catch (Throwable $$5) {
            m $$6 = m.a($$5, "Rendering Block Entity");
            n $$7 = $$6.a("Block Entity Details");
            $$0.a($$7);
            throw new v($$6);
        }
    }

    @Override
    public void a(baz $$0) {
        hrj.a $$1 = new hrj.a(this, this.e, this.f, this.g, this.h, this.c.get(), this.b, this.i, this.j);
        this.a = hrk.a($$1);
    }
}

