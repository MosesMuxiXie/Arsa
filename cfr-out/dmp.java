/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public final class dmp
extends Enum<dmp>
implements bhh {
    public static final /* enum */ dmp a = new dmp(0, "common", l.p);
    public static final /* enum */ dmp b = new dmp(1, "uncommon", l.o);
    public static final /* enum */ dmp c = new dmp(2, "rare", l.l);
    public static final /* enum */ dmp d = new dmp(3, "epic", l.n);
    public static final Codec<dmp> e;
    public static final IntFunction<dmp> f;
    public static final aao<ByteBuf, dmp> g;
    private final int h;
    private final String i;
    private final l j;
    private static final /* synthetic */ dmp[] k;

    public static dmp[] values() {
        return (dmp[])k.clone();
    }

    public static dmp valueOf(String $$0) {
        return Enum.valueOf(dmp.class, $$0);
    }

    private dmp(int $$0, String $$1, l $$2) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
    }

    public l a() {
        return this.j;
    }

    @Override
    public String c() {
        return this.i;
    }

    private static /* synthetic */ dmp[] b() {
        return new dmp[]{a, b, c, d};
    }

    static {
        k = dmp.b();
        e = bhh.b(dmp::values);
        f = beu.a($$0 -> $$0.h, dmp.values(), beu.a.a);
        g = aam.a(f, (T $$0) -> $$0.h);
    }
}

