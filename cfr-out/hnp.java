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
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hnp {
    private static final Logger b = LogUtils.getLogger();
    public static final yh a = yh.c("quickplay.error.title");
    private static final yh c = yh.c("quickplay.error.invalid_identifier");
    private static final yh d = yh.c("quickplay.error.realm_connect");
    private static final yh e = yh.c("quickplay.error.realm_permission");
    private static final yh f = yh.c("gui.toTitle");
    private static final yh g = yh.c("gui.toWorld");
    private static final yh h = yh.c("gui.toRealms");

    public static void a(gfj $$0, gzf.h $$1, fzz $$2) {
        if (!$$1.a()) {
            b.error("Quick play disabled");
            $$0.a(new gsd());
            return;
        }
        gzf.h h2 = $$1;
        Objects.requireNonNull(h2);
        gzf.h h3 = h2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{gzf.e.class, gzf.f.class, gzf.g.class, gzf.d.class}, (Object)h3, n2)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                gzf.e $$3 = (gzf.e)h3;
                hnp.b($$0, $$3.b());
                break;
            }
            case 1: {
                gzf.f $$4 = (gzf.f)h3;
                hnp.a($$0, $$2, $$4.b());
                break;
            }
            case 2: {
                gzf.g $$5 = (gzf.g)h3;
                String $$6 = $$5.b();
                if (bhi.h($$6)) {
                    $$6 = hnp.a($$0.q());
                }
                hnp.a($$0, $$6);
                break;
            }
            case 3: {
                gzf.d $$7 = (gzf.d)h3;
                b.error("Quick play disabled");
                $$0.a(new gsd());
            }
        }
    }

    private static @Nullable String a(fni $$0) {
        try {
            List<fnj> $$1 = $$0.a($$0.b()).get();
            if ($$1.isEmpty()) {
                b.warn("no latest singleplayer world found");
                return null;
            }
            return $$1.getFirst().a();
        }
        catch (InterruptedException | ExecutionException $$2) {
            b.error("failed to load singleplayer world summaries", (Throwable)$$2);
            return null;
        }
    }

    private static void a(gfj $$0, @Nullable String $$1) {
        if (bhi.h($$1) || !$$0.q().b($$1)) {
            gyf $$2 = new gyf(new gsd());
            $$0.a(new grj((gsb)$$2, a, c, g));
            return;
        }
        $$0.B().a($$1, () -> $$0.a(new gsd()));
    }

    private static void b(gfj $$0, String $$1) {
        hiu $$2 = new hiu($$0);
        $$2.a();
        hit $$3 = $$2.a($$1);
        if ($$3 == null) {
            $$3 = new hit(imu.a("selectServer.defaultName", new Object[0]), $$1, hit.c.c);
            $$2.a($$3, true);
            $$2.b();
        }
        hjw $$4 = hjw.a($$1);
        grb.a(new gvp(new gsd()), $$0, $$4, $$3, true, null);
    }

    /*
     * WARNING - void declaration
     */
    private static void a(gfj $$0, fzz $$1, String $$2) {
        void $$9;
        void $$10;
        try {
            long $$3 = Long.parseLong($$2);
            gbh $$4 = $$1.c();
        }
        catch (NumberFormatException $$5) {
            fzu $$6 = new fzu(new gsd());
            $$0.a(new grj((gsb)$$6, a, c, h));
            return;
        }
        catch (gce $$7) {
            gsd $$8 = new gsd();
            $$0.a(new grj((gsb)$$8, a, d, f));
            return;
        }
        gbg $$11 = $$10.a().stream().filter(arg_0 -> hnp.a((long)$$9, arg_0)).findFirst().orElse(null);
        if ($$11 == null) {
            fzu $$12 = new fzu(new gsd());
            $$0.a(new grj((gsb)$$12, a, e, h));
            return;
        }
        gsd $$13 = new gsd();
        $$0.a(new gcu($$13, new geg($$13, $$11)));
    }

    private static /* synthetic */ boolean a(long $$0, gbg $$1) {
        return $$1.b == $$0;
    }
}

