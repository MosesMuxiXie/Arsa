/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class hgr
extends gzp<a> {
    private static final String a = "left_pages";
    private static final String b = "right_pages";
    private static final String c = "flip_page1";
    private static final String d = "flip_page2";
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;

    public hgr(hdg $$0) {
        super($$0, ijt::d);
        this.e = $$0.b("left_lid");
        this.f = $$0.b("right_lid");
        this.g = $$0.b(a);
        this.h = $$0.b(b);
        this.i = $$0.b(c);
        this.j = $$0.b(d);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("left_lid", hdl.c().a(0, 0).a(-6.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f), hdi.a(0.0f, 0.0f, -1.0f));
        $$1.a("right_lid", hdl.c().a(16, 0).a(0.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f), hdi.a(0.0f, 0.0f, 1.0f));
        $$1.a("seam", hdl.c().a(12, 0).a(-1.0f, -5.0f, 0.0f, 2.0f, 10.0f, 0.005f), hdi.b(0.0f, 1.5707964f, 0.0f));
        $$1.a(a, hdl.c().a(0, 10).a(0.0f, -4.0f, -0.99f, 5.0f, 8.0f, 1.0f), hdi.a);
        $$1.a(b, hdl.c().a(12, 10).a(0.0f, -4.0f, -0.01f, 5.0f, 8.0f, 1.0f), hdi.a);
        hdl $$2 = hdl.c().a(24, 10).a(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        $$1.a(c, $$2, hdi.a);
        $$1.a(d, $$2, hdi.a);
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(a $$0) {
        super.a($$0);
        float $$1 = (bgj.a((double)($$0.a * 0.02f)) * 0.1f + 1.25f) * $$0.d;
        this.e.f = (float)Math.PI + $$1;
        this.f.f = -$$1;
        this.g.f = $$1;
        this.h.f = -$$1;
        this.i.f = $$1 - $$1 * 2.0f * $$0.b;
        this.j.f = $$1 - $$1 * 2.0f * $$0.c;
        this.g.b = bgj.a((double)$$1);
        this.h.b = bgj.a((double)$$1);
        this.i.b = bgj.a((double)$$1);
        this.j.b = bgj.a((double)$$1);
    }

    public static final class a
    extends Record {
        final float a;
        final float b;
        final float c;
        final float d;

        public a(float $$0, float $$1, float $$2, float $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "animationPos;pageFlip1;pageFlip2;open", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "animationPos;pageFlip1;pageFlip2;open", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "animationPos;pageFlip1;pageFlip2;open", "a", "b", "c", "d"}, this, $$0);
        }

        public float a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }

        public float c() {
            return this.c;
        }

        public float d() {
            return this.d;
        }
    }
}

