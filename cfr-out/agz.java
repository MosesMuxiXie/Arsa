/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class agz
implements aay<adb> {
    public static final aao<xq, agz> a = aay.a(agz::a, agz::new);
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 40;
    private static final int h = 40;
    private final int i;
    private final String j;
    private final Collection<String> k;
    private final Optional<b> l;

    private agz(String $$0, int $$1, Optional<b> $$2, Collection<String> $$3) {
        this.j = $$0;
        this.i = $$1;
        this.l = $$2;
        this.k = ImmutableList.copyOf($$3);
    }

    public static agz a(fum $$0, boolean $$1) {
        return new agz($$0.c(), $$1 ? 0 : 2, Optional.of(new b($$0)), $$1 ? $$0.h() : ImmutableList.of());
    }

    public static agz a(fum $$0) {
        return new agz($$0.c(), 1, Optional.empty(), (Collection<String>)ImmutableList.of());
    }

    public static agz a(fum $$0, String $$1, a $$2) {
        return new agz($$0.c(), $$2 == agz$a.a ? 3 : 4, Optional.empty(), (Collection<String>)ImmutableList.of((Object)$$1));
    }

    private agz(xq $$0) {
        this.j = $$0.p();
        this.i = $$0.readByte();
        this.l = agz.b(this.i) ? Optional.of(new b($$0)) : Optional.empty();
        this.k = agz.a(this.i) ? $$0.a(wx::p) : ImmutableList.of();
    }

    @Override
    private void a(xq $$0) {
        $$0.a(this.j);
        $$0.l(this.i);
        if (agz.b(this.i)) {
            this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
        }
        if (agz.a(this.i)) {
            $$0.a(this.k, wx::a);
        }
    }

    private static boolean a(int $$0) {
        return $$0 == 0 || $$0 == 3 || $$0 == 4;
    }

    private static boolean b(int $$0) {
        return $$0 == 0 || $$0 == 2;
    }

    public @Nullable a b() {
        return switch (this.i) {
            case 0, 3 -> agz$a.a;
            case 4 -> agz$a.b;
            default -> null;
        };
    }

    public @Nullable a e() {
        return switch (this.i) {
            case 0 -> agz$a.a;
            case 1 -> agz$a.b;
            default -> null;
        };
    }

    @Override
    public aba<agz> a() {
        return ahz.aT;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public String f() {
        return this.j;
    }

    public Collection<String> g() {
        return this.k;
    }

    public Optional<b> h() {
        return this.l;
    }

    public static class b {
        private final yh a;
        private final yh b;
        private final yh c;
        private final fut.b d;
        private final fut.a e;
        private final l f;
        private final int g;

        public b(fum $$0) {
            this.a = $$0.d();
            this.g = $$0.n();
            this.d = $$0.k();
            this.e = $$0.m();
            this.f = $$0.o();
            this.b = $$0.f();
            this.c = $$0.g();
        }

        public b(xq $$0) {
            this.a = (yh)yj.d.decode($$0);
            this.g = $$0.readByte();
            this.d = (fut.b)fut.b.f.decode($$0);
            this.e = (fut.a)fut.a.f.decode($$0);
            this.f = $$0.b(l.class);
            this.b = (yh)yj.d.decode($$0);
            this.c = (yh)yj.d.decode($$0);
        }

        public yh a() {
            return this.a;
        }

        public int b() {
            return this.g;
        }

        public l c() {
            return this.f;
        }

        public fut.b d() {
            return this.d;
        }

        public fut.a e() {
            return this.e;
        }

        public yh f() {
            return this.b;
        }

        public yh g() {
            return this.c;
        }

        public void a(xq $$0) {
            yj.d.encode($$0, this.a);
            $$0.l(this.g);
            fut.b.f.encode($$0, this.d);
            fut.a.f.encode($$0, this.e);
            $$0.a(this.f);
            yj.d.encode($$0, this.b);
            yj.d.encode($$0, this.c);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = agz$a.a();
        }
    }
}

