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

public class fdo {
    public static final Codec<fdo> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)0, (int)esh.c).fieldOf("height").forGetter(fdo::a), (App)mi.e.q().fieldOf("block").orElse((Object)dzs.a).forGetter($$0 -> $$0.b().b())).apply((Applicative)$$02, fdo::new));
    private final dzq b;
    private final int c;

    public fdo(int $$0, dzq $$1) {
        this.c = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.c;
    }

    public eoh b() {
        return this.b.m();
    }

    public fdo a(int $$0) {
        if (this.c > $$0) {
            return new fdo($$0, this.b);
        }
        return this;
    }

    public String toString() {
        return (String)(this.c != 1 ? this.c + "*" : "") + String.valueOf(mi.e.b(this.b));
    }
}

