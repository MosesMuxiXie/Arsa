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

public final class asv
extends Record
implements ast {
    private final asx c;
    public static final MapCodec<asv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)asx.a.fieldOf("template").forGetter(asv::b)).apply((Applicative)$$0, asv::new));

    public asv(asx $$0) {
        this.c = $$0;
    }

    public MapCodec<asv> a() {
        return b;
    }

    @Override
    public Optional<yf> a(Map<String, ast.a> $$0) {
        String $$1 = this.c.a(ast.a.a($$0));
        return Optional.of(new yf.g($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{asv.class, "template", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{asv.class, "template", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{asv.class, "template", "c"}, this, $$0);
    }

    public asx b() {
        return this.c;
    }
}

