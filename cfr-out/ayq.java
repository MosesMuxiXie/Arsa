/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.runtime.SwitchBootstraps;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ayq
implements axv {
    static final Logger c = LogUtils.getLogger();
    public static final axv.a a = new axv.a("prepare_spawn");
    public static final int b = 3;
    final MinecraftServer d;
    final bbx e;
    final axq f;
    private @Nullable c g;

    public ayq(MinecraftServer $$0, bbx $$1) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$0.bo();
    }

    @Override
    public void a(Consumer<aay<?>> $$02) {
        try (bgp.j $$12 = new bgp.j(c);){
            Optional<fnq> $$2 = this.d.aj().c(this.e).map($$1 -> fno.a((bgp)$$12, (jf.a)this.d.bc(), $$1));
            axg.c $$3 = $$2.flatMap($$0 -> $$0.a(axg.c.a)).orElse(axg.c.b);
            fne.a $$4 = this.d.bb().H().a();
            axf $$5 = $$3.a().map(this.d::a).orElseGet(() -> {
                axf $$1 = this.d.a($$4.a());
                return $$1 != null ? $$1 : this.d.N();
            });
            CompletableFuture $$6 = $$3.b().map(CompletableFuture::completedFuture).orElseGet(() -> awz.a($$5, $$4.b()));
            ftl $$7 = $$3.c().orElse(new ftl($$4.d(), $$4.e()));
            this.g = new a($$5, $$6, $$7);
        }
    }

    @Override
    public boolean a() {
        c c2 = this.g;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{a.class, b.class}, (Object)c2, n2)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                a $$0 = (a)c2;
                b $$1 = $$0.b();
                if ($$1 != null) {
                    this.g = $$1;
                    yield true;
                }
                yield false;
            }
            case 1 -> {
                b $$2 = (b)c2;
                yield true;
            }
            case -1 -> false;
        };
    }

    public axg a(wu $$0, axu $$1) {
        c c2 = this.g;
        if (c2 instanceof b) {
            b $$2 = (b)c2;
            return $$2.a($$0, $$1);
        }
        throw new IllegalStateException("Player spawn was not ready");
    }

    public void c() {
        c c2 = this.g;
        if (c2 instanceof b) {
            b $$0 = (b)c2;
            $$0.a();
        }
    }

    public void d() {
        c c2 = this.g;
        if (c2 instanceof a) {
            a $$0 = (a)c2;
            $$0.a();
        }
        this.g = null;
    }

    @Override
    public axv.a b() {
        return a;
    }

    final class a
    implements c {
        private final axf b;
        private final CompletableFuture<ftm> c;
        private final ftl d;
        private @Nullable CompletableFuture<?> e;
        private final awi f = new awi();

        a(axf $$0, CompletableFuture<ftm> $$1, ftl $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public void a() {
            this.c.cancel(false);
        }

        public @Nullable b b() {
            if (!this.c.isDone()) {
                return null;
            }
            ftm $$0 = this.c.join();
            if (this.e == null) {
                dvu $$1 = new dvu(is.a($$0));
                this.f.a(this.b, () -> {
                    this.e = this.b.p().a(axm.g, $$1, 3);
                });
                ayq.this.f.a(axq.a.d, this.f.c());
                ayq.this.f.a(this.b.aq(), $$1);
            }
            ayq.this.f.a(axq.a.d, this.f.a(), this.f.c());
            if (!this.e.isDone()) {
                return null;
            }
            ayq.this.f.a(axq.a.d);
            return new b(this.b, $$0, this.d);
        }
    }

    static sealed interface c
    permits a, b {
    }

    final class b
    implements c {
        private final axf b;
        private final ftm c;
        private final ftl d;

        b(axf $$0, ftm $$1, ftl $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public void a() {
            this.b.p().b(axm.g, new dvu(is.a(this.c)), 3);
        }

        public axg a(wu $$0, axu $$12) {
            dvu $$2 = new dvu(is.a(this.c));
            this.b.a($$2, 3);
            axg $$3 = new axg(ayq.this.d, this.b, $$12.a(), $$12.c());
            try (bgp.j $$4 = new bgp.j($$3.es(), c);){
                Optional<fnq> $$5 = ayq.this.d.aj().c(ayq.this.e).map($$1 -> fno.a((bgp)$$4, (jf.a)ayq.this.d.bc(), $$1));
                $$5.ifPresent($$3::d);
                $$3.b(this.c, this.d.j, this.d.k);
                ayq.this.d.aj().a($$0, $$3, $$12);
                $$5.ifPresent($$1 -> {
                    $$3.c((fnq)$$1);
                    $$3.b((fnq)$$1);
                });
                axg axg2 = $$3;
                return axg2;
            }
        }
    }
}

