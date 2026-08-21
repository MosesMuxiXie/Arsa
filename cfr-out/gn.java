/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gn {
    public static <T, C, P> byq<List<T>> a(b<T, C, P> $$02) {
        byc $$1 = byc.a("top");
        byc $$22 = byc.a("type");
        byc $$32 = byc.a("any_type");
        byc $$42 = byc.a("element_type");
        byc $$5 = byc.a("tag_type");
        byc $$6 = byc.a("conditions");
        byc $$7 = byc.a("alternatives");
        byc $$8 = byc.a("term");
        byc $$9 = byc.a("negation");
        byc $$10 = byc.a("test");
        byc $$11 = byc.a("component_type");
        byc $$12 = byc.a("predicate_type");
        byc $$13 = byc.a("id");
        byc $$14 = byc.a("tag");
        byg<StringReader> $$15 = new byg<StringReader>();
        byj<StringReader, amo> $$16 = $$15.a($$13, byt.a);
        byj $$17 = $$15.a($$1, byo.b(byo.a($$15.c($$22), byz.a('['), byo.c(), byo.a($$15.c($$6)), byz.a(']')), $$15.c($$22)), $$2 -> {
            ImmutableList.Builder $$3 = ImmutableList.builder();
            ((Optional)$$2.b($$22)).ifPresent(arg_0 -> ((ImmutableList.Builder)$$3).add(arg_0));
            List $$4 = (List)$$2.a($$6);
            if ($$4 != null) {
                $$3.addAll((Iterable)$$4);
            }
            return $$3.build();
        });
        $$15.a($$22, byo.b($$15.c($$42), byo.a(byz.a('#'), byo.c(), $$15.c($$5)), $$15.c($$32)), $$2 -> Optional.ofNullable($$2.b($$42, $$5)));
        $$15.a($$32, byz.a('*'), $$0 -> bhr.a);
        $$15.a($$42, new c<T, C, P>($$16, $$02));
        $$15.a($$5, new e<T, C, P>($$16, $$02));
        $$15.a($$6, byo.a($$15.c($$7), byo.a(byo.a(byz.a(','), $$15.c($$6)))), $$3 -> {
            Object $$4 = $$02.a((List)$$3.b($$7));
            return Optional.ofNullable((List)$$3.a($$6)).map($$1 -> bhs.a($$4, $$1)).orElse(List.of($$4));
        });
        $$15.a($$7, byo.a($$15.c($$8), byo.a(byo.a(byz.a('|'), $$15.c($$7)))), $$2 -> {
            Object $$3 = $$2.b($$8);
            return Optional.ofNullable((List)$$2.a($$7)).map($$1 -> bhs.a($$3, $$1)).orElse(List.of($$3));
        });
        $$15.a($$8, byo.b($$15.c($$10), byo.a(byz.a('!'), $$15.c($$9))), $$2 -> $$2.c($$10, $$9));
        $$15.a($$9, $$15.c($$10), $$2 -> $$02.a($$2.b($$10)));
        $$15.a($$10, byo.b(byo.a($$15.c($$11), byz.a('='), byo.c(), $$15.c($$14)), byo.a($$15.c($$12), byz.a('~'), byo.c(), $$15.c($$14)), $$15.c($$11)), $$4 -> {
            bym $$5 = $$4.a();
            Object $$6 = $$5.a($$12);
            try {
                if ($$6 != null) {
                    Dynamic $$7 = (Dynamic)$$5.b($$14);
                    return $$02.b((ImmutableStringReader)$$4.f(), $$6, $$7);
                }
                Object $$8 = $$5.b($$11);
                Dynamic $$9 = (Dynamic)$$5.a($$14);
                return $$9 != null ? $$02.a((ImmutableStringReader)$$4.f(), $$8, $$9) : $$02.a((ImmutableStringReader)$$4.f(), $$8);
            }
            catch (CommandSyntaxException $$10) {
                $$4.b().a($$4.g(), (Object)$$10);
                return null;
            }
        });
        $$15.a($$11, new a<T, C, P>($$16, $$02));
        $$15.a($$12, new d<T, C, P>($$16, $$02));
        $$15.a($$14, new bza<vz>(vn.a));
        return new byq<List<T>>($$15, $$17);
    }

    static class c<T, C, P>
    extends byw<b<T, C, P>, T> {
        c(byj<StringReader, amo> $$0, b<T, C, P> $$1) {
            super($$0, $$1);
        }

        @Override
        protected T a(ImmutableStringReader $$0, amo $$1) throws Exception {
            return ((b)this.a).a($$0, $$1);
        }

        @Override
        public Stream<amo> a() {
            return ((b)this.a).a();
        }
    }

    public static interface b<T, C, P> {
        public T a(ImmutableStringReader var1, amo var2) throws CommandSyntaxException;

        public Stream<amo> a();

        public T b(ImmutableStringReader var1, amo var2) throws CommandSyntaxException;

        public Stream<amo> b();

        public C c(ImmutableStringReader var1, amo var2) throws CommandSyntaxException;

        public Stream<amo> c();

        public T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

        public T a(ImmutableStringReader var1, C var2);

        public P d(ImmutableStringReader var1, amo var2) throws CommandSyntaxException;

        public Stream<amo> d();

        public T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

        public T a(T var1);

        public T a(List<T> var1);
    }

    static class e<T, C, P>
    extends byw<b<T, C, P>, T> {
        e(byj<StringReader, amo> $$0, b<T, C, P> $$1) {
            super($$0, $$1);
        }

        @Override
        protected T a(ImmutableStringReader $$0, amo $$1) throws Exception {
            return ((b)this.a).b($$0, $$1);
        }

        @Override
        public Stream<amo> a() {
            return ((b)this.a).b();
        }
    }

    static class a<T, C, P>
    extends byw<b<T, C, P>, C> {
        a(byj<StringReader, amo> $$0, b<T, C, P> $$1) {
            super($$0, $$1);
        }

        @Override
        protected C a(ImmutableStringReader $$0, amo $$1) throws Exception {
            return ((b)this.a).c($$0, $$1);
        }

        @Override
        public Stream<amo> a() {
            return ((b)this.a).c();
        }
    }

    static class d<T, C, P>
    extends byw<b<T, C, P>, P> {
        d(byj<StringReader, amo> $$0, b<T, C, P> $$1) {
            super($$0, $$1);
        }

        @Override
        protected P a(ImmutableStringReader $$0, amo $$1) throws Exception {
            return ((b)this.a).d($$0, $$1);
        }

        @Override
        public Stream<amo> a() {
            return ((b)this.a).d();
        }
    }
}

