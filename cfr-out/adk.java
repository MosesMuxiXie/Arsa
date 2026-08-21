/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public class adk
implements aay<adb> {
    public static final aao<xq, adk> a = aay.a(adk::a, adk::new);
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private final UUID e;
    private final c f;
    static final c g = new c(){

        @Override
        public d a() {
            return adk$d.b;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0);
        }

        @Override
        public void a(xq $$0) {
        }
    };

    private adk(UUID $$0, c $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    private adk(xq $$0) {
        this.e = $$0.n();
        d $$1 = $$0.b(d.class);
        this.f = $$1.g.decode($$0);
    }

    public static adk a(ccs $$0) {
        return new adk($$0.i(), new a($$0));
    }

    public static adk a(UUID $$0) {
        return new adk($$0, g);
    }

    public static adk b(ccs $$0) {
        return new adk($$0.i(), new f($$0.k()));
    }

    public static adk c(ccs $$0) {
        return new adk($$0.i(), new e($$0.j()));
    }

    public static adk d(ccs $$0) {
        return new adk($$0.i(), new h($$0.l(), $$0.m()));
    }

    public static adk e(ccs $$0) {
        return new adk($$0.i(), new g($$0.n(), $$0.o(), $$0.p()));
    }

    @Override
    private void a(xq $$0) {
        $$0.a(this.e);
        $$0.a(this.f.a());
        this.f.a($$0);
    }

    static int a(boolean $$0, boolean $$1, boolean $$2) {
        int $$3 = 0;
        if ($$0) {
            $$3 |= 1;
        }
        if ($$1) {
            $$3 |= 2;
        }
        if ($$2) {
            $$3 |= 4;
        }
        return $$3;
    }

    @Override
    public aba<adk> a() {
        return ahz.k;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public void a(b $$0) {
        this.f.a(this.e, $$0);
    }

    static interface c {
        public d a();

        public void a(UUID var1, b var2);

        public void a(xq var1);
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(a::new);
        public static final /* enum */ d b = new d($$0 -> g);
        public static final /* enum */ d c = new d(f::new);
        public static final /* enum */ d d = new d(e::new);
        public static final /* enum */ d e = new d(h::new);
        public static final /* enum */ d f = new d(g::new);
        final aap<xq, c> g;
        private static final /* synthetic */ d[] h;

        public static d[] values() {
            return (d[])h.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(aap<xq, c> $$0) {
            this.g = $$0;
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c, d, e, f};
        }

        static {
            h = adk$d.a();
        }
    }

    static class a
    implements c {
        private final yh a;
        private final float b;
        private final ccs.a c;
        private final ccs.b d;
        private final boolean e;
        private final boolean f;
        private final boolean g;

        a(ccs $$0) {
            this.a = $$0.j();
            this.b = $$0.k();
            this.c = $$0.l();
            this.d = $$0.m();
            this.e = $$0.n();
            this.f = $$0.o();
            this.g = $$0.p();
        }

        private a(xq $$0) {
            this.a = (yh)yj.d.decode($$0);
            this.b = $$0.readFloat();
            this.c = $$0.b(ccs.a.class);
            this.d = $$0.b(ccs.b.class);
            short $$1 = $$0.readUnsignedByte();
            this.e = ($$1 & 1) > 0;
            this.f = ($$1 & 2) > 0;
            this.g = ($$1 & 4) > 0;
        }

        @Override
        public d a() {
            return adk$d.a;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        @Override
        public void a(xq $$0) {
            yj.d.encode($$0, this.a);
            $$0.a(this.b);
            $$0.a(this.c);
            $$0.a(this.d);
            $$0.l(adk.a(this.e, this.f, this.g));
        }
    }

    record f(float a) implements c
    {
        private final float a;

        private f(xq $$0) {
            this($$0.readFloat());
        }

        @Override
        public d a() {
            return adk$d.c;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a);
        }

        @Override
        public void a(xq $$0) {
            $$0.a(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "progress", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "progress", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "progress", "a"}, this, $$0);
        }

        public float b() {
            return this.a;
        }
    }

    record e(yh a) implements c
    {
        private final yh a;

        private e(xq $$0) {
            this((yh)yj.d.decode($$0));
        }

        @Override
        public d a() {
            return adk$d.d;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a);
        }

        @Override
        public void a(xq $$0) {
            yj.d.encode($$0, this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "name", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "name", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "name", "a"}, this, $$0);
        }

        public yh b() {
            return this.a;
        }
    }

    static class h
    implements c {
        private final ccs.a a;
        private final ccs.b b;

        h(ccs.a $$0, ccs.b $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private h(xq $$0) {
            this.a = $$0.b(ccs.a.class);
            this.b = $$0.b(ccs.b.class);
        }

        @Override
        public d a() {
            return adk$d.e;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a, this.b);
        }

        @Override
        public void a(xq $$0) {
            $$0.a(this.a);
            $$0.a(this.b);
        }
    }

    static class g
    implements c {
        private final boolean a;
        private final boolean b;
        private final boolean c;

        g(boolean $$0, boolean $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        private g(xq $$0) {
            short $$1 = $$0.readUnsignedByte();
            this.a = ($$1 & 1) > 0;
            this.b = ($$1 & 2) > 0;
            this.c = ($$1 & 4) > 0;
        }

        @Override
        public d a() {
            return adk$d.f;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a, this.b, this.c);
        }

        @Override
        public void a(xq $$0) {
            $$0.l(adk.a(this.a, this.b, this.c));
        }
    }

    public static interface b {
        default public void a(UUID $$0, yh $$1, float $$2, ccs.a $$3, ccs.b $$4, boolean $$5, boolean $$6, boolean $$7) {
        }

        default public void a(UUID $$0) {
        }

        default public void a(UUID $$0, float $$1) {
        }

        default public void a(UUID $$0, yh $$1) {
        }

        default public void a(UUID $$0, ccs.a $$1, ccs.b $$2) {
        }

        default public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
        }
    }
}

