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
import java.util.function.Consumer;

public class fox
extends fot {
    public static final MapCodec<fox> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bef.a(mj.R).fieldOf("name").forGetter($$0 -> $$0.j), (App)Codec.BOOL.fieldOf("expand").forGetter($$0 -> $$0.k)).and(fox.b($$02)).apply((Applicative)$$02, fox::new));
    private final bef<dlp> j;
    private final boolean k;

    private fox(bef<dlp> $$0, boolean $$1, int $$2, int $$3, List<frm> $$4, List<fpr> $$5) {
        super($$2, $$3, $$4, $$5);
        this.j = $$0;
        this.k = $$1;
    }

    @Override
    public fos a() {
        return foo.f;
    }

    @Override
    public void a(Consumer<dlt> $$0, fnz $$12) {
        mi.h.c(this.j).forEach($$1 -> $$0.accept(new dlt((jd<dlp>)$$1)));
    }

    private boolean a(fnz $$0, Consumer<fop> $$1) {
        if (this.a($$0)) {
            for (final jd<dlp> $$2 : mi.h.c(this.j)) {
                $$1.accept(new fot.c(this){

                    @Override
                    public void a(Consumer<dlt> $$0, fnz $$1) {
                        $$0.accept(new dlt($$2));
                    }
                });
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean expand(fnz $$0, Consumer<fop> $$1) {
        if (this.k) {
            return this.a($$0, $$1);
        }
        return super.expand($$0, $$1);
    }

    public static fot.a<?> a(bef<dlp> $$0) {
        return fox.a((int $$1, int $$2, List<frm> $$3, List<fpr> $$4) -> new fox($$0, false, $$1, $$2, $$3, $$4));
    }

    public static fot.a<?> b(bef<dlp> $$0) {
        return fox.a((int $$1, int $$2, List<frm> $$3, List<fpr> $$4) -> new fox($$0, true, $$1, $$2, $$3, $$4));
    }
}

