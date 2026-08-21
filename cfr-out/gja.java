/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public abstract class gja
extends gjc {
    private @Nullable Consumer<zf> a = null;
    private final gio b;

    public gja(int $$0, int $$1, int $$2, int $$3, yh $$4, gio $$5) {
        super($$0, $$1, $$2, $$3, $$4);
        this.b = $$5;
    }

    public abstract void a(gil var1);

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        gir.a $$6;
        if (this.C()) {
            if (this.a != null) {
                gir.a $$4 = gir.a.c;
            } else {
                gir.a $$5 = gir.a.b;
            }
        } else {
            $$6 = gir.a.a;
        }
        this.a($$0.a(this, $$6));
    }

    @Override
    public void b(gzc $$0, boolean $$1) {
        if (this.a != null) {
            gil.a $$2 = new gil.a(this.a(), (int)$$0.u(), (int)$$0.v());
            this.a($$2);
            zf $$3 = $$2.b();
            if ($$3 != null) {
                this.a.accept($$3);
                return;
            }
        }
        super.b($$0, $$1);
    }

    @Override
    protected void a(gpd $$0) {
    }

    protected final gio a() {
        return this.b;
    }

    @Override
    public void a_(yh $$0) {
        super.a_($$0);
        this.c(this.a().a($$0.g()));
    }

    public gja b(@Nullable Consumer<zf> $$0) {
        this.a = $$0;
        return this;
    }
}

