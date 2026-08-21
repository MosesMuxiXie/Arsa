/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class gor
extends gop {
    private final b c;
    private final List<a> d = new ArrayList<a>();
    private final gox e = gox.i();

    public gor(int $$0, int $$1, b $$2) {
        this(0, 0, $$0, $$1, $$2);
    }

    public gor(int $$0, int $$1, int $$2, int $$3, b $$4) {
        super($$0, $$1, $$2, $$3);
        this.c = $$4;
    }

    @Override
    public void a() {
        super.a();
        if (this.d.isEmpty()) {
            return;
        }
        int $$0 = 0;
        int $$1 = this.c.b(this);
        for (a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
        }
        int $$3 = this.c.a(this) - $$0;
        int $$4 = this.c.c(this);
        Iterator<a> $$5 = this.d.iterator();
        a $$6 = $$5.next();
        this.c.a($$6, $$4);
        $$4 += this.c.a($$6);
        if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);
            while ($$7.hasNext()) {
                a $$8 = $$5.next();
                this.c.a($$8, $$4 += $$7.nextInt());
                $$4 += this.c.a($$8);
            }
        }
        int $$9 = this.c.d(this);
        for (a $$10 : this.d) {
            this.c.a($$10, $$9, $$1);
        }
        switch (this.c.ordinal()) {
            case 0: {
                this.b = $$1;
                break;
            }
            case 1: {
                this.a = $$1;
            }
        }
    }

    @Override
    public void b(Consumer<gow> $$0) {
        this.d.forEach($$1 -> $$0.accept($$1.a));
    }

    public gox b() {
        return this.e.g();
    }

    public gox c() {
        return this.e;
    }

    public <T extends gow> T a(T $$0) {
        return this.a($$0, this.b());
    }

    public <T extends gow> T a(T $$0, gox $$1) {
        this.d.add(new a($$0, $$1));
        return $$0;
    }

    public <T extends gow> T a(T $$0, Consumer<gox> $$1) {
        return this.a($$0, bhs.a(this.b(), $$1));
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        int a(gow $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.aS_();
                case 1 -> $$0.aR_();
            };
        }

        int a(a $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.b();
                case 1 -> $$0.a();
            };
        }

        int b(gow $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.aR_();
                case 1 -> $$0.aS_();
            };
        }

        int b(a $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.a();
                case 1 -> $$0.b();
            };
        }

        void a(a $$0, int $$1) {
            switch (this.ordinal()) {
                case 0: {
                    $$0.a($$1, $$0.b());
                    break;
                }
                case 1: {
                    $$0.b($$1, $$0.a());
                }
            }
        }

        void a(a $$0, int $$1, int $$2) {
            switch (this.ordinal()) {
                case 0: {
                    $$0.b($$1, $$2);
                    break;
                }
                case 1: {
                    $$0.a($$1, $$2);
                }
            }
        }

        int c(gow $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.aT_();
                case 1 -> $$0.aU_();
            };
        }

        int d(gow $$0) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.aU_();
                case 1 -> $$0.aT_();
            };
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = gor$b.a();
        }
    }

    static class a
    extends gop.a {
        protected a(gow $$0, gox $$1) {
            super($$0, $$1);
        }
    }
}

