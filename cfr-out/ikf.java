/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ikf
implements iki<kf> {
    private final inu a;
    private final hha b;

    public ikf(inu $$0, hha $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public @Nullable kf a(dlt $$0) {
        return $$0.e();
    }

    @Override
    public void a(@Nullable kf $$0, dlr $$1, fzm $$2, hpo $$3, int $$4, int $$5, boolean $$6, int $$7) {
        ekr $$8 = $$0 != null ? $$0.a(ki.at, ekr.a) : ekr.a;
        dkr $$9 = $$0 != null ? $$0.a(ki.au) : null;
        boolean $$10 = !$$8.b().isEmpty() || $$9 != null;
        $$2.a();
        $$2.b(1.0f, -1.0f, -1.0f);
        ins $$11 = $$10 ? inx.i : inx.j;
        $$3.a(this.b.f(), $$2, this.b.a($$11.a()), $$4, $$5, this.a.a($$11), false, false, -1, null, $$7);
        if ($$10) {
            hrd.a(this.a, $$2, $$3, $$4, $$5, this.b, bhr.a, $$11, false, Objects.requireNonNullElse($$9, dkr.a), $$8, $$6, null, $$7);
        } else {
            $$3.a(this.b.e(), $$2, this.b.a($$11.a()), $$4, $$5, this.a.a($$11), false, $$6, -1, null, $$7);
        }
        $$2.b();
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        $$1.b(1.0f, -1.0f, -1.0f);
        this.b.b().a($$1, $$0);
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2) {
        return this.a(dlt2);
    }

    public record a() implements iki.b
    {
        public static final a a = new a();
        public static final MapCodec<a> b = MapCodec.unit((Object)a);

        public MapCodec<a> a() {
            return b;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ikf($$0.c(), new hha($$0.b().a(hdf.dd)));
        }
    }
}

