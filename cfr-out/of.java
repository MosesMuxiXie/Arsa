/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;

public record of(jf.a a) implements no
{
    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        $$0.accept(fnv.aW, fof.b().a(foe.a().a(fsf.a(2.0f)).a((foq.a<?>)fon.a(dlx.dN).a(fqi.a(fsf.a(1.0f)))).a((foq.a<?>)fon.a(dlx.dO).a(fqi.a(fsf.a(1.0f))))));
        nq.a.forEach(($$1, $$2) -> $$0.accept(fnv.bc.get($$1), fof.b().a(foe.a().a(fsm.a(1.0f, 3.0f)).a(fon.a($$2)))));
        $$0.accept(fnv.bb, fof.b().a(nm.a(fnv.bc)));
        $$0.accept(fnv.aX, fof.b().a(foe.a().a(foh.a(new foq.a[]{fou.a(fnv.aY).a(frp.a(fnz.c.a, bs.a.a().a(bh.a.a().a(kc.a(ki.aM, cuk.a.a)).b()))), fou.a(fnv.aZ).a(frp.a(fnz.c.a, bs.a.a().a(bh.a.a().a(kc.a(ki.aM, cuk.a.b)).b())))}))));
        $$0.accept(fnv.aY, fof.b().a(foe.a().a(fsf.a(5.0f)).a(fon.a(dlx.dO))));
        $$0.accept(fnv.aZ, fof.b().a(foe.a().a(fsf.a(5.0f)).a(fon.a(dlx.dN))));
        $$0.accept(fnv.ba, fof.b().a(foe.a().a(fsf.a(1.0f)).a(fon.a(dlx.fT))));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{of.class, "registries", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{of.class, "registries", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{of.class, "registries", "a"}, this, $$0);
    }
}

