/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.Stream;

public final class dpk
extends Record
implements dny<String, dpk> {
    private final List<axx<String>> g;
    public static final dpk a = new dpk(List.of());
    public static final int b = 1024;
    public static final int c = 100;
    private static final Codec<axx<String>> h = axx.a(Codec.string((int)0, (int)1024));
    public static final Codec<List<axx<String>>> d = h.sizeLimitedListOf(100);
    public static final Codec<dpk> e = RecordCodecBuilder.create($$0 -> $$0.group((App)d.optionalFieldOf("pages", List.of()).forGetter(dpk::a)).apply((Applicative)$$0, dpk::new));
    public static final aao<ByteBuf, dpk> f = axx.a(aam.b(1024)).a(aam.c(100)).a(dpk::new, dpk::a);

    public dpk(List<axx<String>> $$0) {
        if ($$0.size() > 100) {
            throw new IllegalArgumentException("Got " + $$0.size() + " pages, but maximum is 100");
        }
        this.g = $$0;
    }

    public Stream<String> a(boolean $$0) {
        return this.g.stream().map($$1 -> (String)$$1.a($$0));
    }

    public dpk b(List<axx<String>> $$0) {
        return new dpk($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpk.class, "pages", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpk.class, "pages", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpk.class, "pages", "g"}, this, $$0);
    }

    @Override
    public List<axx<String>> a() {
        return this.g;
    }

    @Override
    public /* synthetic */ Object a(List list) {
        return this.b(list);
    }
}

