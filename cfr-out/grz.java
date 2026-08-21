/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class grz
extends gsb
implements bgq {
    private @Nullable yh a;
    private @Nullable yh b;
    private int c;
    private boolean d;
    private final boolean e;

    public grz(boolean $$0) {
        super(gfa.a);
        this.e = $$0;
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
    public void a(yh $$0) {
        this.b($$0);
    }

    @Override
    public void b(yh $$0) {
        this.a = $$0;
        this.c(yh.c("menu.working"));
    }

    @Override
    public void c(yh $$0) {
        this.b = $$0;
        this.a(0);
    }

    @Override
    public void a(int $$0) {
        this.c = $$0;
    }

    @Override
    public void a() {
        this.d = true;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        if (this.d) {
            if (this.e) {
                this.n.a((gsb)null);
            }
            return;
        }
        super.a($$0, $$1, $$2, $$3);
        if (this.a != null) {
            $$0.a(this.q, this.a, this.o / 2, 70, -1);
        }
        if (this.b != null && this.c != 0) {
            $$0.a(this.q, (yh)yh.i().b(this.b).f(" " + this.c + "%"), this.o / 2, 90, -1);
        }
    }
}

