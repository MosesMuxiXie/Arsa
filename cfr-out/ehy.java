/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy
extends edy
implements dzh {
    public static final MapCodec<ehy> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(ehy::b), ehy.x()).apply((Applicative)$$0, ehy::new));
    private final dkr i;

    public MapCodec<ehy> a() {
        return h;
    }

    public ehy(dkr $$0, eog.d $$1) {
        super($$1);
        this.i = $$0;
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(a, false)).b(b, false)).b(c, false)).b(d, false)).b(e, false));
    }

    @Override
    public dkr b() {
        return this.i;
    }
}

