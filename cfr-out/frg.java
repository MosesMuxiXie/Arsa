/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public record frg(boolean b) implements frm
{
    private final boolean b;
    public static final MapCodec<frg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.fieldOf("active").forGetter(frg::e)).apply((Applicative)$$0, frg::new));

    public boolean a(fnz $$0) {
        return $$0.b(fqx.n) == this.b;
    }

    @Override
    public frn a() {
        return fro.s;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.n);
    }

    public static frm.a c() {
        return () -> new frg(true);
    }

    public static frm.a d() {
        return () -> new frg(false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frg.class, "active", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frg.class, "active", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frg.class, "active", "b"}, this, $$0);
    }

    public boolean e() {
        return this.b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

