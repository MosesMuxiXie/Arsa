/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ekp
extends elb
implements cdg {
    public static final int a = 6;
    private static final String b = "patterns";
    private static final yh c = yh.c("block.minecraft.banner");
    private @Nullable yh d;
    private final dkr e;
    private ekr f = ekr.a;

    public ekp(is $$0, eoh $$1) {
        this($$0, $$1, ((dyh)$$1.b()).b());
    }

    public ekp(is $$0, eoh $$1, dkr $$2) {
        super(eld.u, $$0, $$1);
        this.e = $$2;
    }

    @Override
    public yh ap() {
        if (this.d != null) {
            return this.d;
        }
        return c;
    }

    @Override
    public @Nullable yh as() {
        return this.d;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.f.equals(ekr.a)) {
            $$0.a(b, ekr.b, this.f);
        }
        $$0.b("CustomName", yj.a, this.d);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.d = ekp.a($$0, "CustomName");
        this.f = $$0.a(b, ekr.b).orElse(ekr.a);
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.c($$0);
    }

    public ekr b() {
        return this.f;
    }

    public dlt c() {
        dlt $$0 = new dlt(dyv.a(this.e));
        $$0.b(this.t());
        return $$0;
    }

    public dkr f() {
        return this.e;
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.f = $$0.a(ki.at, ekr.a);
        this.d = $$0.a(ki.h);
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.at, this.f);
        $$0.a(ki.h, this.d);
    }

    @Override
    public void b(fns $$0) {
        $$0.c(b);
        $$0.c("CustomName");
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }
}

