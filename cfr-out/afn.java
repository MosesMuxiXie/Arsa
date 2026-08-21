/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class afn
implements aay<adb> {
    public static final aao<xq, afn> a = aay.a(afn::a, afn::new);
    private final EnumSet<a> b;
    private final List<b> c;

    public afn(EnumSet<a> $$0, Collection<axg> $$1) {
        this.b = $$0;
        this.c = $$1.stream().map(b::new).toList();
    }

    public afn(a $$0, axg $$1) {
        this.b = EnumSet.of($$0);
        this.c = List.of(new b($$1));
    }

    public static afn a(Collection<axg> $$0) {
        EnumSet<a[]> $$1 = EnumSet.of(afn$a.a, new a[]{afn$a.b, afn$a.c, afn$a.d, afn$a.e, afn$a.f, afn$a.h, afn$a.g});
        return new afn($$1, $$0);
    }

    private afn(xq $$02) {
        this.b = $$02.a(a.class);
        this.c = $$02.a((? super wx $$0) -> {
            c $$1 = new c($$0.n());
            for (a $$2 : this.b) {
                $$2.i.read($$1, (xq)((Object)$$0));
            }
            return $$1.a();
        });
    }

    @Override
    private void a(xq $$02) {
        $$02.a(this.b, a.class);
        $$02.a(this.c, (? super wx $$0, T $$1) -> {
            $$0.a($$1.a());
            for (a $$2 : this.b) {
                $$2.j.write((xq)((Object)$$0), (b)$$1);
            }
        });
    }

    @Override
    public aba<afn> a() {
        return ahz.al;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public EnumSet<a> b() {
        return this.b;
    }

    public List<b> e() {
        return this.c;
    }

    public List<b> f() {
        return this.b.contains((Object)afn$a.a) ? this.c : List.of();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("actions", this.b).add("entries", this.c).toString();
    }

    public static final class b
    extends Record {
        private final UUID a;
        private final @Nullable GameProfile b;
        private final boolean c;
        private final int d;
        private final dwl e;
        private final @Nullable yh f;
        final boolean g;
        final int h;
        final @Nullable yz.a i;

        b(axg $$0) {
            this($$0.cY(), $$0.gI(), true, $$0.g.k(), $$0.a(), $$0.Q(), $$0.a(ddo.g), $$0.R(), t.a($$0.ac(), yz::a));
        }

        public b(UUID $$0, @Nullable GameProfile $$1, boolean $$2, int $$3, dwl $$4, @Nullable yh $$5, boolean $$6, int $$7, @Nullable yz.a $$8) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
            this.i = $$8;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "profileId;profile;listed;latency;gameMode;displayName;showHat;listOrder;chatSession", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "profileId;profile;listed;latency;gameMode;displayName;showHat;listOrder;chatSession", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "profileId;profile;listed;latency;gameMode;displayName;showHat;listOrder;chatSession", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public UUID a() {
            return this.a;
        }

        public @Nullable GameProfile b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public dwl e() {
            return this.e;
        }

        public @Nullable yh f() {
            return this.f;
        }

        public boolean g() {
            return this.g;
        }

        public int h() {
            return this.h;
        }

        public @Nullable yz.a i() {
            return this.i;
        }
    }

    public static final class afn$a
    extends Enum<afn$a> {
        public static final /* enum */ afn$a a = new afn$a(($$0, $$1) -> {
            String $$2 = (String)aam.z.decode($$1);
            PropertyMap $$3 = (PropertyMap)aam.y.decode($$1);
            $$0.b = new GameProfile($$0.a, $$2, $$3);
        }, ($$0, $$1) -> {
            GameProfile $$2 = Objects.requireNonNull($$1.b());
            aam.z.encode($$0, $$2.name());
            aam.y.encode($$0, $$2.properties());
        });
        public static final /* enum */ afn$a b = new afn$a(($$0, $$1) -> {
            $$0.i = $$1.c(yz.a::a);
        }, ($$0, $$1) -> $$0.a($$1.i, yz.a::a));
        public static final /* enum */ afn$a c = new afn$a(($$0, $$1) -> {
            $$0.e = dwl.a($$1.l());
        }, ($$0, $$1) -> $$0.c($$1.e().a()));
        public static final /* enum */ afn$a d = new afn$a(($$0, $$1) -> {
            $$0.c = $$1.readBoolean();
        }, ($$0, $$1) -> $$0.a($$1.c()));
        public static final /* enum */ afn$a e = new afn$a(($$0, $$1) -> {
            $$0.d = $$1.l();
        }, ($$0, $$1) -> $$0.c($$1.d()));
        public static final /* enum */ afn$a f = new afn$a(($$0, $$1) -> {
            $$0.f = wx.a($$1, yj.d);
        }, ($$0, $$1) -> wx.a($$0, $$1.f(), yj.d));
        public static final /* enum */ afn$a g = new afn$a(($$0, $$1) -> {
            $$0.h = $$1.l();
        }, ($$0, $$1) -> $$0.c($$1.h));
        public static final /* enum */ afn$a h = new afn$a(($$0, $$1) -> {
            $$0.g = $$1.readBoolean();
        }, ($$0, $$1) -> $$0.a($$1.g));
        final a i;
        final b j;
        private static final /* synthetic */ afn$a[] k;

        public static afn$a[] values() {
            return (afn$a[])k.clone();
        }

        public static afn$a valueOf(String $$0) {
            return Enum.valueOf(afn$a.class, $$0);
        }

        private afn$a(a $$0, b $$1) {
            this.i = $$0;
            this.j = $$1;
        }

        private static /* synthetic */ afn$a[] a() {
            return new afn$a[]{a, b, c, d, e, f, g, h};
        }

        static {
            k = afn$a.a();
        }

        public static interface a {
            public void read(c var1, xq var2);
        }

        public static interface b {
            public void write(xq var1, afn$b var2);
        }
    }

    static class c {
        final UUID a;
        @Nullable GameProfile b;
        boolean c;
        int d;
        dwl e = dwl.e;
        @Nullable yh f;
        boolean g;
        int h;
        @Nullable yz.a i;

        c(UUID $$0) {
            this.a = $$0;
        }

        b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }
}

