/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class hpw
implements bba {
    private final hpv a;
    private final inu b;
    private final hpy c;
    private @Nullable hpx d;
    private final bgr e = bgr.a();
    private final List<hqg> f = new ArrayList<hqg>();
    private final ggr g;

    public hpw(hpv $$0, inu $$1, ggr $$2) {
        this.a = $$0;
        this.b = $$1;
        this.g = $$2;
        this.c = new hpy(this.g);
    }

    public hpv a() {
        return this.a;
    }

    public void a(eoh $$0, is $$1, dvq $$2, fzm $$3, fzp $$4) {
        if ($$0.o() != egf.b) {
            return;
        }
        hqh $$5 = this.a.b($$0);
        this.e.b($$0.b($$1));
        this.f.clear();
        $$5.a(this.e, this.f);
        this.c.a($$2, this.f, $$0, $$1, $$3, $$4, true, ilg.d);
    }

    public void a(eoh $$0, is $$1, dvq $$2, fzm $$3, fzp $$4, boolean $$5, List<hqg> $$6) {
        try {
            this.c.a($$2, $$6, $$0, $$1, $$3, $$4, $$5, ilg.d);
        }
        catch (Throwable $$7) {
            m $$8 = m.a($$7, "Tesselating block in world");
            n $$9 = $$8.a("Block being tesselated");
            n.a($$9, $$2, $$1, $$0);
            throw new v($$8);
        }
    }

    public void a(is $$0, dvq $$1, fzp $$2, eoh $$3, flb $$4) {
        try {
            Objects.requireNonNull(this.d).a($$1, $$0, $$2, $$3, $$4);
        }
        catch (Throwable $$5) {
            m $$6 = m.a($$5, "Tesselating liquid in world");
            n $$7 = $$6.a("Block being tesselated");
            n.a($$7, $$1, $$0, $$3);
            throw new v($$6);
        }
    }

    public hpy b() {
        return this.c;
    }

    public hqh a(eoh $$0) {
        return this.a.b($$0);
    }

    public void a(eoh $$0, fzm $$1, hon $$2, int $$3, int $$4) {
        egf $$5 = $$0.o();
        if ($$5 == egf.a) {
            return;
        }
        hqh $$6 = this.a($$0);
        int $$7 = this.g.a($$0, null, null, 0);
        float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0f;
        float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0f;
        float $$10 = (float)($$7 & 0xFF) / 255.0f;
        hpy.a($$1.c(), $$2.a(hoe.c($$0)), $$6, $$8, $$9, $$10, $$3, $$4);
    }

    @Override
    public void a(baz $$0) {
        this.d = new hpx(this.b);
    }
}

