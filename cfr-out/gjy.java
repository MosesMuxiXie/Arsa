/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface gjy {
    public static final gjy a = new gjy(){

        @Override
        public int a(git $$0, int $$1, int $$2, int $$3, gil $$4) {
            return $$2;
        }

        @Override
        public int a() {
            return 0;
        }

        @Override
        public int b() {
            return 0;
        }
    };

    public static gjy a(gio $$0, yh ... $$1) {
        return gjy.a($$0, Integer.MAX_VALUE, Integer.MAX_VALUE, $$1);
    }

    public static gjy a(gio $$0, int $$1, yh ... $$2) {
        return gjy.a($$0, $$1, Integer.MAX_VALUE, $$2);
    }

    public static gjy a(gio $$0, yh $$1, int $$2) {
        return gjy.a($$0, $$2, Integer.MAX_VALUE, $$1);
    }

    public static gjy a(final gio $$0, final int $$1, final int $$2, final yh ... $$3) {
        if ($$3.length == 0) {
            return a;
        }
        return new gjy(){
            private @Nullable List<a> f;
            private @Nullable uu g;

            @Override
            public int a(git $$02, int $$12, int $$22, int $$32, gil $$4) {
                int $$5 = $$22;
                for (a $$6 : this.c()) {
                    int $$7 = $$02.a($$12, $$6.b);
                    $$4.a($$7, $$5, $$6.a);
                    $$5 += $$32;
                }
                return $$5;
            }

            private List<a> c() {
                uu $$02 = uu.a();
                if (this.f != null && $$02 == this.g) {
                    return this.f;
                }
                this.g = $$02;
                ArrayList<yn> $$12 = new ArrayList<yn>();
                for (yh $$22 : $$3) {
                    $$12.addAll($$0.d($$22, $$1));
                }
                this.f = new ArrayList<a>();
                int $$32 = Math.min($$12.size(), $$2);
                List $$4 = $$12.subList(0, $$32);
                for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                    yn $$6 = (yn)$$4.get($$5);
                    bfr $$7 = uu.a().a($$6);
                    if ($$5 == $$4.size() - 1 && $$32 == $$2 && $$32 != $$12.size()) {
                        yn $$8 = $$0.a($$6, $$0.a($$6) - $$0.a(yg.w));
                        yn $$9 = yn.a($$8, yg.w.f().c($$3[$$3.length - 1].a()));
                        this.f.add(new a(uu.a().a($$9), $$0.a($$9)));
                        continue;
                    }
                    this.f.add(new a($$7, $$0.a($$7)));
                }
                return this.f;
            }

            @Override
            public int a() {
                return this.c().size();
            }

            @Override
            public int b() {
                return Math.min($$1, this.c().stream().mapToInt(a::b).max().orElse(0));
            }
        };
    }

    public int a(git var1, int var2, int var3, int var4, gil var5);

    public int a();

    public int b();

    public static final class a
    extends Record {
        final bfr a;
        final int b;

        public a(bfr $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "text;width", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "text;width", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "text;width", "a", "b"}, this, $$0);
        }

        public bfr a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }
}

