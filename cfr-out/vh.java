/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record vh(long b) implements vp
{
    private final long b;
    private static final int c = 16;
    public static final wb<vh> a = new wb.a<vh>(){

        public vh a(DataInput $$0, vi $$1) throws IOException {
            return vh.a(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static long d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(16L);
            return $$0.readLong();
        }

        @Override
        public int c() {
            return 8;
        }

        @Override
        public String a() {
            return "LONG";
        }

        @Override
        public String b() {
            return "TAG_Long";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };

    public static vh a(long $$0) {
        if ($$0 >= -128L && $$0 <= 1024L) {
            return vh$a.a[(int)$$0 - -128];
        }
        return new vh($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeLong(this.b);
    }

    @Override
    public int a() {
        return 16;
    }

    @Override
    public byte b() {
        return 4;
    }

    public wb<vh> c() {
        return a;
    }

    public vh e() {
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
        return (int)(this.b & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public short i() {
        return (short)(this.b & 0xFFFFL);
    }

    @Override
    public byte j() {
        return (byte)(this.b & 0xFFL);
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
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vh.class, "value", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vh.class, "value", "b"}, this, $$0);
    }

    public long n() {
        return this.b;
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }

    static class a {
        private static final int b = 1024;
        private static final int c = -128;
        static final vh[] a = new vh[1153];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                vh$a.a[$$0] = new vh(-128 + $$0);
            }
        }
    }
}

