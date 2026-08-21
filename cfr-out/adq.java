/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record adq(List<a> b) implements aay<adb>
{
    public static final aao<wx, adq> a = aay.a(adq::a, adq::new);
    private static final int c = 0x200000;

    private adq(wx $$0) {
        this($$0.a(a::new));
    }

    public static adq a(List<eqq> $$0) {
        return new adq($$0.stream().map(a::new).toList());
    }

    @Override
    private void a(wx $$02) {
        $$02.a(this.b, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
    }

    @Override
    public aba<adq> a() {
        return ahz.o;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adq.class, "chunkBiomeData", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adq.class, "chunkBiomeData", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adq.class, "chunkBiomeData", "b"}, this, $$0);
    }

    public record a(dvu a, byte[] b) {
        private final dvu a;
        private final byte[] b;

        public a(eqq $$0) {
            this($$0.f(), new byte[adq$a.a($$0)]);
            adq$a.a(new wx(this.d()), $$0);
        }

        public a(wx $$0) {
            this($$0.f(), $$0.a(0x200000));
        }

        private static int a(eqq $$0) {
            int $$1 = 0;
            for (eqr $$2 : $$0.d()) {
                $$1 += $$2.i().d();
            }
            return $$1;
        }

        public wx a() {
            return new wx(Unpooled.wrappedBuffer((byte[])this.b));
        }

        private ByteBuf d() {
            ByteBuf $$0 = Unpooled.wrappedBuffer((byte[])this.b);
            $$0.writerIndex(0);
            return $$0;
        }

        public static void a(wx $$0, eqq $$1) {
            for (eqr $$2 : $$1.d()) {
                $$2.i().b($$0);
            }
            if ($$0.writerIndex() != $$0.capacity()) {
                throw new IllegalStateException("Didn't fill biome buffer: expected " + $$0.capacity() + " bytes, got " + $$0.writerIndex());
            }
        }

        public void a(wx $$0) {
            $$0.a(this.a);
            $$0.a(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;buffer", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;buffer", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;buffer", "a", "b"}, this, $$0);
        }

        public dvu b() {
            return this.a;
        }

        public byte[] c() {
            return this.b;
        }
    }
}

