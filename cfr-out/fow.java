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

public class fow
extends fot {
    public static final MapCodec<fow> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dvg.b.fieldOf("slot_source").forGetter($$0 -> $$0.j)).and(fow.b($$02)).apply((Applicative)$$02, fow::new));
    private final dvf j;

    private fow(dvf $$0, int $$1, int $$2, List<frm> $$3, List<fpr> $$4) {
        super($$1, $$2, $$3, $$4);
        this.j = $$0;
    }

    @Override
    public fos a() {
        return foo.g;
    }

    @Override
    public void a(Consumer<dlt> $$02, fnz $$1) {
        this.j.a($$1).itemCopies().filter($$0 -> !$$0.f()).forEach($$02);
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        this.j.a($$0.a(new bgp.c("slot_source")));
    }
}

