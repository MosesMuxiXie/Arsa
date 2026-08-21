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

public class fon
extends fot {
    public static final MapCodec<fon> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dlp.e.fieldOf("name").forGetter($$0 -> $$0.j)).and(fon.b($$02)).apply((Applicative)$$02, fon::new));
    private final jd<dlp> j;

    private fon(jd<dlp> $$0, int $$1, int $$2, List<frm> $$3, List<fpr> $$4) {
        super($$1, $$2, $$3, $$4);
        this.j = $$0;
    }

    @Override
    public fos a() {
        return foo.c;
    }

    @Override
    public void a(Consumer<dlt> $$0, fnz $$1) {
        $$0.accept(new dlt(this.j));
    }

    public static fot.a<?> a(dwn $$0) {
        return fon.a((int $$1, int $$2, List<frm> $$3, List<fpr> $$4) -> new fon($$0.h().e(), $$1, $$2, $$3, $$4));
    }
}

