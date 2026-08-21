/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ce
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, ddl $$1, dlt $$2) {
        int $$3 = 0;
        int $$4 = 0;
        int $$5 = 0;
        for (int $$6 = 0; $$6 < $$1.b(); ++$$6) {
            dlt $$7 = $$1.a($$6);
            if ($$7.f()) {
                ++$$4;
                continue;
            }
            ++$$5;
            if ($$7.N() < $$7.k()) continue;
            ++$$3;
        }
        this.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private void a(axg $$0, ddl $$1, dlt $$2, int $$3, int $$4, int $$52) {
        this.a($$0, (T $$5) -> $$5.a($$1, $$2, $$3, $$4, $$52));
    }

    public static final class ce$a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final a c;
        private final List<cg> d;
        public static final Codec<ce$a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(ce$a::a), (App)a.a.optionalFieldOf("slots", (Object)a.b).forGetter(ce$a::b), (App)cg.a.listOf().optionalFieldOf("items", List.of()).forGetter(ce$a::c)).apply((Applicative)$$0, ce$a::new));

        public ce$a(Optional<bc> $$0, a $$1, List<cg> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<ce$a> a(cg.a ... $$0) {
            return ce$a.a((cg[])Stream.of($$0).map(cg.a::b).toArray(cg[]::new));
        }

        public static ak<ce$a> a(cg ... $$0) {
            return aj.f.a(new ce$a(Optional.empty(), a.b, List.of($$0)));
        }

        public static ak<ce$a> a(dwn ... $$0) {
            cg[] $$1 = new cg[$$0.length];
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                $$1[$$2] = new cg(Optional.of(jh.a($$0[$$2].h().e())), cq.d.c, bh.a);
            }
            return ce$a.a($$1);
        }

        public boolean a(ddl $$0, dlt $$12, int $$2, int $$3, int $$4) {
            if (!this.c.a($$2, $$3, $$4)) {
                return false;
            }
            if (this.d.isEmpty()) {
                return true;
            }
            if (this.d.size() == 1) {
                return !$$12.f() && this.d.get(0).a($$12);
            }
            ObjectArrayList $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();
            for (int $$7 = 0; $$7 < $$6; ++$$7) {
                if ($$5.isEmpty()) {
                    return true;
                }
                dlt $$8 = $$0.a($$7);
                if ($$8.f()) continue;
                $$5.removeIf($$1 -> $$1.a($$8));
            }
            return $$5.isEmpty();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{ce$a.class, "player;slots;items", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ce$a.class, "player;slots;items", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ce$a.class, "player;slots;items", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public a b() {
            return this.c;
        }

        public List<cg> c() {
            return this.d;
        }

        public static final class a
        extends Record {
            private final cq.d c;
            private final cq.d d;
            private final cq.d e;
            public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("occupied", (Object)cq.d.c).forGetter(a::a), (App)cq.d.d.optionalFieldOf("full", (Object)cq.d.c).forGetter(a::b), (App)cq.d.d.optionalFieldOf("empty", (Object)cq.d.c).forGetter(a::c)).apply((Applicative)$$0, a::new));
            public static final a b = new a(cq.d.c, cq.d.c, cq.d.c);

            public a(cq.d $$0, cq.d $$1, cq.d $$2) {
                this.c = $$0;
                this.d = $$1;
                this.e = $$2;
            }

            public boolean a(int $$0, int $$1, int $$2) {
                if (!this.d.d($$0)) {
                    return false;
                }
                if (!this.e.d($$1)) {
                    return false;
                }
                return this.c.d($$2);
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "occupied;full;empty", "c", "d", "e"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "occupied;full;empty", "c", "d", "e"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "occupied;full;empty", "c", "d", "e"}, this, $$0);
            }

            public cq.d a() {
                return this.c;
            }

            public cq.d b() {
                return this.d;
            }

            public cq.d c() {
                return this.e;
            }
        }
    }
}

