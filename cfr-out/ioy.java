/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class ioy
implements iou {
    private static final int a = 40;
    private static final float b = 0.001f;
    private final hnh c;
    private final iqr d;
    private final bgr e;
    private final Object2ObjectArrayMap<jd<bcz>, a> f = new Object2ObjectArrayMap();
    private float g;
    private @Nullable jd<bcz> h;

    public ioy(hnh $$0, iqr $$1) {
        this.e = $$0.ao().G_();
        this.c = $$0;
        this.d = $$1;
    }

    public float b() {
        return this.g;
    }

    @Override
    public void a() {
        this.f.values().removeIf(iot::m);
        dwo $$0 = this.c.ao();
        cef $$12 = $$0.c();
        cdu $$22 = $$12.a(ceg.x, this.c.dI());
        jd $$3 = $$22.a().orElse(null);
        if (!Objects.equals($$3, this.h)) {
            this.h = $$3;
            this.f.values().forEach(a::o);
            if ($$3 != null) {
                this.f.compute((Object)$$3, ($$1, $$2) -> {
                    if ($$2 == null) {
                        $$2 = new a((bcz)$$3.a());
                        this.d.a((ipm)$$2);
                    }
                    $$2.p();
                    return $$2;
                });
            }
        }
        for (cdr $$4 : $$22.c()) {
            if (!(this.e.j() < $$4.b())) continue;
            this.d.a(iph.b($$4.a().a()));
        }
        $$22.b().ifPresent($$1 -> {
            int $$2 = $$1.c() * 2 + 1;
            is $$3 = is.a(this.c.dP() + (double)this.e.a($$2) - (double)$$1.c(), this.c.dT() + (double)this.e.a($$2) - (double)$$1.c(), this.c.dV() + (double)this.e.a($$2) - (double)$$1.c());
            int $$4 = $$0.a(dww.a, $$3);
            this.g = $$4 > 0 ? (this.g -= (float)$$4 / 15.0f * 0.001f) : (this.g -= (float)($$0.a(dww.b, $$3) - 1) / (float)$$1.b());
            if (this.g >= 1.0f) {
                double $$5 = (double)$$3.u() + 0.5;
                double $$6 = (double)$$3.v() + 0.5;
                double $$7 = (double)$$3.w() + 0.5;
                double $$8 = $$5 - this.c.dP();
                double $$9 = $$6 - this.c.dT();
                double $$10 = $$7 - this.c.dV();
                double $$11 = Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10);
                double $$12 = $$11 + $$1.d();
                iph $$13 = iph.a($$1.a().a(), this.e, this.c.dP() + $$8 / $$11 * $$12, this.c.dT() + $$9 / $$11 * $$12, this.c.dV() + $$10 / $$11 * $$12);
                this.d.a($$13);
                this.g = 0.0f;
            } else {
                this.g = Math.max(this.g, 0.0f);
            }
        });
    }

    public static class a
    extends iot {
        private int n;
        private int o;

        public a(bcz $$0) {
            super($$0, bdb.i, ipm.u());
            this.i = true;
            this.j = 0;
            this.d = 1.0f;
            this.l = true;
        }

        @Override
        public void q() {
            if (this.o < 0) {
                this.n();
            }
            this.o += this.n;
            this.d = bgj.a((float)this.o / 40.0f, 0.0f, 1.0f);
        }

        public void o() {
            this.o = Math.min(this.o, 40);
            this.n = -1;
        }

        public void p() {
            this.o = Math.max(0, this.o);
            this.n = 1;
        }
    }
}

