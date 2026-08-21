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

public final class dqe
extends Enum<dqe>
implements bhh {
    public static final /* enum */ dqe a = new dqe(0, "food");
    public static final /* enum */ dqe b = new dqe(1, "blocks");
    public static final /* enum */ dqe c = new dqe(2, "misc");
    private static final IntFunction<dqe> f;
    public static final Codec<dqe> d;
    public static final aao<ByteBuf, dqe> e;
    private final int g;
    private final String h;
    private static final /* synthetic */ dqe[] i;

    public static dqe[] values() {
        return (dqe[])i.clone();
    }

    public static dqe valueOf(String $$0) {
        return Enum.valueOf(dqe.class, $$0);
    }

    private dqe(int $$0, String $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public String c() {
        return this.h;
    }

    private static /* synthetic */ dqe[] a() {
        return new dqe[]{a, b, c};
    }

    static {
        i = dqe.a();
        f = beu.a($$0 -> $$0.g, dqe.values(), beu.a.a);
        d = bhh.a(dqe::values);
        e = aam.a(f, (T $$0) -> $$0.g);
    }
}

