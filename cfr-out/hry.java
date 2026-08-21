/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hry
implements hri<emr, hta> {
    private final inu a;
    private final a b;

    public hry(hrj.a $$0) {
        this($$0.f(), $$0.h());
    }

    public hry(iki.a $$0) {
        this($$0.b(), $$0.c());
    }

    public hry(hdc $$0, inu $$1) {
        this.a = $$1;
        this.b = new a($$0.a(hdf.df));
    }

    public hta a() {
        return new hta();
    }

    @Override
    public void a(emr $$0, hta $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a = $$0.o().a(ehd.c, iz.b);
        $$1.b = $$0.w();
        $$1.c = $$0.a($$2);
    }

    @Override
    public void a(hta $$0, fzm $$1, hpo $$2, ikp $$3) {
        ins $$6;
        dkr $$4 = $$0.b;
        if ($$4 == null) {
            ins $$5 = hpj.x;
        } else {
            $$6 = hpj.d($$4);
        }
        this.a($$1, $$2, $$0.i, ilg.d, $$0.a, $$0.c, $$0.j, $$6, 0);
    }

    public void a(fzm $$0, hpo $$1, int $$2, int $$3, iz $$4, float $$5, @Nullable igi.a $$6, ins $$7, int $$8) {
        $$0.a();
        this.a($$0, $$4, $$5);
        $$1.a(this.b, Float.valueOf($$5), $$0, $$7.a(this.b::a), $$2, $$3, -1, this.a.a($$7), $$8, $$6);
        $$0.b();
    }

    private void a(fzm $$0, iz $$1, float $$2) {
        $$0.a(0.5f, 0.5f, 0.5f);
        float $$3 = 0.9995f;
        $$0.b(0.9995f, 0.9995f, 0.9995f);
        $$0.a((Quaternionfc)$$1.b());
        $$0.b(1.0f, -1.0f, -1.0f);
        $$0.a(0.0f, -1.0f, 0.0f);
        this.b.a(Float.valueOf($$2));
    }

    public void a(iz $$0, float $$1, Consumer<Vector3fc> $$2) {
        fzm $$3 = new fzm();
        this.a($$3, $$0, $$1);
        this.b.b().a($$3, $$2);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }

    static class a
    extends gzp<Float> {
        private final hdg a;

        public a(hdg $$0) {
            super($$0, ijt::g);
            this.a = $$0.b("lid");
        }

        @Override
        public void a(Float $$0) {
            super.a($$0);
            this.a.a(0.0f, 24.0f - $$0.floatValue() * 0.5f * 16.0f, 0.0f);
            this.a.f = 270.0f * $$0.floatValue() * ((float)Math.PI / 180);
        }
    }
}

