/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fay
implements fac {
    public static final Codec<fay> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("trunk_provider").forGetter($$0 -> $$0.b), (App)fdk.c.fieldOf("trunk_placer").forGetter($$0 -> $$0.d), (App)fcd.a.fieldOf("foliage_provider").forGetter($$0 -> $$0.e), (App)fbo.d.fieldOf("foliage_placer").forGetter($$0 -> $$0.f), (App)fca.d.optionalFieldOf("root_placer").forGetter($$0 -> $$0.g), (App)fcd.a.fieldOf("dirt_provider").forGetter($$0 -> $$0.c), (App)fbd.a.fieldOf("minimum_size").forGetter($$0 -> $$0.h), (App)fcy.h.listOf().fieldOf("decorators").forGetter($$0 -> $$0.i), (App)Codec.BOOL.fieldOf("ignore_vines").orElse((Object)false).forGetter($$0 -> $$0.j), (App)Codec.BOOL.fieldOf("force_dirt").orElse((Object)false).forGetter($$0 -> $$0.k)).apply((Applicative)$$02, fay::new));
    public final fcd b;
    public final fcd c;
    public final fdk d;
    public final fcd e;
    public final fbo f;
    public final Optional<fca> g;
    public final fbd h;
    public final List<fcy> i;
    public final boolean j;
    public final boolean k;

    protected fay(fcd $$0, fdk $$1, fcd $$2, fbo $$3, Optional<fca> $$4, fcd $$5, fbd $$6, List<fcy> $$7, boolean $$8, boolean $$9) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.c = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
    }

    public static class a {
        public final fcd a;
        private final fdk c;
        public final fcd b;
        private final fbo d;
        private final Optional<fca> e;
        private fcd f;
        private final fbd g;
        private List<fcy> h = ImmutableList.of();
        private boolean i;
        private boolean j;

        public a(fcd $$0, fdk $$1, fcd $$2, fbo $$3, Optional<fca> $$4, fbd $$5) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
            this.f = fcd.a(dzs.j);
            this.d = $$3;
            this.e = $$4;
            this.g = $$5;
        }

        public a(fcd $$0, fdk $$1, fcd $$2, fbo $$3, fbd $$4) {
            this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
        }

        public a a(fcd $$0) {
            this.f = $$0;
            return this;
        }

        public a a(List<fcy> $$0) {
            this.h = $$0;
            return this;
        }

        public a a() {
            this.i = true;
            return this;
        }

        public a b() {
            this.j = true;
            return this;
        }

        public fay c() {
            return new fay(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
}

