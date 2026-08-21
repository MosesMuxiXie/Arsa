/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public final class acb
extends Record
implements aay<abv> {
    private final UUID b;
    private final a c;
    public static final aao<wx, acb> a = aay.a(acb::a, acb::new);

    private acb(wx $$0) {
        this($$0.n(), $$0.b(a.class));
    }

    public acb(UUID $$0, a $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<acb> a() {
        return abu.r;
    }

    @Override
    public void a(abv $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acb.class, "id;action", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acb.class, "id;action", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acb.class, "id;action", "b", "c"}, this, $$0);
    }

    public UUID b() {
        return this.b;
    }

    public a e() {
        return this.c;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public boolean a() {
            return this != d && this != e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            i = acb$a.b();
        }
    }
}

