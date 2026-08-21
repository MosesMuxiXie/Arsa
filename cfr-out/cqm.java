/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cqm<T extends chl>
extends cqj<T> {
    private final cii i;

    public cqm(cii $$0, Class<T> $$1, boolean $$2, @Nullable csk.a $$3) {
        super($$0, $$1, 10, $$2, false, $$3);
        this.i = $$0;
    }

    @Override
    public boolean b() {
        return !this.i.p() && super.b();
    }

    @Override
    public boolean c() {
        if (this.d != null) {
            return this.d.a(cqm.a(this.e), this.e, this.c);
        }
        return super.c();
    }
}

