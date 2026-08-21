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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class cd
extends Record {
    private final Optional<Boolean> b;
    private final Optional<Boolean> c;
    private final Optional<Boolean> d;
    private final Optional<Boolean> e;
    private final Optional<Boolean> f;
    private final Optional<Boolean> g;
    private final Optional<Boolean> h;
    public static final Codec<cd> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("forward").forGetter(cd::a), (App)Codec.BOOL.optionalFieldOf("backward").forGetter(cd::b), (App)Codec.BOOL.optionalFieldOf("left").forGetter(cd::c), (App)Codec.BOOL.optionalFieldOf("right").forGetter(cd::d), (App)Codec.BOOL.optionalFieldOf("jump").forGetter(cd::e), (App)Codec.BOOL.optionalFieldOf("sneak").forGetter(cd::f), (App)Codec.BOOL.optionalFieldOf("sprint").forGetter(cd::g)).apply((Applicative)$$0, cd::new));

    public cd(Optional<Boolean> $$0, Optional<Boolean> $$1, Optional<Boolean> $$2, Optional<Boolean> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5, Optional<Boolean> $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    public boolean a(ddk $$0) {
        return this.a(this.b, $$0.a()) && this.a(this.c, $$0.b()) && this.a(this.d, $$0.c()) && this.a(this.e, $$0.d()) && this.a(this.f, $$0.e()) && this.a(this.g, $$0.f()) && this.a(this.h, $$0.g());
    }

    private boolean a(Optional<Boolean> $$0, boolean $$12) {
        return $$0.map($$1 -> $$1 == $$12).orElse(true);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cd.class, "forward;backward;left;right;jump;sneak;sprint", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cd.class, "forward;backward;left;right;jump;sneak;sprint", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cd.class, "forward;backward;left;right;jump;sneak;sprint", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public Optional<Boolean> a() {
        return this.b;
    }

    public Optional<Boolean> b() {
        return this.c;
    }

    public Optional<Boolean> c() {
        return this.d;
    }

    public Optional<Boolean> d() {
        return this.e;
    }

    public Optional<Boolean> e() {
        return this.f;
    }

    public Optional<Boolean> f() {
        return this.g;
    }

    public Optional<Boolean> g() {
        return this.h;
    }
}

