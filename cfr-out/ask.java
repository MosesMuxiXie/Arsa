/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public final class ask
extends Enum<ask>
implements bhh {
    public static final /* enum */ ask a = new ask(0, "close");
    public static final /* enum */ ask b = new ask(1, "none");
    public static final /* enum */ ask c = new ask(2, "wait_for_response");
    public static final IntFunction<ask> d;
    public static final bhh.a<ask> e;
    public static final aao<ByteBuf, ask> f;
    private final int g;
    private final String h;
    private static final /* synthetic */ ask[] i;

    public static ask[] values() {
        return (ask[])i.clone();
    }

    public static ask valueOf(String $$0) {
        return Enum.valueOf(ask.class, $$0);
    }

    private ask(int $$0, String $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public String c() {
        return this.h;
    }

    public boolean a() {
        return this == a || this == c;
    }

    private static /* synthetic */ ask[] b() {
        return new ask[]{a, b, c};
    }

    static {
        i = ask.b();
        d = beu.a($$0 -> $$0.g, ask.values(), beu.a.a);
        e = bhh.a(ask::values);
        f = aam.a(d, (T $$0) -> $$0.g);
    }
}

