/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cvk
extends cvh {
    private static final String a = "type";
    private static final alw<Integer> b = ama.a(cvk.class, aly.b);

    public cvk(cgu<? extends cvk> $$0, dwo $$1) {
        super((cgu<? extends cvh>)$$0, $$1);
        this.j_();
    }

    @Override
    public int gQ() {
        return 5;
    }

    @Override
    public dlt b() {
        return new dlt(dlx.ss);
    }

    @Override
    protected bcz W() {
        return bda.yz;
    }

    @Override
    protected bcz fd() {
        return bda.yA;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.yC;
    }

    @Override
    protected bcz gP() {
        return bda.yB;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(b, cvk$a.d.a());
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (b.equals($$0)) {
            this.j_();
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(a, cvk$a.e, this.gX());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a(a, cvk$a.e).orElse(cvk$a.d));
    }

    @Override
    public void a(dlt $$0) {
        cti.a((chn)this, $$0);
        $$0.a(ki.aH, (kd)this);
    }

    private void a(a $$0) {
        this.az.a(b, $$0.i);
    }

    public a gX() {
        return cvk$a.g.apply(this.az.a(b));
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aH) {
            return cvk.c($$0, this.gX());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aH);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aH) {
            this.a(cvk.c(ki.aH, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        cbn.a<a> $$4 = cbn.b();
        $$4.a(cvk$a.a, 30);
        $$4.a(cvk$a.b, 50);
        $$4.a(cvk$a.c, 15);
        $$4.a().a(this.as).ifPresent(this::a);
        return super.a($$0, $$1, $$2, $$3);
    }

    public float gY() {
        return this.gX().j;
    }

    @Override
    protected cgn b(chx $$0) {
        return super.b($$0).a(this.gY());
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("small", 0, 0.5f);
        public static final /* enum */ a b = new a("medium", 1, 1.0f);
        public static final /* enum */ a c = new a("large", 2, 1.5f);
        public static final a d;
        public static final bhh.a<a> e;
        static final IntFunction<a> g;
        public static final aao<ByteBuf, a> f;
        private final String h;
        final int i;
        final float j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, int $$1, float $$2) {
            this.h = $$0;
            this.i = $$1;
            this.j = $$2;
        }

        @Override
        public String c() {
            return this.h;
        }

        int a() {
            return this.i;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            k = cvk$a.b();
            d = b;
            e = bhh.a(a::values);
            g = beu.a(a::a, cvk$a.values(), beu.a.c);
            f = aam.a(g, a::a);
        }
    }
}

