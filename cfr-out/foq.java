/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;

public abstract class foq
implements foi {
    protected final List<frm> g;
    private final Predicate<fnz> a;

    protected foq(List<frm> $$0) {
        this.g = $$0;
        this.a = bhs.a($$0);
    }

    protected static <T extends foq> Products.P1<RecordCodecBuilder.Mu<T>, List<frm>> a(RecordCodecBuilder.Instance<T> $$02) {
        return $$02.group((App)frm.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0 -> $$0.g));
    }

    public void a(fog $$0) {
        for (int $$1 = 0; $$1 < this.g.size(); ++$$1) {
            this.g.get($$1).a($$0.a(new bgp.d("conditions", $$1)));
        }
    }

    protected final boolean a(fnz $$0) {
        return this.a.test($$0);
    }

    public abstract fos a();

    public static abstract class a<T extends a<T>>
    implements fre<T> {
        private final ImmutableList.Builder<frm> a = ImmutableList.builder();

        protected abstract T aH_();

        public T a(frm.a $$0) {
            this.a.add((Object)$$0.build());
            return this.aH_();
        }

        public final T e() {
            return this.aH_();
        }

        protected List<frm> f() {
            return this.a.build();
        }

        public foh.a a(a<?> $$0) {
            return new foh.a(this, $$0);
        }

        public fom.a b(a<?> $$0) {
            return new fom.a(this, $$0);
        }

        public fov.a c(a<?> $$0) {
            return new fov.a(this, $$0);
        }

        public abstract foq b();

        @Override
        public /* synthetic */ fre d() {
            return this.e();
        }

        @Override
        public /* synthetic */ fre b(frm.a a2) {
            return this.a(a2);
        }
    }
}

