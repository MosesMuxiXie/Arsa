/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public final class asy
extends Record
implements ast {
    private final yf c;
    public static final Map<yf.a, MapCodec<asy>> b = bhs.a(() -> {
        EnumMap<yf.a, MapCodec> $$0 = new EnumMap<yf.a, MapCodec>(yf.a.class);
        for (yf.a $$1 : (yf.a[])yf.a.class.getEnumConstants()) {
            if (!$$1.a()) continue;
            MapCodec<? extends yf> $$2 = $$1.b();
            $$0.put($$1, $$2.xmap(asy::new, asy::b));
        }
        return Collections.unmodifiableMap($$0);
    });

    public asy(yf $$0) {
        this.c = $$0;
    }

    public MapCodec<asy> a() {
        return b.get(this.c.a());
    }

    @Override
    public Optional<yf> a(Map<String, ast.a> $$0) {
        return Optional.of(this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asy.class, "value", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asy.class, "value", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asy.class, "value", "c"}, this, $$0);
    }

    public yf b() {
        return this.c;
    }
}

