/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class aiy
implements aay<aib> {
    public static final aao<wx, aiy> a = aay.a(aiy::a, aiy::new);
    private final int b;
    private final a c;
    private final boolean d;
    static final a e = new a(){

        @Override
        public b a() {
            return aiy$b.b;
        }

        @Override
        public void a(c $$0) {
            $$0.a();
        }

        @Override
        public void a(wx $$0) {
        }
    };

    private aiy(int $$0, boolean $$1, a $$2) {
        this.b = $$0;
        this.c = $$2;
        this.d = $$1;
    }

    public static aiy a(cgk $$0, boolean $$1) {
        return new aiy($$0.aA(), $$1, e);
    }

    public static aiy a(cgk $$0, boolean $$1, cdb $$2) {
        return new aiy($$0.aA(), $$1, new d($$2));
    }

    public static aiy a(cgk $$0, boolean $$1, cdb $$2, ftm $$3) {
        return new aiy($$0.aA(), $$1, new e($$2, $$3));
    }

    private aiy(wx $$0) {
        this.b = $$0.l();
        b $$1 = $$0.b(b.class);
        this.c = $$1.d.apply($$0);
        this.d = $$0.readBoolean();
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c.a());
        this.c.a($$0);
        $$0.a(this.d);
    }

    @Override
    public aba<aiy> a() {
        return ahz.bM;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public @Nullable cgk a(axf $$0) {
        return $$0.b(this.b);
    }

    public boolean b() {
        return this.d;
    }

    public boolean a(axg $$0, fth $$1, double $$2) {
        if (this.c.a() == aiy$b.b) {
            return $$0.b($$1, $$2);
        }
        return $$0.a($$1, $$2);
    }

    @Override
    public void a(c $$0) {
        this.c.a($$0);
    }

    static interface a {
        public b a();

        public void a(c var1);

        public void a(wx var1);
    }

    static class d
    implements a {
        private final cdb a;

        d(cdb $$0) {
            this.a = $$0;
        }

        private d(wx $$0) {
            this.a = $$0.b(cdb.class);
        }

        @Override
        public b a() {
            return aiy$b.a;
        }

        @Override
        public void a(c $$0) {
            $$0.a(this.a);
        }

        @Override
        public void a(wx $$0) {
            $$0.a(this.a);
        }
    }

    static class e
    implements a {
        private final cdb a;
        private final ftm b;

        e(cdb $$0, ftm $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private e(wx $$0) {
            this.b = new ftm($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
            this.a = $$0.b(cdb.class);
        }

        @Override
        public b a() {
            return aiy$b.c;
        }

        @Override
        public void a(c $$0) {
            $$0.a(this.a, this.b);
        }

        @Override
        public void a(wx $$0) {
            $$0.a((float)this.b.g);
            $$0.a((float)this.b.h);
            $$0.a((float)this.b.i);
            $$0.a(this.a);
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(d::new);
        public static final /* enum */ b b = new b($$0 -> e);
        public static final /* enum */ b c = new b(e::new);
        final Function<wx, a> d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(Function<wx, a> $$0) {
            this.d = $$0;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            e = aiy$b.a();
        }
    }

    public static interface c {
        public void a(cdb var1);

        public void a(cdb var1, ftm var2);

        public void a();
    }
}

