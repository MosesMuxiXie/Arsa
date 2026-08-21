/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.net.URI;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class gsb
extends gmk
implements gki {
    private static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("narrator.screen.usage");
    public static final amo g = amo.b("textures/gui/menu_background.png");
    public static final amo h = amo.b("textures/gui/header_separator.png");
    public static final amo i = amo.b("textures/gui/footer_separator.png");
    private static final amo c = amo.b("textures/gui/inworld_menu_background.png");
    public static final amo j = amo.b("textures/gui/inworld_header_separator.png");
    public static final amo k = amo.b("textures/gui/inworld_footer_separator.png");
    protected static final float l = 2000.0f;
    protected final yh m;
    private final List<gmm> d = Lists.newArrayList();
    private final List<gpb> e = Lists.newArrayList();
    protected final gfj n;
    private boolean f;
    public int o;
    public int p;
    private final List<gki> t = Lists.newArrayList();
    protected final gio q;
    private static final long u;
    private static final long v;
    private static final long w = 750L;
    private static final long x = 200L;
    private static final long y = 200L;
    private final gpg z = new gpg();
    private long A = Long.MIN_VALUE;
    private long B = Long.MAX_VALUE;
    protected @Nullable gjl<gfm> r;
    private @Nullable gpb C;
    protected final Executor s;

    protected gsb(yh $$0) {
        this(gfj.V(), gfj.V().g, $$0);
    }

    protected gsb(gfj $$0, gio $$12, yh $$2) {
        this.n = $$0;
        this.q = $$12;
        this.m = $$2;
        this.s = $$1 -> $$0.execute(() -> {
            if ($$0.x == this) {
                $$1.run();
            }
        });
    }

    public yh q() {
        return this.m;
    }

    public yh i() {
        return this.q();
    }

    public final void c(gir $$0, int $$1, int $$2, float $$3) {
        $$0.c();
        this.b($$0, $$1, $$2, $$3);
        $$0.c();
        this.a($$0, $$1, $$2, $$3);
        $$0.g();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        for (gki $$4 : this.t) {
            $$4.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public boolean a(gzb $$0) {
        gpi.a $$1;
        if ($$0.e() && this.aY_()) {
            this.aX_();
            return true;
        }
        if (super.a($$0)) {
            return true;
        }
        switch ($$0.t()) {
            case 263: {
                Record record = this.b(gpk.c);
                break;
            }
            case 262: {
                Record record = this.b(gpk.d);
                break;
            }
            case 265: {
                Record record = this.b(gpk.a);
                break;
            }
            case 264: {
                Record record = this.b(gpk.b);
                break;
            }
            case 258: {
                Record record = this.c(!$$0.m());
                break;
            }
            default: {
                Record record = $$1 = null;
            }
        }
        if ($$1 != null) {
            gin $$2 = super.a((gpi)$$1);
            if ($$2 == null && $$1 instanceof gpi.c) {
                this.r();
                $$2 = super.a((gpi)$$1);
            }
            if ($$2 != null) {
                this.a($$2);
            }
        }
        return false;
    }

    private gpi.c c(boolean $$0) {
        return new gpi.c($$0);
    }

    private gpi.a b(gpk $$0) {
        return new gpi.a($$0);
    }

    protected void aI_() {
        gpi.c $$0;
        gin $$1;
        if (this.n.aY().b() && ($$1 = super.a((gpi)($$0 = new gpi.c(true)))) != null) {
            this.a($$1);
        }
    }

    protected void b(gmm $$0) {
        gin $$1 = gin.a(this, $$0.a(new gpi.b()));
        if ($$1 != null) {
            this.a($$1);
        }
    }

    public void r() {
        gin $$0 = this.aQ_();
        if ($$0 != null) {
            $$0.a(false);
        }
    }

    @VisibleForTesting
    protected void a(gin $$0) {
        this.r();
        $$0.a(true);
    }

    public boolean aY_() {
        return true;
    }

    public void aX_() {
        this.n.a((gsb)null);
    }

    protected <T extends gmm & gki> T c(T $$0) {
        this.t.add($$0);
        return this.d($$0);
    }

    protected <T extends gki> T a(T $$0) {
        this.t.add($$0);
        return $$0;
    }

    protected <T extends gmm & gpb> T d(T $$0) {
        this.d.add($$0);
        this.e.add($$0);
        return $$0;
    }

    protected void e(gmm $$0) {
        if ($$0 instanceof gki) {
            this.t.remove((gki)((Object)$$0));
        }
        if ($$0 instanceof gpb) {
            this.e.remove((gpb)((Object)$$0));
        }
        if (this.aO_() == $$0) {
            this.r();
        }
        this.d.remove($$0);
    }

    protected void t() {
        this.t.clear();
        this.d.clear();
        this.e.clear();
    }

    public static List<yh> a(gfj $$0, dlt $$1) {
        return $$1.a(dlp.b.a($$0.r), (ddm)$$0.s, $$0.k.k ? dnj.a.b : dnj.a.a);
    }

    protected void a_(String $$0, boolean $$1) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static void a(yf $$0, gfj $$1, @Nullable gsb $$2) {
        hnh $$3 = Objects.requireNonNull($$1.s, "Player not available");
        yf yf2 = $$0;
        Objects.requireNonNull(yf2);
        yf yf3 = yf2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{yf.g.class, yf.h.class, yf.d.class}, (Object)yf3, n2)) {
            case 0: {
                String $$4;
                yf.g g2 = (yf.g)yf3;
                try {
                    String string;
                    $$4 = string = g2.b();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                gsb.a($$3, $$4, $$2);
                return;
            }
            case 1: {
                yf.h $$5 = (yf.h)yf3;
                $$3.b.a($$5.b(), $$2);
                return;
            }
            case 2: {
                yf.d $$6 = (yf.d)yf3;
                $$3.b.b(new abx($$6.b(), $$6.c()));
                if ($$1.x == $$2) return;
                $$1.a($$2);
                return;
            }
        }
        gsb.b($$0, $$1, $$2);
    }

    /*
     * Loose catch block
     */
    protected static void b(yf $$0, gfj $$1, @Nullable gsb $$2) {
        block12: {
            boolean $$7;
            yf yf2 = $$0;
            Objects.requireNonNull(yf2);
            yf yf3 = yf2;
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{yf.f.class, yf.e.class, yf.i.class, yf.c.class}, (Object)yf3, n2)) {
                case 0: {
                    URI uRI;
                    yf.f f2 = (yf.f)yf3;
                    URI $$3 = uRI = f2.b();
                    gsb.a($$1, $$2, $$3);
                    boolean bl2 = false;
                    break;
                }
                case 1: {
                    yf.e $$4 = (yf.e)yf3;
                    bhs.n().a($$4.b());
                    boolean bl2 = true;
                    break;
                }
                case 2: {
                    Object object;
                    yf.i i2 = (yf.i)yf3;
                    Object $$5 = object = i2.b();
                    if ($$2 != null) {
                        $$2.a_((String)$$5, true);
                    }
                    boolean bl2 = true;
                    break;
                }
                case 3: {
                    String string;
                    Object object = (yf.c)yf3;
                    String $$6 = string = ((yf.c)object).b();
                    $$1.o.a($$6);
                    boolean bl2 = true;
                    break;
                }
                default: {
                    a.error("Don't know how to handle {}", (Object)$$0);
                    boolean bl2 = $$7 = true;
                }
            }
            if ($$7 && $$1.x != $$2) {
                $$1.a($$2);
            }
            break block12;
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
        }
    }

    protected static boolean a(gfj $$0, @Nullable gsb $$1, URI $$2) {
        if (!$$0.k.Y().b().booleanValue()) {
            return false;
        }
        if ($$0.k.Z().b().booleanValue()) {
            $$0.a(new gqz($$3 -> {
                if ($$3) {
                    bhs.n().a($$2);
                }
                $$0.a($$1);
            }, $$2.toString(), false));
        } else {
            bhs.n().a($$2);
        }
        return true;
    }

    protected static void a(hnh $$0, String $$1, @Nullable gsb $$2) {
        $$0.b.a(ee.a($$1), $$2);
    }

    public final void b(int $$0, int $$1) {
        this.o = $$0;
        this.p = $$1;
        if (!this.f) {
            this.bg_();
            this.aI_();
        } else {
            this.c();
        }
        this.f = true;
        this.d(false);
        if (this.n.aY().b()) {
            this.b(Long.MAX_VALUE);
        } else {
            this.a(u);
        }
    }

    protected void u() {
        this.t();
        this.r();
        this.bg_();
        this.aI_();
    }

    protected void a(float $$0) {
        for (gmm gmm2 : this.aJ_()) {
            if (!(gmm2 instanceof gjc)) continue;
            gjc $$2 = (gjc)gmm2;
            $$2.a($$0);
        }
    }

    @Override
    public List<? extends gmm> aJ_() {
        return this.d;
    }

    protected void bg_() {
    }

    public void e() {
    }

    public void aZ_() {
    }

    public void aK_() {
    }

    public void b(gir $$0, int $$1, int $$2, float $$3) {
        if (this.v()) {
            this.c($$0);
        } else {
            if (this.n.r == null) {
                this.a($$0, $$3);
            }
            this.b($$0);
            this.a($$0);
        }
        this.n.j.b();
    }

    protected void b(gir $$0) {
        float $$1 = this.n.k.x();
        if ($$1 >= 1.0f) {
            $$0.d();
        }
    }

    protected void a(gir $$0, float $$1) {
        this.n.i.u().a($$0, this.o, this.p, this.aL_());
    }

    protected void a(gir $$0) {
        this.a($$0, 0, 0, this.o, this.p);
    }

    protected void a(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        gsb.a($$0, this.n.r == null ? g : c, $$1, $$2, 0.0f, 0.0f, $$3, $$4);
    }

    public static void a(gir $$0, amo $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
        int $$8 = 32;
        $$0.a(hpa.at, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
    }

    public void c(gir $$0) {
        $$0.a(0, 0, this.o, this.p, -1072689136, -804253680);
    }

    public boolean ba_() {
        return true;
    }

    public boolean v() {
        return false;
    }

    protected boolean aL_() {
        return true;
    }

    public boolean bb_() {
        return this.ba_();
    }

    protected void c() {
        this.u();
    }

    public void a(int $$0, int $$1) {
        this.o = $$0;
        this.p = $$1;
        this.c();
    }

    public void a(m $$0) {
        n $$1 = $$0.a("Affected screen", 1);
        $$1.a("Screen name", () -> this.getClass().getCanonicalName());
    }

    protected boolean a(String $$0, int $$1, int $$2) {
        int $$3 = $$0.indexOf(58);
        int $$4 = $$0.indexOf(47);
        if ($$1 == 58) {
            return ($$4 == -1 || $$2 <= $$4) && $$3 == -1;
        }
        if ($$1 == 47) {
            return $$2 > $$3;
        }
        return $$1 == 95 || $$1 == 45 || $$1 >= 97 && $$1 <= 122 || $$1 >= 48 && $$1 <= 57 || $$1 == 46;
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return true;
    }

    public void a(List<Path> $$0) {
    }

    private void a(long $$0, boolean $$1) {
        this.B = bhs.c() + $$0;
        if ($$1) {
            this.A = Long.MIN_VALUE;
        }
    }

    private void a(long $$0) {
        this.b(bhs.c() + $$0);
    }

    private void b(long $$0) {
        this.A = $$0;
    }

    public void w() {
        this.a(750L, false);
    }

    public void x() {
        this.a(200L, true);
    }

    public void y() {
        this.a(200L, true);
    }

    private boolean o() {
        return w.w || this.n.aZ().a();
    }

    public void z() {
        long $$0;
        if (this.o() && ($$0 = bhs.c()) > this.B && $$0 > this.A) {
            this.f(true);
            this.B = Long.MAX_VALUE;
        }
    }

    public void d(boolean $$0) {
        if (this.o()) {
            this.f($$0);
        }
    }

    private void f(boolean $$0) {
        this.z.a(this::a);
        String $$1 = this.z.a(!$$0);
        if (!$$1.isEmpty()) {
            this.n.aZ().a($$1);
        }
    }

    protected boolean bc_() {
        return true;
    }

    protected void a(gpd $$0) {
        $$0.a(gpc.a, this.i());
        if (this.bc_()) {
            $$0.a(gpc.d, b);
        }
        this.b($$0);
    }

    protected void b(gpd $$02) {
        List<gpb> $$1 = this.e.stream().flatMap($$0 -> $$0.aW_().stream()).filter(gpb::b).sorted(Comparator.comparingInt(gkr::G)).toList();
        a $$2 = gsb.a($$1, this.C);
        if ($$2 != null) {
            if ($$2.c.a()) {
                this.C = $$2.a;
            }
            if ($$1.size() > 1) {
                $$02.a(gpc.b, (yh)yh.a("narrator.position.screen", $$2.b + 1, $$1.size()));
                if ($$2.c == gpb.a.c) {
                    $$02.a(gpc.d, this.B());
                }
            }
            $$2.a.b($$02.a());
        }
    }

    protected yh B() {
        return yh.c("narration.component_list.usage");
    }

    public static @Nullable a a(List<? extends gpb> $$0, @Nullable gpb $$1) {
        a $$2 = null;
        a $$3 = null;
        int $$5 = $$0.size();
        for (int $$4 = 0; $$4 < $$5; ++$$4) {
            gpb $$6 = $$0.get($$4);
            gpb.a $$7 = $$6.y();
            if ($$7.a()) {
                if ($$6 == $$1) {
                    $$3 = new a($$6, $$4, $$7);
                    continue;
                }
                return new a($$6, $$4, $$7);
            }
            if ($$7.compareTo($$2 != null ? $$2.c : gpb.a.a) <= 0) continue;
            $$2 = new a($$6, $$4, $$7);
        }
        return $$2 != null ? $$2 : $$3;
    }

    public void e(boolean $$0) {
        if ($$0) {
            this.a(v, false);
        }
        if (this.r != null) {
            this.r.a(this.n.k.aK().b());
        }
    }

    public gio C() {
        return this.q;
    }

    public boolean D() {
        return false;
    }

    public boolean aM_() {
        return this.aY_();
    }

    @Override
    public gpm aV_() {
        return new gpm(0, 0, this.o, this.p);
    }

    public @Nullable bcx E() {
        return null;
    }

    static {
        v = u = TimeUnit.SECONDS.toMillis(2L);
    }

    public static final class a
    extends Record {
        final gpb a;
        final int b;
        final gpb.a c;

        public a(gpb $$0, int $$1, gpb.a $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entry;index;priority", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entry;index;priority", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entry;index;priority", "a", "b", "c"}, this, $$0);
        }

        public gpb a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public gpb.a c() {
            return this.c;
        }
    }
}

