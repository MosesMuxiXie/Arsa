/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;

public class guf
extends gti<dif> {
    private static final amo[] J = new amo[]{amo.b("container/enchanting_table/level_1"), amo.b("container/enchanting_table/level_2"), amo.b("container/enchanting_table/level_3")};
    private static final amo[] K = new amo[]{amo.b("container/enchanting_table/level_1_disabled"), amo.b("container/enchanting_table/level_2_disabled"), amo.b("container/enchanting_table/level_3_disabled")};
    private static final amo L = amo.b("container/enchanting_table/enchantment_slot_disabled");
    private static final amo M = amo.b("container/enchanting_table/enchantment_slot_highlighted");
    private static final amo N = amo.b("container/enchanting_table/enchantment_slot");
    private static final amo O = amo.b("textures/gui/container/enchanting_table.png");
    private static final amo P = amo.b("textures/entity/enchanting_table_book.png");
    private final bgr Q = bgr.a();
    private hgr R;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    private dlt S = dlt.l;

    public guf(dif $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.R = new hgr(this.n.aV().a(hdf.G));
    }

    @Override
    public void p() {
        super.p();
        this.n.s.f = this.n.s.at;
        this.I();
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        int $$2 = (this.o - this.d) / 2;
        int $$3 = (this.p - this.e) / 2;
        for (int $$4 = 0; $$4 < 3; ++$$4) {
            double $$5 = $$0.u() - (double)($$2 + 60);
            double $$6 = $$0.v() - (double)($$3 + 14 + 19 * $$4);
            if (!($$5 >= 0.0) || !($$6 >= 0.0) || !($$5 < 108.0) || !($$6 < 19.0) || !((dif)this.w).a((ddm)this.n.s, $$4)) continue;
            this.n.q.a(((dif)this.w).l, $$4);
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, O, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        this.e($$0, $$4, $$5);
        gue.a().a(((dif)this.w).m());
        int $$6 = ((dif)this.w).l();
        for (int $$7 = 0; $$7 < 3; ++$$7) {
            int $$8 = $$4 + 60;
            int $$9 = $$8 + 20;
            int $$10 = ((dif)this.w).m[$$7];
            if ($$10 == 0) {
                $$0.a(hpa.at, L, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                continue;
            }
            String $$11 = "" + $$10;
            int $$12 = 86 - this.q.b($$11);
            yn $$13 = gue.a().a(this.q, $$12);
            int $$14 = -9937334;
            if (!($$6 >= $$7 + 1 && this.n.s.cs >= $$10 || this.n.s.gv())) {
                $$0.a(hpa.at, L, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                $$0.a(hpa.at, K[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
                $$0.a(this.q, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, bel.g(($$14 & 0xFEFEFE) >> 1), false);
                $$14 = -12550384;
            } else {
                int $$15 = $$2 - ($$4 + 60);
                int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
                if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                    $$0.a(hpa.at, M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                    $$0.a(fyn.d);
                    $$14 = -128;
                } else {
                    $$0.a(hpa.at, N, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                }
                $$0.a(hpa.at, J[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
                $$0.a(this.q, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14, false);
                $$14 = -8323296;
            }
            $$0.b(this.q, $$11, $$9 + 86 - this.q.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
        }
    }

    private void e(gir $$0, int $$1, int $$2) {
        float $$3 = this.n.aD().a(false);
        float $$4 = bgj.h($$3, this.I, this.H);
        float $$5 = bgj.h($$3, this.E, this.D);
        int $$6 = $$1 + 14;
        int $$7 = $$2 + 14;
        int $$8 = $$6 + 38;
        int $$9 = $$7 + 31;
        $$0.a(this.R, P, 40.0f, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        float $$4 = this.n.aD().a(false);
        super.a($$0, $$1, $$2, $$4);
        this.c($$0, $$1, $$2);
        boolean $$5 = this.n.s.gv();
        int $$6 = ((dif)this.w).l();
        for (int $$7 = 0; $$7 < 3; ++$$7) {
            int $$8 = ((dif)this.w).m[$$7];
            Optional<jd.c<dso>> $$9 = this.n.r.J_().f(mj.bf).c(((dif)this.w).n[$$7]);
            if ($$9.isEmpty()) continue;
            int $$10 = ((dif)this.w).o[$$7];
            int $$11 = $$7 + 1;
            if (!this.a(60, 14 + 19 * $$7, 108, 17, $$1, $$2) || $$8 <= 0 || $$10 < 0) continue;
            ArrayList $$12 = Lists.newArrayList();
            $$12.add(yh.a("container.enchant.clue", dso.a((jd<dso>)$$9.get(), $$10)).a(l.p));
            if (!$$5) {
                $$12.add(yg.a);
                if (this.n.s.cs < $$8) {
                    $$12.add(yh.a("container.enchant.level.requirement", ((dif)this.w).m[$$7]).a(l.m));
                } else {
                    yw $$16;
                    yw $$14;
                    if ($$11 == 1) {
                        yw $$13 = yh.c("container.enchant.lapis.one");
                    } else {
                        $$14 = yh.a("container.enchant.lapis.many", $$11);
                    }
                    $$12.add($$14.a($$6 >= $$11 ? l.h : l.m));
                    if ($$11 == 1) {
                        yw $$15 = yh.c("container.enchant.level.one");
                    } else {
                        $$16 = yh.a("container.enchant.level.many", $$11);
                    }
                    $$12.add($$16.a(l.h));
                }
            }
            $$0.a(this.q, $$12, $$1, $$2);
            break;
        }
    }

    public void I() {
        dlt $$0 = ((dif)this.w).b(0).g();
        if (!dlt.a($$0, this.S)) {
            this.S = $$0;
            do {
                this.F += (float)(this.Q.a(4) - this.Q.a(4));
            } while (this.D <= this.F + 1.0f && this.D >= this.F - 1.0f);
        }
        this.E = this.D;
        this.I = this.H;
        boolean $$1 = false;
        for (int $$2 = 0; $$2 < 3; ++$$2) {
            if (((dif)this.w).m[$$2] == 0) continue;
            $$1 = true;
            break;
        }
        this.H = $$1 ? (this.H += 0.2f) : (this.H -= 0.2f);
        this.H = bgj.a(this.H, 0.0f, 1.0f);
        float $$3 = (this.F - this.D) * 0.4f;
        float $$4 = 0.2f;
        $$3 = bgj.a($$3, -0.2f, 0.2f);
        this.G += ($$3 - this.G) * 0.9f;
        this.D += this.G;
    }
}

