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
import java.util.List;

public class fom
extends foj {
    public static final MapCodec<fom> a = fom.a(fom::new);

    fom(List<foq> $$0, List<frm> $$1) {
        super($$0, $$1);
    }

    @Override
    public fos a() {
        return foo.j;
    }

    @Override
    protected foi a(List<? extends foi> $$0) {
        return switch ($$0.size()) {
            case 0 -> d;
            case 1 -> $$0.get(0);
            case 2 -> {
                foi $$1 = $$0.get(0);
                foi $$2 = $$0.get(1);
                yield ($$2, $$3) -> {
                    $$1.expand($$2, $$3);
                    $$2.expand($$2, $$3);
                    return true;
                };
            }
            default -> ($$1, $$2) -> {
                for (foi $$3 : $$0) {
                    $$3.expand($$1, $$2);
                }
                return true;
            };
        };
    }

    public static a a(foq.a<?> ... $$0) {
        return new a($$0);
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
        public a b(foq.a<?> $$0) {
            this.a.add((Object)$$0.b());
            return this;
        }

        @Override
        public foq b() {
            return new fom((List<foq>)this.a.build(), this.f());
        }

        @Override
        protected /* synthetic */ foq.a aH_() {
            return this.a();
        }
    }
}

