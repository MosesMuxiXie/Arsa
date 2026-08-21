/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public interface asf
extends asj {
    public MapCodec<? extends asf> a();

    public int b();

    public Optional<ase> c();

    @Override
    default public Optional<ast> d() {
        return this.c().flatMap(ase::b);
    }
}

