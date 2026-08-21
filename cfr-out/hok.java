/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.util.Objects;
import org.joml.Quaternionfc;

public class hok {
    private static final float c = -0.01f;
    private static final float d = -0.001f;
    public static final int a = 128;
    public static final int b = 128;
    private final ilo e;
    private final imn f;

    public hok(inl $$0, imn $$1) {
        this.e = $$0.a(ml.i);
        this.f = $$1;
    }

    public void a(ikr $$0, fzm $$12, hpo $$22, boolean $$32, int $$42) {
        $$22.a($$12, ijt.u($$0.a), (fzm.a $$1, fzp $$2) -> {
            $$2.a($$1, 0.0f, 128.0f, -0.01f).a(-1).a(0.0f, 1.0f).c($$42);
            $$2.a($$1, 128.0f, 128.0f, -0.01f).a(-1).a(1.0f, 1.0f).c($$42);
            $$2.a($$1, 128.0f, 0.0f, -0.01f).a(-1).a(1.0f, 0.0f).c($$42);
            $$2.a($$1, 0.0f, 0.0f, -0.01f).a(-1).a(0.0f, 0.0f).c($$42);
        });
        int $$5 = 0;
        for (ikr.a $$6 : $$0.b) {
            if ($$32 && !$$6.e) continue;
            $$12.a();
            $$12.a((float)$$6.b / 2.0f + 64.0f, (float)$$6.c / 2.0f + 64.0f, -0.02f);
            $$12.a((Quaternionfc)a.f.rotationDegrees((float)($$6.d * 360) / 16.0f));
            $$12.b(4.0f, 4.0f, 3.0f);
            $$12.a(-0.125f, 0.125f, 0.0f);
            ilp $$7 = $$6.a;
            if ($$7 != null) {
                float $$8 = (float)$$5 * -0.001f;
                $$22.a($$12, ijt.u($$7.h()), (fzm.a $$3, fzp $$4) -> {
                    $$4.a($$3, -1.0f, 1.0f, $$8).a(-1).a($$7.c(), $$7.f()).c($$42);
                    $$4.a($$3, 1.0f, 1.0f, $$8).a(-1).a($$7.d(), $$7.f()).c($$42);
                    $$4.a($$3, 1.0f, -1.0f, $$8).a(-1).a($$7.d(), $$7.g()).c($$42);
                    $$4.a($$3, -1.0f, -1.0f, $$8).a(-1).a($$7.c(), $$7.g()).c($$42);
                });
                $$12.b();
            }
            if ($$6.f != null) {
                gio $$9 = gfj.V().g;
                float $$10 = $$9.a($$6.f);
                float f2 = 25.0f / $$10;
                Objects.requireNonNull($$9);
                float $$11 = bgj.a(f2, 0.0f, 6.0f / 9.0f);
                $$12.a();
                $$12.a((float)$$6.b / 2.0f + 64.0f - $$10 * $$11 / 2.0f, (float)$$6.c / 2.0f + 64.0f + 4.0f, -0.025f);
                $$12.b($$11, $$11, -1.0f);
                $$12.a(0.0f, 0.0f, 0.1f);
                $$22.a(1).a($$12, 0.0f, 0.0f, $$6.f.g(), false, gio.a.a, $$42, -1, Integer.MIN_VALUE, 0);
                $$12.b();
            }
            ++$$5;
        }
    }

    public void a(fmu $$0, fmw $$1, ikr $$2) {
        $$2.a = this.f.b($$0, $$1);
        $$2.b.clear();
        for (fmq $$3 : $$1.f()) {
            $$2.b.add(this.a($$3));
        }
    }

    private ikr.a a(fmq $$0) {
        ikr.a $$1 = new ikr.a();
        $$1.a = this.e.a($$0.a());
        $$1.b = $$0.d();
        $$1.c = $$0.e();
        $$1.d = $$0.f();
        $$1.f = $$0.g().orElse(null);
        $$1.e = $$0.b();
        return $$1;
    }
}

