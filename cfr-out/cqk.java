/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cqk<T extends chl>
extends cqj<T> {
    private boolean i = true;

    public cqk(dfi $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable csk.a $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void a(boolean $$0) {
        this.i = $$0;
    }

    @Override
    public boolean b() {
        return this.i && super.b();
    }
}

