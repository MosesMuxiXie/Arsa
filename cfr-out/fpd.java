/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class fpd
extends fpq {
    public static final MapCodec<fpd> a = RecordCodecBuilder.mapCodec($$02 -> fpd.a($$02).and($$02.group((App)fsb.a.fieldOf("source").forGetter($$0 -> $$0.b), (App)fpd$b.a.listOf().fieldOf("ops").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fpd::new));
    private final fsa b;
    private final List<b> c;

    fpd(List<frm> $$0, fsa $$1, List<b> $$2) {
        super($$0);
        this.b = $$1;
        this.c = List.copyOf($$2);
    }

    public fps<fpd> a() {
        return fpt.C;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.b();
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Override
    public dlt a(dlt $$0, fnz $$1) {
        vz $$22 = this.b.a($$1);
        if ($$22 == null) {
            return $$0;
        }
        @Nullable MutableObject $$3 = new MutableObject();
        Supplier<vz> $$4 = () -> {
            if ($$3.get() == null) {
                $$3.setValue((Object)$$0.a(ki.b, doe.a).b());
            }
            return (vz)$$3.get();
        };
        this.c.forEach($$2 -> $$2.a($$4, $$22));
        uz $$5 = (uz)$$3.get();
        if ($$5 != null) {
            doe.a(ki.b, $$0, $$5);
        }
        return $$0;
    }

    @Deprecated
    public static a a(fsa $$0) {
        return new a($$0);
    }

    public static a a(fnz.c $$0) {
        return new a(fry.a($$0));
    }

    public static class a
    extends fpq.a<a> {
        private final fsa a;
        private final List<b> b = Lists.newArrayList();

        a(fsa $$0) {
            this.a = $$0;
        }

        public a a(String $$0, String $$1, c $$2) {
            try {
                this.b.add(new b(ex.g.a($$0), ex.g.a($$1), $$2));
            }
            catch (CommandSyntaxException $$3) {
                throw new IllegalArgumentException($$3);
            }
            return this;
        }

        public a a(String $$0, String $$1) {
            return this.a($$0, $$1, fpd$c.a);
        }

        protected a a() {
            return this;
        }

        @Override
        public fpr b() {
            return new fpd(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }

    static final class b
    extends Record {
        private final ex.g b;
        private final ex.g c;
        private final c d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)ex.g.a.fieldOf("source").forGetter(b::a), (App)ex.g.a.fieldOf("target").forGetter(b::b), (App)fpd$c.d.fieldOf("op").forGetter(b::c)).apply((Applicative)$$0, b::new));

        b(ex.g $$0, ex.g $$1, c $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public void a(Supplier<vz> $$0, vz $$1) {
            try {
                List<vz> $$2 = this.b.a($$1);
                if (!$$2.isEmpty()) {
                    this.d.a($$0.get(), this.c, $$2);
                }
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "sourcePath;targetPath;op", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "sourcePath;targetPath;op", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "sourcePath;targetPath;op", "b", "c", "d"}, this, $$0);
        }

        public ex.g a() {
            return this.b;
        }

        public ex.g b() {
            return this.c;
        }

        public c c() {
            return this.d;
        }
    }

    public static abstract sealed class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("replace"){

            @Override
            public void a(vz $$0, ex.g $$1, List<vz> $$2) throws CommandSyntaxException {
                $$1.a($$0, (vz)Iterables.getLast($$2));
            }
        };
        public static final /* enum */ c b = new c("append"){

            @Override
            public void a(vz $$0, ex.g $$1, List<vz> $$2) throws CommandSyntaxException {
                List<vz> $$3 = $$1.a($$0, vf::new);
                $$3.forEach($$12 -> {
                    if ($$12 instanceof vf) {
                        $$2.forEach($$1 -> ((vf)$$12).add($$1.d()));
                    }
                });
            }
        };
        public static final /* enum */ c c = new c("merge"){

            @Override
            public void a(vz $$0, ex.g $$1, List<vz> $$2) throws CommandSyntaxException {
                List<vz> $$3 = $$1.a($$0, uz::new);
                $$3.forEach($$12 -> {
                    if ($$12 instanceof uz) {
                        $$2.forEach($$1 -> {
                            if ($$1 instanceof uz) {
                                ((uz)$$12).a((uz)$$1);
                            }
                        });
                    }
                });
            }
        };
        public static final Codec<c> d;
        private final String e;
        private static final /* synthetic */ c[] f;

        public static c[] values() {
            return (c[])f.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        public abstract void a(vz var1, ex.g var2, List<vz> var3) throws CommandSyntaxException;

        c(String $$0) {
            this.e = $$0;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            f = fpd$c.a();
            d = bhh.a(c::values);
        }
    }
}

