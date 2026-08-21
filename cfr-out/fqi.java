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
import java.util.List;
import java.util.Set;

public class fqi
extends fpq {
    public static final MapCodec<fqi> a = RecordCodecBuilder.mapCodec($$02 -> fqi.a($$02).and($$02.group((App)fsj.a.fieldOf("count").forGetter($$0 -> $$0.b), (App)Codec.BOOL.fieldOf("add").orElse((Object)false).forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fqi::new));
    private final fsi b;
    private final boolean c;

    private fqi(List<frm> $$0, fsi $$1, boolean $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    public fps<fqi> a() {
        return fpt.e;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.b();
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        int $$2 = this.c ? $$0.N() : 0;
        $$0.e($$2 + this.b.a($$1));
        return $$0;
    }

    public static fpq.a<?> a(fsi $$0) {
        return fqi.a((List<frm> $$1) -> new fqi((List<frm>)$$1, $$0, false));
    }

    public static fpq.a<?> a(fsi $$0, boolean $$1) {
        return fqi.a((List<frm> $$2) -> new fqi((List<frm>)$$2, $$0, $$1));
    }
}

