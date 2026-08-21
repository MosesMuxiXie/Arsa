/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;

public class gjz
extends gja {
    private OptionalInt a = OptionalInt.empty();
    private OptionalInt b = OptionalInt.empty();
    private final bgz<a, gjy> c = bhs.a($$1 -> {
        if ($$1.c.isPresent()) {
            return gjy.a($$3, $$1.b, $$1.c.getAsInt(), $$1.a);
        }
        return gjy.a($$3, $$1.a, $$1.b);
    });
    private boolean d = false;

    public gjz(yh $$0, gio $$1) {
        this(0, 0, $$0, $$1);
    }

    public gjz(int $$0, int $$12, yh $$2, gio $$3) {
        super($$0, $$12, 0, 0, $$2, $$3);
        this.k = false;
    }

    public gjz a(int $$0) {
        this.a = OptionalInt.of($$0);
        return this;
    }

    public gjz b(int $$0) {
        this.b = OptionalInt.of($$0);
        return this;
    }

    public gjz a(boolean $$0) {
        this.d = $$0;
        return this;
    }

    @Override
    public int aS_() {
        return this.c.a(this.e()).b();
    }

    @Override
    public int aR_() {
        return this.c.a(this.e()).a() * this.a().b;
    }

    @Override
    public void a(gil $$0) {
        gjy $$1 = this.c.a(this.e());
        int $$2 = this.c();
        int $$3 = this.d();
        int $$4 = this.a().b;
        if (this.d) {
            int $$5 = this.aT_() + this.aS_() / 2;
            $$1.a(git.b, $$5, $$3, $$4, $$0);
        } else {
            $$1.a(git.a, $$2, $$3, $$4, $$0);
        }
    }

    protected int c() {
        return this.aT_();
    }

    protected int d() {
        return this.aU_();
    }

    private a e() {
        return new a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
    }

    static final class a
    extends Record {
        final yh a;
        final int b;
        final OptionalInt c;

        a(yh $$0, int $$1, OptionalInt $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "message;maxWidth;maxRows", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "message;maxWidth;maxRows", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "message;maxWidth;maxRows", "a", "b", "c"}, this, $$0);
        }

        public yh a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public OptionalInt c() {
            return this.c;
        }
    }
}

