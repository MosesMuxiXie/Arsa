/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gyj {
    private static final yh a = yh.c("selectWorld.newWorld");
    private final List<Consumer<gyj>> b = new ArrayList<Consumer<gyj>>();
    private String c = a.getString();
    private a d = gyj$a.a;
    private ccz e = ccz.c;
    private @Nullable Boolean f;
    private String g;
    private boolean h;
    private boolean i;
    private final Path j;
    private String k;
    private gyh l;
    private b m;
    private final List<b> n = new ArrayList<b>();
    private final List<b> o = new ArrayList<b>();
    private eua p;

    public gyj(Path $$02, gyh $$1, Optional<amt<ffd>> $$2, OptionalLong $$3) {
        this.j = $$02;
        this.l = $$1;
        this.m = new b(gyj.a($$1, $$2).orElse(null));
        this.r();
        this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
        this.h = $$1.c().d();
        this.i = $$1.c().e();
        this.k = this.c(this.c);
        this.d = $$1.i().a();
        this.p = new eua($$1.h().b());
        this.p.a($$1.i().b(), null);
        Optional.ofNullable($$1.i().c()).flatMap($$12 -> $$1.a().a(mj.bg).flatMap($$1 -> $$1.a($$12))).map($$0 -> ((fdp)$$0.a()).b()).ifPresent($$0 -> this.a(gye.a($$0)));
    }

    public void a(Consumer<gyj> $$0) {
        this.b.add($$0);
    }

    public void a() {
        boolean $$12;
        boolean $$0 = this.j();
        if ($$0 != this.l.c().e()) {
            this.l = this.l.a($$1 -> $$1.a($$0));
        }
        if (($$12 = this.i()) != this.l.c().d()) {
            this.l = this.l.a($$1 -> $$1.b($$12));
        }
        for (Consumer<gyj> $$2 : this.b) {
            $$2.accept(this);
        }
    }

    public void a(String $$0) {
        this.c = $$0;
        this.k = this.c($$0);
        this.a();
    }

    private String c(String $$0) {
        String $$1 = $$0.trim();
        try {
            return bfp.a(this.j, !$$1.isEmpty() ? $$1 : a.getString(), "");
        }
        catch (Exception exception) {
            try {
                return bfp.a(this.j, "World", "");
            }
            catch (IOException $$2) {
                throw new RuntimeException("Could not create save folder", $$2);
            }
        }
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.k;
    }

    public void a(a $$0) {
        this.d = $$0;
        this.a();
    }

    public a d() {
        if (this.l()) {
            return gyj$a.d;
        }
        return this.d;
    }

    public void a(ccz $$0) {
        this.e = $$0;
        this.a();
    }

    public ccz e() {
        if (this.f()) {
            return ccz.d;
        }
        return this.e;
    }

    public boolean f() {
        return this.d() == gyj$a.b;
    }

    public void a(boolean $$0) {
        this.f = $$0;
        this.a();
    }

    public boolean g() {
        if (this.l()) {
            return true;
        }
        if (this.f()) {
            return false;
        }
        if (this.f == null) {
            return this.d() == gyj$a.c;
        }
        return this.f;
    }

    public void b(String $$02) {
        this.g = $$02;
        this.l = this.l.a($$0 -> $$0.a(evo.a(this.h())));
        this.a();
    }

    public String h() {
        return this.g;
    }

    public void b(boolean $$0) {
        this.h = $$0;
        this.a();
    }

    public boolean i() {
        if (this.l()) {
            return false;
        }
        return this.h;
    }

    public void c(boolean $$0) {
        this.i = $$0;
        this.a();
    }

    public boolean j() {
        if (this.l() || this.f()) {
            return false;
        }
        return this.i;
    }

    public void a(gyh $$0) {
        this.l = $$0;
        this.r();
        this.a();
    }

    public gyh k() {
        return this.l;
    }

    public void a(gyh.a $$0) {
        this.l = this.l.a($$0);
        this.a();
    }

    protected boolean a(dxm $$0) {
        dxm $$1 = this.l.h();
        if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
            this.l = new gyh(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.l.e().c();
    }

    public void a(b $$0) {
        this.m = $$0;
        jd<ffd> $$12 = $$0.c();
        if ($$12 != null) {
            this.a(($$1, $$2) -> ((ffd)$$12.a()).a());
        }
    }

    public b m() {
        return this.m;
    }

    public @Nullable gye n() {
        jd<ffd> $$0 = this.m().c();
        return $$0 != null ? gye.a.get($$0.e()) : null;
    }

    public List<b> o() {
        return this.n;
    }

    public List<b> p() {
        return this.o;
    }

    private void r() {
        jq<ffd> $$0 = this.k().a().f(mj.bD);
        this.n.clear();
        this.n.addAll(gyj.a($$0, bej.a).orElseGet(() -> $$0.c().map(b::new).toList()));
        this.o.clear();
        this.o.addAll((Collection<b>)gyj.a($$0, bej.b).orElse(this.n));
        jd<ffd> $$1 = this.m.c();
        if ($$1 != null) {
            boolean $$3;
            b $$2 = gyj.a(this.k(), $$1.e()).map(b::new).orElse(this.n.getFirst());
            boolean bl2 = $$3 = gye.a.get($$1.e()) != null;
            if ($$3) {
                this.m = $$2;
            } else {
                this.a($$2);
            }
        }
    }

    private static Optional<jd<ffd>> a(gyh $$0, Optional<amt<ffd>> $$12) {
        return $$12.flatMap($$1 -> $$0.a().f(mj.bD).a((amt)$$1));
    }

    private static Optional<List<b>> a(jq<ffd> $$02, bef<ffd> $$1) {
        return $$02.a($$1).map($$0 -> $$0.a().map(b::new).toList()).filter($$0 -> !$$0.isEmpty());
    }

    public void a(eua $$0) {
        this.p = $$0;
        this.a();
    }

    public eua q() {
        return this.p;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("survival", dwl.a);
        public static final /* enum */ a b = new a("hardcore", dwl.a);
        public static final /* enum */ a c = new a("creative", dwl.b);
        public static final /* enum */ a d = new a("spectator", dwl.d);
        public final dwl e;
        public final yh f;
        private final yh g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, dwl $$1) {
            this.e = $$1;
            this.f = yh.c("selectWorld.gameMode." + $$0);
            this.g = yh.c("selectWorld.gameMode." + $$0 + ".info");
        }

        public yh a() {
            return this.g;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            h = gyj$a.b();
        }
    }

    public record b(@Nullable jd<ffd> a) {
        private final @Nullable jd<ffd> a;
        private static final yh b = yh.c("generator.custom");

        public yh a() {
            return Optional.ofNullable(this.a).flatMap(jd::e).map($$0 -> yh.c($$0.a().h("generator"))).orElse(b);
        }

        public boolean b() {
            return Optional.ofNullable(this.a).flatMap(jd::e).filter($$0 -> $$0.equals(ffe.d)).isPresent();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "preset", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "preset", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "preset", "a"}, this, $$0);
        }

        public @Nullable jd<ffd> c() {
            return this.a;
        }
    }
}

