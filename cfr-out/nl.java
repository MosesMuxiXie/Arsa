/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nl
implements no {
    protected final jf.a a;
    protected final Set<dlp> b;
    protected final dgz c;
    protected final Map<amt<fof>, fof.a> d;
    protected static final float[] e = new float[]{0.05f, 0.0625f, 0.083333336f, 0.1f};
    private static final float[] f = new float[]{0.02f, 0.022222223f, 0.025f, 0.033333335f, 0.1f};

    protected frm.a a() {
        return frt.a(cg.a.a().a(bh.a.a().a(kt.b, ku.a(List.of(new bn(this.a.e(mj.bf).b(dst.v), cq.d.b(1))))).b()));
    }

    protected frm.a b() {
        return this.a().invert();
    }

    protected frm.a c() {
        return frt.a(cg.a.a().a(this.a.e(mj.R), dlx.tZ));
    }

    private frm.a f() {
        return this.c().or(this.a());
    }

    private frm.a g() {
        return this.f().invert();
    }

    protected nl(Set<dlp> $$0, dgz $$1, jf.a $$2) {
        this($$0, $$1, new HashMap<amt<fof>, fof.a>(), $$2);
    }

    protected nl(Set<dlp> $$0, dgz $$1, Map<amt<fof>, fof.a> $$2, jf.a $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.a = $$3;
    }

    protected <T extends fpn<T>> T a(dwn $$0, fpn<T> $$1) {
        if (!this.b.contains($$0.h())) {
            return $$1.b(fpa.c());
        }
        return $$1.c();
    }

    protected <T extends fre<T>> T a(dwn $$0, fre<T> $$1) {
        if (!this.b.contains($$0.h())) {
            return $$1.b(fri.c());
        }
        return $$1.d();
    }

    public fof.a a(dwn $$0) {
        return fof.b().a(this.a($$0, foe.a().a(fsf.a(1.0f)).a(fon.a($$0))));
    }

    private static fof.a a(dzq $$0, frm.a $$1, foq.a<?> $$2) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a(((fot.a)fon.a($$0).a($$1)).a($$2)));
    }

    protected fof.a a(dzq $$0, foq.a<?> $$1) {
        return nl.a($$0, this.a(), $$1);
    }

    protected fof.a b(dzq $$0, foq.a<?> $$1) {
        return nl.a($$0, this.c(), $$1);
    }

    protected fof.a c(dzq $$0, foq.a<?> $$1) {
        return nl.a($$0, this.f(), $$1);
    }

    protected fof.a a(dzq $$0, dwn $$1) {
        return this.a($$0, (foq.a)this.a((dwn)$$0, fon.a($$1)));
    }

    protected fof.a a(dwn $$0, fsi $$1) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a((foq.a)this.a($$0, (fpn)fon.a($$0).a(fqi.a($$1)))));
    }

    protected fof.a a(dzq $$0, dwn $$1, fsi $$2) {
        return this.a($$0, (foq.a)this.a((dwn)$$0, (fpn)fon.a($$1).a(fqi.a($$2))));
    }

    private fof.a d(dwn $$0) {
        return fof.b().a(foe.a().a(this.a()).a(fsf.a(1.0f)).a(fon.a($$0)));
    }

    private fof.a e(dwn $$0) {
        return fof.b().a(this.a((dwn)dzs.gG, foe.a().a(fsf.a(1.0f)).a(fon.a(dzs.gG)))).a(this.a($$0, foe.a().a(fsf.a(1.0f)).a(fon.a($$0))));
    }

    protected fof.a a(dzq $$0) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a((foq.a)this.a((dwn)$$0, (fpn)fon.a($$0).a((fpr.a)fqi.a(fsf.a(2.0f)).a(frl.a($$0).a(dl.a.a().a(ehi.b, epq.c)))))));
    }

    protected <T extends Comparable<T> & bhh> fof.a a(dzq $$0, epk<T> $$1, T $$2) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a($$0).a(frl.a($$0).a(dl.a.a().a($$1, $$2))))));
    }

    protected fof.a b(dzq $$0) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a($$0).a(fpc.b(fqx.j).a(ki.h)))));
    }

    protected fof.a c(dzq $$0) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a($$0).a(fpc.b(fqx.j).a(ki.h).a(ki.aw).a(ki.az).a(ki.aA)))));
    }

    protected fof.a d(dzq $$0) {
        jf.b<dso> $$1 = this.a.e(mj.bf);
        return this.a($$0, (foq.a)this.a((dwn)$$0, (fpn)((fot.a)fon.a(dlx.qh).a(fqi.a(fsm.a(2.0f, 5.0f)))).a(foz.a($$1.b(dst.x)))));
    }

    protected fof.a e(dzq $$0) {
        jf.b<dso> $$1 = this.a.e(mj.bf);
        return this.a($$0, (foq.a)this.a((dwn)$$0, (fpn)((fot.a)fon.a(dlx.qc).a(fqi.a(fsm.a(4.0f, 9.0f)))).a(foz.a($$1.b(dst.x)))));
    }

    protected fof.a f(dzq $$0) {
        jf.b<dso> $$1 = this.a.e(mj.bf);
        return this.a($$0, (foq.a)this.a((dwn)$$0, (fpn)((fot.a)fon.a(dlx.mB).a(fqi.a(fsm.a(4.0f, 5.0f)))).a(foz.b($$1.b(dst.x)))));
    }

    protected fof.a g(dzq $$0) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a($$0).a(fpc.b(fqx.j).a(ki.h).a(ki.k).a(ki.t).a(ki.at).a(ki.n)))));
    }

    protected fof.a h(dzq $$0) {
        return fof.b().a(foe.a().a(this.a()).a(fsf.a(1.0f)).a((foq.a<?>)((fot.a)fon.a($$0).a(fpc.b(fqx.j).a(ki.ay))).a(fpb.a($$0).a(dzk.c))));
    }

    protected fof.a i(dzq $$0) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a(((foq.a)((fot.a)((fot.a)fon.a($$0).a(this.a())).a(fpc.b(fqx.j).a(ki.ay))).a(fpb.a($$0).a(dzk.c))).a(fon.a($$0))));
    }

    protected fof.a j(dzq $$0) {
        return fof.b().a(foe.a().a(fon.a(dlx.zb)).a(frl.a($$0).a(dl.a.a().a(eao.v_, true))));
    }

    protected fof.a k(dzq $$0) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a<?>)((fot.a)fon.a($$0).a(fpc.b(fqx.j).a(ki.h))).a(fpb.a($$0).a(ebh.c)))));
    }

    protected fof.a a(dzq $$0, dlp $$1) {
        jf.b<dso> $$2 = this.a.e(mj.bf);
        return this.a($$0, (foq.a)this.a((dwn)$$0, (fpn)fon.a($$1).a(foz.a($$2.b(dst.x)))));
    }

    protected fof.a b(dzq $$0, dwn $$1) {
        return this.a($$0, (foq.a)this.a((dwn)$$0, (fpn)((fot.a)fon.a($$1).a(fqi.a(fsm.a(-6.0f, 2.0f)))).a(fpo.a(fny.b(0)))));
    }

    protected fof.a l(dzq $$0) {
        jf.b<dso> $$1 = this.a.e(mj.bf);
        return this.b($$0, (foq.a)this.a((dwn)$$0, (fpn)((fot.a)fon.a(dlx.rb).a(frr.a(0.125f))).a(foz.a($$1.b(dst.x), 2))));
    }

    public fof.a b(dzq $$0, dlp $$12) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a)fon.a($$12).a(eib.c.a(), (E $$1) -> fqi.a(fse.a(3, (float)($$1 + 1) / 15.0f)).a(frl.a($$0).a(dl.a.a().a(eib.c, $$1.intValue())))))));
    }

    public fof.a c(dzq $$0, dlp $$1) {
        return fof.b().a(this.a((dwn)$$0, foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a($$1).a(fqi.a(fse.a(3, 0.53333336f))))));
    }

    protected fof.a b(dwn $$0) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a(this.c()).a(fon.a($$0)));
    }

    protected fof.a c(dwn $$0) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a(this.f()).a(fon.a($$0)));
    }

    protected fof.a a(dzq $$0, frm.a $$12) {
        return fof.b().a(foe.a().a((foq.a)this.a((dwn)$$0, (fpn)((fot.a)((fot.a)fon.a($$0).a($$12)).a(iz.values(), (E $$1) -> fqi.a((fsi)fsf.a(1.0f), true).a(frl.a($$0).a(dl.a.a().a(eey.b($$1), true))))).a(fqi.a((fsi)fsf.a(-1.0f), true)))));
    }

    protected fof.a m(dzq $$0) {
        return fof.b().a(foe.a().a((foq.a)this.a((dwn)$$0, (fpn)((fot.a)fon.a($$0).a(iz.values(), (E $$1) -> fqi.a((fsi)fsf.a(1.0f), true).a(frl.a($$0).a(dl.a.a().a(eey.b($$1), true))))).a(fqi.a((fsi)fsf.a(-1.0f), true)))));
    }

    protected fof.a n(dzq $$0) {
        return fof.b().a(foe.a().a((foq.a)this.a((dwn)$$0, (fpn)fon.a($$0).a(frl.a($$0).a(dl.a.a().a(eew.b, true))))));
    }

    protected fof.a a(dzq $$0, dzq $$1, float ... $$2) {
        jf.b<dso> $$3 = this.a.e(mj.bf);
        return this.c($$0, (foq.a<?>)((fot.a)this.a((dwn)$$0, fon.a($$1))).a(frb.a($$3.b(dst.x), $$2))).a(foe.a().a(fsf.a(1.0f)).a(this.g()).a((foq.a<?>)((fot.a)this.a((dwn)$$0, (fpn)fon.a(dlx.qW).a(fqi.a(fsm.a(1.0f, 2.0f))))).a(frb.a($$3.b(dst.x), f))));
    }

    protected fof.a b(dzq $$0, dzq $$1, float ... $$2) {
        jf.b<dso> $$3 = this.a.e(mj.bf);
        return this.a($$0, $$1, $$2).a(foe.a().a(fsf.a(1.0f)).a(this.g()).a((foq.a<?>)((fot.a)this.a((dwn)$$0, fon.a(dlx.pV))).a(frb.a($$3.b(dst.x), 0.005f, 0.0055555557f, 0.00625f, 0.008333334f, 0.025f))));
    }

    protected fof.a o(dzq $$0) {
        jf.b<dso> $$1 = this.a.e(mj.bf);
        return this.c($$0, (foq.a<?>)((fot.a)this.a((dwn)dzs.aS, (fpn)fon.a(dlx.qW).a(fqi.a(fsm.a(1.0f, 2.0f))))).a(frb.a($$1.b(dst.x), f)));
    }

    protected fof.a a(dzq $$0, dlp $$1, dlp $$2, frm.a $$3) {
        jf.b<dso> $$4 = this.a.e(mj.bf);
        return this.a((dwn)$$0, fof.b().a(foe.a().a(((fot.a)fon.a($$1).a($$3)).a(fon.a($$2)))).a(foe.a().a($$3).a((foq.a<?>)fon.a($$2).a(foz.a($$4.b(dst.x), 0.5714286f, 3)))));
    }

    protected fof.a p(dzq $$0) {
        return fof.b().a(foe.a().a(this.c()).a((foq.a<?>)fon.a($$0).a(fqi.a(fsf.a(2.0f)))));
    }

    protected fof.a a(dzq $$0, dzq $$1) {
        jf.b<dzq> $$2 = this.a.e(mj.i);
        foh.a $$3 = ((fot.a)((foq.a)fon.a($$1).a(fqi.a(fsf.a(2.0f)))).a(this.c())).a((foq.a<?>)((fot.a)this.a((dwn)$$0, fon.a(dlx.rb))).a(frr.a(0.125f)));
        return fof.b().a(foe.a().a($$3).a(frl.a($$0).a(dl.a.a().a(ecb.b, epd.b))).a(frk.a(co.a.a().a(as.a.a().a($$2, $$0).a(dl.a.a().a(ecb.b, epd.a))), new is(0, 1, 0)))).a(foe.a().a($$3).a(frl.a($$0).a(dl.a.a().a(ecb.b, epd.a))).a(frk.a(co.a.a().a(as.a.a().a($$2, $$0).a(dl.a.a().a(ecb.b, epd.b))), new is(0, -1, 0))));
    }

    protected fof.a q(dzq $$0) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a((foq.a)this.a((dwn)$$0, (fpn)fon.a($$0).a(List.of(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)), (E $$1) -> fqi.a(fsf.a($$1.intValue())).a(frl.a($$0).a(dl.a.a().a(eah.f, $$1.intValue())))))));
    }

    public fof.a r(dzq $$0) {
        if ($$0 instanceof egz) {
            egz $$1 = (egz)((Object)$$0);
            return fof.b().a(foe.a().a(fsf.a(1.0f)).a((foq.a)this.a((dwn)$$0, (fpn)fon.a($$0).a(IntStream.rangeClosed(1, 4).boxed().toList(), (E $$2) -> fqi.a(fsf.a($$2.intValue())).a(frl.a($$0).a(dl.a.a().a($$1.c(), $$2.intValue())))))));
        }
        return nl.d();
    }

    protected static fof.a s(dzq $$0) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a(fon.a($$0)));
    }

    public static fof.a d() {
        return fof.b();
    }

    protected abstract void e();

    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        this.e();
        HashSet $$1 = new HashSet();
        for (dzq $$2 : mi.e) {
            if (!$$2.a(this.c)) continue;
            $$2.y().ifPresent($$3 -> {
                if ($$1.add($$3)) {
                    fof.a $$4 = this.d.remove($$3);
                    if ($$4 == null) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mi.e.b($$2)));
                    }
                    $$0.accept((amt<fof>)$$3, $$4);
                }
            });
        }
        if (!this.d.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + String.valueOf(this.d.keySet()));
        }
    }

    protected void b(dzq $$0, dzq $$1) {
        jf.b<dso> $$2 = this.a.e(mj.bf);
        fof.a $$3 = this.c($$0, (foq.a<?>)fon.a($$0).a(frb.a($$2.b(dst.x), 0.33f, 0.55f, 0.77f, 1.0f)));
        this.a($$0, $$3);
        this.a($$1, $$3);
    }

    protected fof.a t(dzq $$0) {
        return this.a($$0, ebz.c, epd.b);
    }

    protected void u(dzq $$02) {
        this.a($$02, (dzq $$0) -> this.e((dwn)((ecz)$$0).b()));
    }

    protected void c(dzq $$0, dzq $$1) {
        this.a($$0, this.d((dwn)$$1));
    }

    protected void c(dzq $$0, dwn $$1) {
        this.a($$0, this.a($$1));
    }

    protected void v(dzq $$0) {
        this.c($$0, $$0);
    }

    protected void w(dzq $$0) {
        this.c($$0, (dwn)$$0);
    }

    protected void a(dzq $$0, Function<dzq, fof.a> $$1) {
        this.a($$0, $$1.apply($$0));
    }

    protected void a(dzq $$0, fof.a $$1) {
        this.d.put($$0.y().orElseThrow(() -> new IllegalStateException("Block " + String.valueOf($$0) + " does not have loot table")), $$1);
    }
}

