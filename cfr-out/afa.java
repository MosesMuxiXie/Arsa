/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class afa
implements aay<adb> {
    protected final int a;
    protected final short b;
    protected final short c;
    protected final short d;
    protected final byte e;
    protected final byte f;
    protected final boolean g;
    protected final boolean h;
    protected final boolean i;

    protected afa(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6, boolean $$7, boolean $$8) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
        this.i = $$8;
    }

    @Override
    public abstract aba<? extends afa> a();

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    public @Nullable cgk a(dwo $$0) {
        return $$0.a(this.a);
    }

    public short b() {
        return this.b;
    }

    public short e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public float g() {
        return bgj.a(this.e);
    }

    public float h() {
        return bgj.a(this.f);
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    public static class c
    extends afa {
        public static final aao<wx, c> j = aay.a(c::b, c::a);

        public c(int $$0, byte $$1, byte $$2, boolean $$3) {
            super($$0, (short)0, (short)0, (short)0, $$1, $$2, $$3, true, false);
        }

        private static c a(wx $$0) {
            int $$1 = $$0.l();
            byte $$2 = $$0.readByte();
            byte $$3 = $$0.readByte();
            boolean $$4 = $$0.readBoolean();
            return new c($$1, $$2, $$3, $$4);
        }

        private void b(wx $$0) {
            $$0.c(this.a);
            $$0.l(this.e);
            $$0.l(this.f);
            $$0.a(this.g);
        }

        @Override
        public aba<c> a() {
            return ahz.Z;
        }
    }

    public static class a
    extends afa {
        public static final aao<wx, a> j = aay.a(a::b, a::a);

        public a(int $$0, short $$1, short $$2, short $$3, boolean $$4) {
            super($$0, $$1, $$2, $$3, (byte)0, (byte)0, $$4, false, true);
        }

        private static a a(wx $$0) {
            int $$1 = $$0.l();
            short $$2 = $$0.readShort();
            short $$3 = $$0.readShort();
            short $$4 = $$0.readShort();
            boolean $$5 = $$0.readBoolean();
            return new a($$1, $$2, $$3, $$4, $$5);
        }

        private void b(wx $$0) {
            $$0.c(this.a);
            $$0.m(this.b);
            $$0.m(this.c);
            $$0.m(this.d);
            $$0.a(this.g);
        }

        @Override
        public aba<a> a() {
            return ahz.W;
        }
    }

    public static class b
    extends afa {
        public static final aao<wx, b> j = aay.a(b::b, b::a);

        public b(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
        }

        private static b a(wx $$0) {
            int $$1 = $$0.l();
            short $$2 = $$0.readShort();
            short $$3 = $$0.readShort();
            short $$4 = $$0.readShort();
            byte $$5 = $$0.readByte();
            byte $$6 = $$0.readByte();
            boolean $$7 = $$0.readBoolean();
            return new b($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }

        private void b(wx $$0) {
            $$0.c(this.a);
            $$0.m(this.b);
            $$0.m(this.c);
            $$0.m(this.d);
            $$0.l(this.e);
            $$0.l(this.f);
            $$0.a(this.g);
        }

        @Override
        public aba<b> a() {
            return ahz.X;
        }
    }
}

