/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gna
implements gnb {
    private static final amo a = amo.b("toast/system");
    private static final int e = 200;
    private static final int f = 12;
    private static final int g = 10;
    private final a h;
    private yh i;
    private List<bfr> j;
    private long k;
    private boolean l;
    private final int m;
    private boolean n;
    private gnb.a o = gnb.a.b;

    public gna(a $$0, yh $$1, @Nullable yh $$2) {
        this($$0, $$1, (List<bfr>)gna.a($$2), Math.max(160, 30 + Math.max(gfj.V().g.a($$1), $$2 == null ? 0 : gfj.V().g.a($$2))));
    }

    public static gna a(gfj $$0, a $$1, yh $$2, yh $$3) {
        gio $$4 = $$0.g;
        List<bfr> $$5 = $$4.c($$3, 200);
        int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
        return new gna($$1, $$2, $$5, $$6 + 30);
    }

    private gna(a $$0, yh $$1, List<bfr> $$2, int $$3) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.m = $$3;
    }

    private static ImmutableList<bfr> a(@Nullable yh $$0) {
        return $$0 == null ? ImmutableList.of() : ImmutableList.of((Object)$$0.g());
    }

    @Override
    public int e() {
        return this.m;
    }

    @Override
    public int f() {
        return 20 + Math.max(this.j.size(), 1) * 12;
    }

    public void c() {
        this.n = true;
    }

    @Override
    public gnb.a a() {
        return this.o;
    }

    @Override
    public void a(gnc $$0, long $$1) {
        if (this.l) {
            this.k = $$1;
            this.l = false;
        }
        double $$2 = (double)this.h.l * $$0.f();
        long $$3 = $$1 - this.k;
        this.o = !this.n && (double)$$3 < $$2 ? gnb.a.a : gnb.a.b;
    }

    @Override
    public void a(gir $$0, gio $$1, long $$2) {
        $$0.a(hpa.at, a, 0, 0, this.e(), this.f());
        if (this.j.isEmpty()) {
            $$0.a($$1, this.i, 18, 12, -256, false);
        } else {
            $$0.a($$1, this.i, 18, 7, -256, false);
            for (int $$3 = 0; $$3 < this.j.size(); ++$$3) {
                $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
            }
        }
    }

    public void a(yh $$0, @Nullable yh $$1) {
        this.i = $$0;
        this.j = gna.a($$1);
        this.l = true;
    }

    public a g() {
        return this.h;
    }

    public static void a(gnc $$0, a $$1, yh $$2, @Nullable yh $$3) {
        $$0.a(new gna($$1, $$2, $$3));
    }

    public static void b(gnc $$0, a $$1, yh $$2, @Nullable yh $$3) {
        gna $$4 = $$0.a(gna.class, $$1);
        if ($$4 == null) {
            gna.a($$0, $$1, $$2, $$3);
        } else {
            $$4.a($$2, $$3);
        }
    }

    public static void a(gnc $$0, a $$1) {
        gna $$2 = $$0.a(gna.class, $$1);
        if ($$2 != null) {
            $$2.c();
        }
    }

    public static void a(gfj $$0, String $$1) {
        gna.a($$0.aG(), gna$a.d, (yh)yh.c("selectWorld.access_failure"), (yh)yh.b($$1));
    }

    public static void b(gfj $$0, String $$1) {
        gna.a($$0.aG(), gna$a.d, (yh)yh.c("selectWorld.delete_failure"), (yh)yh.b($$1));
    }

    public static void c(gfj $$0, String $$1) {
        gna.a($$0.aG(), gna$a.e, (yh)yh.c("pack.copyFailure"), (yh)yh.b($$1));
    }

    public static void a(gfj $$0, int $$1) {
        gna.a($$0.aG(), gna$a.f, (yh)yh.c("gui.fileDropFailure.title"), (yh)yh.a("gui.fileDropFailure.detail", $$1));
    }

    public static void a(gfj $$0) {
        gna.b($$0.aG(), gna$a.h, yh.c("chunk.toast.lowDiskSpace"), yh.c("chunk.toast.lowDiskSpace.description"));
    }

    public static void a(gfj $$0, dvu $$1) {
        gna.b($$0.aG(), gna$a.i, yh.a("chunk.toast.loadFailure", yh.a($$1)).a(l.m), yh.c("chunk.toast.checkLog"));
    }

    public static void b(gfj $$0, dvu $$1) {
        gna.b($$0.aG(), gna$a.j, yh.a("chunk.toast.saveFailure", yh.a($$1)).a(l.m), yh.c("chunk.toast.checkLog"));
    }

    @Override
    public /* synthetic */ Object h() {
        return this.g();
    }

    public static class a {
        public static final a a = new a();
        public static final a b = new a();
        public static final a c = new a();
        public static final a d = new a();
        public static final a e = new a();
        public static final a f = new a();
        public static final a g = new a();
        public static final a h = new a(10000L);
        public static final a i = new a();
        public static final a j = new a();
        public static final a k = new a(10000L);
        final long l;

        public a(long $$0) {
            this.l = $$0;
        }

        public a() {
            this(5000L);
        }
    }
}

