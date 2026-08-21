/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface hqh {
    public void a(bgr var1, List<hqg> var2);

    default public List<hqg> a(bgr $$0) {
        ObjectArrayList $$1 = new ObjectArrayList();
        this.a($$0, (List<hqg>)$$1);
        return $$1;
    }

    public ilp a();

    public static class a
    implements c {
        final b a;
        private final inw.b<hqh> b = new inw.b<hqh>(){

            public hqh a(inw $$0) {
                return a.a($$0);
            }

            @Override
            public /* synthetic */ Object compute(inw inw2) {
                return this.a(inw2);
            }
        };

        public a(b $$0) {
            this.a = $$0;
        }

        @Override
        public void a(ioe.a $$0) {
            this.a.a($$0);
        }

        @Override
        public hqh a(eoh $$0, inw $$1) {
            return $$1.a(this.b);
        }

        @Override
        public Object a(eoh $$0) {
            return this;
        }
    }

    public static interface b
    extends ioe {
        public static final Codec<cbm<hqq>> a = RecordCodecBuilder.create($$0 -> $$0.group((App)hqq.a.forGetter(cbm::a), (App)bfm.r.optionalFieldOf("weight", (Object)1).forGetter(cbm::b)).apply((Applicative)$$0, cbm::new));
        public static final Codec<ioj.a> b = bfm.b(a.listOf()).flatComapMap($$02 -> new ioj.a(cbn.a(Lists.transform((List)$$02, $$0 -> $$0.a(hqo.a::new)))), $$0 -> {
            List<cbm<b>> $$1 = $$0.b().d();
            ArrayList<cbm<hqq>> $$2 = new ArrayList<cbm<hqq>>($$1.size());
            for (cbm<b> $$3 : $$1) {
                b $$4 = $$3.a();
                if ($$4 instanceof hqo.a) {
                    hqo.a $$5 = (hqo.a)$$4;
                    $$2.add(new cbm<hqq>($$5.b(), $$3.b()));
                    continue;
                }
                return DataResult.error(() -> "Only single variants are supported");
            }
            return DataResult.success($$2);
        });
        public static final Codec<b> c = Codec.either(b, hqo.a.d).flatComapMap($$02 -> (b)$$02.map($$0 -> $$0, $$0 -> $$0), $$0 -> {
            b b2 = $$0;
            Objects.requireNonNull(b2);
            b $$1 = b2;
            int $$2 = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{hqo.a.class, ioj.a.class}, (Object)$$1, $$2)) {
                case 0 -> {
                    hqo.a $$3 = (hqo.a)$$1;
                    yield DataResult.success((Object)Either.right((Object)$$3));
                }
                case 1 -> {
                    ioj.a $$4 = (ioj.a)$$1;
                    yield DataResult.success((Object)Either.left((Object)$$4));
                }
                default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
            };
        });

        public hqh a(inw var1);

        default public c a() {
            return new a(this);
        }
    }

    public static interface c
    extends ioe {
        public hqh a(eoh var1, inw var2);

        public Object a(eoh var1);
    }
}

