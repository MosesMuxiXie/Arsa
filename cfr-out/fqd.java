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
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fqd
extends fpq {
    private static final Codec<fsi> b = Codec.withAlternative(fsj.a, bfm.l, fsf::new);
    public static final MapCodec<fqd> a = RecordCodecBuilder.mapCodec($$02 -> fqd.a($$02).and($$02.group((App)fpp.e.a(fsj.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0 -> $$0.c), (App)fpp.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0 -> $$0.d), (App)fpp.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0 -> $$0.e), (App)fpp.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0 -> $$0.f))).apply((Applicative)$$02, fqd::new));
    private final Optional<fpp.e<fsi>> c;
    private final Optional<fpp.e<Boolean>> d;
    private final Optional<fpp.e<String>> e;
    private final Optional<fpp.e<fsi>> f;

    public fqd(List<frm> $$0, Optional<fpp.e<fsi>> $$1, Optional<fpp.e<Boolean>> $$2, Optional<fpp.e<String>> $$3, Optional<fpp.e<fsi>> $$4) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public Set<bhv<?>> b() {
        return Stream.concat(this.c.stream(), this.f.stream()).flatMap($$0 -> $$0.a().stream()).flatMap($$0 -> $$0.b().stream()).collect(Collectors.toSet());
    }

    public fps<fqd> a() {
        return fpt.R;
    }

    private static <T> List<T> a(Optional<fpp.e<T>> $$0, List<T> $$12) {
        return $$0.map($$1 -> $$1.a($$12)).orElse($$12);
    }

    private static <T, E> List<E> a(Optional<fpp.e<T>> $$0, List<E> $$1, Function<T, E> $$22) {
        return $$0.map($$2 -> {
            List $$3 = $$2.a().stream().map($$22).toList();
            return $$2.b().a($$1, $$3);
        }).orElse($$1);
    }

    @Override
    public dlt a(dlt $$0, fnz $$12) {
        dof $$2 = $$0.a(ki.s, dof.a);
        $$0.b(ki.s, new dof(fqd.a(this.c, $$2.a(), (T $$1) -> Float.valueOf($$1.b($$12))), fqd.a(this.d, $$2.b()), fqd.a(this.e, $$2.c()), fqd.a(this.f, $$2.d(), (T $$1) -> $$1.a($$12))));
        return $$0;
    }
}

