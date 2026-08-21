/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class fqj
extends fpq {
    private static final Logger b = LogUtils.getLogger();
    public static final MapCodec<fqj> a = RecordCodecBuilder.mapCodec($$02 -> fqj.a($$02).and($$02.group((App)fsj.a.fieldOf("damage").forGetter($$0 -> $$0.c), (App)Codec.BOOL.fieldOf("add").orElse((Object)false).forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fqj::new));
    private final fsi c;
    private final boolean d;

    private fqj(List<frm> $$0, fsi $$1, boolean $$2) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
    }

    public fps<fqj> a() {
        return fpt.n;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.c.b();
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        if ($$0.m()) {
            int $$2 = $$0.p();
            float $$3 = this.d ? 1.0f - (float)$$0.o() / (float)$$2 : 0.0f;
            float $$4 = 1.0f - bgj.a(this.c.b($$1) + $$3, 0.0f, 1.0f);
            $$0.b(bgj.b($$4 * (float)$$2));
        } else {
            b.warn("Couldn't set damage of loot item {}", (Object)$$0);
        }
        return $$0;
    }

    public static fpq.a<?> a(fsi $$0) {
        return fqj.a((List<frm> $$1) -> new fqj((List<frm>)$$1, $$0, false));
    }

    public static fpq.a<?> a(fsi $$0, boolean $$1) {
        return fqj.a((List<frm> $$2) -> new fqj((List<frm>)$$2, $$0, $$1));
    }
}

