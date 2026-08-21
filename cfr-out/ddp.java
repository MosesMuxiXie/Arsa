/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public final class ddp
extends Enum<ddp>
implements bhh {
    public static final /* enum */ ddp a = new ddp("slim", "slim");
    public static final /* enum */ ddp b = new ddp("wide", "default");
    public static final Codec<ddp> c;
    private static final Function<String, ddp> e;
    public static final aao<ByteBuf, ddp> d;
    private final String f;
    private final String g;
    private static final /* synthetic */ ddp[] h;

    public static ddp[] values() {
        return (ddp[])h.clone();
    }

    public static ddp valueOf(String $$0) {
        return Enum.valueOf(ddp.class, $$0);
    }

    private ddp(String $$0, String $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public static ddp a(@Nullable String $$0) {
        return Objects.requireNonNullElse(e.apply($$0), b);
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ ddp[] a() {
        return new ddp[]{a, b};
    }

    static {
        h = ddp.a();
        c = bhh.a(ddp::values);
        e = bhh.a(ddp.values(), (T $$0) -> $$0.g);
        d = aam.b.a($$0 -> $$0 != false ? a : b, $$0 -> $$0 == a);
    }
}

