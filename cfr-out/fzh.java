/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 */
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.nio.ByteOrder;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;

public class fzh
implements fzp {
    private static final int a = 0xFFFFFF;
    private static final long b = -1L;
    private static final long c = -1L;
    private static final boolean d = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
    private final fzi e;
    private long f = -1L;
    private int g;
    private final VertexFormat h;
    private final VertexFormat.b i;
    private final boolean j;
    private final boolean k;
    private final int l;
    private final int m;
    private final int[] n;
    private int o;
    private boolean p = true;

    public fzh(fzi $$0, VertexFormat.b $$1, VertexFormat $$2) {
        if (!$$2.contains(VertexFormatElement.POSITION)) {
            throw new IllegalArgumentException("Cannot build mesh with no position element");
        }
        this.e = $$0;
        this.i = $$1;
        this.h = $$2;
        this.l = $$2.getVertexSize();
        this.m = $$2.getElementsMask() & ~VertexFormatElement.POSITION.mask();
        this.n = $$2.getOffsetsByElement();
        boolean $$3 = $$2 == fzk.c;
        boolean $$4 = $$2 == fzk.b;
        this.j = $$3 || $$4;
        this.k = $$3;
    }

    public @Nullable fzl a() {
        this.c();
        this.f();
        fzl $$0 = this.d();
        this.p = false;
        this.f = -1L;
        return $$0;
    }

    public fzl b() {
        fzl $$0 = this.a();
        if ($$0 == null) {
            throw new IllegalStateException("BufferBuilder was empty");
        }
        return $$0;
    }

    private void c() {
        if (!this.p) {
            throw new IllegalStateException("Not building!");
        }
    }

    private @Nullable fzl d() {
        if (this.g == 0) {
            return null;
        }
        fzi.a $$0 = this.e.a();
        if ($$0 == null) {
            return null;
        }
        int $$1 = this.i.a(this.g);
        VertexFormat.a $$2 = VertexFormat.a.a(this.g);
        return new fzl($$0, new fzl.a(this.h, this.g, $$1, this.i, $$2));
    }

    private long e() {
        long $$0;
        this.c();
        this.f();
        if (this.g >= 0xFFFFFF) {
            throw new IllegalStateException("Trying to write too many vertices (>16777215) into BufferBuilder");
        }
        ++this.g;
        this.f = $$0 = this.e.b(this.l);
        return $$0;
    }

    private long a(VertexFormatElement $$0) {
        int $$1 = this.o;
        int $$2 = $$1 & ~$$0.mask();
        if ($$2 == $$1) {
            return -1L;
        }
        this.o = $$2;
        long $$3 = this.f;
        if ($$3 == -1L) {
            throw new IllegalArgumentException("Not currently building vertex");
        }
        return $$3 + (long)this.n[$$0.id()];
    }

    private void f() {
        if (this.g == 0) {
            return;
        }
        if (this.o != 0) {
            String $$0 = VertexFormatElement.elementsFromMask(this.o).map(this.h::getElementName).collect(Collectors.joining(", "));
            throw new IllegalStateException("Missing elements in vertex: " + $$0);
        }
        if (this.i == VertexFormat.b.a) {
            long $$1 = this.e.b(this.l);
            MemoryUtil.memCopy((long)($$1 - (long)this.l), (long)$$1, (long)this.l);
            ++this.g;
        }
    }

    private static void a(long $$0, int $$1) {
        int $$2 = bel.q($$1);
        MemoryUtil.memPutInt((long)$$0, (int)(d ? $$2 : Integer.reverseBytes($$2)));
    }

    private static void b(long $$0, int $$1) {
        if (d) {
            MemoryUtil.memPutInt((long)$$0, (int)$$1);
        } else {
            MemoryUtil.memPutShort((long)$$0, (short)((short)($$1 & 0xFFFF)));
            MemoryUtil.memPutShort((long)($$0 + 2L), (short)((short)($$1 >> 16 & 0xFFFF)));
        }
    }

    @Override
    public fzp a(float $$0, float $$1, float $$2) {
        long $$3 = this.e() + (long)this.n[VertexFormatElement.POSITION.id()];
        this.o = this.m;
        MemoryUtil.memPutFloat((long)$$3, (float)$$0);
        MemoryUtil.memPutFloat((long)($$3 + 4L), (float)$$1);
        MemoryUtil.memPutFloat((long)($$3 + 8L), (float)$$2);
        return this;
    }

    @Override
    public fzp a(int $$0, int $$1, int $$2, int $$3) {
        long $$4 = this.a(VertexFormatElement.COLOR);
        if ($$4 != -1L) {
            MemoryUtil.memPutByte((long)$$4, (byte)((byte)$$0));
            MemoryUtil.memPutByte((long)($$4 + 1L), (byte)((byte)$$1));
            MemoryUtil.memPutByte((long)($$4 + 2L), (byte)((byte)$$2));
            MemoryUtil.memPutByte((long)($$4 + 3L), (byte)((byte)$$3));
        }
        return this;
    }

    @Override
    public fzp a(int $$0) {
        long $$1 = this.a(VertexFormatElement.COLOR);
        if ($$1 != -1L) {
            fzh.a($$1, $$0);
        }
        return this;
    }

    @Override
    public fzp a(float $$0, float $$1) {
        long $$2 = this.a(VertexFormatElement.UV0);
        if ($$2 != -1L) {
            MemoryUtil.memPutFloat((long)$$2, (float)$$0);
            MemoryUtil.memPutFloat((long)($$2 + 4L), (float)$$1);
        }
        return this;
    }

    @Override
    public fzp a(int $$0, int $$1) {
        return this.a((short)$$0, (short)$$1, VertexFormatElement.UV1);
    }

    @Override
    public fzp b(int $$0) {
        long $$1 = this.a(VertexFormatElement.UV1);
        if ($$1 != -1L) {
            fzh.b($$1, $$0);
        }
        return this;
    }

    @Override
    public fzp b(int $$0, int $$1) {
        return this.a((short)$$0, (short)$$1, VertexFormatElement.UV2);
    }

    @Override
    public fzp c(int $$0) {
        long $$1 = this.a(VertexFormatElement.UV2);
        if ($$1 != -1L) {
            fzh.b($$1, $$0);
        }
        return this;
    }

    private fzp a(short $$0, short $$1, VertexFormatElement $$2) {
        long $$3 = this.a($$2);
        if ($$3 != -1L) {
            MemoryUtil.memPutShort((long)$$3, (short)$$0);
            MemoryUtil.memPutShort((long)($$3 + 2L), (short)$$1);
        }
        return this;
    }

    @Override
    public fzp b(float $$0, float $$1, float $$2) {
        long $$3 = this.a(VertexFormatElement.NORMAL);
        if ($$3 != -1L) {
            MemoryUtil.memPutByte((long)$$3, (byte)fzh.b($$0));
            MemoryUtil.memPutByte((long)($$3 + 1L), (byte)fzh.b($$1));
            MemoryUtil.memPutByte((long)($$3 + 2L), (byte)fzh.b($$2));
        }
        return this;
    }

    @Override
    public fzp a(float $$0) {
        long $$1 = this.a(VertexFormatElement.LINE_WIDTH);
        if ($$1 != -1L) {
            MemoryUtil.memPutFloat((long)$$1, (float)$$0);
        }
        return this;
    }

    private static byte b(float $$0) {
        return (byte)((int)(bgj.a($$0, -1.0f, 1.0f) * 127.0f) & 0xFF);
    }

    @Override
    public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
        if (this.j) {
            long $$13;
            long $$11 = this.e();
            MemoryUtil.memPutFloat((long)($$11 + 0L), (float)$$0);
            MemoryUtil.memPutFloat((long)($$11 + 4L), (float)$$1);
            MemoryUtil.memPutFloat((long)($$11 + 8L), (float)$$2);
            fzh.a($$11 + 12L, $$3);
            MemoryUtil.memPutFloat((long)($$11 + 16L), (float)$$4);
            MemoryUtil.memPutFloat((long)($$11 + 20L), (float)$$5);
            if (this.k) {
                fzh.b($$11 + 24L, $$6);
                long $$12 = $$11 + 28L;
            } else {
                $$13 = $$11 + 24L;
            }
            fzh.b($$13 + 0L, $$7);
            MemoryUtil.memPutByte((long)($$13 + 4L), (byte)fzh.b($$8));
            MemoryUtil.memPutByte((long)($$13 + 5L), (byte)fzh.b($$9));
            MemoryUtil.memPutByte((long)($$13 + 6L), (byte)fzh.b($$10));
            return;
        }
        fzp.super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
    }
}

