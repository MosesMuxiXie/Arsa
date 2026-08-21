/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public class gmz
implements gnb {
    private static final amo a = amo.b("toast/recipe");
    private static final long e = 5000L;
    private static final yh f = yh.c("recipe.toast.title");
    private static final yh g = yh.c("recipe.toast.description");
    private final List<a> h = new ArrayList<a>();
    private long i;
    private boolean j;
    private gnb.a k = gnb.a.b;
    private int l;

    private gmz() {
    }

    @Override
    public gnb.a a() {
        return this.k;
    }

    @Override
    public void a(gnc $$0, long $$1) {
        if (this.j) {
            this.i = $$1;
            this.j = false;
        }
        this.k = this.h.isEmpty() ? gnb.a.b : ((double)($$1 - this.i) >= 5000.0 * $$0.f() ? gnb.a.b : gnb.a.a);
        this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.f() / (double)this.h.size()) % (double)this.h.size());
    }

    @Override
    public void a(gir $$0, gio $$1, long $$2) {
        $$0.a(hpa.at, a, 0, 0, this.e(), this.f());
        $$0.a($$1, f, 30, 7, -11534256, false);
        $$0.a($$1, g, 30, 18, -16777216, false);
        a $$3 = this.h.get(this.l);
        $$0.e().pushMatrix();
        $$0.e().scale(0.6f, 0.6f);
        $$0.b($$3.a(), 3, 3);
        $$0.e().popMatrix();
        $$0.b($$3.b(), 8, 8);
    }

    private void a(dlt $$0, dlt $$1) {
        this.h.add(new a($$0, $$1));
        this.j = true;
    }

    public static void a(gnc $$0, dry $$1) {
        gmz $$2 = $$0.a(gmz.class, b);
        if ($$2 == null) {
            $$2 = new gmz();
            $$0.a($$2);
        }
        bhx $$3 = dsf.a($$0.e().r);
        dlt $$4 = $$1.e().b($$3);
        dlt $$5 = $$1.d().b($$3);
        $$2.a($$4, $$5);
    }

    record a(dlt a, dlt b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "categoryItem;unlockedItem", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "categoryItem;unlockedItem", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "categoryItem;unlockedItem", "a", "b"}, this, $$0);
        }
    }
}

