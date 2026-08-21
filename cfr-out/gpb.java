/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public interface gpb
extends gkr,
gpe {
    public a y();

    default public boolean b() {
        return true;
    }

    default public Collection<? extends gpb> aW_() {
        return List.of(this);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public boolean a() {
            return this == c;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            d = gpb$a.b();
        }
    }
}

