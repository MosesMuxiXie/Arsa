/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hlw
implements bat {
    private static final Logger a = LogUtils.getLogger();
    private static final amm b = amm.a("particles");
    private final Map<amo, b> c = Maps.newHashMap();
    private final Int2ObjectMap<hlu<?>> d = new Int2ObjectOpenHashMap();
    private @Nullable Runnable e;

    public hlw() {
        this.b();
    }

    public void a(Runnable $$0) {
        this.e = $$0;
    }

    private void b() {
        this.a(ly.a, hlg.a::new);
        this.a(ly.c, new hkf.a());
        this.a(ly.b, new hms.c());
        this.a(ly.d, hki.a::new);
        this.a(ly.au, hkh.a::new);
        this.a(ly.as, hkj.a::new);
        this.a(ly.ax, hkk.a::new);
        this.a(ly.ay, hkk.b::new);
        this.a(ly.e, hlx.a::new);
        this.a(ly.S, hmr.a::new);
        this.a(ly.f, hla.a::new);
        this.a(ly.g, hkl.c::new);
        this.a(ly.at, hmz.a::new);
        this.a(ly.h, hkl.a::new);
        this.a(ly.i, hkm.a::new);
        this.a(ly.aw, hmr.b::new);
        this.a(ly.j, hkn.p::new);
        this.a(ly.k, hkn.o::new);
        this.a(ly.l, hkn.q::new);
        this.a(ly.m, hkn.x::new);
        this.a(ly.n, hkn.w::new);
        this.a(ly.o, hkp.a::new);
        this.a(ly.p, hko.a::new);
        this.a(ly.q, hml.a::new);
        this.a(ly.r, new hks.a());
        this.a(ly.s, hkl.b::new);
        this.a(ly.t, hlc.a::new);
        this.a(ly.u, hku.a::new);
        this.a(ly.v, hml.b::new);
        this.a(ly.w, new hli.a());
        this.a(ly.x, hlh.a::new);
        this.a(ly.C, hmj.a::new);
        this.a(ly.D, hkw.a::new);
        this.a(ly.y, hle.a::new);
        this.a(ly.z, hle.b::new);
        this.a(ly.A, new hlf.a(3.0, 7, 0));
        this.a(ly.B, new hlf.a(1.0, 3, 2));
        this.a(ly.E, hkz.d::new);
        this.a(ly.F, hmy.a::new);
        this.a(ly.G, hla.a::new);
        this.a(ly.H, hml.c::new);
        this.a(ly.L, hmk.a::new);
        this.a(ly.M, hmc.a::new);
        this.a(ly.N, hmd.a::new);
        this.a(ly.P, hmk.b::new);
        this.a(ly.O, hla.a::new);
        this.a(ly.Q, hkz.a::new);
        this.a(ly.R, hmr.d::new);
        this.a(ly.T, hlg.b::new);
        this.a(ly.U, hml.a::new);
        this.a(ly.V, new hkg.c());
        this.a(ly.Y, new hkg.d());
        this.a(ly.Z, new hkg.a());
        this.a(ly.aa, new hkg.e());
        this.a(ly.ab, hll.a::new);
        this.a(ly.ac, hlm.a::new);
        this.a(ly.ad, hmr.e::new);
        this.a(ly.av, hlc.b::new);
        this.a(ly.ae, hlp.a::new);
        this.a(ly.af, hkv.a::new);
        this.a(ly.ag, hly.a::new);
        this.a(ly.ah, hna.a::new);
        this.a(ly.ai, hmh.a::new);
        this.a(ly.aj, hnc.a::new);
        this.a(ly.ak, hlx.b::new);
        this.a(ly.aO, hmi.a::new);
        this.a(ly.al, hmm.a::new);
        this.a(ly.an, hkd.a::new);
        this.a(ly.ao, hmt.a::new);
        this.a(ly.am, hmp.b::new);
        this.a(ly.ap, hmq.c::new);
        this.a(ly.aq, hmn.a::new);
        this.a(ly.ar, hml.d::new);
        this.a(ly.az, hkn.m::new);
        this.a(ly.aA, hkn.l::new);
        this.a(ly.aB, hkn.n::new);
        this.a(ly.aC, hkn.r::new);
        this.a(ly.aD, hkn.v::new);
        this.a(ly.aH, hmq.b::new);
        this.a(ly.aE, hkc.a::new);
        this.a(ly.aF, hmq.a::new);
        this.a(ly.aG, hmq.d::new);
        this.a(ly.aI, hkn.t::new);
        this.a(ly.aJ, hkn.s::new);
        this.a(ly.aK, hkn.u::new);
        this.a(ly.aL, hma.a::new);
        this.a(ly.aM, hnb.a::new);
        this.a(ly.aN, hla.b::new);
        this.a(ly.aR, hkn.h::new);
        this.a(ly.aS, hkn.g::new);
        this.a(ly.I, hkx.a::new);
        this.a(ly.J, hkx.b::new);
        this.a(ly.K, hkx.c::new);
        this.a(ly.aP, hkn.f::new);
        this.a(ly.aQ, hkn.e::new);
        this.a(ly.W, hmx.a::new);
        this.a(ly.X, hmv.a::new);
        this.a(ly.aT, hmp.a::new);
        this.a(ly.aU, hld.b::new);
        this.a(ly.aV, hld.e::new);
        this.a(ly.aW, hld.d::new);
        this.a(ly.aX, hld.a::new);
        this.a(ly.aY, hld.c::new);
        this.a(ly.aZ, hme.a::new);
        this.a(ly.ba, hmr.c::new);
        this.a(ly.bb, hkr.a::new);
        this.a(ly.bc, hmw.a::new);
        this.a(ly.bd, hmw.a::new);
        this.a(ly.be, hlc.c::new);
        this.a(ly.bf, new hms.b());
        this.a(ly.bh, hml.c::new);
        this.a(ly.bi, hml.c::new);
        this.a(ly.bg, hlb.a::new);
        this.a(ly.bj, new hms.a());
        this.a(ly.bk, hky.a::new);
    }

    private <T extends lw> void a(lx<T> $$0, hlu<T> $$1) {
        this.d.put(mi.j.a($$0), $$1);
    }

    private <T extends lw> void a(lx<T> $$0, c<T> $$1) {
        b $$2 = new b();
        this.c.put(mi.j.b($$0), $$2);
        this.d.put(mi.j.a($$0), $$1.create($$2));
    }

    @Override
    public CompletableFuture<Void> reload(bat.b $$0, Executor $$12, bat.a $$2, Executor $$3) {
        baz $$4 = $$0.a();
        CompletionStage $$5 = CompletableFuture.supplyAsync(() -> b.a($$4), $$12).thenCompose($$1 -> {
            ArrayList $$22 = new ArrayList($$1.size());
            $$1.forEach(($$2, $$3) -> {
                amo $$4 = b.b((amo)$$2);
                $$22.add(CompletableFuture.supplyAsync(() -> {
                    record A(amo a, Optional<List<amo>> b) {
                        @Override
                        public final String toString() {
                            return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "id;sprites", "a", "b"}, this);
                        }

                        @Override
                        public final int hashCode() {
                            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "id;sprites", "a", "b"}, this);
                        }

                        @Override
                        public final boolean equals(Object $$0) {
                            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "id;sprites", "a", "b"}, this, $$0);
                        }
                    }
                    return new A($$4, this.a($$4, (bax)$$3));
                }, $$12));
            });
            return bhs.c($$22);
        });
        CompletableFuture<ill.a> $$6 = $$0.a(inl.a).a(ml.k);
        return ((CompletableFuture)CompletableFuture.allOf(new CompletableFuture[]{$$5, $$6}).thenCompose($$2::wait)).thenAcceptAsync(arg_0 -> this.a($$6, (CompletableFuture)$$5, arg_0), $$3);
    }

    private Optional<List<amo>> a(amo $$0, bax $$1) {
        Optional<List<amo>> optional;
        block9: {
            if (!this.c.containsKey($$0)) {
                a.debug("Redundant texture list for particle: {}", (Object)$$0);
                return Optional.empty();
            }
            BufferedReader $$2 = $$1.e();
            try {
                hlr $$3 = hlr.a(bfv.a($$2));
                optional = Optional.of($$3.a());
                if ($$2 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            ((Reader)$$2).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$4) {
                    throw new IllegalStateException("Failed to load description for particle " + String.valueOf($$0), $$4);
                }
            }
            ((Reader)$$2).close();
        }
        return optional;
    }

    public Int2ObjectMap<hlu<?>> a() {
        return this.d;
    }

    private /* synthetic */ void a(CompletableFuture $$0, CompletableFuture $$1, Void $$2) {
        if (this.e != null) {
            this.e.run();
        }
        bzm $$32 = bzl.a();
        $$32.a("upload");
        ill.a $$4 = (ill.a)$$0.join();
        $$32.b("bindSpriteSets");
        HashSet $$5 = new HashSet();
        ilp $$6 = $$4.d();
        ((List)$$1.join()).forEach($$3 -> {
            Optional<List<amo>> $$4 = $$3.b();
            if ($$4.isEmpty()) {
                return;
            }
            ArrayList<ilp> $$5 = new ArrayList<ilp>();
            for (amo $$6 : $$4.get()) {
                ilp $$7 = $$4.a($$6);
                if ($$7 == null) {
                    $$5.add($$6);
                    $$5.add($$6);
                    continue;
                }
                $$5.add($$7);
            }
            if ($$5.isEmpty()) {
                $$5.add($$6);
            }
            this.c.get($$3.a()).a($$5);
        });
        if (!$$5.isEmpty()) {
            a.warn("Missing particle sprites: {}", (Object)$$5.stream().sorted().map(amo::toString).collect(Collectors.joining(",")));
        }
        $$32.c();
    }

    @FunctionalInterface
    static interface c<T extends lw> {
        public hlu<T> create(hmo var1);
    }

    static class b
    implements hmo {
        private List<ilp> a;

        b() {
        }

        @Override
        public ilp a(int $$0, int $$1) {
            return this.a.get($$0 * (this.a.size() - 1) / $$1);
        }

        @Override
        public ilp a(bgr $$0) {
            return this.a.get($$0.a(this.a.size()));
        }

        @Override
        public ilp a() {
            return this.a.getFirst();
        }

        public void a(List<ilp> $$0) {
            this.a = ImmutableList.copyOf($$0);
        }
    }
}

