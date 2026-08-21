/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class aeq {
    private static final aao<ByteBuf, Map<euq.a, long[]>> a = aam.a($$0 -> new EnumMap(euq.a.class), euq.a.h, aam.o);
    private static final int b = 0x200000;
    private final Map<euq.a, long[]> c;
    private final byte[] d;
    private final List<a> e;

    public aeq(eqq $$02) {
        this.c = $$02.e().stream().filter($$0 -> ((euq.a)$$0.getKey()).b()).collect(Collectors.toMap(Map.Entry::getKey, $$0 -> (long[])((euq)$$0.getValue()).a().clone()));
        this.d = new byte[aeq.a($$02)];
        aeq.a(new wx(this.c()), $$02);
        this.e = Lists.newArrayList();
        for (Map.Entry<is, elb> $$1 : $$02.J().entrySet()) {
            this.e.add(aeq$a.a($$1.getValue()));
        }
    }

    public aeq(xq $$0, int $$1, int $$2) {
        this.c = (Map)a.decode($$0);
        int $$3 = $$0.l();
        if ($$3 > 0x200000) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
        }
        this.d = new byte[$$3];
        $$0.b(this.d);
        this.e = (List)aeq$a.b.decode($$0);
    }

    public void a(xq $$0) {
        a.encode($$0, this.c);
        $$0.c(this.d.length);
        $$0.c(this.d);
        aeq$a.b.encode($$0, this.e);
    }

    private static int a(eqq $$0) {
        int $$1 = 0;
        for (eqr $$2 : $$0.d()) {
            $$1 += $$2.j();
        }
        return $$1;
    }

    private ByteBuf c() {
        ByteBuf $$0 = Unpooled.wrappedBuffer((byte[])this.d);
        $$0.writerIndex(0);
        return $$0;
    }

    public static void a(wx $$0, eqq $$1) {
        for (eqr $$2 : $$1.d()) {
            $$2.c($$0);
        }
        if ($$0.writerIndex() != $$0.capacity()) {
            throw new IllegalStateException("Didn't fill chunk buffer: expected " + $$0.capacity() + " bytes, got " + $$0.writerIndex());
        }
    }

    public Consumer<b> a(int $$0, int $$1) {
        return $$2 -> this.a((b)$$2, $$0, $$1);
    }

    private void a(b $$0, int $$1, int $$2) {
        int $$3 = 16 * $$1;
        int $$4 = 16 * $$2;
        is.a $$5 = new is.a();
        for (a $$6 : this.e) {
            int $$7 = $$3 + jw.b($$6.c >> 4);
            int $$8 = $$4 + jw.b($$6.c);
            $$5.d($$7, $$6.d, $$8);
            $$0.accept($$5, $$6.e, $$6.f);
        }
    }

    public wx a() {
        return new wx(Unpooled.wrappedBuffer((byte[])this.d));
    }

    public Map<euq.a, long[]> b() {
        return this.c;
    }

    static class a {
        public static final aao<xq, a> a = aao.a(a::a, a::new);
        public static final aao<xq, List<a>> b = a.a(aam.a());
        final int c;
        final int d;
        final eld<?> e;
        final @Nullable uz f;

        private a(int $$0, int $$1, eld<?> $$2, @Nullable uz $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        private a(xq $$0) {
            this.c = $$0.readByte();
            this.d = $$0.readShort();
            this.e = (eld)aam.a(mj.e).decode($$0);
            this.f = $$0.o();
        }

        private void a(xq $$0) {
            $$0.l(this.c);
            $$0.m(this.d);
            aam.a(mj.e).encode($$0, this.e);
            $$0.a(this.f);
        }

        static a a(elb $$0) {
            uz $$1 = $$0.a($$0.j().J_());
            is $$2 = $$0.aD_();
            int $$3 = jw.b($$2.u()) << 4 | jw.b($$2.w());
            return new a($$3, $$2.v(), $$0.s(), $$1.j() ? null : $$1);
        }
    }

    @FunctionalInterface
    public static interface b {
        public void accept(is var1, eld<?> var2, @Nullable uz var3);
    }
}

