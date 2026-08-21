/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class gwf
extends gsb {
    private static final int a = 20;
    private static final int b = 5;
    private static final int c = 20;
    private final yh d;
    private final List<yh> e;
    private final ImmutableList<a> f;
    private gjy t = gjy.a;
    private int u;
    private int v;

    protected gwf(yh $$0, List<yh> $$1, ImmutableList<a> $$2) {
        super($$0);
        this.e = $$1;
        this.d = yg.a(new yh[]{$$0, yk.a($$1, yg.a)});
        this.f = $$2;
    }

    @Override
    public yh i() {
        return this.d;
    }

    @Override
    public void bg_() {
        for (a $$0 : this.f) {
            this.v = Math.max(this.v, 20 + this.q.a($$0.a) + 20);
        }
        int $$1 = 5 + this.v + 5;
        int $$2 = $$1 * this.f.size();
        this.t = gjy.a(this.q, $$2, this.e.toArray(new yh[0]));
        int $$3 = this.t.a() * this.q.b;
        this.u = (int)((double)this.p / 2.0 - (double)$$3 / 2.0);
        int $$4 = this.u + $$3 + this.q.b * 2;
        int $$5 = (int)((double)this.o / 2.0 - (double)$$2 / 2.0);
        for (a $$6 : this.f) {
            this.c(gje.a($$6.a, $$6.b).a($$5, $$4, this.v, 20).a());
            $$5 += $$1;
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        gil $$4 = $$0.h();
        $$0.a(this.q, this.m, this.o / 2, this.u - this.q.b * 2, -1);
        this.t.a(git.b, this.o / 2, this.u, this.q.b, $$4);
    }

    @Override
    public boolean aY_() {
        return false;
    }

    public static final class a {
        final yh a;
        final gje.c b;

        public a(yh $$0, gje.c $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

