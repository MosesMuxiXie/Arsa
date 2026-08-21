/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class gpy
extends gpz<gqr> {
    private boolean b;
    private @Nullable Object c;

    public gpy(hon.a $$0) {
        super($$0);
    }

    public boolean c() {
        return this.b;
    }

    public void d() {
        this.b = false;
    }

    public void e() {
        this.c = null;
    }

    @Override
    public Class<gqr> a() {
        return gqr.class;
    }

    @Override
    protected void a(gqr $$0, fzm $$1) {
        boolean $$9;
        $$1.b(1.0f, -1.0f, -1.0f);
        gqf $$2 = $$0.c();
        gpm $$3 = $$2.g();
        Objects.requireNonNull($$3);
        float $$4 = (float)($$3.d() + $$3.e()) / 2.0f;
        float $$5 = (float)($$3.b() + $$3.c()) / 2.0f;
        float $$6 = (float)$$2.d() + 8.0f;
        float $$7 = (float)$$2.e() + 8.0f;
        $$1.a(($$6 - $$4) / 16.0f, ($$5 - $$7) / 16.0f, 0.0f);
        ihs $$8 = $$2.c();
        boolean bl2 = $$9 = !$$8.f();
        if ($$9) {
            gfj.V().i.t().a(fyd.a.b);
        } else {
            gfj.V().i.t().a(fyd.a.c);
        }
        ige $$10 = gfj.V().i.c();
        hpp $$11 = $$10.c();
        $$8.a($$1, $$11, 0xF000F0, ilg.d, 0);
        $$10.a();
        this.c = $$8.i();
    }

    @Override
    public void a(gqr $$0, gqg $$1) {
        super.a($$0, $$1);
        this.b = true;
    }

    @Override
    public boolean a(gqr $$0) {
        ihs $$1 = $$0.c().c();
        return !$$1.d() && $$1.i().equals(this.c);
    }

    @Override
    protected float a(int $$0, int $$1) {
        return (float)$$0 / 2.0f;
    }

    @Override
    protected String b() {
        return "oversized_item";
    }
}

