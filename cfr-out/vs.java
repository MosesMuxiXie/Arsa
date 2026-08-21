/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record vs(short b) implements vp
{
    private final short b;
    private static final int c = 10;
    public static final wb<vs> a = new wb.a<vs>(){

        public vs a(DataInput $$0, vi $$1) throws IOException {
            return vs.a(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static short d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(10L);
            return $$0.readShort();
        }

        @Override
        public int c() {
            return 2;
        }

        @Override
        public String a() {
            return "SHORT";
        }

        @Override
        public String b() {
            return "TAG_Short";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };

    public static vs a(short $$0) {
        if ($$0 >= -128 && $$0 <= 1024) {
            return vs$a.a[$$0 - -128];
        }
        return new vs($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeShort(this.b);
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public byte b() {
        return 2;
    }

    public wb<vs> c() {
        return a;
    }

    public vs e() {
        return this;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public long g() {
        return this.b;
    }

    @Override
    public int h() {
        return this.b;
    }

    @Override
    public short i() {
        return this.b;
    }

    @Override
    public byte j() {
        return (byte)(this.b & 0xFF);
    }

    @Override
    public double k() {
        return this.b;
    }

    @Override
    public float l() {
        return this.b;
    }

    @Override
    public Number m() {
        return this.b;
    }

    @Override
    public vw.b a(vw $$0) {
        return $$0.a(this.b);
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vs.class, "value", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vs.class, "value", "b"}, this, $$0);
    }

    public short n() {
        return this.b;
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }

    static class a {
        private static final int b = 1024;
        private static final int c = -128;
        static final vs[] a = new vs[1153];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                vs$a.a[$$0] = new vs((short)(-128 + $$0));
            }
        }
    }
}

