/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class coi
extends cop {
    private int a;
    private final cht b;
    private @Nullable ddm c;
    private cnw d;

    public coi(cht $$0) {
        this.b = $$0;
    }

    @Override
    public boolean b() {
        if (this.c != null && this.c.aZ()) {
            return true;
        }
        List<dgb> $$0 = this.b.ao().a(dgb.class, this.b.dj().g(5.0));
        for (dgb $$1 : $$0) {
            ddm $$2;
            chl chl2 = $$1.dl();
            if (!(chl2 instanceof ddm) || !($$2 = (ddm)chl2).aZ()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean W_() {
        return true;
    }

    @Override
    public boolean c() {
        return this.c != null && this.c.cq() && this.c.aZ();
    }

    @Override
    public void d() {
        List<dgb> $$0 = this.b.ao().a(dgb.class, this.b.dj().g(5.0));
        for (dgb $$1 : $$0) {
            ddm $$2;
            chl chl2 = $$1.dl();
            if (!(chl2 instanceof ddm)) continue;
            this.c = $$2 = (ddm)chl2;
            break;
        }
        this.a = 0;
        this.d = cnw.a;
    }

    @Override
    public void e() {
        this.c = null;
    }

    @Override
    public void a() {
        float $$0 = this.d == cnw.b ? 0.01f : 0.015f;
        this.b.a($$0, new ftm(this.b.bN, this.b.bO, this.b.bP));
        this.b.a(chp.a, this.b.dN());
        if (--this.a > 0) {
            return;
        }
        this.a = this.a(10);
        if (this.d == cnw.a) {
            is $$1 = this.c.dK().a(this.c.dg().g());
            $$1 = $$1.b(0, -1, 0);
            this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
            if (this.b.f((cgk)this.c) < 4.0f) {
                this.a = 0;
                this.d = cnw.b;
            }
        } else if (this.d == cnw.b) {
            iz $$2 = this.c.dh();
            is $$3 = this.c.dK().a($$2, 10);
            this.b.N().a((double)$$3.u(), (double)($$3.v() - 1), (double)$$3.w(), 1.0);
            if (this.b.f((cgk)this.c) > 12.0f) {
                this.a = 0;
                this.d = cnw.a;
            }
        }
    }
}

