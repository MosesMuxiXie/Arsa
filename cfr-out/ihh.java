/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public class ihh
implements ihj {
    private final iij a;
    private final ihj b;
    private final ihj c;

    public ihh(iij $$0, ihj $$1, ihj $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        (this.a.get($$1, $$4, $$5 == null ? null : $$5.et(), $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    public record a(ihy b, ihj.b c, ihj.b d) implements ihj.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ihx.a.forGetter(a::b), (App)ihl.a.fieldOf("on_true").forGetter(a::c), (App)ihl.a.fieldOf("on_false").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public ihj a(ihj.a $$0) {
            return new ihh(this.a(this.b, $$0.f()), this.c.a($$0), this.d.a($$0));
        }

        private iij a(ihy $$0, @Nullable bgs $$1) {
            if ($$1 == null) {
                return $$0;
            }
            hhw<hif, iij> $$22 = new hhw<hif, iij>($$2 -> ihh$a.a($$0, $$1, $$2));
            return ($$2, $$3, $$4, $$5, $$6) -> {
                ihy $$7 = $$3 == null ? $$0 : (iij)$$22.a($$3);
                return $$7.get($$2, $$3, $$4, $$5, $$6);
            };
        }

        private static <T extends ihy> T a(T $$0, bgs $$1, hif $$2) {
            return $$1.a($$0.a().codec(), $$0, $$2.J_()).result().orElse($$0);
        }

        @Override
        public void a(ioe.a $$0) {
            this.c.a($$0);
            this.d.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "property;onTrue;onFalse", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "property;onTrue;onFalse", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "property;onTrue;onFalse", "b", "c", "d"}, this, $$0);
        }
    }
}

