/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class tb {
    public static final Codec<tb> b = mi.aF.q().dispatch(tb::a, $$0 -> $$0);
    private final tu<jd<tv>> a;

    public static MapCodec<? extends tb> a(jq<MapCodec<? extends tb>> $$0) {
        tb.a($$0, "block_based", sm.a);
        return tb.a($$0, "function", sq.a);
    }

    private static MapCodec<? extends tb> a(jq<MapCodec<? extends tb>> $$0, String $$1, MapCodec<? extends tb> $$2) {
        return jq.a($$0, amt.a(mj.aH, amo.b($$1)), $$2);
    }

    protected tb(tu<jd<tv>> $$0) {
        this.a = $$0;
    }

    public abstract void a(sz var1);

    public abstract MapCodec<? extends tb> a();

    public jd<tv> d() {
        return this.a.a();
    }

    public amo e() {
        return this.a.b();
    }

    public int f() {
        return this.a.c();
    }

    public int g() {
        return this.a.d();
    }

    public boolean h() {
        return this.a.e();
    }

    public boolean i() {
        return this.a.g();
    }

    public int j() {
        return this.a.h();
    }

    public int k() {
        return this.a.i();
    }

    public boolean l() {
        return this.a.j();
    }

    public egm m() {
        return this.a.f();
    }

    protected tu<jd<tv>> n() {
        return this.a;
    }

    protected abstract yw b();

    public yh c() {
        return this.o().b(this.p());
    }

    protected yw o() {
        return this.a("test_instance.description.type", this.b());
    }

    protected yh p() {
        return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
    }

    protected yw a(String $$0, String $$1) {
        return this.a($$0, yh.b($$1));
    }

    protected yw a(String $$0, yw $$1) {
        return yh.a($$0, $$1.a(l.j)).b(yh.b("\n"));
    }
}

