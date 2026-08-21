/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public final class vb
implements vz {
    private static final int c = 8;
    public static final wb<vb> a = new wb<vb>(){

        public vb a(DataInput $$0, vi $$1) {
            $$1.b(8L);
            return b;
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) {
            $$2.b(8L);
            return $$1.a();
        }

        @Override
        public void a(DataInput $$0, int $$1, vi $$2) {
        }

        @Override
        public void b(DataInput $$0, vi $$1) {
        }

        @Override
        public String a() {
            return "END";
        }

        @Override
        public String b() {
            return "TAG_End";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    public static final vb b = new vb();

    private vb() {
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
    }

    @Override
    public int a() {
        return 8;
    }

    @Override
    public byte b() {
        return 0;
    }

    public wb<vb> c() {
        return a;
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    public vb e() {
        return this;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public vw.b a(vw $$0) {
        return $$0.a();
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }
}

