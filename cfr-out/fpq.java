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
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fpq
implements fpr {
    protected final List<frm> g;
    private final Predicate<fnz> a;

    protected fpq(List<frm> $$0) {
        this.g = $$0;
        this.a = bhs.a($$0);
    }

    public abstract fps<? extends fpq> a();

    protected static <T extends fpq> Products.P1<RecordCodecBuilder.Mu<T>, List<frm>> a(RecordCodecBuilder.Instance<T> $$02) {
        return $$02.group((App)frm.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0 -> $$0.g));
    }

    public final dlt b(dlt $$0, fnz $$1) {
        return this.a.test($$1) ? this.a($$0, $$1) : $$0;
    }

    protected abstract dlt a(dlt var1, fnz var2);

    @Override
    public void a(fog $$0) {
        fpr.super.a($$0);
        for (int $$1 = 0; $$1 < this.g.size(); ++$$1) {
            this.g.get($$1).a($$0.a(new bgp.d("conditions", $$1)));
        }
    }

    protected static a<?> a(Function<List<frm>, fpr> $$0) {
        return new b($$0);
    }

    @Override
    public /* synthetic */ Object apply(Object object, Object object2) {
        return this.b((dlt)object, (fnz)object2);
    }

    static final class b
    extends a<b> {
        private final Function<List<frm>, fpr> a;

        public b(Function<List<frm>, fpr> $$0) {
            this.a = $$0;
        }

        protected b a() {
            return this;
        }

        @Override
        public fpr b() {
            return this.a.apply(this.g());
        }

        @Override
        protected /* synthetic */ a c() {
            return this.a();
        }
    }

    public static abstract class a<T extends a<T>>
    implements fpr.a,
    fre<T> {
        private final ImmutableList.Builder<frm> a = ImmutableList.builder();

        public T a(frm.a $$0) {
            this.a.add((Object)$$0.build());
            return this.c();
        }

        public final T f() {
            return this.c();
        }

        protected abstract T c();

        protected List<frm> g() {
            return this.a.build();
        }

        @Override
        public /* synthetic */ fre d() {
            return this.f();
        }

        @Override
        public /* synthetic */ fre b(frm.a a2) {
            return this.a(a2);
        }
    }
}

