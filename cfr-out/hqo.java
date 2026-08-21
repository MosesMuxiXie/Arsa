/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class hqo
implements hqh {
    private final hqg a;

    public hqo(hqg $$0) {
        this.a = $$0;
    }

    @Override
    public void a(bgr $$0, List<hqg> $$1) {
        $$1.add(this.a);
    }

    @Override
    public ilp a() {
        return this.a.b();
    }

    public static final class a
    extends Record
    implements hqh.b {
        private final hqq e;
        public static final Codec<a> d = hqq.b.xmap(a::new, a::b);

        public a(hqq $$0) {
            this.e = $$0;
        }

        @Override
        public hqh a(inw $$0) {
            return new hqo(this.e.a($$0));
        }

        @Override
        public void a(ioe.a $$0) {
            this.e.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "variant", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "variant", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "variant", "e"}, this, $$0);
        }

        public hqq b() {
            return this.e;
        }
    }
}

