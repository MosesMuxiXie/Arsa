/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.EnumSet;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class erl {
    private static final Logger a = LogUtils.getLogger();

    private static boolean a(eqf $$0) {
        return $$0.n().a(erj.l) && $$0.x();
    }

    static CompletableFuture<eqf> a(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> b(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$0.a();
        if ($$4.s().bb().x().d()) {
            $$0.b().a($$4.J_(), $$4.p().h(), $$4.b(), $$3, $$0.c(), $$4.aq());
        }
        $$4.a($$3);
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> c(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        $$0.a().a($$3);
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> d(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$0.a();
        axn $$5 = new axn($$4, $$2, $$1, $$3);
        $$0.b().a((dxn)$$5, $$4.b().a($$5), $$3);
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> e(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$0.a();
        axn $$5 = new axn($$4, $$2, $$1, $$3);
        return $$0.b().a($$4.p().i(), evs.a($$5), $$4.b().a($$5), $$3);
    }

    static CompletableFuture<eqf> f(ero $$02, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$02.a();
        axn $$5 = new axn($$4, $$2, $$1, $$3);
        return $$02.b().a(evs.a($$5), $$4.p().i(), $$4.b().a($$5), $$3).thenApply($$0 -> {
            erb $$1;
            eue $$2;
            if ($$0 instanceof erb && ($$2 = ($$1 = (erb)$$0).z()) != null) {
                eue.a($$1);
                if ($$2.b()) {
                    $$2.b($$1);
                }
            }
            return $$0;
        });
    }

    static CompletableFuture<eqf> g(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$0.a();
        axn $$5 = new axn($$4, $$2, $$1, $$3);
        $$0.b().a($$5, $$4.b().a($$5), $$4.p().i(), $$3);
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> h(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$0.a();
        axn $$5 = new axn($$4, $$2, $$1, $$3);
        if ($$3 instanceof erb) {
            erb $$6 = (erb)$$3;
            evs.a((dxn)$$5, $$6);
        }
        $$0.b().a($$5, $$4.J(), $$4.p().i(), $$4.H_(), $$4.b().a($$5), $$3);
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> i(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axf $$4 = $$0.a();
        euq.a($$3, EnumSet.of(euq.a.e, euq.a.f, euq.a.d, euq.a.b));
        axn $$5 = new axn($$4, $$2, $$1, $$3);
        if (!w.aD) {
            $$0.b().a((dxn)$$5, $$3, $$4.b().a($$5));
        }
        evs.a($$5, $$3);
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> j(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        axj $$4 = $$0.d();
        $$3.C();
        ((erb)$$3).a($$4);
        boolean $$5 = erl.a($$3);
        return $$4.a($$3, $$5);
    }

    static CompletableFuture<eqf> k(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        boolean $$4 = erl.a($$3);
        return $$0.d().b($$3, $$4);
    }

    static CompletableFuture<eqf> l(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        if (!$$3.A()) {
            $$0.b().a(new axn($$0.a(), $$2, $$1, $$3));
        }
        return CompletableFuture.completedFuture($$3);
    }

    static CompletableFuture<eqf> m(ero $$0, erm $$1, bhe<awv> $$2, eqf $$3) {
        dvu $$4 = $$3.f();
        awv $$5 = $$2.a($$4.h, $$4.i);
        return CompletableFuture.supplyAsync(() -> {
            eqq $$7;
            erb $$32 = (erb)$$3;
            axf $$4 = $$0.a();
            if ($$32 instanceof eqp) {
                eqp $$5 = (eqp)$$32;
                eqq $$6 = $$5.H();
            } else {
                $$7 = new eqq($$4, $$32, $$3 -> {
                    try (bgp.j $$4 = new bgp.j($$3.E(), a);){
                        erl.a($$4, fno.a((bgp)$$4, (jf.a)$$4.J_(), $$32.J()));
                    }
                });
                $$5.a(new eqp($$7, false));
            }
            $$7.b($$5::s);
            $$7.H();
            $$7.b(true);
            $$7.L();
            $$7.b($$4);
            $$7.a($$0.f());
            return $$7;
        }, $$0.e());
    }

    private static void a(axf $$0, fnq.b $$1) {
        if (!$$1.a()) {
            $$0.b(cgu.a($$1, (dwo)$$0, cgt.r));
        }
    }
}

