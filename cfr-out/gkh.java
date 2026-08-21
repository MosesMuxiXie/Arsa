/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gkh
extends gsb {
    private static final amo a = amo.b("popup/background");
    private static final int b = 12;
    private static final int c = 18;
    private static final int d = 6;
    private static final int e = 130;
    private static final int f = 64;
    private static final int t = 250;
    private final gsb u;
    private final @Nullable amo v;
    private final yh w;
    private final List<b> x;
    private final @Nullable Runnable y;
    private final int z;
    private final goy A = goy.d();

    gkh(gsb $$0, int $$1, @Nullable amo $$2, yh $$3, yh $$4, List<b> $$5, @Nullable Runnable $$6) {
        super($$3);
        this.u = $$0;
        this.v = $$2;
        this.w = $$4;
        this.x = $$5;
        this.y = $$6;
        this.z = $$1 - 36;
    }

    @Override
    public void aK_() {
        super.aK_();
        this.u.r();
    }

    @Override
    protected void bg_() {
        this.u.b(this.o, this.p);
        this.A.a(12).c().b();
        this.A.a(new gjz(this.m.f().a(l.r), this.q).a(this.z).a(true));
        if (this.v != null) {
            this.A.a(gjr.a(130, 64, this.v, 130, 64));
        }
        this.A.a(new gjz(this.w, this.q).a(this.z).a(true));
        this.A.a(this.o());
        this.A.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    private goy o() {
        int $$0 = 6 * (this.x.size() - 1);
        int $$12 = Math.min((this.z - $$0) / this.x.size(), 150);
        goy $$2 = goy.e();
        $$2.a(6);
        for (b $$3 : this.x) {
            $$2.a(gje.a($$3.a(), (gje $$1) -> $$3.b().accept(this)).a($$12).a());
        }
        return $$2;
    }

    @Override
    protected void c() {
        this.u.a(this.o, this.p);
        this.A.a();
        gos.a(this.A, this.aV_());
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        this.u.b($$0, $$1, $$2, $$3);
        $$0.c();
        this.u.a($$0, -1, -1, $$3);
        $$0.c();
        this.c($$0);
        $$0.a(hpa.at, a, this.A.aT_() - 18, this.A.aU_() - 18, this.A.aS_() + 36, this.A.aR_() + 36);
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{this.m, this.w});
    }

    @Override
    public void aX_() {
        if (this.y != null) {
            this.y.run();
        }
        this.n.a(this.u);
    }

    record b(yh a, Consumer<gkh> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message;action", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message;action", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message;action", "a", "b"}, this, $$0);
        }
    }

    public static class a {
        private final gsb a;
        private final yh b;
        private yh c = yg.a;
        private int d = 250;
        private @Nullable amo e;
        private final List<b> f = new ArrayList<b>();
        private @Nullable Runnable g = null;

        public a(gsb $$0, yh $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(int $$0) {
            this.d = $$0;
            return this;
        }

        public a a(amo $$0) {
            this.e = $$0;
            return this;
        }

        public a a(yh $$0) {
            this.c = $$0;
            return this;
        }

        public a a(yh $$0, Consumer<gkh> $$1) {
            this.f.add(new b($$0, $$1));
            return this;
        }

        public a a(Runnable $$0) {
            this.g = $$0;
            return this;
        }

        public gkh a() {
            if (this.f.isEmpty()) {
                throw new IllegalStateException("Popup must have at least one button");
            }
            return new gkh(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
        }
    }
}

