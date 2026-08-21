/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.ServicesKeySet
 *  com.mojang.brigadier.StringReader
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class th
extends MinecraftServer {
    private static final Logger m = LogUtils.getLogger();
    private static final int n = 20;
    private static final int o = 14999992;
    private static final ano p = new ano(null, ServicesKeySet.EMPTY, null, new b(), new a());
    private static final dgz q = dhb.e.a().d(dgz.a(dhb.c, dhb.d));
    private final bxn r = new bxn(4);
    private final Optional<String> s;
    private final boolean t;
    private List<st> u = new ArrayList<st>();
    private final Stopwatch v = Stopwatch.createUnstarted();
    private static final evo w = new evo(0L, false, false);
    private @Nullable to x;

    public static th a(Thread $$0, fni.c $$1, bak $$22, Optional<String> $$3, boolean $$4) {
        $$22.a();
        ArrayList<String> $$5 = new ArrayList<String>($$22.c());
        $$5.remove("vanilla");
        $$5.addFirst("vanilla");
        dxm $$6 = new dxm(new dwc($$5, List.of()), q);
        dws $$7 = new dws("Test Level", dwl.b, false, ccz.c, true, new eua(q), $$6);
        anr.d $$8 = new anr.d($$22, $$6, false, true);
        anr.c $$9 = new anr.c($$8, ee.a.b, bbh.e);
        try {
            m.debug("Starting resource loading");
            Stopwatch $$10 = Stopwatch.createStarted();
            ans $$11 = (ans)bhs.c($$2 -> anr.a($$9, (anr.a $$1) -> {
                Object $$2 = new jl<esi>(mj.bF, Lifecycle.stable()).n();
                evl.b $$3 = $$1.c().e(mj.bD).b(ffe.b).a().a().a((jq<esi>)$$2);
                return new anr.b<fnm>(new fnm($$7, w, $$3.d(), $$3.a()), $$3.b());
            }, ans::new, bhs.h(), $$2)).get();
            $$10.stop();
            m.debug("Finished resource loading after {} ms", (Object)$$10.elapsed(TimeUnit.MILLISECONDS));
            return new th($$0, $$1, $$22, $$11, $$3, $$4);
        }
        catch (Exception $$12) {
            m.warn("Failed to load vanilla datapack, bit oops", (Throwable)$$12);
            System.exit(-1);
            throw new IllegalStateException();
        }
    }

    private th(Thread $$0, fni.c $$1, bak $$2, ans $$3, Optional<String> $$4, boolean $$5) {
        super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bia.a(), p, axs.a());
        this.s = $$4;
        this.t = $$5;
    }

    @Override
    public boolean e() {
        this.a(new bbz(this, this, this.bd(), this.h, new ayw()){});
        um.a(ui.b);
        this.u_();
        axf $$0 = this.N();
        this.u = this.a($$0);
        m.info("Started game test server");
        return true;
    }

    private List<st> a(axf $$02) {
        su.a $$6;
        List<jd.c<tb>> $$5;
        jq<tb> $$1 = $$02.J_().f(mj.bv);
        if (this.s.isPresent()) {
            List<jd.c> $$2 = th.a($$02.J_(), this.s.get()).filter($$0 -> !((tb)$$0.a()).i()).toList();
            if (this.t) {
                su.a $$3 = th::a;
                m.info("Verify requested. Will run each test that matches {} {} times", (Object)this.s.get(), (Object)(100 * egm.values().length));
            } else {
                su.a $$4 = su.a;
                m.info("Will run tests matching {} ({} tests)", (Object)this.s.get(), (Object)$$2.size());
            }
        } else {
            $$5 = $$1.c().filter($$0 -> !((tb)$$0.a()).i()).toList();
            $$6 = su.a;
        }
        return su.a($$5, $$6, $$02);
    }

    private static Stream<ta> a(jd.c<tb> $$0, axf $$1) {
        Stream.Builder<ta> $$2 = Stream.builder();
        for (egm $$3 : egm.values()) {
            for (int $$4 = 0; $$4 < 100; ++$$4) {
                $$2.add(new ta($$0, $$3, $$1, tq.a()));
            }
        }
        return $$2.build();
    }

    public static Stream<jd.c<tb>> a(jr $$0, String $$1) {
        return fj.a(new StringReader($$1), $$0.f(mj.bv)).stream();
    }

    @Override
    public void a(BooleanSupplier $$0) {
        super.a($$0);
        axf $$1 = this.N();
        if (!this.bx()) {
            this.b($$1);
        }
        if ($$1.au() % 20L == 0L) {
            m.info(this.x.j());
        }
        if (this.x.i()) {
            this.a(false);
            m.info(this.x.j());
            tl.a();
            m.info("========= {} GAME TESTS COMPLETE IN {} ======================", (Object)this.x.h(), (Object)this.v.stop());
            if (this.x.d()) {
                m.info("{} required tests failed :(", (Object)this.x.a());
                this.x.f().forEach(th::a);
            } else {
                m.info("All {} required tests passed :)", (Object)this.x.h());
            }
            if (this.x.e()) {
                m.info("{} optional tests failed", (Object)this.x.b());
                this.x.g().forEach(th::a);
            }
            m.info("====================================================");
        }
    }

    private static void a(ta $$0) {
        if ($$0.u() != egm.a) {
            m.info("   - {} with rotation {}: {}", new Object[]{$$0.b(), $$0.u().c(), $$0.n().a().getString()});
        } else {
            m.info("   - {}: {}", (Object)$$0.b(), (Object)$$0.n().a().getString());
        }
    }

    @Override
    public bxq f() {
        return this.r;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void w_() {
        this.bN();
    }

    @Override
    public y a(y $$0) {
        $$0.a("Type", "Game test server");
        return $$0;
    }

    @Override
    public void i() {
        super.i();
        m.info("Game test server shutting down");
        System.exit(this.x != null ? this.x.a() : -1);
    }

    @Override
    public void a(m $$0) {
        super.a($$0);
        m.error("Game test server crashed\n{}", (Object)$$0.a(u.a));
        System.exit(1);
    }

    private void b(axf $$0) {
        is $$1 = new is($$0.y.a(-14999992, 14999992), -59, $$0.y.a(-14999992, 14999992));
        $$0.a(fne.a.a($$0.aq(), $$1, 0.0f, 0.0f));
        tf $$2 = tf.a.a(this.u, $$0).a((tf.c)new tr($$1, 8, false)).c();
        List<ta> $$3 = $$2.a();
        this.x = new to($$3);
        m.info("{} tests are now running at position {}!", (Object)this.x.h(), (Object)$$1.y());
        this.v.reset();
        this.v.start();
        $$2.b();
    }

    private boolean bx() {
        return this.x != null;
    }

    @Override
    public boolean v_() {
        return false;
    }

    @Override
    public bbh k() {
        return bbh.a;
    }

    @Override
    public bbn l() {
        return bbh.e;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public int o() {
        return 0;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean a(bbx $$0) {
        return false;
    }

    @Override
    public int r() {
        return 1;
    }

    static class b
    implements bci {
        private final Set<bbx> a = new HashSet<bbx>();

        b() {
        }

        @Override
        public void a(bbx $$0) {
            this.a.add($$0);
        }

        @Override
        public Optional<bbx> a(String $$0) {
            return this.a.stream().filter($$1 -> $$1.b().equals($$0)).findFirst().or(() -> Optional.of(bbx.a($$0)));
        }

        @Override
        public Optional<bbx> a(UUID $$0) {
            return this.a.stream().filter($$1 -> $$1.a().equals($$0)).findFirst();
        }

        @Override
        public void a(boolean $$0) {
        }

        @Override
        public void a() {
        }
    }

    static class a
    implements bca {
        a() {
        }

        @Override
        public Optional<GameProfile> a(String $$0) {
            return Optional.empty();
        }

        @Override
        public Optional<GameProfile> a(UUID $$0) {
            return Optional.empty();
        }
    }
}

