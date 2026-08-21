/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3fc
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Vector3fc;

public class ikk
implements ikd {
    private final inu a;
    private final gzp.a b;
    private final ins c;

    public ikk(inu $$0, gzp.a $$1, ins $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        hrz.a(this.a, $$1, $$2, $$3, $$4, this.b, this.c);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        hrz.a($$1);
        this.b.b().a($$1, $$0);
    }

    public record a(epw b, Optional<amo> c) implements iki.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)epw.a.fieldOf("wood_type").forGetter(a::b), (App)amo.a.optionalFieldOf("texture").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(epw $$0) {
            this($$0, Optional.empty());
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            gzp.a $$1 = hrz.a($$0.b(), this.b, true);
            ins $$2 = this.c.map(hpj.v::a).orElseGet(() -> hpj.a(this.b));
            return new ikk($$0.c(), $$1, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "woodType;texture", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "woodType;texture", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "woodType;texture", "b", "c"}, this, $$0);
        }
    }
}

