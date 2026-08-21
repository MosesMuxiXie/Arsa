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

public class ews
extends ewp {
    public static final Codec<ews> a = RecordCodecBuilder.create($$02 -> $$02.group((App)ewp.d.forGetter($$0 -> $$0), (App)ccf.c.fieldOf("horizontal_radius_multiplier").forGetter($$0 -> $$0.b), (App)ccf.c.fieldOf("vertical_radius_multiplier").forGetter($$0 -> $$0.c), (App)ccf.a(-1.0f, 1.0f).fieldOf("floor_level").forGetter($$0 -> $$0.j)).apply((Applicative)$$02, ews::new));
    public final ccf b;
    public final ccf c;
    final ccf j;

    public ews(float $$0, fdv $$1, ccf $$2, evk $$3, ewq $$4, jh<dzq> $$5, ccf $$6, ccf $$7, ccf $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
        this.b = $$6;
        this.c = $$7;
        this.j = $$8;
    }

    public ews(float $$0, fdv $$1, ccf $$2, evk $$3, jh<dzq> $$4, ccf $$5, ccf $$6, ccf $$7) {
        this($$0, $$1, $$2, $$3, ewq.a, $$4, $$5, $$6, $$7);
    }

    public ews(ewp $$0, ccf $$1, ccf $$2, ccf $$3) {
        this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
    }
}

