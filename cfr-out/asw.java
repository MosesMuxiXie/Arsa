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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;

public final class asw
extends Record
implements ast {
    private final amo c;
    private final Optional<uz> d;
    public static final MapCodec<asw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("id").forGetter(asw::b), (App)uz.a.optionalFieldOf("additions").forGetter(asw::c)).apply((Applicative)$$0, asw::new));

    public asw(amo $$0, Optional<uz> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public MapCodec<asw> a() {
        return b;
    }

    @Override
    public Optional<yf> a(Map<String, ast.a> $$0) {
        uz $$12 = this.d.map(uz::l).orElseGet(uz::new);
        $$0.forEach(($$1, $$2) -> $$12.a((String)$$1, $$2.b()));
        return Optional.of(new yf.d(this.c, Optional.of($$12)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asw.class, "id;additions", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asw.class, "id;additions", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asw.class, "id;additions", "c", "d"}, this, $$0);
    }

    public amo b() {
        return this.c;
    }

    public Optional<uz> c() {
        return this.d;
    }
}

