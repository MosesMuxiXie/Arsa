/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import org.jspecify.annotations.Nullable;

public class gxs
extends gjb {
    private static final int c = 32;
    private static final String d = "telemetry.event.required";
    private static final String e = "telemetry.event.optional";
    private static final String f = "telemetry.event.optional.disabled";
    private static final yh n = yh.c("telemetry_info.property_title").a(l.t);
    private final gio o;
    private a p;
    private @Nullable DoubleConsumer q;

    public gxs(int $$0, int $$1, int $$2, int $$3, gio $$4) {
        super($$0, $$1, $$2, $$3, yh.i());
        this.o = $$4;
        this.p = this.c(gfj.V().H());
    }

    public void a(boolean $$0) {
        this.p = this.c($$0);
        this.i();
    }

    public void u() {
        this.p = this.c(gfj.V().H());
        this.i();
    }

    private a c(boolean $$0) {
        b $$1 = new b(this.v());
        ArrayList<irb> $$2 = new ArrayList<irb>(irb.g());
        $$2.sort(Comparator.comparing(irb::d));
        for (int $$3 = 0; $$3 < $$2.size(); ++$$3) {
            irb $$4 = (irb)$$2.get($$3);
            boolean $$5 = $$4.d() && !$$0;
            this.a($$1, $$4, $$5);
            if ($$3 >= $$2.size() - 1) continue;
            $$1.a(this.o.b);
        }
        return $$1.a();
    }

    public void a(@Nullable DoubleConsumer $$0) {
        this.q = $$0;
    }

    @Override
    public void a(double $$0) {
        super.a($$0);
        if (this.q != null) {
            this.q.accept(this.h());
        }
    }

    @Override
    protected int d() {
        return this.p.a().aR_();
    }

    @Override
    protected double p() {
        return this.o.b;
    }

    @Override
    protected void c(gir $$0, int $$1, int $$2, float $$3) {
        int $$42 = this.t();
        int $$5 = this.e();
        $$0.e().pushMatrix();
        $$0.e().translate((float)$$5, (float)$$42);
        this.p.a().a((gjc $$4) -> $$4.a($$0, $$1, $$2, $$3));
        $$0.e().popMatrix();
    }

    @Override
    protected void a(gpd $$0) {
        $$0.a(gpc.a, this.p.b());
    }

    private yh a(yh $$0, boolean $$1) {
        if ($$1) {
            return $$0.f().a(l.h);
        }
        return $$0;
    }

    private void a(b $$0, irb $$1, boolean $$2) {
        String $$3 = $$1.d() ? ($$2 ? f : e) : d;
        $$0.b(this.o, this.a(yh.a($$3, $$1.e()), $$2));
        $$0.b(this.o, $$1.f().a(l.h));
        $$0.a(this.o.b / 2);
        $$0.a(this.o, this.a(n, $$2), 2);
        this.a($$1, $$0, $$2);
    }

    private void a(irb $$0, b $$1, boolean $$2) {
        for (ird<?> $$3 : $$0.b()) {
            $$1.a(this.o, this.a($$3.a(), $$2));
        }
    }

    private int v() {
        return this.g - this.c();
    }

    record a(gov a, yh b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "container;narration", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "container;narration", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "container;narration", "a", "b"}, this, $$0);
        }
    }

    static class b {
        private final int a;
        private final goy b;
        private final yw c = yh.i();

        public b(int $$0) {
            this.a = $$0;
            this.b = goy.d();
            this.b.c().a();
            this.b.a(goz.a($$0));
        }

        public void a(gio $$0, yh $$1) {
            this.a($$0, $$1, 0);
        }

        public void a(gio $$0, yh $$12, int $$2) {
            this.b.a(new gjz($$12, $$0).a(this.a), (gox $$1) -> $$1.e($$2));
            this.c.b($$12).f("\n");
        }

        public void b(gio $$02, yh $$1) {
            this.b.a(new gjz($$1, $$02).a(this.a - 64).a(true), (gox $$0) -> $$0.b().f(32));
            this.c.b($$1).f("\n");
        }

        public void a(int $$0) {
            this.b.a(goz.b($$0));
        }

        public a a() {
            this.b.a();
            return new a(this.b, this.c);
        }
    }
}

