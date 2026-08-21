/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class adz
extends Record
implements aay<adb> {
    private final a b;
    private final List<String> c;
    public static final aao<wx, adz> a = aay.a(adz::a, adz::new);

    private adz(wx $$0) {
        this($$0.b(a.class), $$0.a(wx::p));
    }

    public adz(a $$0, List<String> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c, wx::a);
    }

    @Override
    public aba<adz> a() {
        return ahz.x;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adz.class, "action;entries", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adz.class, "action;entries", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adz.class, "action;entries", "b", "c"}, this, $$0);
    }

    public a b() {
        return this.b;
    }

    public List<String> e() {
        return this.c;
    }

    public static final class a
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
            d = adz$a.a();
        }
    }
}

