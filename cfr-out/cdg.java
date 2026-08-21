/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface cdg {
    public yh ap();

    default public String aq() {
        return this.ap().getString();
    }

    default public boolean i_() {
        return this.as() != null;
    }

    default public yh R_() {
        return this.ap();
    }

    default public @Nullable yh as() {
        return null;
    }
}

