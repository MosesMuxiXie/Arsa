/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tw
implements ty,
tz {
    static final ty a = Stream::empty;
    static final tz b = Stream::empty;
    private final ty c;
    private final tz d;
    private final ed e;

    @Override
    public Stream<is> findTestPos() {
        return this.d.findTestPos();
    }

    public static a a() {
        return new a();
    }

    tw(ed $$0, ty $$1, tz $$2) {
        this.e = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public ed b() {
        return this.e;
    }

    @Override
    public Stream<jd.c<tb>> findTests() {
        return this.c.findTests();
    }

    public static class a {
        private final UnaryOperator<Supplier<Stream<jd.c<tb>>>> a;
        private final UnaryOperator<Supplier<Stream<is>>> b;

        public a() {
            this.a = $$0 -> $$0;
            this.b = $$0 -> $$0;
        }

        private a(UnaryOperator<Supplier<Stream<jd.c<tb>>>> $$0, UnaryOperator<Supplier<Stream<is>>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(int $$0) {
            return new a(tw$a.b($$0), tw$a.b($$0));
        }

        private static <Q> UnaryOperator<Supplier<Stream<Q>>> b(int $$0) {
            return $$1 -> {
                LinkedList $$2 = new LinkedList();
                List $$3 = ((Stream)$$1.get()).toList();
                for (int $$4 = 0; $$4 < $$0; ++$$4) {
                    $$2.addAll($$3);
                }
                return $$2::stream;
            };
        }

        private tw a(ed $$0, ty $$1, tz $$2) {
            return new tw($$0, ((Supplier)((Supplier)this.a.apply($$1::findTests)))::get, ((Supplier)((Supplier)this.b.apply($$2::findTestPos)))::get);
        }

        public tw a(CommandContext<ed> $$0, int $$1) {
            ed $$2 = (ed)$$0.getSource();
            is $$3 = is.a($$2.e());
            return this.a($$2, a, () -> ts.c($$3, $$1, $$2.f()));
        }

        public tw a(CommandContext<ed> $$0) {
            ed $$1 = (ed)$$0.getSource();
            is $$2 = is.a($$1.e());
            return this.a($$1, a, () -> ts.b($$2, 15, $$1.f()).stream());
        }

        public tw b(CommandContext<ed> $$0) {
            ed $$1 = (ed)$$0.getSource();
            is $$2 = is.a($$1.e());
            return this.a($$1, a, () -> ts.c($$2, 250, $$1.f()));
        }

        public tw c(CommandContext<ed> $$0) {
            ed $$1 = (ed)$$0.getSource();
            return this.a($$1, a, () -> ts.a(is.a($$1.e()), $$1.j().N(), $$1.f()));
        }

        public tw a(CommandContext<ed> $$0, boolean $$1) {
            return this.a((ed)$$0.getSource(), () -> sp.a().filter($$1 -> !$$1 || ((tb)$$1.a()).h()), b);
        }

        public tw a(CommandContext<ed> $$0, Collection<jd.c<tb>> $$1) {
            return this.a((ed)$$0.getSource(), $$1::stream, b);
        }

        public tw d(CommandContext<ed> $$0) {
            return this.a($$0, false);
        }
    }
}

