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

public class eyg
implements fac {
    public static final Codec<eyg> a = RecordCodecBuilder.create($$02 -> $$02.group((App)eoh.a.fieldOf("valid_base_block").forGetter($$0 -> $$0.b), (App)eoh.a.fieldOf("stem_state").forGetter($$0 -> $$0.c), (App)eoh.a.fieldOf("hat_state").forGetter($$0 -> $$0.d), (App)eoh.a.fieldOf("decor_state").forGetter($$0 -> $$0.e), (App)evx.b.fieldOf("replaceable_blocks").forGetter($$0 -> $$0.f), (App)Codec.BOOL.fieldOf("planted").orElse((Object)false).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, eyg::new));
    public final eoh b;
    public final eoh c;
    public final eoh d;
    public final eoh e;
    public final evx f;
    public final boolean g;

    public eyg(eoh $$0, eoh $$1, eoh $$2, eoh $$3, evx $$4, boolean $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }
}

