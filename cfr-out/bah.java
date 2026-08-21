/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bah {
    private static final Logger a = LogUtils.getLogger();
    private final azk b;
    private final c c;
    private final a d;
    private final azm e;

    public static @Nullable bah a(azk $$0, c $$1, azn $$2, azm $$3) {
        azz $$4 = w.b().a($$2);
        a $$5 = bah.a($$0, $$1, $$4, $$2);
        return $$5 != null ? new bah($$0, $$1, $$5, $$3) : null;
    }

    public bah(azk $$0, c $$1, a $$2, azm $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static @Nullable a a(azk $$0, c $$1, azz $$2, azn $$3) {
        try (azl $$4 = $$1.a($$0);){
            baa $$5 = $$4.a(baa.a($$3));
            if ($$5 == null) {
                $$5 = $$4.a(baa.c);
            }
            if ($$5 == null) {
                a.warn("Missing metadata in pack {}", (Object)$$0.a());
                a a2 = null;
                return a2;
            }
            azh $$6 = $$4.a(azh.a);
            dgz $$7 = $$6 != null ? $$6.a() : dgz.a();
            bai $$8 = bai.a($$5.b(), $$2);
            azj $$9 = $$4.a(azj.b($$3));
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            a a3 = new a($$5.a(), $$8, $$7, $$10);
            return a3;
        }
        catch (Exception $$11) {
            a.warn("Failed to read pack {} metadata", (Object)$$0.a(), (Object)$$11);
            return null;
        }
    }

    public azk a() {
        return this.b;
    }

    public yh b() {
        return this.b.b();
    }

    public yh c() {
        return this.d.a();
    }

    public yh a(boolean $$0) {
        return this.b.a($$0, this.d.a);
    }

    public bai d() {
        return this.d.b();
    }

    public dgz e() {
        return this.d.c();
    }

    public azl f() {
        return this.c.a(this.b, this.d);
    }

    public String g() {
        return this.b.a();
    }

    public azm h() {
        return this.e;
    }

    public boolean i() {
        return this.e.a();
    }

    public boolean j() {
        return this.e.c();
    }

    public b k() {
        return this.e.b();
    }

    public bal l() {
        return this.b.c();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof bah)) {
            return false;
        }
        bah $$1 = (bah)$$0;
        return this.b.equals($$1.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public static interface c {
        public azl a(azk var1);

        public azl a(azk var1, a var2);
    }

    public static final class a
    extends Record {
        final yh a;
        private final bai b;
        private final dgz c;
        private final List<String> d;

        public a(yh $$0, bai $$1, dgz $$2, List<String> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "description;compatibility;requestedFeatures;overlays", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "description;compatibility;requestedFeatures;overlays", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "description;compatibility;requestedFeatures;overlays", "a", "b", "c", "d"}, this, $$0);
        }

        public yh a() {
            return this.a;
        }

        public bai b() {
            return this.b;
        }

        public dgz c() {
            return this.c;
        }

        public List<String> d() {
            return this.d;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public <T> int a(List<T> $$0, T $$1, Function<T, azm> $$2, boolean $$3) {
            azm $$8;
            int $$7;
            b $$4;
            b b2 = $$4 = $$3 ? this.a() : this;
            if ($$4 == b) {
                azm $$6;
                int $$5;
                for ($$5 = 0; $$5 < $$0.size() && ($$6 = $$2.apply($$0.get($$5))).c() && $$6.b() == this; ++$$5) {
                }
                $$0.add($$5, $$1);
                return $$5;
            }
            for ($$7 = $$0.size() - 1; $$7 >= 0 && ($$8 = $$2.apply($$0.get($$7))).c() && $$8.b() == this; --$$7) {
            }
            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
        }

        public b a() {
            return this == a ? b : a;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b};
        }

        static {
            c = bah$b.b();
        }
    }
}

