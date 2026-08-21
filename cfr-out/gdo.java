/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

class gdo
extends gmr
implements gdh {
    private static final Logger b = LogUtils.getLogger();
    private static final int d = 200;
    private static final int e = 2;
    private static final int f = 6;
    static final yh a = yh.c("mco.configure.world.subscription.tab");
    private static final yh g = yh.c("mco.configure.world.subscription.start");
    private static final yh h = yh.c("mco.configure.world.subscription.timeleft");
    private static final yh i = yh.c("mco.configure.world.subscription.recurring.daysleft");
    private static final yh j = yh.c("mco.configure.world.subscription.expired").a(l.h);
    private static final yh k = yh.c("mco.configure.world.subscription.less_than_a_day").a(l.h);
    private static final yh l = yh.c("mco.configure.world.subscription.unknown");
    private static final yh m = yh.c("mco.configure.world.subscription.recurring.info");
    private final gdi n;
    private final gfj o;
    private final gje p;
    private final gjp q;
    private final gko r;
    private final gko s;
    private final gko t;
    private gbg u;
    private yh v = l;
    private yh w = l;
    private @Nullable gbv.a x;

    gdo(gdi $$0, gfj $$1, gbg $$22) {
        super(a);
        this.n = $$0;
        this.o = $$1;
        this.u = $$22;
        got.b $$32 = this.c.b(6).d(1);
        gio $$4 = $$0.C();
        $$32.a(new gko(200, $$4.b, g, $$4));
        this.r = $$32.a(new gko(200, $$4.b, this.w, $$4));
        $$32.a(goz.b(2));
        this.s = $$32.a(new gko(200, $$4.b, h, $$4));
        this.t = $$32.a(new gko(200, $$4.b, this.v, $$4));
        $$32.a(goz.b(2));
        $$32.a(gje.a(yh.c("mco.configure.world.subscription.extend"), $$3 -> gqz.a((gsb)$$0, bez.a($$1.c, $$1.ac().b()))).a(0, 0, 200, 20).a());
        $$32.a(goz.b(2));
        this.p = $$32.a(gje.a(yh.c("mco.configure.world.delete.button"), $$2 -> $$1.a(gcy.b($$0, yh.c("mco.configure.world.delete.question.line1"), $$0 -> this.c()))).a(0, 0, 200, 20).a());
        $$32.a(goz.b(2));
        this.q = $$32.a(gjp.a(yh.i(), $$4).a(200).a(), gox.i().b());
        this.q.a(false);
        this.a($$22);
    }

    private void c() {
        gdz.a($$0 -> $$0.i(this.u.b), gdz.a(this.n::a, "Couldn't delete world")).thenRunAsync(() -> this.o.a(this.n.k()), this.o);
        this.o.a(this.n);
    }

    private void a(long $$0) {
        fzz $$1 = fzz.a();
        try {
            gbv $$2 = $$1.g($$0);
            this.v = this.a($$2.b());
            this.w = gdo.a($$2.a());
            this.x = $$2.c();
        }
        catch (gce $$3) {
            b.error("Couldn't get subscription", (Throwable)$$3);
            this.o.a(this.n.a($$3));
        }
    }

    private static yh a(Instant $$0) {
        String $$1 = ZonedDateTime.ofInstant($$0, ZoneId.systemDefault()).format(bhs.a(FormatStyle.MEDIUM));
        return yh.b($$1).a(l.h);
    }

    private yh a(int $$0) {
        boolean $$4;
        if ($$0 < 0 && this.u.k) {
            return j;
        }
        if ($$0 <= 1) {
            return k;
        }
        int $$1 = $$0 / 30;
        int $$2 = $$0 % 30;
        boolean $$3 = $$1 > 0;
        boolean bl2 = $$4 = $$2 > 0;
        if ($$3 && $$4) {
            return yh.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2).a(l.h);
        }
        if ($$3) {
            return yh.a("mco.configure.world.subscription.remaining.months", $$1).a(l.h);
        }
        if ($$4) {
            return yh.a("mco.configure.world.subscription.remaining.days", $$2).a(l.h);
        }
        return yh.i();
    }

    @Override
    public void a(gbg $$0) {
        this.u = $$0;
        this.a($$0.b);
        this.r.a_(this.w);
        if (this.x == gbv.a.a) {
            this.s.a_(h);
        } else if (this.x == gbv.a.b) {
            this.s.a_(i);
        }
        this.t.a_(this.v);
        boolean $$1 = fzu.b() && $$0.v != null;
        this.p.k = $$0.k;
        if ($$1) {
            this.q.a_(yh.a("mco.snapshot.subscription.info", new Object[]{$$0.v}));
        } else {
            this.q.a_(m);
        }
        this.c.a();
    }

    @Override
    public yh bd_() {
        return yg.b(a, g, this.w, h, this.v);
    }
}

