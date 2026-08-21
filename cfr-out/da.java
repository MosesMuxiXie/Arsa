/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class da
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, amt<dqs<?>> $$1, List<dlt> $$22) {
        this.a($$0, (T $$2) -> $$2.b($$1, $$22));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final amt<dqs<?>> c;
        private final List<cg> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)dqs.b.fieldOf("recipe_id").forGetter(a::b), (App)cg.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, amt<dqs<?>> $$1, List<cg> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(amt<dqs<?>> $$0, List<cg.a> $$1) {
            return aj.ae.a(new a(Optional.empty(), $$0, $$1.stream().map(cg.a::b).toList()));
        }

        public static ak<a> a(amt<dqs<?>> $$0) {
            return aj.ae.a(new a(Optional.empty(), $$0, List.of()));
        }

        public static ak<a> b(amt<dqs<?>> $$0) {
            return aj.af.a(new a(Optional.empty(), $$0, List.of()));
        }

        boolean b(amt<dqs<?>> $$0, List<dlt> $$1) {
            if ($$0 != this.c) {
                return false;
            }
            ArrayList<dlt> $$2 = new ArrayList<dlt>($$1);
            for (cg $$3 : this.d) {
                boolean $$4 = false;
                Iterator $$5 = $$2.iterator();
                while ($$5.hasNext()) {
                    if (!$$3.a((dlt)$$5.next())) continue;
                    $$5.remove();
                    $$4 = true;
                    break;
                }
                if ($$4) continue;
                return false;
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;recipeId;ingredients", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;recipeId;ingredients", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;recipeId;ingredients", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public amt<dqs<?>> b() {
            return this.c;
        }

        public List<cg> c() {
            return this.d;
        }
    }
}

