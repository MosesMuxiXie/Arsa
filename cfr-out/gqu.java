/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.text2speech.Narrator
 */
import com.mojang.text2speech.Narrator;

public class gqu
extends gsb {
    private static final yh a = yh.c("accessibility.onboarding.screen.title");
    private static final yh b = yh.c("accessibility.onboarding.screen.narrator");
    private static final int c = 4;
    private static final int d = 16;
    private static final float e = 1000.0f;
    private static final int f = 374;
    private final gjw t;
    private final gfo u;
    private final boolean v;
    private boolean w;
    private float x;
    private final Runnable y;
    private final gou z = new gou(this, this.o(), 33);
    private float A;
    private boolean B = true;
    private float C;

    public gqu(gfo $$0, Runnable $$1) {
        super(a);
        this.u = $$0;
        this.y = $$1;
        this.t = new gjw(true);
        this.v = gfj.V().aZ().a();
    }

    @Override
    public void bg_() {
        goy $$02 = this.z.c(goy.d());
        $$02.c().b().a(4);
        $$02.a(gjp.a(this.m, this.q).a(374).a(), (gox $$0) -> $$0.a(8));
        gjc gjc2 = this.u.aK().a(this.u);
        if (gjc2 instanceof gjl) {
            gjl $$1;
            this.r = $$1 = (gjl)gjc2;
            this.r.k = this.v;
            $$02.a(this.r);
        }
        $$02.a(gji.b(150, (gje $$0) -> this.a(new gvv(this, this.n.k)), false));
        $$02.a(gji.a(150, (gje $$0) -> this.a(new gvy((gsb)this, this.n.k, this.n.am())), false));
        this.z.b(gje.a(yg.j, (gje $$0) -> this.aX_()).a());
        this.z.a(this::c);
        this.c();
    }

    @Override
    protected void c() {
        this.z.a();
    }

    @Override
    protected void aI_() {
        if (this.v && this.r != null) {
            this.b(this.r);
        } else {
            super.aI_();
        }
    }

    private int o() {
        return 90;
    }

    @Override
    public void aX_() {
        if (this.C == 0.0f) {
            this.C = bhs.c();
        }
    }

    private void a(gsb $$0) {
        this.a(false, () -> this.n.a($$0));
    }

    private void a(boolean $$0, Runnable $$1) {
        if ($$0) {
            this.u.aM();
        }
        Narrator.getNarrator().clear();
        $$1.run();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.p();
        if (this.A == 0.0f && this.B) {
            this.A = bhs.c();
        }
        if (this.A > 0.0f) {
            float $$4 = ((float)bhs.c() - this.A) / 2000.0f;
            float $$5 = 1.0f;
            if ($$4 >= 1.0f) {
                this.B = false;
                this.A = 0.0f;
            } else {
                $$4 = bgj.a($$4, 0.0f, 1.0f);
                $$5 = bgj.b($$4, 0.5f, 1.0f, 0.0f, 1.0f);
            }
            this.a($$5);
        }
        if (this.C > 0.0f) {
            float $$6 = 1.0f - ((float)bhs.c() - this.C) / 1000.0f;
            float $$7 = 0.0f;
            if ($$6 <= 0.0f) {
                this.C = 0.0f;
                this.a(true, this.y);
            } else {
                $$6 = bgj.a($$6, 0.0f, 1.0f);
                $$7 = bgj.b($$6, 0.5f, 1.0f, 0.0f, 1.0f);
            }
            this.a($$7);
        }
        this.t.a($$0, this.o, 1.0f);
    }

    @Override
    protected boolean aL_() {
        return false;
    }

    private void p() {
        if (!this.w && this.v) {
            if (this.x < 40.0f) {
                this.x += 1.0f;
            } else if (this.n.aI()) {
                Narrator.getNarrator().say(b.getString(), true, this.n.k.a(bdb.j));
                this.w = true;
            }
        }
    }
}

