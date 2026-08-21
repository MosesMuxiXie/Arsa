/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fok
extends fot {
    public static final MapCodec<fok> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amo.a.fieldOf("name").forGetter($$0 -> $$0.j)).and(fok.b($$02)).apply((Applicative)$$02, fok::new));
    private final amo j;

    private fok(amo $$0, int $$1, int $$2, List<frm> $$3, List<fpr> $$4) {
        super($$1, $$2, $$3, $$4);
        this.j = $$0;
    }

    @Override
    public fos a() {
        return foo.e;
    }

    @Override
    public void a(Consumer<dlt> $$0, fnz $$1) {
        $$1.a(this.j, $$0);
    }

    public static fot.a<?> a(amo $$0) {
        return fok.a((int $$1, int $$2, List<frm> $$3, List<fpr> $$4) -> new fok($$0, $$1, $$2, $$3, $$4));
    }
}

