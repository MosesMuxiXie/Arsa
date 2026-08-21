/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public class fnz {
    private final fod a;
    private final bgr b;
    private final je.a c;
    private final Set<e<?>> d = Sets.newLinkedHashSet();

    fnz(fod $$0, bgr $$1, je.a $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public boolean a(bhv<?> $$0) {
        return this.a.b().a($$0);
    }

    public <T> T b(bhv<T> $$0) {
        return this.a.b().b($$0);
    }

    public <T> @Nullable T c(bhv<T> $$0) {
        return this.a.b().c($$0);
    }

    public void a(amo $$0, Consumer<dlt> $$1) {
        this.a.a($$0, $$1);
    }

    public boolean a(e<?> $$0) {
        return this.d.contains($$0);
    }

    public boolean b(e<?> $$0) {
        return this.d.add($$0);
    }

    public void c(e<?> $$0) {
        this.d.remove($$0);
    }

    public je.a a() {
        return this.c;
    }

    public bgr b() {
        return this.b;
    }

    public float c() {
        return this.a.c();
    }

    public axf d() {
        return this.a.a();
    }

    public static e<fof> a(fof $$0) {
        return new e<fof>(foc.c, $$0);
    }

    public static e<frm> a(frm $$0) {
        return new e<frm>(foc.a, $$0);
    }

    public static e<fpr> a(fpr $$0) {
        return new e<fpr>(foc.b, $$0);
    }

    public record e<T>(foc<T> a, T b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "type;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "type;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "type;value", "a", "b"}, this, $$0);
        }
    }

    public static final class d
    extends Enum<d>
    implements bhh,
    foa.c<dlt> {
        public static final /* enum */ d a = new d("tool", fqx.k);
        private final String b;
        private final bhv<? extends dlt> c;
        private static final /* synthetic */ d[] d;

        public static d[] values() {
            return (d[])d.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(String $$0, bhv<? extends dlt> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public bhv<? extends dlt> a() {
            return this.c;
        }

        @Override
        public String c() {
            return this.b;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a};
        }

        static {
            d = fnz$d.b();
        }
    }

    public static final class a
    extends Enum<a>
    implements bhh,
    foa.c<elb> {
        public static final /* enum */ a a = new a("block_entity", fqx.j);
        private final String b;
        private final bhv<? extends elb> c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, bhv<? extends elb> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public bhv<? extends elb> a() {
            return this.c;
        }

        @Override
        public String c() {
            return this.b;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a};
        }

        static {
            d = fnz$a.b();
        }
    }

    public static final class c
    extends Enum<c>
    implements bhh,
    foa.c<cgk> {
        public static final /* enum */ c a = new c("this", fqx.a);
        public static final /* enum */ c b = new c("attacker", fqx.f);
        public static final /* enum */ c c = new c("direct_attacker", fqx.g);
        public static final /* enum */ c d = new c("attacking_player", fqx.d);
        public static final /* enum */ c e = new c("target_entity", fqx.c);
        public static final /* enum */ c f = new c("interacting_entity", fqx.b);
        public static final bhh.a<c> g;
        private final String i;
        private final bhv<? extends cgk> j;
        private static final /* synthetic */ c[] k;

        public static c[] values() {
            return (c[])k.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0, bhv<? extends cgk> $$1) {
            this.i = $$0;
            this.j = $$1;
        }

        @Override
        public bhv<? extends cgk> a() {
            return this.j;
        }

        public static c a(String $$0) {
            c $$1 = g.a($$0);
            if ($$1 != null) {
                return $$1;
            }
            throw new IllegalArgumentException("Invalid entity target " + $$0);
        }

        @Override
        public String c() {
            return this.i;
        }

        private static /* synthetic */ c[] b() {
            return new c[]{a, b, c, d, e, f};
        }

        static {
            k = fnz$c.b();
            g = bhh.a(c::values);
        }
    }

    public static class b {
        private final fod a;
        private @Nullable bgr b;

        public b(fod $$0) {
            this.a = $$0;
        }

        public b a(long $$0) {
            if ($$0 != 0L) {
                this.b = bgr.a($$0);
            }
            return this;
        }

        public b a(bgr $$0) {
            this.b = $$0;
            return this;
        }

        public axf a() {
            return this.a.a();
        }

        public fnz a(Optional<amo> $$0) {
            axf $$1 = this.a();
            MinecraftServer $$2 = $$1.s();
            bgr $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::G_);
            return new fnz(this.a, $$3, $$2.be().a());
        }
    }
}

