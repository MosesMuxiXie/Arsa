/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class lx<T extends lw> {
    private final boolean a;

    protected lx(boolean $$0) {
        this.a = $$0;
    }

    public boolean b() {
        return this.a;
    }

    public abstract MapCodec<T> c();

    public abstract aao<? super xq, T> d();
}

