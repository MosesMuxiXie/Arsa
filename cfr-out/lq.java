/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lq
implements lw {
    private final lx<lq> a;
    private final int b;

    public static MapCodec<lq> a(lx<lq> $$02) {
        return bfm.m.xmap($$1 -> new lq($$02, (int)$$1), $$0 -> $$0.b).fieldOf("color");
    }

    public static aao<? super ByteBuf, lq> b(lx<lq> $$02) {
        return aam.g.a($$1 -> new lq($$02, (int)$$1), $$0 -> $$0.b);
    }

    private lq(lx<lq> $$0, int $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public lx<lq> a() {
        return this.a;
    }

    public float b() {
        return (float)bel.c(this.b) / 255.0f;
    }

    public float c() {
        return (float)bel.d(this.b) / 255.0f;
    }

    public float d() {
        return (float)bel.e(this.b) / 255.0f;
    }

    public float e() {
        return (float)bel.b(this.b) / 255.0f;
    }

    public static lq a(lx<lq> $$0, int $$1) {
        return new lq($$0, $$1);
    }

    public static lq a(lx<lq> $$0, float $$1, float $$2, float $$3) {
        return lq.a($$0, bel.a(1.0f, $$1, $$2, $$3));
    }
}

