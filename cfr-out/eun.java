/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eun {
    public final fcd a;
    public final fcd b;
    public final fcd c;
    public final fcd d;
    public final fcd e;
    public final List<eoh> f;
    public final bef<dzq> g;
    public final bef<dzq> h;
    public static final Codec<eun> i = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("filling_provider").forGetter($$0 -> $$0.a), (App)fcd.a.fieldOf("inner_layer_provider").forGetter($$0 -> $$0.b), (App)fcd.a.fieldOf("alternate_inner_layer_provider").forGetter($$0 -> $$0.c), (App)fcd.a.fieldOf("middle_layer_provider").forGetter($$0 -> $$0.d), (App)fcd.a.fieldOf("outer_layer_provider").forGetter($$0 -> $$0.e), (App)bfm.b(eoh.a.listOf()).fieldOf("inner_placements").forGetter($$0 -> $$0.f), (App)bef.b(mj.i).fieldOf("cannot_replace").forGetter($$0 -> $$0.g), (App)bef.b(mj.i).fieldOf("invalid_blocks").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, eun::new));

    public eun(fcd $$0, fcd $$1, fcd $$2, fcd $$3, fcd $$4, List<eoh> $$5, bef<dzq> $$6, bef<dzq> $$7) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
    }
}

