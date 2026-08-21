/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class fsy<C> {
    public static final fsy<MinecraftServer> a = new fsy().a(amo.b("function"), fsv.a).a(amo.b("function_tag"), fsw.a);
    private final bfm.b<amo, MapCodec<? extends fsx<C>>> b = new bfm.b();
    private final Codec<fsx<C>> c = this.b.a(amo.a).dispatch("Type", fsx::a, Function.identity());

    @VisibleForTesting
    public fsy() {
    }

    public fsy<C> a(amo $$0, MapCodec<? extends fsx<C>> $$1) {
        this.b.a($$0, $$1);
        return this;
    }

    public Codec<fsx<C>> a() {
        return this.c;
    }
}

