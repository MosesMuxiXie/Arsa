/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ci
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, Collection<cgk> $$1, @Nullable dlt $$2) {
        ArrayList $$32 = Lists.newArrayList();
        HashSet $$4 = Sets.newHashSet();
        for (cgk $$5 : $$1) {
            $$4.add($$5.ay());
            $$32.add(bs.b($$0, $$5));
        }
        this.a($$0, (T $$3) -> $$3.a($$32, $$4.size(), $$2));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final List<bc> c;
        private final cq.d d;
        private final Optional<cg> e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bs.b.listOf().optionalFieldOf("victims", List.of()).forGetter(a::b), (App)cq.d.d.optionalFieldOf("unique_entity_types", (Object)cq.d.c).forGetter(a::c), (App)cg.a.optionalFieldOf("fired_from_weapon").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, List<bc> $$1, cq.d $$2, Optional<cg> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public static ak<a> a(je<dlp> $$0, bs.a ... $$1) {
            return aj.I.a(new a(Optional.empty(), bs.a($$1), cq.d.c, Optional.of(cg.a.a().a($$0, dlx.yz).b())));
        }

        public static ak<a> a(je<dlp> $$0, cq.d $$1) {
            return aj.I.a(new a(Optional.empty(), List.of(), $$1, Optional.of(cg.a.a().a($$0, dlx.yz).b())));
        }

        public boolean a(Collection<fnz> $$0, int $$1, @Nullable dlt $$2) {
            if (this.e.isPresent() && ($$2 == null || !this.e.get().a($$2))) {
                return false;
            }
            if (!this.c.isEmpty()) {
                ArrayList $$3 = Lists.newArrayList($$0);
                for (bc $$4 : this.c) {
                    boolean $$5 = false;
                    Iterator $$6 = $$3.iterator();
                    while ($$6.hasNext()) {
                        fnz $$7 = (fnz)$$6.next();
                        if (!$$4.a($$7)) continue;
                        $$6.remove();
                        $$5 = true;
                        break;
                    }
                    if ($$5) continue;
                    return false;
                }
            }
            return this.d.d($$1);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.c, "victims");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;victims;uniqueEntityTypes;firedFromWeapon", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;victims;uniqueEntityTypes;firedFromWeapon", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;victims;uniqueEntityTypes;firedFromWeapon", "b", "c", "d", "e"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public List<bc> b() {
            return this.c;
        }

        public cq.d c() {
            return this.d;
        }

        public Optional<cg> d() {
            return this.e;
        }
    }
}

