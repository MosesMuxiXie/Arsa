/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HexFormat;

public final class bex
extends Record {
    private final int b;
    public static final Codec<bex> a = bfm.o.xmap(bex::new, bex::a);

    public bex(int $$0) {
        this.b = $$0;
    }

    @Override
    public String toString() {
        return HexFormat.of().toHexDigits(this.b, 8);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bex.class, "rgba", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bex.class, "rgba", "b"}, this, $$0);
    }

    public int a() {
        return this.b;
    }
}

