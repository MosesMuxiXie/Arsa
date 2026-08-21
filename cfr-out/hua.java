/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class hua
implements hug.a {
    private static final boolean a = true;
    private static final boolean b = false;
    private static final boolean c = false;
    private static final boolean d = false;
    private static final boolean e = false;
    private static final boolean f = false;
    private static final boolean g = false;
    private static final boolean h = true;
    private static final boolean i = false;
    private static final boolean j = true;
    private static final boolean k = true;
    private static final boolean l = true;
    private static final boolean m = true;
    private static final boolean n = true;
    private static final boolean o = true;
    private static final boolean p = true;
    private static final boolean q = true;
    private static final boolean r = true;
    private static final boolean s = true;
    private static final int t = 30;
    private static final int u = 8;
    private static final float v = 0.32f;
    private static final int w = -16711681;
    private static final int x = -3355444;
    private static final int y = -98404;
    private static final int z = -23296;
    private final gfj A;
    private @Nullable UUID B;

    public hua(gfj $$0) {
        this.A = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        this.b($$3);
        if (!this.A.s.au()) {
            this.a();
        }
    }

    private void b(bxg $$02) {
        $$02.c(bxf.c, ($$0, $$1) -> {
            if (this.A.s.a((cgk)$$0, 30.0)) {
                this.a((cgk)$$0, (bwu)$$1);
            }
        });
    }

    private void a(cgk $$0, bwu $$1) {
        boolean $$2 = this.a($$0);
        int $$3 = 0;
        um.a($$0, $$3, $$1.a(), -1, 0.48f);
        ++$$3;
        if ($$2) {
            um.a($$0, $$3, $$1.b() + " " + $$1.c() + " xp", -1, 0.32f);
            ++$$3;
        }
        if ($$2) {
            int $$4 = $$1.d() < $$1.e() ? -23296 : -1;
            um.a($$0, $$3, "health: " + String.format(Locale.ROOT, "%.1f", Float.valueOf($$1.d())) + " / " + String.format(Locale.ROOT, "%.1f", Float.valueOf($$1.e())), $$4, 0.32f);
            ++$$3;
        }
        if ($$2 && !$$1.f().equals("")) {
            um.a($$0, $$3, $$1.f(), -98404, 0.32f);
            ++$$3;
        }
        if ($$2) {
            for (String $$5 : $$1.j()) {
                um.a($$0, $$3, $$5, -16711681, 0.32f);
                ++$$3;
            }
        }
        if ($$2) {
            for (String $$6 : $$1.i()) {
                um.a($$0, $$3, $$6, -16711936, 0.32f);
                ++$$3;
            }
        }
        if ($$1.g()) {
            um.a($$0, $$3, "Wants Golem", -23296, 0.32f);
            ++$$3;
        }
        if ($$2 && $$1.h() != -1) {
            um.a($$0, $$3, "Anger Level: " + $$1.h(), -98404, 0.32f);
            ++$$3;
        }
        if ($$2) {
            for (String $$7 : $$1.l()) {
                if ($$7.startsWith($$1.a())) {
                    um.a($$0, $$3, $$7, -1, 0.32f);
                } else {
                    um.a($$0, $$3, $$7, -23296, 0.32f);
                }
                ++$$3;
            }
        }
        if ($$2) {
            for (String $$8 : Lists.reverse($$1.k())) {
                um.a($$0, $$3, $$8, -3355444, 0.32f);
                ++$$3;
            }
        }
    }

    private boolean a(cgk $$0) {
        return Objects.equals(this.B, $$0.cY());
    }

    public Map<is, List<String>> a(bxg $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.c(bxf.c, ($$1, $$2) -> {
            for (is $$3 : Iterables.concat($$2.m(), $$2.n())) {
                $$12.computeIfAbsent($$3, $$0 -> Lists.newArrayList()).add($$2.a());
            }
        });
        return $$12;
    }

    private void a() {
        hug.a(this.A.au(), 8).ifPresent($$0 -> {
            this.B = $$0.cY();
        });
    }
}

