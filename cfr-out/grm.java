/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class grm
extends gsb {
    private @Nullable gjp a;

    public grm(yh $$0) {
        super($$0);
    }

    @Override
    protected void bg_() {
        this.a = this.c(gjp.a(this.m, this.q, 12).b(this.q.a(this.m)).a());
        this.c();
    }

    @Override
    protected void c() {
        if (this.a != null) {
            this.a.c(this.o / 2 - this.a.aS_() / 2, this.p / 2 - this.q.b / 2);
        }
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    protected boolean bc_() {
        return false;
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        this.a($$0, $$3);
        this.b($$0);
        this.a($$0);
    }
}

