/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.function.Supplier;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ihr<T>
implements ihj {
    private final iki<T> a;
    private final iho b;
    private final Supplier<Vector3fc[]> c;

    public ihr(iki<T> $$0, iho $$1) {
        this.a = $$0;
        this.b = $$1;
        this.c = Suppliers.memoize(() -> {
            HashSet $$1 = new HashSet();
            $$0.a($$1::add);
            return $$1.toArray(new Vector3fc[0]);
        });
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        ihm.b $$7 = $$0.a();
        if ($$1.C()) {
            ihm.a $$8 = ihm.a.b;
            $$7.a($$8);
            $$0.c();
            $$0.a((Object)$$8);
        }
        T $$9 = this.a.b($$1);
        $$7.a(this.c);
        $$7.a(this.a, $$9);
        if ($$9 != null) {
            $$0.a($$9);
        }
        this.b.a($$7, $$3);
    }

    public record a(amo b, iki.b c) implements ihj.b
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("base").forGetter(a::b), (App)ikj.a.fieldOf("model").forGetter(a::c)).apply((Applicative)$$0, a::new));

        @Override
        public void a(ioe.a $$0) {
            $$0.markDependency(this.b);
        }

        @Override
        public ihj a(ihj.a $$0) {
            iki<?> $$1 = this.c.a($$0);
            if ($$1 == null) {
                return $$0.e();
            }
            iho $$2 = this.b($$0);
            return new ihr($$1, $$2);
        }

        private iho b(ihj.a $$0) {
            inw $$1 = $$0.a();
            iof $$2 = $$1.a(this.b);
            hqp $$3 = $$2.g();
            return iho.a($$1, $$2, $$3);
        }

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "base;specialModel", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "base;specialModel", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "base;specialModel", "b", "c"}, this, $$0);
        }
    }
}

