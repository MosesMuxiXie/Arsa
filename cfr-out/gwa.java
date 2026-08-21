/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gwa
extends gwc {
    private static final yh a = yh.c("options.online.title");
    private @Nullable gfn<Unit> f;

    public gwa(gsb $$0, gfo $$1) {
        super($$0, $$1, a);
    }

    @Override
    protected void bg_() {
        gjc $$0;
        super.bg_();
        if (this.f != null && ($$0 = this.d.b(this.f)) != null) {
            $$0.k = false;
        }
    }

    private gfn<?>[] a(gfo $$0, gfj $$1) {
        ArrayList<gfn> $$2 = new ArrayList<gfn>();
        $$2.add($$0.ah());
        $$2.add($$0.ai());
        gfn $$3 = t.a($$1.r, (T $$02) -> {
            ccz $$12 = $$02.av();
            return new gfn<Unit>("options.difficulty.online", gfn.a(), ($$1, $$2) -> $$12.b(), new gfn.e<Unit>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()), Unit.INSTANCE, $$0 -> {});
        });
        if ($$3 != null) {
            this.f = $$3;
            $$2.add($$3);
        }
        return $$2.toArray(new gfn[0]);
    }

    @Override
    protected void o() {
        this.d.a(this.a(this.c, this.n));
    }
}

