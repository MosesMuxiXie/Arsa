/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class fof {
    private static final Logger g = LogUtils.getLogger();
    public static final Codec<amt<fof>> a = amt.a(mj.bG);
    public static final bhw b = fqw.q;
    public static final long c = 0L;
    public static final Codec<fof> d = Codec.lazyInitialized(() -> RecordCodecBuilder.create($$02 -> $$02.group((App)fqw.a.lenientOptionalFieldOf("type", (Object)b).forGetter($$0 -> $$0.h), (App)amo.a.optionalFieldOf("random_sequence").forGetter($$0 -> $$0.i), (App)foe.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0 -> $$0.j), (App)fpt.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0 -> $$0.k)).apply((Applicative)$$02, fof::new)));
    public static final Codec<jd<fof>> e = amq.a(mj.bG, d);
    public static final fof f = new fof(fqw.b, Optional.empty(), List.of(), List.of());
    private final bhw h;
    private final Optional<amo> i;
    private final List<foe> j;
    private final List<fpr> k;
    private final BiFunction<dlt, fnz, dlt> l;

    fof(bhw $$0, Optional<amo> $$1, List<foe> $$2, List<fpr> $$3) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.k = $$3;
        this.l = fpt.a($$3);
    }

    public static Consumer<dlt> a(axf $$0, Consumer<dlt> $$1) {
        return $$2 -> {
            if (!$$2.a($$0.Q())) {
                return;
            }
            if ($$2.N() < $$2.k()) {
                $$1.accept((dlt)$$2);
            } else {
                dlt $$4;
                for (int $$3 = $$2.N(); $$3 > 0; $$3 -= $$4.N()) {
                    $$4 = $$2.c(Math.min($$2.k(), $$3));
                    $$1.accept($$4);
                }
            }
        };
    }

    public void a(fod $$0, Consumer<dlt> $$1) {
        this.a(new fnz.b($$0).a(this.i), $$1);
    }

    public void a(fnz $$0, Consumer<dlt> $$1) {
        fnz.e<fof> $$2 = fnz.a(this);
        if ($$0.b($$2)) {
            Consumer<dlt> $$3 = fpr.a(this.l, $$1, $$0);
            for (foe $$4 : this.j) {
                $$4.a($$3, $$0);
            }
            $$0.c($$2);
        } else {
            g.warn("Detected infinite loop in loot tables");
        }
    }

    public void a(fod $$0, long $$1, Consumer<dlt> $$2) {
        this.a(new fnz.b($$0).a($$1).a(this.i), fof.a($$0.a(), $$2));
    }

    public void b(fod $$0, Consumer<dlt> $$1) {
        this.a($$0, fof.a($$0.a(), $$1));
    }

    public void b(fnz $$0, Consumer<dlt> $$1) {
        this.a($$0, fof.a($$0.d(), $$1));
    }

    public ObjectArrayList<dlt> a(fod $$0, bgr $$1) {
        return this.a(new fnz.b($$0).a($$1).a(this.i));
    }

    public ObjectArrayList<dlt> a(fod $$0, long $$1) {
        return this.a(new fnz.b($$0).a($$1).a(this.i));
    }

    public ObjectArrayList<dlt> a(fod $$0) {
        return this.a(new fnz.b($$0).a(this.i));
    }

    private ObjectArrayList<dlt> a(fnz $$0) {
        ObjectArrayList $$1 = new ObjectArrayList();
        this.b($$0, arg_0 -> ((ObjectArrayList)$$1).add(arg_0));
        return $$1;
    }

    public bhw a() {
        return this.h;
    }

    public void a(fog $$0) {
        for (int $$1 = 0; $$1 < this.j.size(); ++$$1) {
            this.j.get($$1).a($$0.a(new bgp.d("pools", $$1)));
        }
        for (int $$2 = 0; $$2 < this.k.size(); ++$$2) {
            this.k.get($$2).a($$0.a(new bgp.d("functions", $$2)));
        }
    }

    public void a(ccv $$0, fod $$1, long $$2) {
        fnz $$3 = new fnz.b($$1).a($$2).a(this.i);
        ObjectArrayList<dlt> $$4 = this.a($$3);
        bgr $$5 = $$3.b();
        List<Integer> $$6 = this.a($$0, $$5);
        this.a($$4, $$6.size(), $$5);
        for (dlt $$7 : $$4) {
            if ($$6.isEmpty()) {
                g.warn("Tried to over-fill a container");
                return;
            }
            if ($$7.f()) {
                $$0.a((int)$$6.remove($$6.size() - 1), dlt.l);
                continue;
            }
            $$0.a((int)$$6.remove($$6.size() - 1), $$7);
        }
    }

    private void a(ObjectArrayList<dlt> $$0, int $$1, bgr $$2) {
        ArrayList $$3 = Lists.newArrayList();
        ObjectListIterator $$4 = $$0.iterator();
        while ($$4.hasNext()) {
            dlt $$5 = (dlt)$$4.next();
            if ($$5.f()) {
                $$4.remove();
                continue;
            }
            if ($$5.N() <= 1) continue;
            $$3.add($$5);
            $$4.remove();
        }
        while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
            dlt $$6 = (dlt)$$3.remove(bgj.a($$2, 0, $$3.size() - 1));
            int $$7 = bgj.a($$2, 1, $$6.N() / 2);
            dlt $$8 = $$6.a($$7);
            if ($$6.N() > 1 && $$2.h()) {
                $$3.add($$6);
            } else {
                $$0.add((Object)$$6);
            }
            if ($$8.N() > 1 && $$2.h()) {
                $$3.add($$8);
                continue;
            }
            $$0.add((Object)$$8);
        }
        $$0.addAll((Collection)$$3);
        bhs.c($$0, $$2);
    }

    private List<Integer> a(ccv $$0, bgr $$1) {
        ObjectArrayList $$2 = new ObjectArrayList();
        for (int $$3 = 0; $$3 < $$0.b(); ++$$3) {
            if (!$$0.a($$3).f()) continue;
            $$2.add((Object)$$3);
        }
        bhs.c($$2, $$1);
        return $$2;
    }

    public static a b() {
        return new a();
    }

    public static class a
    implements fpn<a> {
        private final ImmutableList.Builder<foe> a = ImmutableList.builder();
        private final ImmutableList.Builder<fpr> b = ImmutableList.builder();
        private bhw c = b;
        private Optional<amo> d = Optional.empty();

        public a a(foe.a $$0) {
            this.a.add((Object)$$0.b());
            return this;
        }

        public a a(bhw $$0) {
            this.c = $$0;
            return this;
        }

        public a a(amo $$0) {
            this.d = Optional.of($$0);
            return this;
        }

        public a a(fpr.a $$0) {
            this.b.add((Object)$$0.b());
            return this;
        }

        public a a() {
            return this;
        }

        public fof b() {
            return new fof(this.c, this.d, (List<foe>)this.a.build(), (List<fpr>)this.b.build());
        }

        @Override
        public /* synthetic */ fpn c() {
            return this.a();
        }

        @Override
        public /* synthetic */ fpn b(fpr.a a2) {
            return this.a(a2);
        }
    }
}

