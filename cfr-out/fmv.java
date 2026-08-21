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

public class fmv
extends fmn {
    private static final int c = -1;
    public static final Codec<fmv> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.optionalFieldOf("map", (Object)-1).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fmv::new));
    public static final fmo<fmv> b = new fmo<fmv>("idcounts", fmv::new, a, bhz.l);
    private int d;

    public fmv() {
        this(-1);
    }

    public fmv(int $$0) {
        this.d = $$0;
    }

    public fmu b() {
        fmu $$0 = new fmu(++this.d);
        this.u();
        return $$0;
    }
}

