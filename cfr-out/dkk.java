/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class dkk {
    static final amo a = dkk.a("items");
    private final yh b;
    amo c = a;
    boolean d = true;
    boolean e = true;
    boolean f = false;
    private final f g;
    private final int h;
    private final h i;
    private @Nullable dlt j;
    private Collection<dlt> k = dlu.a();
    private Set<dlt> l = dlu.a();
    private final Supplier<dlt> m;
    private final b n;

    dkk(f $$0, int $$1, h $$2, yh $$3, Supplier<dlt> $$4, b $$5) {
        this.g = $$0;
        this.h = $$1;
        this.b = $$3;
        this.m = $$4;
        this.n = $$5;
        this.i = $$2;
    }

    public static amo a(String $$0) {
        return amo.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
    }

    public static a a(f $$0, int $$1) {
        return new a($$0, $$1);
    }

    public yh a() {
        return this.b;
    }

    public dlt b() {
        if (this.j == null) {
            this.j = this.m.get();
        }
        return this.j;
    }

    public amo c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.d;
    }

    public int f() {
        return this.h;
    }

    public f g() {
        return this.g;
    }

    public boolean h() {
        return !this.k.isEmpty();
    }

    public boolean i() {
        return this.i != dkk$h.a || this.h();
    }

    public boolean j() {
        return this.f;
    }

    public h k() {
        return this.i;
    }

    public void a(d $$0) {
        c $$1 = new c(this, $$0.a);
        amt<dkk> $$2 = mi.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + String.valueOf(this)));
        this.n.accept($$0, $$1);
        this.k = $$1.a;
        this.l = $$1.b;
    }

    public Collection<dlt> l() {
        return this.k;
    }

    public Collection<dlt> m() {
        return this.l;
    }

    public boolean a(dlt $$0) {
        return this.l.contains($$0);
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f a = new f();
        public static final /* enum */ f b = new f();
        private static final /* synthetic */ f[] c;

        public static f[] values() {
            return (f[])c.clone();
        }

        public static f valueOf(String $$0) {
            return Enum.valueOf(f.class, $$0);
        }

        private static /* synthetic */ f[] a() {
            return new f[]{a, b};
        }

        static {
            c = dkk$f.a();
        }
    }

    @FunctionalInterface
    public static interface b {
        public void accept(d var1, e var2);
    }

    public static final class h
    extends Enum<h> {
        public static final /* enum */ h a = new h();
        public static final /* enum */ h b = new h();
        public static final /* enum */ h c = new h();
        public static final /* enum */ h d = new h();
        private static final /* synthetic */ h[] e;

        public static h[] values() {
            return (h[])e.clone();
        }

        public static h valueOf(String $$0) {
            return Enum.valueOf(h.class, $$0);
        }

        private static /* synthetic */ h[] a() {
            return new h[]{a, b, c, d};
        }

        static {
            e = dkk$h.a();
        }
    }

    public static class a {
        private static final b a = ($$0, $$1) -> {};
        private final f b;
        private final int c;
        private yh d = yh.i();
        private Supplier<dlt> e = () -> dlt.l;
        private b f = a;
        private boolean g = true;
        private boolean h = true;
        private boolean i = false;
        private h j = dkk$h.a;
        private amo k = a;

        public a(f $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public a a(yh $$0) {
            this.d = $$0;
            return this;
        }

        public a a(Supplier<dlt> $$0) {
            this.e = $$0;
            return this;
        }

        public a a(b $$0) {
            this.f = $$0;
            return this;
        }

        public a a() {
            this.i = true;
            return this;
        }

        public a b() {
            this.h = false;
            return this;
        }

        public a c() {
            this.g = false;
            return this;
        }

        protected a a(h $$0) {
            this.j = $$0;
            return this;
        }

        public a a(amo $$0) {
            this.k = $$0;
            return this;
        }

        public dkk d() {
            if ((this.j == dkk$h.c || this.j == dkk$h.b) && this.f != a) {
                throw new IllegalStateException("Special tabs can't have display items");
            }
            dkk $$0 = new dkk(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.f = this.i;
            $$0.e = this.h;
            $$0.d = this.g;
            $$0.c = this.k;
            return $$0;
        }
    }

    static class c
    implements e {
        public final Collection<dlt> a = dlu.a();
        public final Set<dlt> b = dlu.a();
        private final dkk c;
        private final dgz d;

        public c(dkk $$0, dgz $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public void a(dlt $$0, g $$1) {
            boolean $$2;
            if ($$0.N() != 1) {
                throw new IllegalArgumentException("Stack size must be exactly 1");
            }
            boolean bl2 = $$2 = this.a.contains($$0) && $$1 != dkk$g.c;
            if ($$2) {
                throw new IllegalStateException("Accidentally adding the same item stack twice " + $$0.K().getString() + " to a Creative Mode Tab: " + this.c.a().getString());
            }
            if ($$0.h().a(this.d)) {
                switch ($$1.ordinal()) {
                    case 0: {
                        this.a.add($$0);
                        this.b.add($$0);
                        break;
                    }
                    case 1: {
                        this.a.add($$0);
                        break;
                    }
                    case 2: {
                        this.b.add($$0);
                    }
                }
            }
        }
    }

    public static final class d
    extends Record {
        final dgz a;
        private final boolean b;
        private final jf.a c;

        public d(dgz $$0, boolean $$1, jf.a $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean a(dgz $$0, boolean $$1, jf.a $$2) {
            return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "enabledFeatures;hasPermissions;holders", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "enabledFeatures;hasPermissions;holders", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "enabledFeatures;hasPermissions;holders", "a", "b", "c"}, this, $$0);
        }

        public dgz a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public jf.a c() {
            return this.c;
        }
    }

    public static interface e {
        public void a(dlt var1, g var2);

        default public void a(dlt $$0) {
            this.a($$0, dkk$g.a);
        }

        default public void a(dwn $$0, g $$1) {
            this.a(new dlt($$0), $$1);
        }

        default public void a(dwn $$0) {
            this.a(new dlt($$0), dkk$g.a);
        }

        default public void a(Collection<dlt> $$0, g $$12) {
            $$0.forEach($$1 -> this.a((dlt)$$1, $$12));
        }

        default public void a(Collection<dlt> $$0) {
            this.a($$0, dkk$g.a);
        }
    }

    protected static final class g
    extends Enum<g> {
        public static final /* enum */ g a = new g();
        public static final /* enum */ g b = new g();
        public static final /* enum */ g c = new g();
        private static final /* synthetic */ g[] d;

        public static g[] values() {
            return (g[])d.clone();
        }

        public static g valueOf(String $$0) {
            return Enum.valueOf(g.class, $$0);
        }

        private static /* synthetic */ g[] a() {
            return new g[]{a, b, c};
        }

        static {
            d = dkk$g.a();
        }
    }
}

