/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public final class doe {
    public static final doe a = new doe(new uz());
    public static final Codec<uz> b = Codec.withAlternative(uz.a, wa.e);
    public static final Codec<doe> c = b.xmap(doe::new, $$0 -> $$0.e);
    @Deprecated
    public static final aao<ByteBuf, doe> d = aam.s.a(doe::new, $$0 -> $$0.e);
    private final uz e;

    private doe(uz $$0) {
        this.e = $$0;
    }

    public static doe a(uz $$0) {
        return new doe($$0.l());
    }

    public boolean b(uz $$0) {
        return vo.a((vz)$$0, this.e, true);
    }

    public static void a(kh<doe> $$0, dlt $$1, Consumer<uz> $$2) {
        doe $$3 = $$1.a($$0, a).a($$2);
        if ($$3.e.j()) {
            $$1.e($$0);
        } else {
            $$1.b($$0, $$3);
        }
    }

    public static void a(kh<doe> $$0, dlt $$1, uz $$2) {
        if (!$$2.j()) {
            $$1.b($$0, doe.a($$2));
        } else {
            $$1.e($$0);
        }
    }

    public doe a(Consumer<uz> $$0) {
        uz $$1 = this.e.l();
        $$0.accept($$1);
        return new doe($$1);
    }

    public boolean a() {
        return this.e.j();
    }

    public uz b() {
        return this.e.l();
    }

    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if ($$0 instanceof doe) {
            doe $$1 = (doe)$$0;
            return this.e.equals($$1.e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return this.e.toString();
    }
}

