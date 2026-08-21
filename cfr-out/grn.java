/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class grn
extends gsb {
    private static final int a = 80;
    private static final int b = 120;
    private static final int c = 360;
    private final @Nullable yh d;
    private final yh e;
    private final Runnable f;
    private @Nullable gjy t;
    private gje u;
    private int v;

    public static grn a(yh $$0, yh $$1, Runnable $$2) {
        return new grn($$0, null, $$1, $$2, 0);
    }

    public static grn a(yh $$0, yh $$1, yh $$2, Runnable $$3) {
        return new grn($$0, $$1, $$2, $$3, 20);
    }

    protected grn(yh $$0, @Nullable yh $$1, yh $$2, Runnable $$3, int $$4) {
        super($$0);
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.v = $$4;
    }

    @Override
    protected void bg_() {
        super.bg_();
        if (this.d != null) {
            this.t = gjy.a(this.q, this.d, 360);
        }
        int $$02 = 150;
        int $$1 = 20;
        int $$2 = this.t != null ? this.t.a() : 1;
        int $$3 = Math.max($$2, 5) * this.q.b;
        int $$4 = Math.min(120 + $$3, this.p - 40);
        this.u = this.c(gje.a(this.e, (gje $$0) -> this.aX_()).a((this.o - 150) / 2, $$4, 150, 20).a());
    }

    @Override
    public void e() {
        if (this.v > 0) {
            --this.v;
        }
        this.u.k = this.v == 0;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        gil $$4 = $$0.h();
        $$0.a(this.q, this.m, this.o / 2, 80, -1);
        if (this.t == null) {
            String $$5 = grq.a(bhs.c());
            $$0.a(this.q, $$5, this.o / 2, 120, -6250336);
        } else {
            this.t.a(git.b, this.o / 2, 120, this.q.b, $$4);
        }
    }

    @Override
    public boolean aY_() {
        return this.t != null && this.u.k;
    }

    @Override
    public void aX_() {
        this.f.run();
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{this.m, this.d != null ? this.d : yg.a});
    }
}

