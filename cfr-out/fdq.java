/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class fdq {
    public static final amt<fdp> a = fdq.a("classic_flat");
    public static final amt<fdp> b = fdq.a("tunnelers_dream");
    public static final amt<fdp> c = fdq.a("water_world");
    public static final amt<fdp> d = fdq.a("overworld");
    public static final amt<fdp> e = fdq.a("snowy_kingdom");
    public static final amt<fdp> f = fdq.a("bottomless_pit");
    public static final amt<fdp> g = fdq.a("desert");
    public static final amt<fdp> h = fdq.a("redstone_ready");
    public static final amt<fdp> i = fdq.a("the_void");

    public static void a(qr<fdp> $$0) {
        new a($$0).a();
    }

    private static amt<fdp> a(String $$0) {
        return amt.a(mj.bg, amo.b($$0));
    }

    static class a {
        private final qr<fdp> a;

        a(qr<fdp> $$0) {
            this.a = $$0;
        }

        private void a(amt<fdp> $$0, dwn $$1, amt<dxo> $$2, Set<amt<ffu>> $$3, boolean $$4, boolean $$5, fdo ... $$6) {
            je<ffu> $$7 = this.a.a(mj.br);
            je<fes> $$8 = this.a.a(mj.bp);
            je<dxo> $$9 = this.a.a(mj.aS);
            jh.a $$10 = jh.a($$3.stream().map($$7::b).collect(Collectors.toList()));
            fdr $$11 = new fdr(Optional.of($$10), $$9.b($$2), fdr.b($$8));
            if ($$4) {
                $$11.a();
            }
            if ($$5) {
                $$11.b();
            }
            for (int $$12 = $$6.length - 1; $$12 >= 0; --$$12) {
                $$11.e().add($$6[$$12]);
            }
            this.a.a($$0, new fdp($$1.h().e(), $$11));
        }

        public void a() {
            this.a(a, dzs.i, dxv.b, (Set<amt<ffu>>)ImmutableSet.of(ffh.a), false, false, new fdo(1, dzs.i), new fdo(2, dzs.j), new fdo(1, dzs.I));
            this.a(b, dzs.b, dxv.u, (Set<amt<ffu>>)ImmutableSet.of(ffh.j, ffh.r), true, false, new fdo(1, dzs.i), new fdo(5, dzs.j), new fdo(230, dzs.b), new fdo(1, dzs.I));
            this.a(c, dlx.sl, dxv.U, (Set<amt<ffu>>)ImmutableSet.of(ffh.m, ffh.l, ffh.g), false, false, new fdo(90, dzs.J), new fdo(5, dzs.O), new fdo(5, dzs.j), new fdo(5, dzs.b), new fdo(64, dzs.ui), new fdo(1, dzs.I));
            this.a(d, dzs.bA, dxv.b, (Set<amt<ffu>>)ImmutableSet.of(ffh.a, ffh.j, ffh.f, ffh.k, ffh.r), true, true, new fdo(1, dzs.i), new fdo(3, dzs.j), new fdo(59, dzs.b), new fdo(1, dzs.I));
            this.a(e, dzs.ep, dxv.d, (Set<amt<ffu>>)ImmutableSet.of(ffh.a, ffh.c), false, false, new fdo(1, dzs.ep), new fdo(1, dzs.i), new fdo(3, dzs.j), new fdo(59, dzs.b), new fdo(1, dzs.I));
            this.a(f, dlx.qZ, dxv.b, (Set<amt<ffu>>)ImmutableSet.of(ffh.a), false, false, new fdo(1, dzs.i), new fdo(3, dzs.j), new fdo(2, dzs.m));
            this.a(g, dzs.L, dxv.f, (Set<amt<ffu>>)ImmutableSet.of(ffh.a, ffh.b, ffh.j, ffh.r), true, false, new fdo(8, dzs.L), new fdo(52, dzs.bc), new fdo(3, dzs.b), new fdo(1, dzs.I));
            this.a(h, dlx.mB, dxv.f, (Set<amt<ffu>>)ImmutableSet.of(), false, false, new fdo(116, dzs.bc), new fdo(3, dzs.b), new fdo(1, dzs.I));
            this.a(i, dzs.iO, dxv.a, (Set<amt<ffu>>)ImmutableSet.of(), true, false, new fdo(1, dzs.a));
        }
    }
}

