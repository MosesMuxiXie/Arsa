/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class fmh
implements fmi {
    private final dwo b;

    public fmh(dwo $$0) {
        this.b = $$0;
    }

    @Override
    public void a(iz $$0, eoh $$1, is $$2, is $$3, @dzq.b int $$4, int $$5) {
        fmi.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
    }

    @Override
    public void a(is $$0, dzq $$1, @Nullable fmj $$2) {
        eoh $$3 = this.b.a_($$0);
        this.a($$3, $$0, $$1, $$2, false);
    }

    @Override
    public void a(eoh $$0, is $$1, dzq $$2, @Nullable fmj $$3, boolean $$4) {
        fmi.a(this.b, $$0, $$1, $$2, $$3, $$4);
    }
}

