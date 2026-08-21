/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class giv
extends gix
implements gml {
    private @Nullable gmm a;
    private boolean c;

    public giv(int $$0, int $$1, int $$2, int $$3, yh $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public final boolean aN_() {
        return this.c;
    }

    @Override
    public final void c_(boolean $$0) {
        this.c = $$0;
    }

    @Override
    public @Nullable gmm aO_() {
        return this.a;
    }

    @Override
    public void a(@Nullable gmm $$0) {
        if (this.a != null) {
            this.a.b(false);
        }
        if ($$0 != null) {
            $$0.b(true);
        }
        this.a = $$0;
    }

    @Override
    public @Nullable gin a(gpi $$0) {
        return gml.super.a($$0);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        boolean $$2 = this.c($$0);
        return gml.super.a($$0, $$1) || $$2;
    }

    @Override
    public boolean b(gzc $$0) {
        super.b($$0);
        return gml.super.b($$0);
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        super.a($$0, $$1, $$2);
        return gml.super.a($$0, $$1, $$2);
    }

    @Override
    public boolean aP_() {
        return gml.super.aP_();
    }

    @Override
    public void b(boolean $$0) {
        gml.super.b($$0);
    }
}

