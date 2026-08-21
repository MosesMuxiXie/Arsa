/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public final class dnw
extends Record
implements dpe {
    private final Map<String, String> d;
    public static final dnw a = new dnw(Map.of());
    public static final Codec<dnw> b = Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING).xmap(dnw::new, dnw::b);
    private static final aao<ByteBuf, Map<String, String>> e = aam.a(Object2ObjectOpenHashMap::new, aam.p, aam.p);
    public static final aao<ByteBuf, dnw> c = e.a(dnw::new, dnw::b);

    public dnw(Map<String, String> $$0) {
        this.d = $$0;
    }

    public <T extends Comparable<T>> dnw a(epk<T> $$0, T $$1) {
        return new dnw(bhs.a(this.d, $$0.f(), $$0.b($$1)));
    }

    public <T extends Comparable<T>> dnw a(epk<T> $$0, eoh $$1) {
        return this.a($$0, $$1.c($$0));
    }

    public <T extends Comparable<T>> @Nullable T a(epk<T> $$0) {
        String $$1 = this.d.get($$0.f());
        if ($$1 == null) {
            return null;
        }
        return (T)((Comparable)$$0.b($$1).orElse(null));
    }

    public eoh a(eoh $$0) {
        eoi<dzq, eoh> $$1 = $$0.b().l();
        for (Map.Entry<String, String> $$2 : this.d.entrySet()) {
            epk<?> $$3 = $$1.a($$2.getKey());
            if ($$3 == null) continue;
            $$0 = dnw.a($$0, $$3, $$2.getValue());
        }
        return $$0;
    }

    private static <T extends Comparable<T>> eoh a(eoh $$0, epk<T> $$1, String $$22) {
        return $$1.b($$22).map($$2 -> (eoh)$$0.b($$1, $$2)).orElse($$0);
    }

    public boolean a() {
        return this.d.isEmpty();
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        Integer $$4 = this.a(dzk.c);
        if ($$4 != null) {
            $$1.accept(yh.a("container.beehive.honey", $$4, 5).a(l.h));
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnw.class, "properties", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnw.class, "properties", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnw.class, "properties", "d"}, this, $$0);
    }

    public Map<String, String> b() {
        return this.d;
    }
}

