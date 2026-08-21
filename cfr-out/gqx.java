/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.BanDetails
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.apache.commons.lang3.StringUtils
 */
import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class gqx {
    private static final yh b = yh.c("gui.banned.title.temporary").a(l.r);
    private static final yh c = yh.c("gui.banned.title.permanent").a(l.r);
    public static final yh a = yh.c("gui.banned.name.title").a(l.r);
    private static final yh d = yh.c("gui.banned.skin.title").a(l.r);
    private static final yh e = yh.a("gui.banned.skin.description", yh.a(bez.n));

    public static gqz a(BooleanConsumer $$0, BanDetails $$1) {
        return new gqz($$0, gqx.a($$1), gqx.b($$1), bez.n, yg.m, true);
    }

    public static gqz a(Runnable $$0) {
        URI $$1 = bez.n;
        return new gqz($$2 -> {
            if ($$2) {
                bhs.n().a($$1);
            }
            $$0.run();
        }, d, e, $$1, yg.m, true);
    }

    public static gqz a(String $$0, Runnable $$1) {
        URI $$22 = bez.n;
        return new gqz($$2 -> {
            if ($$2) {
                bhs.n().a($$22);
            }
            $$1.run();
        }, a, (yh)yh.a("gui.banned.name.description", yh.b($$0).a(l.o), yh.a(bez.n)), $$22, yg.m, true);
    }

    private static yh a(BanDetails $$0) {
        return gqx.f($$0) ? b : c;
    }

    private static yh b(BanDetails $$0) {
        return yh.a("gui.banned.description", gqx.c($$0), gqx.d($$0), yh.a(bez.n));
    }

    private static yh c(BanDetails $$0) {
        String $$1 = $$0.reason();
        String $$2 = $$0.reasonMessage();
        if (StringUtils.isNumeric((CharSequence)$$1)) {
            yw $$7;
            int $$3 = Integer.parseInt($$1);
            hjf $$4 = hjf.a($$3);
            if ($$4 != null) {
                yh $$5 = yk.a($$4.a(), zf.a.a(true));
            } else if ($$2 != null) {
                yw $$6 = yh.a("gui.banned.description.reason_id_message", $$3, $$2).a(l.r);
            } else {
                $$7 = yh.a("gui.banned.description.reason_id", $$3).a(l.r);
            }
            return yh.a("gui.banned.description.reason", $$7);
        }
        return yh.c("gui.banned.description.unknownreason");
    }

    private static yh d(BanDetails $$0) {
        if (gqx.f($$0)) {
            yh $$1 = gqx.e($$0);
            return yh.a("gui.banned.description.temporary", yh.a("gui.banned.description.temporary.duration", $$1).a(l.r));
        }
        return yh.c("gui.banned.description.permanent").a(l.r);
    }

    private static yh e(BanDetails $$0) {
        Duration $$1 = Duration.between(Instant.now(), $$0.expires());
        long $$2 = $$1.toHours();
        if ($$2 > 72L) {
            return yg.a($$1.toDays());
        }
        if ($$2 < 1L) {
            return yg.c($$1.toMinutes());
        }
        return yg.b($$1.toHours());
    }

    private static boolean f(BanDetails $$0) {
        return $$0.expires() != null;
    }
}

