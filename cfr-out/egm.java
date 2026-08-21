/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public final class egm
extends Enum<egm>
implements bhh {
    public static final /* enum */ egm a = new egm(0, "none", f.a);
    public static final /* enum */ egm b = new egm(1, "clockwise_90", f.u);
    public static final /* enum */ egm c = new egm(2, "180", f.c);
    public static final /* enum */ egm d = new egm(3, "counterclockwise_90", f.v);
    public static final IntFunction<egm> e;
    public static final Codec<egm> f;
    public static final aao<ByteBuf, egm> g;
    @Deprecated
    public static final Codec<egm> h;
    private final int i;
    private final String j;
    private final f k;
    private static final /* synthetic */ egm[] l;

    public static egm[] values() {
        return (egm[])l.clone();
    }

    public static egm valueOf(String $$0) {
        return Enum.valueOf(egm.class, $$0);
    }

    private egm(int $$0, String $$1, f $$2) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
    }

    public egm a(egm $$0) {
        return switch ($$0.ordinal()) {
            case 2 -> {
                switch (this.ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        yield c;
                    }
                    case 1: {
                        yield d;
                    }
                    case 2: {
                        yield a;
                    }
                    case 3: 
                }
                yield b;
            }
            case 3 -> {
                switch (this.ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        yield d;
                    }
                    case 1: {
                        yield a;
                    }
                    case 2: {
                        yield b;
                    }
                    case 3: 
                }
                yield c;
            }
            case 1 -> {
                switch (this.ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        yield b;
                    }
                    case 1: {
                        yield c;
                    }
                    case 2: {
                        yield d;
                    }
                    case 3: 
                }
                yield a;
            }
            default -> this;
        };
    }

    public f a() {
        return this.k;
    }

    public iz a(iz $$0) {
        if ($$0.o() == iz.a.b) {
            return $$0;
        }
        return switch (this.ordinal()) {
            case 2 -> $$0.g();
            case 3 -> $$0.i();
            case 1 -> $$0.h();
            default -> $$0;
        };
    }

    public int a(int $$0, int $$1) {
        return switch (this.ordinal()) {
            case 2 -> ($$0 + $$1 / 2) % $$1;
            case 3 -> ($$0 + $$1 * 3 / 4) % $$1;
            case 1 -> ($$0 + $$1 / 4) % $$1;
            default -> $$0;
        };
    }

    public static egm a(bgr $$0) {
        return bhs.a(egm.values(), $$0);
    }

    public static List<egm> b(bgr $$0) {
        return bhs.b(egm.values(), $$0);
    }

    @Override
    public String c() {
        return this.j;
    }

    private int b() {
        return this.i;
    }

    private static /* synthetic */ egm[] d() {
        return new egm[]{a, b, c, d};
    }

    static {
        l = egm.d();
        e = beu.a(egm::b, egm.values(), beu.a.b);
        f = bhh.a(egm::values);
        g = aam.a(e, egm::b);
        h = bfm.c(egm::valueOf);
    }
}

