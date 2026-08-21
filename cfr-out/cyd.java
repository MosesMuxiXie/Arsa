/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cyd
extends cgk {
    public final cyc a;
    public final String b;
    private final cgn c;

    public cyd(cyc $$0, String $$1, float $$2, float $$3) {
        super($$0.ay(), $$0.ao());
        this.c = cgn.b($$2, $$3);
        this.j_();
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    protected void a(ama.a $$0) {
    }

    @Override
    protected void a(fnq $$0) {
    }

    @Override
    protected void a(fns $$0) {
    }

    @Override
    public boolean bX() {
        return true;
    }

    @Override
    public @Nullable dlt dZ() {
        return this.a.dZ();
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        if (this.d($$1)) {
            return false;
        }
        return this.a.a($$0, this, $$1, $$2);
    }

    @Override
    public boolean v(cgk $$0) {
        return this == $$0 || this.a == $$0;
    }

    @Override
    public aay<adb> a(axd $$0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public cgn a(chx $$0) {
        return this.c;
    }

    @Override
    public boolean ek() {
        return false;
    }
}

