/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gsa
extends gsb {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 25;
    private static final yh c = yh.c("recover_world.title").a(l.r);
    private static final yh d = yh.c("recover_world.bug_tracker");
    private static final yh e = yh.c("recover_world.restore");
    private static final yh f = yh.c("recover_world.no_fallback");
    private static final yh t = yh.c("recover_world.done.title");
    private static final yh u = yh.c("recover_world.done.success");
    private static final yh v = yh.c("recover_world.done.failed");
    private static final yh w = yh.c("recover_world.issue.none").a(l.k);
    private static final yh x = yh.c("recover_world.issue.missing_file").a(l.m);
    private final BooleanConsumer y;
    private final goy z = goy.d().a(8);
    private final yh A;
    private final gjz B;
    private final gjz C;
    private final fni.c D;

    public gsa(gfj $$02, BooleanConsumer $$1, fni.c $$2) {
        super(c);
        this.y = $$1;
        this.A = yh.a("recover_world.message", yh.b($$2.f()).a(l.h));
        this.B = new gjz(this.A, $$02.g);
        this.D = $$2;
        Exception $$3 = this.a($$2, false);
        Exception $$4 = this.a($$2, true);
        yw $$5 = yh.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
        this.C = new gjz($$5, $$02.g);
        boolean $$6 = $$3 != null && $$4 == null;
        this.z.c().b();
        this.z.a(new gko(this.m, $$02.g));
        this.z.a(this.B.a(true));
        this.z.a(this.C);
        goy $$7 = goy.e().a(5);
        $$7.a(gje.a(d, gqz.b((gsb)this, bez.j)).b(120, 20).a());
        $$7.a(gje.a((yh)gsa.e, (gje.c)(gje.c)LambdaMetafactory.metafactory(null, null, null, (Lgje;)V, a(gfj gje ), (Lgje;)V)((gsa)this, (gfj)$$02)).b((int)120, (int)20).a((gks)($$6 ? null : gks.a((yh)gsa.f))).a()).k = $$6;
        this.z.a($$7);
        this.z.a(gje.a(yg.k, (gje $$0) -> this.aX_()).b(120, 20).a());
        this.z.a(this::c);
    }

    private void a(gfj $$0) {
        Exception $$1 = this.a(this.D, false);
        Exception $$2 = this.a(this.D, true);
        if ($$1 == null || $$2 != null) {
            a.error("Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}", (Object)($$1 != null ? $$1.getMessage() : "no issues"), (Object)($$2 != null ? $$2.getMessage() : "no issues"));
            $$0.a(new gqv(() -> this.y.accept(false), t, v));
            return;
        }
        $$0.c(new grm(yh.c("recover_world.restoring")));
        gya.a(this.D);
        if (this.D.n()) {
            $$0.a(new gra(this.y, t, u, yg.j, yg.k));
        } else {
            $$0.a(new gqv(() -> this.y.accept(false), t, v));
        }
    }

    private yh a(fni.c $$0, boolean $$1, @Nullable Exception $$2) {
        if ($$1 && $$2 instanceof FileNotFoundException) {
            return yh.i();
        }
        yw $$3 = yh.i();
        Instant $$4 = $$0.a($$1);
        yw $$5 = $$4 != null ? yh.b(gyl.a.format(ZonedDateTime.ofInstant($$4, ZoneId.systemDefault()))) : yh.c("recover_world.state_entry.unknown");
        $$3.b(yh.a("recover_world.state_entry", $$5.a(l.h)));
        if ($$2 == null) {
            $$3.b(w);
        } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(x);
        } else if ($$2 instanceof vr) {
            $$3.b(yh.b($$2.getCause().toString()).a(l.m));
        } else {
            $$3.b(yh.b($$2.toString()).a(l.m));
        }
        return $$3;
    }

    private @Nullable Exception a(fni.c $$0, boolean $$1) {
        try {
            if (!$$1) {
                $$0.a($$0.h());
            } else {
                $$0.a($$0.i());
            }
        }
        catch (IOException | vk | vr $$2) {
            return $$2;
        }
        return null;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.c();
    }

    @Override
    protected void c() {
        this.C.a(this.o - 50);
        this.B.a(this.o - 50);
        this.z.a();
        gos.a(this.z, this.aV_());
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), this.A});
    }

    @Override
    public void aX_() {
        this.y.accept(false);
    }

    private /* synthetic */ void a(gfj $$0, gje $$1) {
        this.a($$0);
    }
}

