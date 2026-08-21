/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class fcy {
    public static final Codec<fcy> h = mi.X.q().dispatch(fcy::a, fcz::a);

    protected abstract fcz<?> a();

    public abstract void a(a var1);

    public static final class a {
        private final dwu a;
        private final BiConsumer<is, eoh> b;
        private final bgr c;
        private final ObjectArrayList<is> d;
        private final ObjectArrayList<is> e;
        private final ObjectArrayList<is> f;

        public a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, Set<is> $$3, Set<is> $$4, Set<is> $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.f = new ObjectArrayList($$5);
            this.d = new ObjectArrayList($$3);
            this.e = new ObjectArrayList($$4);
            this.d.sort(Comparator.comparingInt(jy::v));
            this.e.sort(Comparator.comparingInt(jy::v));
            this.f.sort(Comparator.comparingInt(jy::v));
        }

        public void a(is $$0, eoy $$1) {
            this.a($$0, (eoh)dzs.fN.m().b($$1, true));
        }

        public void a(is $$0, eoh $$1) {
            this.b.accept($$0, $$1);
        }

        public boolean a(is $$0) {
            return this.a.a($$0, eog.a::l);
        }

        public boolean a(is $$0, Predicate<eoh> $$1) {
            return this.a.a($$0, $$1);
        }

        public dwu a() {
            return this.a;
        }

        public bgr b() {
            return this.c;
        }

        public ObjectArrayList<is> c() {
            return this.d;
        }

        public ObjectArrayList<is> d() {
            return this.e;
        }

        public ObjectArrayList<is> e() {
            return this.f;
        }
    }
}

