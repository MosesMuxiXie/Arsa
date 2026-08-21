/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;

public final class ob
extends Record
implements no {
    private final jf.a a;

    public ob(jf.a $$0) {
        this.a = $$0;
    }

    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        jf.b<dxo> $$1 = this.a.e(mj.aS);
        $$0.accept(fnv.am, fof.b().a(foe.a().a(fsf.a(1.0f)).a((foq.a<?>)((fot.a)fou.a(fnv.an).a(10)).b(-2)).a((foq.a<?>)((foq.a)((fot.a)fou.a(fnv.ao).a(5)).b(2)).a(frp.a(fnz.c.a, bs.a.a().a(by.a(true))))).a((foq.a<?>)((fot.a)fou.a(fnv.ap).a(85)).b(-1))));
        $$0.accept(fnv.ap, ob.a());
        $$0.accept(fnv.an, fof.b().a(foe.a().a((foq.a<?>)fon.a(dzs.fV).a(17)).a((foq.a<?>)((fot.a)fon.a(dlx.rh).a(10)).a(fqj.a(fsm.a(0.0f, 0.9f)))).a((foq.a<?>)fon.a(dlx.sp).a(10)).a((foq.a<?>)fon.a(dlx.tD).a(10)).a((foq.a<?>)((fot.a)fon.a(dlx.up).a(10)).a(fqo.a(dns.a))).a((foq.a<?>)fon.a(dlx.qY).a(5)).a((foq.a<?>)((fot.a)fon.a(dlx.sZ).a(2)).a(fqj.a(fsm.a(0.0f, 0.9f)))).a((foq.a<?>)fon.a(dlx.pU).a(10)).a((foq.a<?>)fon.a(dlx.qW).a(5)).a((foq.a<?>)((fot.a)fon.a(dlx.tj).a(1)).a(fqi.a(fsf.a(10.0f)))).a((foq.a<?>)fon.a(dzs.gw).a(10)).a((foq.a<?>)fon.a(dlx.ui).a(10)).a((foq.a<?>)((fot.a)fon.a(dzs.nW).a(frk.a(co.a.a().a(jh.a($$1.b(dxv.y), $$1.b(dxv.z), $$1.b(dxv.A)))))).a(10))));
        $$0.accept(fnv.ao, fof.b().a(foe.a().a(fon.a(dlx.xa)).a(fon.a(dlx.oR)).a((foq.a<?>)((fot.a)fon.a(dlx.pW).a(fqj.a(fsm.a(0.0f, 0.25f)))).a(fph.a(this.a, fsf.a(30.0f)))).a((foq.a<?>)((fot.a)fon.a(dlx.sZ).a(fqj.a(fsm.a(0.0f, 0.25f)))).a(fph.a(this.a, fsf.a(30.0f)))).a((foq.a<?>)fon.a(dlx.sB).a(fph.a(this.a, fsf.a(30.0f)))).a(fon.a(dlx.ys))));
    }

    public static fof.a a() {
        return fof.b().a(foe.a().a((foq.a<?>)fon.a(dlx.td).a(60)).a((foq.a<?>)fon.a(dlx.te).a(25)).a((foq.a<?>)fon.a(dlx.tf).a(2)).a((foq.a<?>)fon.a(dlx.tg).a(13)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ob.class, "registries", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ob.class, "registries", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ob.class, "registries", "a"}, this, $$0);
    }

    public jf.a b() {
        return this.a;
    }
}

