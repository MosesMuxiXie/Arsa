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

public final class cez
extends Record {
    private final String d;
    private final cew e;
    private final float f;
    private final cev g;
    private final cfb h;
    public static final Codec<cez> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("message_id").forGetter(cez::a), (App)cew.d.fieldOf("scaling").forGetter(cez::b), (App)Codec.FLOAT.fieldOf("exhaustion").forGetter(cez::c), (App)cev.g.optionalFieldOf("effects", (Object)cev.a).forGetter(cez::d), (App)cfb.d.optionalFieldOf("death_message_type", (Object)cfb.a).forGetter(cez::e)).apply((Applicative)$$0, cez::new));
    public static final Codec<jd<cez>> b = amr.a(mj.ba);
    public static final aao<xq, jd<cez>> c = aam.b(mj.ba);

    public cez(String $$0, cew $$1, float $$2) {
        this($$0, $$1, $$2, cev.a, cfb.a);
    }

    public cez(String $$0, cew $$1, float $$2, cev $$3) {
        this($$0, $$1, $$2, $$3, cfb.a);
    }

    public cez(String $$0, float $$1, cev $$2) {
        this($$0, cew.b, $$1, $$2);
    }

    public cez(String $$0, float $$1) {
        this($$0, cew.b, $$1);
    }

    public cez(String $$0, cew $$1, float $$2, cev $$3, cfb $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cez.class, "msgId;scaling;exhaustion;effects;deathMessageType", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cez.class, "msgId;scaling;exhaustion;effects;deathMessageType", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cez.class, "msgId;scaling;exhaustion;effects;deathMessageType", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public String a() {
        return this.d;
    }

    public cew b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }

    public cev d() {
        return this.g;
    }

    public cfb e() {
        return this.h;
    }
}

