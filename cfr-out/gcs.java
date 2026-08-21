/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class gcs
extends isc {
    private static final yh a = yh.c("mco.errorMessage.generic");
    private final gsb b;
    private final yh c;
    private gjy F = gjy.a;

    public gcs(gce $$0, gsb $$1) {
        this(gcs$a.a($$0), $$1);
    }

    public gcs(yh $$0, gsb $$1) {
        this(new a(a, $$0), $$1);
    }

    public gcs(yh $$0, yh $$1, gsb $$2) {
        this(new a($$0, $$1), $$2);
    }

    private gcs(a $$0, gsb $$1) {
        super($$0.a);
        this.b = $$1;
        this.c = yk.a($$0.b, zf.a.a(-2142128));
    }

    @Override
    public void bg_() {
        this.c(gje.a(yg.h, (gje $$0) -> this.aX_()).a(this.o / 2 - 100, this.p - 52, 200, 20).a());
        this.F = gjy.a(this.q, this.c, this.o * 3 / 4);
    }

    @Override
    public void aX_() {
        this.n.a(this.b);
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), this.c});
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 80, -1);
        gil $$4 = $$0.h();
        this.F.a(git.b, this.o / 2, 100, this.n.g.b, $$4);
    }

    static final class a
    extends Record {
        final yh a;
        final yh b;

        a(yh $$0, yh $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        static a a(gce $$0) {
            gab $$1 = $$0.a;
            return new a(yh.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "title;detail", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "title;detail", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "title;detail", "a", "b"}, this, $$0);
        }

        public yh a() {
            return this.a;
        }

        public yh b() {
            return this.b;
        }
    }
}

