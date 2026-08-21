/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;

public record oa(jf.a a) implements no
{
    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        jf.b<dut> $$1 = this.a.e(mj.bA);
        jf.b<dur> $$2 = this.a.e(mj.bz);
        jf.b<dso> $$3 = this.a.e(mj.bf);
        dup $$4 = new dup($$2.b(dus.e), $$1.b(duu.q));
        dup $$5 = new dup($$2.b(dus.e), $$1.b(duu.r));
        $$0.accept(fnv.ai, fof.b().a(foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fou.a(oa.a(dlx.rm, dlx.rn, $$5, $$3).b()).a(4)).a((foq.a<?>)fou.a(oa.a(dlx.rq, dlx.rr, $$4, $$3).b()).a(2)).a((foq.a<?>)fou.a(oa.a(dlx.ru, dlx.rv, $$4, $$3).b()).a(1))));
        $$0.accept(fnv.ak, fof.b().a(foe.a().a(fsf.a(1.0f)).a(fou.a(fnv.ai))).a(foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a(dlx.qH).a(4)).a((foq.a<?>)fon.a(dlx.qH).a(new fqe.a().a($$3.b(dst.n), fsf.a(1.0f)))).a((foq.a<?>)fon.a(dlx.qH).a(new fqe.a().a($$3.b(dst.q), fsf.a(1.0f)))).a(fon.a(dlx.qM))));
        $$0.accept(fnv.aj, fof.b().a(foe.a().a(fsf.a(1.0f)).a(fou.a(fnv.ai))).a(foe.a().a(fsf.a(1.0f)).a((foq.a<?>)fon.a(dlx.pW).a(2)).a((foq.a<?>)fon.a(dlx.pW).a(new fqe.a().a($$3.b(dst.y), fsf.a(1.0f)))).a((foq.a<?>)fon.a(dlx.pW).a(new fqe.a().a($$3.b(dst.z), fsf.a(1.0f))))));
    }

    public static fof.a a(dlp $$0, dlp $$1, dup $$2, jf.b<dso> $$3) {
        return fof.b().a(foe.a().a(fsf.a(1.0f)).a(frr.a(0.5f)).a((foq.a<?>)((fot.a)fon.a($$0).a(fpz.a(ki.ad, $$2))).a(new fqe.a().a($$3.b(dst.a), fsf.a(4.0f)).a($$3.b(dst.e), fsf.a(4.0f)).a($$3.b(dst.b), fsf.a(4.0f))))).a(foe.a().a(fsf.a(1.0f)).a(frr.a(0.5f)).a((foq.a<?>)((fot.a)fon.a($$1).a(fpz.a(ki.ad, $$2))).a(new fqe.a().a($$3.b(dst.a), fsf.a(4.0f)).a($$3.b(dst.e), fsf.a(4.0f)).a($$3.b(dst.b), fsf.a(4.0f)))));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{oa.class, "registries", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{oa.class, "registries", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{oa.class, "registries", "a"}, this, $$0);
    }
}

