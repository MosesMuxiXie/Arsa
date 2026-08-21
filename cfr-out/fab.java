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
import java.util.ArrayList;
import java.util.List;

public class fab
implements fac {
    public static final Codec<fab> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("trunk_provider").forGetter($$0 -> $$0.b), (App)cch.b(0, 16).fieldOf("log_length").forGetter($$0 -> $$0.c), (App)fcy.h.listOf().fieldOf("stump_decorators").forGetter($$0 -> $$0.d), (App)fcy.h.listOf().fieldOf("log_decorators").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fab::new));
    public final fcd b;
    public final cch c;
    public final List<fcy> d;
    public final List<fcy> e;

    protected fab(fcd $$0, cch $$1, List<fcy> $$2, List<fcy> $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static class a {
        private final fcd a;
        private final cch b;
        private List<fcy> c = new ArrayList<fcy>();
        private List<fcy> d = new ArrayList<fcy>();

        public a(fcd $$0, cch $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(List<fcy> $$0) {
            this.c = $$0;
            return this;
        }

        public a b(List<fcy> $$0) {
            this.d = $$0;
            return this;
        }

        public fab a() {
            return new fab(this.a, this.b, this.c, this.d);
        }
    }
}

