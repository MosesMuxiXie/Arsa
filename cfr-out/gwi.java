/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.lang3.ArrayUtils;

public class gwi
extends gjk<b> {
    private static final int a = 20;
    final gwj f;
    private int n;

    public gwi(gwj $$0, gfj $$1) {
        super($$1, $$0.o, $$0.e.d(), $$0.e.c(), 20);
        this.f = $$0;
        Object[] $$2 = (gfh[])ArrayUtils.clone((Object[])$$1.k.as);
        Arrays.sort($$2);
        gfh.a $$3 = null;
        for (Object $$4 : $$2) {
            yw $$6;
            int $$7;
            gfh.a $$5 = ((gfh)$$4).g();
            if ($$5 != $$3) {
                $$3 = $$5;
                this.c(new a($$5));
            }
            if (($$7 = $$1.g.a($$6 = yh.c(((gfh)$$4).k()))) > this.n) {
                this.n = $$7;
            }
            this.c(new c((gfh)$$4, $$6));
        }
    }

    public void d() {
        gfh.e();
        this.I();
    }

    public void I() {
        this.aJ_().forEach(b::c);
    }

    @Override
    public int a() {
        return 340;
    }

    public class a
    extends b {
        private final gjp b;

        public a(gfh.a $$1) {
            this.b = gjp.a($$1.a(), ((gwi)gwi.this).c.g).a(false).a(gjp.a.b).a();
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.b.c(gwi.this.g / 2 - this.b.aS_() / 2, this.k() - this.b.aR_());
            this.b.a($$0, $$1, $$2, $$4);
        }

        @Override
        public List<? extends gmm> aJ_() {
            return List.of(this.b);
        }

        @Override
        public List<? extends gpb> b() {
            return List.of(this.b);
        }

        @Override
        protected void c() {
        }
    }

    public class c
    extends b {
        private static final yh b = yh.c("controls.reset");
        private static final int c = 10;
        private final gfh d;
        private final yh e;
        private final gje f;
        private final gje g;
        private boolean i = false;

        c(gfh $$12, yh $$22) {
            this.d = $$12;
            this.e = $$22;
            this.f = gje.a($$22, (gje $$1) -> {
                gwi.this.f.a = $$12;
                gwi.this.d();
            }).a(0, 0, 75, 20).a((Supplier<yw> $$2) -> {
                if ($$12.m()) {
                    return yh.a("narrator.controls.unbound", $$22);
                }
                return yh.a("narrator.controls.bound", $$22, $$2.get());
            }).a();
            this.g = gje.a(b, (gje $$1) -> {
                $$12.b($$12.l());
                gwi.this.d();
            }).a(0, 0, 50, 20).a((Supplier<yw> $$1) -> yh.a("narrator.controls.reset", $$22)).a();
            this.c();
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = gwi.this.m() - this.g.aS_() - 10;
            int $$6 = this.h() - 2;
            this.g.c($$5, $$6);
            this.g.a($$0, $$1, $$2, $$4);
            int $$7 = $$5 - 5 - this.f.aS_();
            this.f.c($$7, $$6);
            this.f.a($$0, $$1, $$2, $$4);
            $$0.b(((gwi)gwi.this).c.g, this.e, this.d(), this.j() - ((gwi)gwi.this).c.g.b / 2, -1);
            if (this.i) {
                int $$8 = 3;
                int $$9 = this.f.aT_() - 6;
                $$0.a($$9, this.h() - 1, $$9 + 3, this.k(), -256);
            }
        }

        @Override
        public List<? extends gmm> aJ_() {
            return ImmutableList.of((Object)this.f, (Object)this.g);
        }

        @Override
        public List<? extends gpb> b() {
            return ImmutableList.of((Object)this.f, (Object)this.g);
        }

        @Override
        protected void c() {
            this.f.a_(this.d.n());
            this.g.k = !this.d.o();
            this.i = false;
            yw $$0 = yh.i();
            if (!this.d.m()) {
                for (gfh $$1 : ((gwi)gwi.this).c.k.as) {
                    if ($$1 == this.d || !this.d.b($$1) || $$1.o() && this.d.o()) continue;
                    if (this.i) {
                        $$0.f(", ");
                    }
                    this.i = true;
                    $$0.b(yh.c($$1.k()));
                }
            }
            if (this.i) {
                this.f.a_(yh.b("[ ").b(this.f.B().f().a(l.p)).f(" ]").a(l.o));
                this.f.a(gks.a(yh.a("controls.keybinds.duplicateKeybinds", $$0)));
            } else {
                this.f.a((gks)null);
            }
            if (gwi.this.f.a == this.d) {
                this.f.a_(yh.b("> ").b(this.f.B().f().a(l.p, l.t)).f(" <").a(l.o));
            }
        }
    }

    public static abstract class b
    extends gjk.a<b> {
        abstract void c();
    }
}

