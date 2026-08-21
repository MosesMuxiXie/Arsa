/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hrg
implements hri<ekz, hsl> {
    public static final ins a = hpj.o.a("bell/bell_body");
    private final inu b;
    private final hgl c;

    public hrg(hrj.a $$0) {
        this.b = $$0.h();
        this.c = new hgl($$0.a(hdf.y));
    }

    public hsl a() {
        return new hsl();
    }

    @Override
    public void a(ekz $$0, hsl $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.b = (float)$$0.a + $$2;
        $$1.a = $$0.b ? $$0.c : null;
    }

    @Override
    public void a(hsl $$0, fzm $$1, hpo $$2, ikp $$3) {
        hgl.a $$4 = new hgl.a($$0.b, $$0.a);
        this.c.a($$4);
        ijs $$5 = a.a(ijt::d);
        $$2.a(this.c, $$4, $$1, $$5, $$0.i, ilg.d, -1, this.b.a(a), 0, $$0.j);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

