/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ecy
extends ejg
implements eih {
    protected static final MapCodec<dpa> b = dpa.c.fieldOf("suspicious_stew_effects");
    public static final MapCodec<ecy> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)b.forGetter(ecy::c), ecy.x()).apply((Applicative)$$0, ecy::new));
    private static final fug a = dzq.b(6.0, 0.0, 10.0);
    private final dpa d;

    public MapCodec<? extends ecy> a() {
        return c;
    }

    public ecy(jd<cfk> $$0, float $$1, eog.d $$2) {
        this(ecy.a($$0, $$1), $$2);
    }

    public ecy(dpa $$0, eog.d $$1) {
        super($$1);
        this.d = $$0;
    }

    protected static dpa a(jd<cfk> $$0, float $$1) {
        return new dpa(List.of(new dpa.a($$0, bgj.b($$1 * 20.0f))));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a.a($$0.a($$2));
    }

    @Override
    public dpa c() {
        return this.d;
    }

    public @Nullable cfm b() {
        return null;
    }
}

