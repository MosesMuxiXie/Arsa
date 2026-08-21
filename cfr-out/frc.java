/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class frc
implements frm {
    protected final List<frm> c;
    private final Predicate<fnz> a;

    protected frc(List<frm> $$0, Predicate<fnz> $$1) {
        this.c = $$0;
        this.a = $$1;
    }

    protected static <T extends frc> MapCodec<T> a(Function<List<frm>, T> $$0) {
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)frm.e.listOf().fieldOf("terms").forGetter($$0 -> $$0.c)).apply((Applicative)$$1, $$0));
    }

    protected static <T extends frc> Codec<T> b(Function<List<frm>, T> $$02) {
        return frm.e.listOf().xmap($$02, $$0 -> $$0.c);
    }

    public final boolean a(fnz $$0) {
        return this.a.test($$0);
    }

    @Override
    public void a(fog $$0) {
        frm.super.a($$0);
        for (int $$1 = 0; $$1 < this.c.size(); ++$$1) {
            this.c.get($$1).a($$0.a(new bgp.d("terms", $$1)));
        }
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }

    public static abstract class a
    implements frm.a {
        private final ImmutableList.Builder<frm> a = ImmutableList.builder();

        protected a(frm.a ... $$0) {
            for (frm.a $$1 : $$0) {
                this.a.add((Object)$$1.build());
            }
        }

        public void a(frm.a $$0) {
            this.a.add((Object)$$0.build());
        }

        @Override
        public frm build() {
            return this.a((List<frm>)this.a.build());
        }

        protected abstract frm a(List<frm> var1);
    }
}

