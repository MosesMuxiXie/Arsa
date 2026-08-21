/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class atc
extends Record
implements ata {
    private final dlt d;
    private final Optional<atd> e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    public static final MapCodec<atc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dlt.d.fieldOf("item").forGetter(atc::b), (App)atd.e.optionalFieldOf("description").forGetter(atc::c), (App)Codec.BOOL.optionalFieldOf("show_decorations", (Object)true).forGetter(atc::d), (App)Codec.BOOL.optionalFieldOf("show_tooltip", (Object)true).forGetter(atc::e), (App)bfm.a(1, 256).optionalFieldOf("width", (Object)16).forGetter(atc::f), (App)bfm.a(1, 256).optionalFieldOf("height", (Object)16).forGetter(atc::g)).apply((Applicative)$$0, atc::new));

    public atc(dlt $$0, Optional<atd> $$1, boolean $$2, boolean $$3, int $$4, int $$5) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
    }

    public MapCodec<atc> a() {
        return c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{atc.class, "item;description;showDecorations;showTooltip;width;height", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{atc.class, "item;description;showDecorations;showTooltip;width;height", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{atc.class, "item;description;showDecorations;showTooltip;width;height", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public dlt b() {
        return this.d;
    }

    public Optional<atd> c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        return this.i;
    }
}

