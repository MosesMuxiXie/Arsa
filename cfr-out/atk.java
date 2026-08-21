/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class atk
extends Record
implements atg {
    private final int c;
    private final yh d;
    private final boolean e;
    private final String f;
    private final int g;
    private final Optional<a> h;
    public static final MapCodec<atk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)asj.b.optionalFieldOf("width", (Object)200).forGetter(atk::b), (App)yj.a.fieldOf("label").forGetter(atk::c), (App)Codec.BOOL.optionalFieldOf("label_visible", (Object)true).forGetter(atk::d), (App)Codec.STRING.optionalFieldOf("initial", (Object)"").forGetter(atk::e), (App)bfm.r.optionalFieldOf("max_length", (Object)32).forGetter(atk::f), (App)atk$a.b.optionalFieldOf("multiline").forGetter(atk::g)).apply((Applicative)$$0, atk::new)).validate($$0 -> {
        if ($$0.f.length() > $$0.f()) {
            return DataResult.error(() -> "Default text length exceeds allowed size");
        }
        return DataResult.success((Object)$$0);
    });

    public atk(int $$0, yh $$1, boolean $$2, String $$3, int $$4, Optional<a> $$5) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
    }

    public MapCodec<atk> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{atk.class, "width;label;labelVisible;initial;maxLength;multiline", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{atk.class, "width;label;labelVisible;initial;maxLength;multiline", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{atk.class, "width;label;labelVisible;initial;maxLength;multiline", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public int b() {
        return this.c;
    }

    public yh c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public Optional<a> g() {
        return this.h;
    }

    public static final class a
    extends Record {
        private final Optional<Integer> c;
        private final Optional<Integer> d;
        public static final int a = 512;
        public static final Codec<a> b = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.r.optionalFieldOf("max_lines").forGetter(a::a), (App)bfm.a(1, 512).optionalFieldOf("height").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(Optional<Integer> $$0, Optional<Integer> $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "maxLines;height", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "maxLines;height", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "maxLines;height", "c", "d"}, this, $$0);
        }

        public Optional<Integer> a() {
            return this.c;
        }

        public Optional<Integer> b() {
            return this.d;
        }
    }
}

