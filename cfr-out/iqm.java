/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class iqm {
    private static final int a = 100;
    private final bgr b = bgr.a();
    private final gfj c;
    private @Nullable ipm d;
    private a e;
    private float f = 1.0f;
    private int g = 100;
    private boolean h = false;

    public iqm(gfj $$0) {
        this.c = $$0;
        this.e = $$0.k.aN().b();
    }

    public void a() {
        boolean $$1;
        float $$0 = this.c.ar();
        if (this.d != null && this.f != $$0 && !($$1 = this.a($$0))) {
            return;
        }
        bcx $$2 = this.c.aq();
        if ($$2 == null) {
            this.g = Math.max(this.g, 100);
            return;
        }
        if (this.d != null) {
            if (iqm.a($$2, this.d)) {
                this.c.ap().b(this.d);
                this.g = bgj.a(this.b, 0, $$2.b() / 2);
            }
            if (!this.c.ap().c(this.d)) {
                this.d = null;
                this.g = Math.min(this.g, this.e.a($$2, this.b));
            }
        }
        this.g = Math.min(this.g, this.e.a($$2, this.b));
        if (this.d == null && this.g-- <= 0) {
            this.a($$2);
        }
    }

    private static boolean a(bcx $$0, ipm $$1) {
        return $$0.d() && !$$0.a().a().a().equals($$1.a());
    }

    public void a(bcx $$0) {
        bcz $$1 = $$0.a().a();
        this.d = iph.a($$1);
        switch (this.c.ap().a(this.d)) {
            case a: {
                this.c.aG().c();
                this.h = true;
                break;
            }
            case b: {
                this.h = false;
            }
        }
        this.g = Integer.MAX_VALUE;
    }

    public void b() {
        if (!this.h) {
            this.c.aG().c();
            this.h = true;
        }
    }

    public void b(bcx $$0) {
        if (this.c($$0)) {
            this.c();
        }
    }

    public void c() {
        if (this.d != null) {
            this.c.ap().b(this.d);
            this.d = null;
            this.c.aG().d();
        }
        this.g += 100;
    }

    private boolean a(float $$0) {
        if (this.d == null) {
            return false;
        }
        if (this.f == $$0) {
            return true;
        }
        if (this.f < $$0) {
            this.f += bgj.a(this.f, 5.0E-4f, 0.005f);
            if (this.f > $$0) {
                this.f = $$0;
            }
        } else {
            this.f = 0.03f * $$0 + 0.97f * this.f;
            if (Math.abs(this.f - $$0) < 1.0E-4f || this.f < $$0) {
                this.f = $$0;
            }
        }
        this.f = bgj.a(this.f, 0.0f, 1.0f);
        if (this.f <= 1.0E-4f) {
            this.c();
            return false;
        }
        this.c.ap().a(bdb.b, this.f);
        return true;
    }

    public boolean c(bcx $$0) {
        if (this.d == null) {
            return false;
        }
        return $$0.a().a().a().equals(this.d.a());
    }

    public @Nullable String d() {
        ipj $$0;
        if (this.d != null && ($$0 = this.d.b()) != null) {
            return $$0.a().e();
        }
        return null;
    }

    public void a(a $$0) {
        this.e = $$0;
        this.g = this.e.a(this.c.aq(), this.b);
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("DEFAULT", "options.music_frequency.default", 20);
        public static final /* enum */ a b = new a("FREQUENT", "options.music_frequency.frequent", 10);
        public static final /* enum */ a c = new a("CONSTANT", "options.music_frequency.constant", 0);
        public static final Codec<a> d;
        private final String e;
        private final int f;
        private final yh g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, String $$1, int $$2) {
            this.e = $$0;
            this.f = $$2 * 1200;
            this.g = yh.c($$1);
        }

        int a(@Nullable bcx $$0, bgr $$1) {
            if ($$0 == null) {
                return this.f;
            }
            if (this == c) {
                return 100;
            }
            int $$2 = Math.min($$0.b(), this.f);
            int $$3 = Math.min($$0.c(), this.f);
            return bgj.a($$1, $$2, $$3);
        }

        public yh a() {
            return this.g;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            h = iqm$a.b();
            d = bhh.a(a::values);
        }
    }
}

