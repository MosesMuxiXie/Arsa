/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fou
extends fot {
    public static final MapCodec<fou> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.either(fof.a, fof.d).fieldOf("value").forGetter($$0 -> $$0.k)).and(fou.b($$02)).apply((Applicative)$$02, fou::new));
    public static final bgp.f j = new bgp.f(){

        @Override
        public String get() {
            return "->{inline}";
        }
    };
    private final Either<amt<fof>, fof> k;

    private fou(Either<amt<fof>, fof> $$0, int $$1, int $$2, List<frm> $$3, List<fpr> $$4) {
        super($$1, $$2, $$3, $$4);
        this.k = $$0;
    }

    @Override
    public fos a() {
        return foo.d;
    }

    @Override
    public void a(Consumer<dlt> $$02, fnz $$12) {
        ((fof)this.k.map($$1 -> $$12.a().c($$1).map(jd::a).orElse(fof.f), $$0 -> $$0)).a($$12, $$02);
    }

    @Override
    public void a(fog $$0) {
        Optional $$12 = this.k.left();
        if ($$12.isPresent()) {
            amt $$2 = (amt)$$12.get();
            if (!$$0.b()) {
                $$0.a(new fog.d($$2));
                return;
            }
            if ($$0.a($$2)) {
                $$0.a(new fog.c($$2));
                return;
            }
        }
        super.a($$0);
        this.k.ifLeft($$1 -> $$0.a().c($$1).ifPresentOrElse($$2 -> ((fof)$$2.a()).a($$0.a(new bgp.b((amt<?>)$$1), (amt<?>)$$1)), () -> $$0.a(new fog.a((amt<?>)$$1)))).ifRight($$1 -> $$1.a($$0.a(j)));
    }

    public static fot.a<?> a(amt<fof> $$0) {
        return fou.a((int $$1, int $$2, List<frm> $$3, List<fpr> $$4) -> new fou((Either<amt<fof>, fof>)Either.left((Object)$$0), $$1, $$2, $$3, $$4));
    }

    public static fot.a<?> a(fof $$0) {
        return fou.a((int $$1, int $$2, List<frm> $$3, List<fpr> $$4) -> new fou((Either<amt<fof>, fof>)Either.right((Object)$$0), $$1, $$2, $$3, $$4));
    }
}

