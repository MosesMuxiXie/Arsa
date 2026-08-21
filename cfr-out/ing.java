/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class ing
extends Record {
    private final Map<String, imv> d;
    public static final Codec<String> a = Codec.string((int)1, (int)16);
    public static final Codec<ing> b = Codec.unboundedMap(a, imv.a).xmap(ing::new, ing::a);
    public static final azy<ing> c = new azy<ing>("language", b);

    public ing(Map<String, imv> $$0) {
        this.d = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ing.class, "languages", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ing.class, "languages", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ing.class, "languages", "d"}, this, $$0);
    }

    public Map<String, imv> a() {
        return this.d;
    }
}

