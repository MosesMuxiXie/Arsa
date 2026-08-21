/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class foh
extends foj {
    public static final MapCodec<foh> a = foh.a(foh::new);
    public static final bgp.g b = new bgp.g(){

        @Override
        public String a() {
            return "Unreachable entry!";
        }
    };

    foh(List<foq> $$0, List<frm> $$1) {
        super($$0, $$1);
    }

    @Override
    public fos a() {
        return foo.h;
    }

    @Override
    protected foi a(List<? extends foi> $$0) {
        return switch ($$0.size()) {
            case 0 -> c;
            case 1 -> $$0.get(0);
            case 2 -> $$0.get(0).or($$0.get(1));
            default -> ($$1, $$2) -> {
                for (foi $$3 : $$0) {
                    if (!$$3.expand($$1, $$2)) continue;
                    return true;
                }
                return false;
            };
        };
    }

    @Override
    public void a(fog $$0) {
        super.a($$0);
        for (int $$1 = 0; $$1 < this.f.size() - 1; ++$$1) {
            if (!((foq)this.f.get((int)$$1)).g.isEmpty()) continue;
            $$0.a(b);
        }
    }

    public static a a(foq.a<?> ... $$0) {
        return new a($$0);
    }

    public static <E> a a(Collection<E> $$0, Function<E, foq.a<?>> $$1) {
        return new a((foq.a[])$$0.stream().map($$1::apply).toArray(foq.a[]::new));
    }

    public static class a
    extends foq.a<a> {
        private final ImmutableList.Builder<foq> a = ImmutableList.builder();

        public a(foq.a<?> ... $$0) {
            for (foq.a<?> $$1 : $$0) {
                this.a.add((Object)$$1.b());
            }
        }

        protected a a() {
            return this;
        }

        @Override
        public a a(foq.a<?> $$0) {
            this.a.add((Object)$$0.b());
            return this;
        }

        @Override
        public foq b() {
            return new foh((List<foq>)this.a.build(), this.f());
        }

        @Override
        protected /* synthetic */ foq.a aH_() {
            return this.a();
        }
    }
}

