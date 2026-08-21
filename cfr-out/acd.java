/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface acd {
    public b<? extends acd> a();

    public static <B extends ByteBuf, T extends acd> aao<B, T> a(aar<B, T> $$0, aap<B, T> $$1) {
        return aao.a($$0, $$1);
    }

    public static <T extends acd> b<T> a(String $$0) {
        return new b(amo.b($$0));
    }

    public static <B extends wx> aao<B, acd> a(final a<B> $$02, List<c<? super B, ?>> $$1) {
        final Map<amo, aao> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0 -> $$0.a().a(), c::b));
        return new aao<B, acd>(){

            @Override
            private aao<? super B, ? extends acd> a(amo $$0) {
                aao $$1 = (aao)$$2.get($$0);
                if ($$1 != null) {
                    return $$1;
                }
                return $$02.create($$0);
            }

            private <T extends acd> void a(B $$0, b<T> $$1, acd $$22) {
                ((wx)((Object)$$0)).a($$1.a());
                aao $$3 = this.a($$1.a);
                $$3.encode($$0, $$22);
            }

            public void a(B $$0, acd $$1) {
                this.a($$0, $$1.a(), $$1);
            }

            public acd a(B $$0) {
                amo $$1 = ((wx)((Object)$$0)).q();
                return (acd)this.a($$1).decode($$0);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((Object)((Object)((wx)((Object)object))), (acd)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((Object)((Object)((wx)((Object)object))));
            }
        };
    }

    public static final class b<T extends acd>
    extends Record {
        final amo a;

        public b(amo $$0) {
            this.a = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id", "a"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }
    }

    public static interface a<B extends wx> {
        public aao<B, ? extends acd> create(amo var1);
    }

    public record c<B extends wx, T extends acd>(b<T> a, aao<B, T> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "type;codec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "type;codec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "type;codec", "a", "b"}, this, $$0);
        }
    }
}

