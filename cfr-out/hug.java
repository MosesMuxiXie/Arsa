/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class hug {
    private final List<a> a = new ArrayList<a>();
    private long b;

    public hug() {
        this.a();
    }

    public void a() {
        gfj $$0 = gfj.V();
        this.a.clear();
        if ($$0.m.b(glx.x)) {
            this.a.add(new huc($$0));
        }
        if ($$0.m.b(glx.C)) {
            this.a.add(new huq($$0));
        }
        if (w.A) {
            this.a.add(new hur());
        }
        if ($$0.m.b(glx.D)) {
            this.a.add(new huz($$0));
        }
        if ($$0.m.b(glx.E)) {
            this.a.add(new hum($$0));
        }
        if ($$0.m.b(glx.F)) {
            this.a.add(new huf($$0));
        }
        if ($$0.m.b(glx.G)) {
            this.a.add(new hux($$0));
        }
        if (w.D) {
            this.a.add(new hup());
        }
        if (w.E) {
            this.a.add(new huu());
        }
        if (w.F) {
            this.a.add(new huw());
        }
        if ($$0.m.b(glx.H) || $$0.m.b(glx.I)) {
            this.a.add(new hun($$0, $$0.m.b(glx.H), $$0.m.b(glx.I)));
        }
        if ($$0.m.b(glx.J)) {
            this.a.add(new huv($$0));
        }
        if (w.P) {
            this.a.add(new huy());
        }
        if (w.Q) {
            this.a.add(new hua($$0));
        }
        if (w.R) {
            this.a.add(new hus(new hua($$0)));
        }
        if (w.S) {
            this.a.add(new htz($$0));
        }
        if (w.T) {
            this.a.add(new hut($$0));
        }
        if (w.O) {
            this.a.add(new hul($$0));
        }
        if ($$0.m.b(glx.K)) {
            this.a.add(new hue($$0));
        }
        if (w.G) {
            this.a.add(new huj());
        }
        if ($$0.m.b(glx.L)) {
            this.a.add(new huo($$0, dww.a));
        }
        if (w.ag) {
            this.a.add(new hub($$0));
        }
        if (w.av) {
            this.a.add(new huh());
        }
        if ($$0.m.b(glx.w)) {
            this.a.add(new hui($$0));
        }
        this.a.add(new hud($$0));
    }

    public void a(htx $$0, double $$1, double $$2, double $$3, float $$4) {
        gfj $$5 = gfj.V();
        bxg $$6 = $$5.R().J();
        if ($$5.m.f() != this.b) {
            this.b = $$5.m.f();
            this.a();
        }
        for (a $$7 : this.a) {
            $$7.a($$1, $$2, $$3, $$6, $$0, $$4);
        }
    }

    public static Optional<cgk> a(@Nullable cgk $$0, int $$1) {
        int $$6;
        fth $$5;
        ftm $$3;
        ftm $$4;
        if ($$0 == null) {
            return Optional.empty();
        }
        ftm $$2 = $$0.bV();
        ftj $$7 = dee.a($$0, $$2, $$4 = $$2.e($$3 = $$0.h(1.0f).c((double)$$1)), $$5 = $$0.dj().b($$3).g(1.0), cgs.h, $$6 = $$1 * $$1);
        if ($$7 == null) {
            return Optional.empty();
        }
        if ($$2.g($$7.g()) > (double)$$6) {
            return Optional.empty();
        }
        return Optional.of($$7.a());
    }

    private static ftm a(float $$0) {
        float $$1 = 5.99999f;
        int $$2 = (int)(bgj.a($$0, 0.0f, 1.0f) * 5.99999f);
        float $$3 = $$0 * 5.99999f - (float)$$2;
        return switch ($$2) {
            case 0 -> new ftm(1.0, $$3, 0.0);
            case 1 -> new ftm(1.0f - $$3, 1.0, 0.0);
            case 2 -> new ftm(0.0, 1.0, $$3);
            case 3 -> new ftm(0.0, 1.0 - (double)$$3, 1.0);
            case 4 -> new ftm($$3, 0.0, 1.0);
            case 5 -> new ftm(1.0, 0.0, 1.0 - (double)$$3);
            default -> throw new IllegalStateException("Unexpected value: " + $$2);
        };
    }

    private static ftm a(float $$0, float $$1, float $$2, float $$3) {
        ftm $$4 = hug.a($$3).c((double)$$0);
        ftm $$5 = hug.a(($$3 + 0.33333334f) % 1.0f).c((double)$$1);
        ftm $$6 = hug.a(($$3 + 0.6666667f) % 1.0f).c((double)$$2);
        ftm $$7 = $$4.e($$5).e($$6);
        double $$8 = Math.max(Math.max(1.0, $$7.g), Math.max($$7.h, $$7.i));
        return new ftm($$7.g / $$8, $$7.h / $$8, $$7.i / $$8);
    }

    public static interface a {
        public void a(double var1, double var3, double var5, bxg var7, htx var8, float var9);
    }
}

