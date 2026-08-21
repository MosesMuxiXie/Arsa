/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.function.Predicate;

public class cof
extends cop {
    private static final int a = 40;
    private static final Predicate<eoh> b = $$0 -> $$0.a(bdp.bm);
    private final chn c;
    private final dwo d;
    private int e;

    public cof(chn $$0) {
        this.c = $$0;
        this.d = $$0.ao();
        this.a(EnumSet.of(cop.a.a, cop.a.b, cop.a.c));
    }

    @Override
    public boolean b() {
        if (this.c.ep().a(this.a(this.c.e_() ? 50 : 1000)) != 0) {
            return false;
        }
        is $$0 = this.c.dK();
        if (b.test(this.d.a_($$0))) {
            return true;
        }
        return this.d.a_($$0.e()).a(dzs.i);
    }

    @Override
    public void d() {
        this.e = this.a(40);
        this.d.a((cgk)this.c, (byte)10);
        this.c.N().n();
    }

    @Override
    public void e() {
        this.e = 0;
    }

    @Override
    public boolean c() {
        return this.e > 0;
    }

    public int h() {
        return this.e;
    }

    @Override
    public void a() {
        this.e = Math.max(0, this.e - 1);
        if (this.e != this.a(4)) {
            return;
        }
        is $$0 = this.c.dK();
        if (b.test(this.d.a_($$0))) {
            if (cof.a(this.d).U().a(eua.F).booleanValue()) {
                this.d.b($$0, false);
            }
            this.c.R();
        } else {
            is $$1 = $$0.e();
            if (this.d.a_($$1).a(dzs.i)) {
                if (cof.a(this.d).U().a(eua.F).booleanValue()) {
                    this.d.c(2001, $$1, dzq.j(dzs.i.m()));
                    this.d.a($$1, dzs.j.m(), 2);
                }
                this.c.R();
            }
        }
    }
}

