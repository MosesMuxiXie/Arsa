/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dyk<E extends elb>
extends dzc {
    protected final Supplier<eld<? extends E>> a;

    protected dyk(eog.d $$0, Supplier<eld<? extends E>> $$1) {
        super($$0);
        this.a = $$1;
    }

    protected abstract MapCodec<? extends dyk<E>> a();

    public abstract eca.c<? extends elj> a(eoh var1, dwo var2, is var3, boolean var4);
}

