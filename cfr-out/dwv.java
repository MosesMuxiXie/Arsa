/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface dwv {
    public boolean a(is var1, eoh var2, @dzq.b int var3, int var4);

    default public boolean a(is $$0, eoh $$1, @dzq.b int $$2) {
        return this.a($$0, $$1, $$2, 512);
    }

    public boolean a(is var1, boolean var2);

    default public boolean b(is $$0, boolean $$1) {
        return this.a($$0, $$1, null);
    }

    default public boolean a(is $$0, boolean $$1, @Nullable cgk $$2) {
        return this.a($$0, $$1, $$2, 512);
    }

    public boolean a(is var1, boolean var2, @Nullable cgk var3, int var4);

    default public boolean b(cgk $$0) {
        return false;
    }
}

