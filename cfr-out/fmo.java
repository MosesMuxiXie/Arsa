/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public record fmo<T extends fmn>(String a, Supplier<T> b, Codec<T> c, bhz d) {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (!($$0 instanceof fmo)) return false;
        fmo $$1 = (fmo)$$0;
        if (!this.a.equals($$1.a)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return "SavedDataType[" + this.a + "]";
    }
}

