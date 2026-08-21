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
import java.util.List;
import java.util.Map;

public class fus
extends fmn {
    public static final fmo<fus> a = new fmo<fus>("scoreboard", fus::new, fus$a.b.xmap(fus::new, fus::b), bhz.o);
    private a b;

    private fus() {
        this(fus$a.a);
    }

    public fus(a $$0) {
        this.b = $$0;
    }

    public a b() {
        return this.b;
    }

    public void a(a $$0) {
        if (!$$0.equals(this.b)) {
            this.b = $$0;
            this.u();
        }
    }

    public static final class a
    extends Record {
        private final List<fuj.a> c;
        private final List<fur.a> d;
        private final Map<fui, String> e;
        private final List<fum.a> f;
        public static final a a = new a(List.of(), List.of(), Map.of(), List.of());
        public static final Codec<a> b = RecordCodecBuilder.create($$0 -> $$0.group((App)fuj.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(a::a), (App)fur.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(a::b), (App)Codec.unboundedMap(fui.t, (Codec)Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(a::c), (App)fum.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(List<fuj.a> $$0, List<fur.a> $$1, Map<fui, String> $$2, List<fum.a> $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "objectives;scores;displaySlots;teams", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "objectives;scores;displaySlots;teams", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "objectives;scores;displaySlots;teams", "c", "d", "e", "f"}, this, $$0);
        }

        public List<fuj.a> a() {
            return this.c;
        }

        public List<fur.a> b() {
            return this.d;
        }

        public Map<fui, String> c() {
            return this.e;
        }

        public List<fum.a> d() {
            return this.f;
        }
    }
}

