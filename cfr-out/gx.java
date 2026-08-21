/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public final class gx
extends Record {
    private final String b;
    private final gv c;
    public static final Codec<gx> a = Codec.STRING.comapFlatMap(gx::a, gx::a);

    public gx(String $$0, gv $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static DataResult<gx> a(String $$0) {
        try {
            gw $$1 = new gw(new StringReader($$0), true);
            return DataResult.success((Object)new gx($$0, $$1.t()));
        }
        catch (CommandSyntaxException $$2) {
            return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + $$2.getMessage());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (!($$0 instanceof gx)) return false;
        gx $$1 = (gx)$$0;
        if (!this.b.equals($$1.b)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public String toString() {
        return this.b;
    }

    public String a() {
        return this.b;
    }

    public gv b() {
        return this.c;
    }
}

