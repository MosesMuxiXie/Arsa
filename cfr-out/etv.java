/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Objects;
import java.util.function.ToIntFunction;

public final class etv<T>
implements dgw {
    private final etw a;
    private final ety b;
    private final ArgumentType<T> c;
    private final eua.a<T> d;
    private final Codec<T> e;
    private final ToIntFunction<T> f;
    private final T g;
    private final dgz h;

    public etv(etw $$0, ety $$1, ArgumentType<T> $$2, eua.a<T> $$3, Codec<T> $$4, ToIntFunction<T> $$5, T $$6, dgz $$7) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
    }

    public String toString() {
        return this.a();
    }

    public String a() {
        return this.b().f();
    }

    public amo b() {
        return Objects.requireNonNull(mi.an.b(this));
    }

    public String c() {
        return bhs.a("gamerule", this.b());
    }

    public String a(T $$0) {
        return $$0.toString();
    }

    public DataResult<T> a(String $$0) {
        try {
            StringReader $$1 = new StringReader($$0);
            Object $$2 = this.c.parse($$1);
            if ($$1.canRead()) {
                return DataResult.error(() -> "Failed to deserialize; trailing characters", (Object)$$2);
            }
            return DataResult.success((Object)$$2);
        }
        catch (CommandSyntaxException $$3) {
            return DataResult.error(() -> "Failed to deserialize");
        }
    }

    public Class<T> d() {
        return this.g.getClass();
    }

    public void a(etz $$0) {
        this.d.call($$0, this);
    }

    public int b(T $$0) {
        return this.f.applyAsInt($$0);
    }

    public etw e() {
        return this.a;
    }

    public ety f() {
        return this.b;
    }

    public ArgumentType<T> g() {
        return this.c;
    }

    public Codec<T> h() {
        return this.e;
    }

    public T i() {
        return this.g;
    }

    @Override
    public dgz k() {
        return this.h;
    }
}

