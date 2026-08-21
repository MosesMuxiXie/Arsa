/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class foe {
    public static final Codec<foe> a = RecordCodecBuilder.create($$02 -> $$02.group((App)foo.a.listOf().fieldOf("entries").forGetter($$0 -> $$0.b), (App)frm.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0 -> $$0.c), (App)fpt.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0 -> $$0.e), (App)fsj.a.fieldOf("rolls").forGetter($$0 -> $$0.g), (App)fsj.a.fieldOf("bonus_rolls").orElse((Object)fsf.a(0.0f)).forGetter($$0 -> $$0.h)).apply((Applicative)$$02, foe::new));
    private final List<foq> b;
    private final List<frm> c;
    private final Predicate<fnz> d;
    private final List<fpr> e;
    private final BiFunction<dlt, fnz, dlt> f;
    private final fsi g;
    private final fsi h;

    foe(List<foq> $$0, List<frm> $$1, List<fpr> $$2, fsi $$3, fsi $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = bhs.a($$1);
        this.e = $$2;
        this.f = fpt.a($$2);
        this.g = $$3;
        this.h = $$4;
    }

    private void b(Consumer<dlt> $$0, fnz $$1) {
        bgr $$2 = $$1.b();
        ArrayList $$32 = Lists.newArrayList();
        MutableInt $$4 = new MutableInt();
        for (foq $$5 : this.b) {
            $$5.expand($$1, $$3 -> {
                int $$4 = $$3.a($$1.c());
                if ($$4 > 0) {
                    $$32.add($$3);
                    $$4.add($$4);
                }
            });
        }
        int $$6 = $$32.size();
        if ($$4.intValue() == 0 || $$6 == 0) {
            return;
        }
        if ($$6 == 1) {
            ((fop)$$32.get(0)).a($$0, $$1);
            return;
        }
        int $$7 = $$2.a($$4.intValue());
        for (fop $$8 : $$32) {
            if (($$7 -= $$8.a($$1.c())) >= 0) continue;
            $$8.a($$0, $$1);
            return;
        }
    }

    public void a(Consumer<dlt> $$0, fnz $$1) {
        if (!this.d.test($$1)) {
            return;
        }
        Consumer<dlt> $$2 = fpr.a(this.f, $$0, $$1);
        int $$3 = this.g.a($$1) + bgj.b(this.h.b($$1) * $$1.c());
        for (int $$4 = 0; $$4 < $$3; ++$$4) {
            this.b($$2, $$1);
        }
    }

    public void a(fog $$0) {
        for (int $$1 = 0; $$1 < this.c.size(); ++$$1) {
            this.c.get($$1).a($$0.a(new bgp.d("conditions", $$1)));
        }
        for (int $$2 = 0; $$2 < this.e.size(); ++$$2) {
            this.e.get($$2).a($$0.a(new bgp.d("functions", $$2)));
        }
        for (int $$3 = 0; $$3 < this.b.size(); ++$$3) {
            this.b.get($$3).a($$0.a(new bgp.d("entries", $$3)));
        }
        this.g.a($$0.a(new bgp.c("rolls")));
        this.h.a($$0.a(new bgp.c("bonus_rolls")));
    }

    public static a a() {
        return new a();
    }

    public static class a
    implements fpn<a>,
    fre<a> {
        private final ImmutableList.Builder<foq> a = ImmutableList.builder();
        private final ImmutableList.Builder<frm> b = ImmutableList.builder();
        private final ImmutableList.Builder<fpr> c = ImmutableList.builder();
        private fsi d = fsf.a(1.0f);
        private fsi e = fsf.a(0.0f);

        public a a(fsi $$0) {
            this.d = $$0;
            return this;
        }

        public a a() {
            return this;
        }

        public a b(fsi $$0) {
            this.e = $$0;
            return this;
        }

        public a a(foq.a<?> $$0) {
            this.a.add((Object)$$0.b());
            return this;
        }

        public a a(frm.a $$0) {
            this.b.add((Object)$$0.build());
            return this;
        }

        public a a(fpr.a $$0) {
            this.c.add((Object)$$0.b());
            return this;
        }

        public foe b() {
            return new foe((List<foq>)this.a.build(), (List<frm>)this.b.build(), (List<fpr>)this.c.build(), this.d, this.e);
        }

        @Override
        public /* synthetic */ fpn c() {
            return this.a();
        }

        @Override
        public /* synthetic */ fpn b(fpr.a a2) {
            return this.a(a2);
        }

        @Override
        public /* synthetic */ fre d() {
            return this.a();
        }

        @Override
        public /* synthetic */ fre b(frm.a a2) {
            return this.a(a2);
        }
    }
}

