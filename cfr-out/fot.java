/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class fot
extends foq {
    public static final int b = 1;
    public static final int e = 0;
    protected final int f;
    protected final int h;
    protected final List<fpr> i;
    final BiFunction<dlt, fnz, dlt> a;
    private final fop j = new c(){

        @Override
        public void a(Consumer<dlt> $$0, fnz $$1) {
            fot.this.a(fpr.a(fot.this.a, $$0, $$1), $$1);
        }
    };

    protected fot(int $$0, int $$1, List<frm> $$2, List<fpr> $$3) {
        super($$2);
        this.f = $$0;
        this.h = $$1;
        this.i = $$3;
        this.a = fpt.a($$3);
    }

    protected static <T extends fot> Products.P4<RecordCodecBuilder.Mu<T>, Integer, Integer, List<frm>, List<fpr>> b(RecordCodecBuilder.Instance<T> $$02) {
        return $$02.group((App)Codec.INT.optionalFieldOf("weight", (Object)1).forGetter($$0 -> $$0.f), (App)Codec.INT.optionalFieldOf("quality", (Object)0).forGetter($$0 -> $$0.h)).and(fot.a($$02).t1()).and((App)fpt.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0 -> $$0.i));
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        for (int $$1 = 0; $$1 < this.i.size(); ++$$1) {
            this.i.get($$1).a($$0.a(new bgp.d("functions", $$1)));
        }
    }

    protected abstract void a(Consumer<dlt> var1, fnz var2);

    @Override
    public boolean expand(fnz $$0, Consumer<fop> $$1) {
        if (this.a($$0)) {
            $$1.accept(this.j);
            return true;
        }
        return false;
    }

    public static a<?> a(d $$0) {
        return new b($$0);
    }

    static class b
    extends a<b> {
        private final d c;

        public b(d $$0) {
            this.c = $$0;
        }

        protected b g() {
            return this;
        }

        @Override
        public foq b() {
            return this.c.build(this.a, this.b, this.f(), this.a());
        }

        @Override
        protected /* synthetic */ foq.a aH_() {
            return this.g();
        }
    }

    @FunctionalInterface
    protected static interface d {
        public fot build(int var1, int var2, List<frm> var3, List<fpr> var4);
    }

    public static abstract class a<T extends a<T>>
    extends foq.a<T>
    implements fpn<T> {
        protected int a = 1;
        protected int b = 0;
        private final ImmutableList.Builder<fpr> c = ImmutableList.builder();

        public T a(fpr.a $$0) {
            this.c.add((Object)$$0.b());
            return (T)((a)this.aH_());
        }

        protected List<fpr> a() {
            return this.c.build();
        }

        public T a(int $$0) {
            this.a = $$0;
            return (T)((a)this.aH_());
        }

        public T b(int $$0) {
            this.b = $$0;
            return (T)((a)this.aH_());
        }

        @Override
        public /* synthetic */ fpn c() {
            return (fpn)super.e();
        }

        @Override
        public /* synthetic */ fpn b(fpr.a a2) {
            return this.a(a2);
        }
    }

    protected abstract class c
    implements fop {
        protected c() {
        }

        @Override
        public int a(float $$0) {
            return Math.max(bgj.b((float)fot.this.f + (float)fot.this.h * $$0), 0);
        }
    }
}

