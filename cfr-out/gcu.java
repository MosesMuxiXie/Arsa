/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gcu
extends isc {
    private static final Logger b = LogUtils.getLogger();
    private static final isd c = new isd(Duration.ofSeconds(5L));
    private final List<geh> F;
    private final gsb G;
    protected final goy a = goy.d();
    private volatile yh H;
    private @Nullable gju I;

    public gcu(gsb $$0, geh ... $$1) {
        super(gfa.a);
        this.G = $$0;
        this.F = List.of($$1);
        if (this.F.isEmpty()) {
            throw new IllegalArgumentException("No tasks added");
        }
        this.H = this.F.get(0).a();
        Runnable $$2 = () -> {
            for (geh $$1 : $$1) {
                this.a($$1.a());
                if ($$1.d()) break;
                $$1.run();
                if (!$$1.d()) continue;
                return;
            }
        };
        Thread $$3 = new Thread($$2, "Realms-long-running-task");
        $$3.setUncaughtExceptionHandler(new gcc(b));
        $$3.start();
    }

    @Override
    public boolean aM_() {
        return false;
    }

    @Override
    public void e() {
        super.e();
        if (this.I != null) {
            c.a(this.n.aZ(), this.I.B());
        }
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.t() == 256) {
            this.f();
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void bg_() {
        this.a.c().b();
        this.a.a(gcu.F());
        this.I = new gju(this.q, this.H);
        this.a.a(this.I, $$0 -> $$0.c(10).e(30));
        this.a.a(gje.a(yg.e, (gje $$0) -> this.f()).a());
        this.a.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.a.a();
        gos.a(this.a, this.aV_());
    }

    protected void f() {
        for (geh $$0 : this.F) {
            $$0.b();
        }
        this.n.a(this.G);
    }

    public void a(yh $$0) {
        if (this.I != null) {
            this.I.a_($$0);
        }
        this.H = $$0;
    }
}

