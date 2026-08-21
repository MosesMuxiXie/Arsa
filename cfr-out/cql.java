/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cql<T extends chl>
extends cqj<T> {
    private static final int i = 200;
    private int j = 0;

    public cql(dfi $$0, Class<T> $$1, boolean $$2, @Nullable csk.a $$3) {
        super($$0, $$1, 500, $$2, false, $$3);
    }

    public int i() {
        return this.j;
    }

    public void k() {
        --this.j;
    }

    @Override
    public boolean b() {
        if (this.j > 0 || !this.e.ep().h()) {
            return false;
        }
        if (!((dfi)this.e).hh()) {
            return false;
        }
        this.h();
        return this.c != null;
    }

    @Override
    public void d() {
        this.j = cql.b(200);
        super.d();
    }
}

