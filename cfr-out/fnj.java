/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import java.nio.file.Path;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class fnj
implements Comparable<fnj> {
    public static final yh a = yh.c("selectWorld.select");
    private final dws b;
    private final fnk c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final Path h;
    private @Nullable yh i;

    public fnj(dws $$0, fnk $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, Path $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.e = $$3;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return StringUtils.isEmpty((CharSequence)this.b.a()) ? this.d : this.b.a();
    }

    public Path c() {
        return this.h;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public long f() {
        return this.c.b();
    }

    public int a(fnj $$0) {
        if (this.f() < $$0.f()) {
            return 1;
        }
        if (this.f() > $$0.f()) {
            return -1;
        }
        return this.d.compareTo($$0.d);
    }

    public dws g() {
        return this.b;
    }

    public dwl h() {
        return this.b.b();
    }

    public boolean i() {
        return this.b.c();
    }

    public boolean j() {
        return this.b.e();
    }

    public yw k() {
        if (bhi.b(this.c.c())) {
            return yh.c("selectWorld.versionUnknown");
        }
        return yh.b(this.c.c());
    }

    public fnk l() {
        return this.c;
    }

    public boolean m() {
        return this.o().a();
    }

    public boolean n() {
        return this.o() == fnj$a.b;
    }

    public a o() {
        aa $$0 = w.b();
        int $$1 = $$0.a().b();
        int $$2 = this.c.d().b();
        if (!$$0.f() && $$2 < $$1) {
            return fnj$a.c;
        }
        if ($$2 > $$1) {
            return fnj$a.b;
        }
        return fnj$a.a;
    }

    public boolean p() {
        return this.f;
    }

    public boolean q() {
        if (this.p() || this.d()) {
            return true;
        }
        return !this.r();
    }

    public boolean r() {
        return w.b().a().a(this.c.d());
    }

    public yh s() {
        if (this.i == null) {
            this.i = this.z();
        }
        return this.i;
    }

    private yh z() {
        yw $$0;
        if (this.p()) {
            return yh.c("selectWorld.locked").a(l.m);
        }
        if (this.d()) {
            return yh.c("selectWorld.conversion").a(l.m);
        }
        if (!this.r()) {
            return yh.a("selectWorld.incompatible.info", this.k()).a(l.m);
        }
        yw yw2 = $$0 = this.i() ? yh.i().b(yh.c("gameMode.hardcore").b(-65536)) : yh.c("gameMode." + this.h().b());
        if (this.j()) {
            $$0.f(", ").b(yh.c("selectWorld.commands"));
        }
        if (this.e()) {
            $$0.f(", ").b(yh.c("selectWorld.experimental").a(l.o));
        }
        yw $$1 = this.k();
        yw $$2 = yh.b(", ").b(yh.c("selectWorld.version")).b(yg.x);
        if (this.m()) {
            $$2.b($$1.a(this.n() ? l.m : l.u));
        } else {
            $$2.b($$1);
        }
        $$0.b($$2);
        return $$0;
    }

    public yh t() {
        return a;
    }

    public boolean u() {
        return !this.q();
    }

    public boolean v() {
        return !this.d() && !this.p();
    }

    public boolean w() {
        return !this.q();
    }

    public boolean x() {
        return !this.q();
    }

    public boolean y() {
        return true;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((fnj)object);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false, false, "");
        public static final /* enum */ a b = new a(true, true, "downgrade");
        public static final /* enum */ a c = new a(true, false, "snapshot");
        private final boolean d;
        private final boolean e;
        private final String f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1, String $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        public boolean a() {
            return this.d;
        }

        public boolean b() {
            return this.e;
        }

        public String c() {
            return this.f;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c};
        }

        static {
            g = fnj$a.d();
        }
    }

    public static class b
    extends fnj {
        private static final yh b = yh.c("recover_world.warning").a($$0 -> $$0.a(-65536));
        private static final yh c = yh.c("recover_world.button");
        private final long d;

        public b(String $$0, Path $$1, long $$2) {
            super(null, null, $$0, false, false, false, $$1);
            this.d = $$2;
        }

        @Override
        public String b() {
            return this.a();
        }

        @Override
        public yh s() {
            return b;
        }

        @Override
        public long f() {
            return this.d;
        }

        @Override
        public boolean q() {
            return false;
        }

        @Override
        public yh t() {
            return c;
        }

        @Override
        public boolean u() {
            return true;
        }

        @Override
        public boolean v() {
            return false;
        }

        @Override
        public boolean w() {
            return false;
        }

        @Override
        public boolean x() {
            return false;
        }

        @Override
        public /* synthetic */ int compareTo(Object object) {
            return super.a((fnj)object);
        }
    }

    public static class c
    extends fnj {
        private static final yh b = yh.c("symlink_warning.more_info");
        private static final yh c = yh.c("symlink_warning.title").b(-65536);

        public c(String $$0, Path $$1) {
            super(null, null, $$0, false, false, false, $$1);
        }

        @Override
        public String b() {
            return this.a();
        }

        @Override
        public yh s() {
            return c;
        }

        @Override
        public long f() {
            return -1L;
        }

        @Override
        public boolean q() {
            return false;
        }

        @Override
        public yh t() {
            return b;
        }

        @Override
        public boolean u() {
            return true;
        }

        @Override
        public boolean v() {
            return false;
        }

        @Override
        public boolean w() {
            return false;
        }

        @Override
        public boolean x() {
            return false;
        }

        @Override
        public /* synthetic */ int compareTo(Object object) {
            return super.a((fnj)object);
        }
    }
}

