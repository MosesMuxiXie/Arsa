/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public abstract class ibt<M extends hht, S>
extends ibj<ick, M> {
    private final gzp<S> a;
    private final S b;
    private final amo c;
    private final a d;

    public ibt(hxs<?, ick, M> $$0, gzp<S> $$1, S $$2, amo $$3, a $$4) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
        this.d = $$4;
    }

    protected abstract int a(ick var1);

    private void a(fzm $$0, hpo $$1, int $$2, float $$3, float $$4, float $$5, int $$6) {
        float $$7 = bgj.a($$3 * $$3 + $$5 * $$5);
        float $$8 = (float)(Math.atan2($$3, $$5) * 57.2957763671875);
        float $$9 = (float)(Math.atan2($$4, $$7) * 57.2957763671875);
        $$0.a((Quaternionfc)a.d.rotationDegrees($$8 - 90.0f));
        $$0.a((Quaternionfc)a.f.rotationDegrees($$9));
        $$1.a(this.a, this.b, $$0, this.a.a(this.c), $$2, ilg.d, $$6, null);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ick $$3, float $$4, float $$5) {
        int $$6 = this.a($$3);
        if ($$6 <= 0) {
            return;
        }
        bgr $$7 = bgr.a($$3.D);
        for (int $$8 = 0; $$8 < $$6; ++$$8) {
            $$0.a();
            hdg $$9 = ((hht)this.d()).a($$7);
            hdg.a $$10 = $$9.a($$7);
            $$9.a($$0);
            float $$11 = $$7.i();
            float $$12 = $$7.i();
            float $$13 = $$7.i();
            if (this.d == ibt$a.b) {
                int $$14 = $$7.a(3);
                switch ($$14) {
                    case 0: {
                        $$11 = ibt.a($$11);
                        break;
                    }
                    case 1: {
                        $$12 = ibt.a($$12);
                        break;
                    }
                    default: {
                        $$13 = ibt.a($$13);
                    }
                }
            }
            $$0.a(bgj.h($$11, $$10.b, $$10.e) / 16.0f, bgj.h($$12, $$10.c, $$10.f) / 16.0f, bgj.h($$13, $$10.d, $$10.g) / 16.0f);
            this.a($$0, $$1, $$2, -($$11 * 2.0f - 1.0f), -($$12 * 2.0f - 1.0f), -($$13 * 2.0f - 1.0f), $$3.U);
            $$0.b();
        }
    }

    private static float a(float $$0) {
        return $$0 > 0.5f ? 1.0f : 0.5f;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = ibt$a.a();
        }
    }
}

