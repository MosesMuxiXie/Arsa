/*
 * Decompiled with CFR 0.152.
 */
public class gqw
extends gsb {
    private static final yh e = yh.c("selectWorld.backupJoinSkipButton");
    public static final yh a = yh.c("selectWorld.backupJoinConfirmButton");
    private final Runnable f;
    protected final a b;
    private final yh t;
    private final boolean u;
    private gjy v = gjy.a;
    final yh c;
    protected int d;
    private gjg w;

    public gqw(Runnable $$0, a $$1, yh $$2, yh $$3, boolean $$4) {
        this($$0, $$1, $$2, $$3, a, $$4);
    }

    public gqw(Runnable $$0, a $$1, yh $$2, yh $$3, yh $$4, boolean $$5) {
        super($$2);
        this.f = $$0;
        this.b = $$1;
        this.t = $$3;
        this.u = $$5;
        this.c = $$4;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.v = gjy.a(this.q, this.t, this.o - 50);
        int $$02 = (this.v.a() + 1) * this.q.b;
        this.w = gjg.a(yh.c("selectWorld.backupEraseCache").b(-2039584), this.q).a(this.o / 2 - 155 + 80, 76 + $$02).a();
        if (this.u) {
            this.c(this.w);
        }
        this.c(gje.a(this.c, (gje $$0) -> this.b.proceed(true, this.w.a())).a(this.o / 2 - 155, 100 + $$02, 150, 20).a());
        this.c(gje.a(e, (gje $$0) -> this.b.proceed(false, this.w.a())).a(this.o / 2 - 155 + 160, 100 + $$02, 150, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.f.run()).a(this.o / 2 - 155 + 80, 124 + $$02, 150, 20).a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        gil $$4 = $$0.h();
        $$0.a(this.q, this.m, this.o / 2, 50, -1);
        this.v.a(git.b, this.o / 2, 70, this.q.b, $$4);
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.t() == 256) {
            this.f.run();
            return true;
        }
        return super.a($$0);
    }

    public static interface a {
        public void proceed(boolean var1, boolean var2);
    }
}

