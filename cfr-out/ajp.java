/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ajp
implements aay<aib> {
    public static final aao<wx, ajp> a = aay.a(ajp::a, ajp::new);
    private final a b;
    private final @Nullable amo c;

    public ajp(a $$0, @Nullable amo $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static ajp a(ac $$0) {
        return new ajp(ajp$a.a, $$0.a());
    }

    public static ajp b() {
        return new ajp(ajp$a.b, null);
    }

    private ajp(wx $$0) {
        this.b = $$0.b(a.class);
        this.c = this.b == ajp$a.a ? $$0.q() : null;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        if (this.b == ajp$a.a) {
            $$0.a(this.c);
        }
    }

    @Override
    public aba<ajp> a() {
        return ahz.cg;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public a e() {
        return this.b;
    }

    public @Nullable amo f() {
        return this.c;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = ajp$a.a();
        }
    }
}

