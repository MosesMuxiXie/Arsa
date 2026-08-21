/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class fjf {
    public static final fjx a = fjx.a;
    public static final Codec<fjf> b = RecordCodecBuilder.create($$02 -> $$02.group((App)fjk.c.fieldOf("input_predicate").forGetter($$0 -> $$0.c), (App)fjk.c.fieldOf("location_predicate").forGetter($$0 -> $$0.d), (App)fjd.c.lenientOptionalFieldOf("position_predicate", (Object)fjc.b).forGetter($$0 -> $$0.e), (App)eoh.a.fieldOf("output_state").forGetter($$0 -> $$0.f), (App)fjy.c.lenientOptionalFieldOf("block_entity_modifier", (Object)a).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, fjf::new));
    private final fjk c;
    private final fjk d;
    private final fjd e;
    private final eoh f;
    private final fjy g;

    public fjf(fjk $$0, fjk $$1, eoh $$2) {
        this($$0, $$1, fjc.b, $$2);
    }

    public fjf(fjk $$0, fjk $$1, fjd $$2, eoh $$3) {
        this($$0, $$1, $$2, $$3, a);
    }

    public fjf(fjk $$0, fjk $$1, fjd $$2, eoh $$3, fjy $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    public boolean a(eoh $$0, eoh $$1, is $$2, is $$3, is $$4, bgr $$5) {
        return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
    }

    public eoh a() {
        return this.f;
    }

    public @Nullable uz a(bgr $$0, @Nullable uz $$1) {
        return this.g.a($$0, $$1);
    }
}

