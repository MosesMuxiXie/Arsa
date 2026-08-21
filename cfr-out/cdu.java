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
import java.util.List;
import java.util.Optional;

public final class cdu
extends Record {
    private final Optional<jd<bcz>> d;
    private final Optional<cds> e;
    private final List<cdr> f;
    public static final cdu a = new cdu(Optional.empty(), Optional.empty(), List.of());
    public static final cdu b = new cdu(Optional.empty(), Optional.of(cds.b), List.of());
    public static final Codec<cdu> c = RecordCodecBuilder.create($$0 -> $$0.group((App)bcz.b.optionalFieldOf("loop").forGetter(cdu::a), (App)cds.a.optionalFieldOf("mood").forGetter(cdu::b), (App)bfm.a(cdr.a).optionalFieldOf("additions", List.of()).forGetter(cdu::c)).apply((Applicative)$$0, cdu::new));

    public cdu(Optional<jd<bcz>> $$0, Optional<cds> $$1, List<cdr> $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdu.class, "loop;mood;additions", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdu.class, "loop;mood;additions", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdu.class, "loop;mood;additions", "d", "e", "f"}, this, $$0);
    }

    public Optional<jd<bcz>> a() {
        return this.d;
    }

    public Optional<cds> b() {
        return this.e;
    }

    public List<cdr> c() {
        return this.f;
    }
}

