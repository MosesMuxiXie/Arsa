/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public abstract class giu
extends gjc.a {
    protected static final int e = 2;
    private static final gku a = new gku(amo.b("widget/button"), amo.b("widget/button_disabled"), amo.b("widget/button_highlighted"));
    private @Nullable Supplier<Boolean> b;

    public giu(int $$0, int $$1, int $$2, int $$3, yh $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    public abstract void a(gza var1);

    @Override
    protected final void a_(gir $$0, int $$1, int $$2, float $$3) {
        this.b($$0, $$1, $$2, $$3);
        this.d($$0);
    }

    protected abstract void b(gir var1, int var2, int var3, float var4);

    protected void a(gil $$0) {
        this.a($$0, this.B(), 2);
    }

    protected final void a(gir $$0) {
        $$0.a(hpa.at, a.a(this.k, this.b != null ? this.b.get().booleanValue() : this.D()), this.aT_(), this.aU_(), this.aS_(), this.aR_(), bel.b(this.m));
    }

    @Override
    public void b(gzc $$0, boolean $$1) {
        this.a((gza)$$0);
    }

    @Override
    public boolean a(gzb $$0) {
        if (!this.b()) {
            return false;
        }
        if ($$0.c()) {
            this.a(gfj.V().ap());
            this.a((gza)$$0);
            return true;
        }
        return false;
    }

    public void a(Supplier<Boolean> $$0) {
        this.b = $$0;
    }
}

