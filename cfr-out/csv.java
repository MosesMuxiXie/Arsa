/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class csv
implements dwb {
    private static final Logger a = LogUtils.getLogger();
    private boolean b;
    private a c = csv$a.c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    @Override
    public void a(axf $$0, boolean $$1) {
        if ($$0.ag() || !$$1) {
            this.c = csv$a.c;
            this.b = false;
            return;
        }
        long $$2 = $$0.al() % 24000L;
        if ($$2 == 18000L) {
            a a2 = this.c = $$0.y.a(10) == 0 ? csv$a.b : csv$a.c;
        }
        if (this.c == csv$a.c) {
            return;
        }
        if (!this.b) {
            if (this.a($$0)) {
                this.b = true;
            } else {
                return;
            }
        }
        if (this.e > 0) {
            --this.e;
            return;
        }
        this.e = 2;
        if (this.d > 0) {
            this.b($$0);
            --this.d;
        } else {
            this.c = csv$a.c;
        }
    }

    private boolean a(axf $$0) {
        for (ddm ddm2 : $$0.E()) {
            is $$2;
            if (ddm2.au() || !$$0.e($$2 = ddm2.dK()) || $$0.z($$2).a(bdo.ab)) continue;
            for (int $$3 = 0; $$3 < 10; ++$$3) {
                float $$4 = $$0.y.i() * ((float)Math.PI * 2);
                this.f = $$2.u() + bgj.b(bgj.b((double)$$4) * 32.0f);
                this.g = $$2.v();
                this.h = $$2.w() + bgj.b(bgj.a((double)$$4) * 32.0f);
                if (this.a($$0, new is(this.f, this.g, this.h)) == null) continue;
                this.e = 0;
                this.d = 20;
                break;
            }
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void b(axf $$0) {
        void $$4;
        ftm $$1 = this.a($$0, new is(this.f, this.g, this.h));
        if ($$1 == null) {
            return;
        }
        try {
            dcn $$2 = new dcn($$0);
            $$2.a((dxf)$$0, $$0.c($$2.dK()), cgt.h, null);
        }
        catch (Exception $$3) {
            a.warn("Failed to create zombie for village siege at {}", (Object)$$1, (Object)$$3);
            return;
        }
        $$4.b($$1.g, $$1.h, $$1.i, $$0.y.i() * 360.0f, 0.0f);
        $$0.a_((cgk)$$4);
    }

    private @Nullable ftm a(axf $$0, is $$1) {
        for (int $$2 = 0; $$2 < 10; ++$$2) {
            int $$4;
            int $$5;
            int $$3 = $$1.u() + $$0.y.a(16) - 8;
            is $$6 = new is($$3, $$5 = $$0.a(euq.a.b, $$3, $$4 = $$1.w() + $$0.y.a(16) - 8), $$4);
            if (!$$0.e($$6) || !czz.a(cgu.bW, $$0, cgt.h, $$6, $$0.y)) continue;
            return ftm.c($$6);
        }
        return null;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = csv$a.a();
        }
    }
}

