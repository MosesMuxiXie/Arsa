/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;

public abstract class fzf
implements AutoCloseable {
    public abstract AddressMode b();

    public abstract AddressMode c();

    public abstract FilterMode d();

    public abstract FilterMode e();

    public abstract int f();

    public abstract OptionalDouble g();

    @Override
    public abstract void close();
}

