/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class gdn
extends isc {
    private static final int F = 2;
    public static final List<ccz> a = ImmutableList.of((Object)ccz.a, (Object)ccz.b, (Object)ccz.c, (Object)ccz.d);
    private static final int G = 0;
    public static final List<dwl> b = ImmutableList.of((Object)dwl.a, (Object)dwl.b, (Object)dwl.c);
    private static final yh H = yh.c("mco.configure.world.edit.slot.name");
    static final yh I = yh.c("mco.configure.world.spawnProtection");
    private gjn J;
    protected final gdi c;
    private int K;
    private int L;
    private final gbk M;
    private final gbg.d N;
    private ccz O;
    private dwl P;
    private final String Q;
    private String R;
    int S;
    private boolean T;
    a U;

    public gdn(gdi $$0, gbk $$1, gbg.d $$2, int $$3) {
        super(yh.c("mco.configure.world.buttons.options"));
        this.c = $$0;
        this.M = $$1;
        this.N = $$2;
        this.O = gdn.a(a, $$1.b.c, 2);
        this.P = gdn.a(b, $$1.b.d, 0);
        this.Q = $$1.b.b($$3);
        this.a($$1.b.a($$3));
        if ($$2 == gbg.d.a) {
            this.S = $$1.b.a;
            this.T = $$1.b.b;
        } else {
            this.S = 0;
            this.T = false;
        }
    }

    @Override
    public void aX_() {
        this.n.a(this.c);
    }

    private static <T> T a(List<T> $$0, int $$1, int $$2) {
        try {
            return $$0.get($$1);
        }
        catch (IndexOutOfBoundsException $$3) {
            return $$0.get($$2);
        }
    }

    private static <T> int a(List<T> $$0, T $$1, int $$2) {
        int $$3 = $$0.indexOf($$1);
        return $$3 == -1 ? $$2 : $$3;
    }

    @Override
    public void bg_() {
        this.L = 170;
        this.K = this.o / 2 - this.L;
        int $$02 = this.o / 2 + 10;
        if (this.N != gbg.d.a) {
            yw $$3;
            if (this.N == gbg.d.c) {
                yw $$12 = yh.c("mco.configure.world.edit.subscreen.adventuremap");
            } else if (this.N == gbg.d.e) {
                yw $$2 = yh.c("mco.configure.world.edit.subscreen.inspiration");
            } else {
                $$3 = yh.c("mco.configure.world.edit.subscreen.experience");
            }
            this.a(new isb($$3, this.o / 2, 26, -65536));
        }
        this.J = this.d(new gjn(this.n.g, this.K, gdn.a(1), this.L, 20, null, yh.c("mco.configure.world.edit.slot.name")));
        this.J.a(this.R);
        this.J.b(this::a);
        gjl<ccz> $$4 = this.c(gjl.a(ccz::b, this.O).a((Collection<ccz>)a).a($$02, gdn.a(1), this.L, 20, yh.c("options.difficulty"), ($$0, $$1) -> {
            this.O = $$1;
        }));
        gjl<dwl> $$5 = this.c(gjl.a(dwl::e, this.P).a((Collection<dwl>)b).a(this.K, gdn.a(3), this.L, 20, yh.c("selectWorld.gameMode"), ($$0, $$1) -> {
            this.P = $$1;
        }));
        gjl<Boolean> $$6 = this.c(gjl.a(this.T).a($$02, gdn.a(3), this.L, 20, yh.c("mco.configure.world.forceGameMode"), ($$0, $$1) -> {
            this.T = $$1;
        }));
        this.U = this.c(new a(this.K, gdn.a(5), this.L, this.S, 0.0f, 16.0f));
        if (this.N != gbg.d.a) {
            this.U.k = false;
            $$6.k = false;
        }
        if (this.M.b()) {
            $$4.k = false;
            $$5.k = false;
            $$6.k = false;
        }
        this.c(gje.a(yh.c("mco.configure.world.buttons.done"), (gje $$0) -> this.o()).a(this.K, gdn.a(13), this.L, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.aX_()).a($$02, gdn.a(13), this.L, 20).a());
    }

    private gjl.c<Boolean> a(yh $$0, Consumer<Boolean> $$1) {
        return ($$2, $$3) -> {
            if ($$3.booleanValue()) {
                $$1.accept(true);
            } else {
                this.n.a(gcy.b(this, $$0, (gkh $$1) -> {
                    $$1.accept(false);
                    $$1.aX_();
                }));
            }
        };
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{this.q(), this.p()});
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 17, -1);
        $$0.b(this.q, H, this.K + this.L / 2 - this.q.a(H) / 2, gdn.a(0) - 5, -1);
        this.J.a($$0, $$1, $$2, $$3);
    }

    private void a(String $$0) {
        this.R = $$0.equals(this.Q) ? "" : $$0;
    }

    private void o() {
        int $$0 = gdn.a(a, this.O, 2);
        int $$1 = gdn.a(b, this.P, 0);
        if (this.N == gbg.d.c || this.N == gbg.d.d || this.N == gbg.d.e) {
            this.c.a(new gbk(this.M.a, new gbn(this.M.b.a, $$0, $$1, this.M.b.b, this.R, this.M.b.e, this.M.b.f), this.M.c));
        } else {
            this.c.a(new gbk(this.M.a, new gbn(this.S, $$0, $$1, this.T, this.R, this.M.b.e, this.M.b.f), this.M.c));
        }
    }

    class a
    extends giz {
        private final double n;
        private final double o;

        public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
            super($$0, $$1, $$2, 20, yg.a, 0.0);
            this.n = $$4;
            this.o = $$5;
            this.e = (bgj.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4);
            this.c();
        }

        @Override
        public void a() {
            if (!gdn.this.U.k) {
                return;
            }
            gdn.this.S = (int)bgj.d(bgj.a(this.e, 0.0, 1.0), this.n, this.o);
        }

        @Override
        protected void c() {
            this.a_(yg.a(I, gdn.this.S == 0 ? yg.c : yh.b(String.valueOf(gdn.this.S))));
        }
    }
}

