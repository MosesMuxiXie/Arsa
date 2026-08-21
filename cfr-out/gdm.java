/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class gdm
extends gmr
implements gdh {
    private static final int d = 212;
    private static final int e = 2;
    private static final int f = 6;
    static final yh a = yh.c("mco.configure.world.settings.title");
    private static final yh g = yh.c("mco.configure.world.name");
    private static final yh h = yh.c("mco.configure.world.description");
    private static final yh i = yh.c("mco.configure.world.region_preference");
    private static final gks j = gks.a(yh.c("mco.configure.world.name.validation.whitespace"));
    private final gdi k;
    private final gfj l;
    private gbg m;
    private final Map<gbf, gbu> n;
    final gje b;
    private final gjn o;
    private final gjn p;
    private final gko q;
    private final gjr r;
    private a s;

    gdm(gdi $$02, gfj $$1, gbg $$2, Map<gbf, gbu> $$32) {
        super(a);
        this.k = $$02;
        this.l = $$1;
        this.m = $$2;
        this.n = $$32;
        got.b $$4 = this.c.b(6).d(1);
        $$4.a(new gko(g, $$02.C()));
        this.p = new gjn($$1.g, 0, 0, 212, 20, yh.c("mco.configure.world.name"));
        this.p.k(32);
        this.p.b((String $$0) -> {
            if (!this.c()) {
                this.p.l(-2142128);
                this.p.a(j);
                return;
            }
            this.p.a((gks)null);
            this.p.l(-2039584);
        });
        $$4.a(this.p);
        $$4.a(goz.b(2));
        $$4.a(new gko(h, $$02.C()));
        this.o = new gjn($$1.g, 0, 0, 212, 20, yh.c("mco.configure.world.description"));
        this.o.k(32);
        $$4.a(this.o);
        $$4.a(goz.b(2));
        $$4.a(new gko(i, $$02.C()));
        gor $$5 = new gor(0, 0, 212, $$02.C().b, gor.b.a);
        this.q = $$5.a(new gko(192, $$02.C().b, yh.i(), $$02.C()));
        this.r = $$5.a(gjr.a(10, 8, gbu.e.b()));
        $$4.a($$5);
        $$4.a(gje.a(yh.c("mco.configure.world.buttons.region_preference"), (gje $$0) -> this.d()).a(0, 0, 212, 20).a());
        $$4.a(goz.b(2));
        this.b = $$4.a(gje.a(yh.i(), (gje $$3) -> {
            if ($$0.f == gbg.c.b) {
                $$1.a(gcy.a($$02, yh.c("mco.configure.world.close.question.title"), yh.c("mco.configure.world.close.question.line1"), $$1 -> {
                    this.a();
                    $$02.m();
                }));
            } else {
                this.a();
                $$02.a(false);
            }
        }).a(0, 0, 212, 20).a());
        this.b.k = false;
        this.a($$2);
    }

    private static yw a(a $$0) {
        return ($$0.a().equals((Object)gbs.c) && $$0.b() != null ? yh.c($$0.b().z) : yh.c($$0.a().f)).a(l.h);
    }

    private static amo a(a $$0, Map<gbf, gbu> $$1) {
        if ($$0.b() != null && $$1.containsKey((Object)$$0.b())) {
            gbu $$2 = $$1.getOrDefault((Object)$$0.b(), gbu.e);
            return $$2.b();
        }
        return gbu.e.b();
    }

    private boolean c() {
        String $$0 = this.p.a();
        String $$1 = $$0.trim();
        return !$$1.isEmpty() && $$0.length() == $$1.length();
    }

    private void d() {
        this.l.a(new gdl(this.k, this::a, this.n, this.s));
    }

    private void a(gbs $$0, gbf $$1) {
        this.s = new a($$0, $$1);
        this.e();
    }

    private void e() {
        this.q.a_(gdm.a(this.s));
        this.r.a(gdm.a(this.s, this.n));
        this.r.l = this.s.a == gbs.c;
    }

    @Override
    public void b(gbg $$0) {
        this.a($$0);
    }

    @Override
    public void a(gbg $$0) {
        this.m = $$0;
        if ($$0.y == null) {
            $$0.y = gbt.a;
        }
        if ($$0.y.b == gbs.c && $$0.y.c == null) {
            Optional $$12 = this.n.keySet().stream().findFirst();
            $$12.ifPresent($$1 -> {
                $$0.y.c = $$1;
            });
        }
        String $$2 = $$0.f == gbg.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
        this.b.a_(yh.c($$2));
        this.b.k = true;
        this.s = new a($$0.y.b, $$0.y.c);
        this.p.a(Objects.requireNonNullElse($$0.b(), ""));
        this.o.a($$0.a());
        this.e();
    }

    @Override
    public void c(gbg $$0) {
        this.a();
    }

    public void a() {
        String $$0 = this.p.a().trim();
        if (this.m.y != null && Objects.equals($$0, this.m.d) && Objects.equals(this.o.a(), this.m.e) && this.s.a() == this.m.y.b && this.s.b() == this.m.y.c) {
            return;
        }
        this.k.a($$0, this.o.a(), this.s.a(), this.s.b());
    }

    public static final class a
    extends Record {
        final gbs a;
        private final @Nullable gbf b;

        public a(gbs $$0, @Nullable gbf $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "preference;region", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "preference;region", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "preference;region", "a", "b"}, this, $$0);
        }

        public gbs a() {
            return this.a;
        }

        public @Nullable gbf b() {
            return this.b;
        }
    }
}

