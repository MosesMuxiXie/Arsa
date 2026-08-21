/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class gnq
extends Enum<gnq>
implements bhh {
    public static final /* enum */ gnq a = new gnq("uniform");
    public static final /* enum */ gnq b = new gnq("jp");
    public static final Codec<gnq> c;
    private final String d;
    private static final /* synthetic */ gnq[] e;

    public static gnq[] values() {
        return (gnq[])e.clone();
    }

    public static gnq valueOf(String $$0) {
        return Enum.valueOf(gnq.class, $$0);
    }

    private gnq(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ gnq[] a() {
        return new gnq[]{a, b};
    }

    static {
        e = gnq.a();
        c = bhh.a(gnq::values);
    }

    public static class a {
        private final Map<gnq, Boolean> c;
        public static final Codec<a> a = Codec.unboundedMap(c, (Codec)Codec.BOOL).xmap(a::new, $$0 -> $$0.c);
        public static final a b = new a(Map.of());

        public a(Map<gnq, Boolean> $$0) {
            this.c = $$0;
        }

        public boolean a(Set<gnq> $$0) {
            for (Map.Entry<gnq, Boolean> $$1 : this.c.entrySet()) {
                if ($$0.contains($$1.getKey()) == $$1.getValue().booleanValue()) continue;
                return false;
            }
            return true;
        }

        public a a(a $$0) {
            HashMap<gnq, Boolean> $$1 = new HashMap<gnq, Boolean>($$0.c);
            $$1.putAll(this.c);
            return new a(Map.copyOf($$1));
        }
    }
}

