/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.IOException;

public interface wb<T extends vz> {
    public T c(DataInput var1, vi var2) throws IOException;

    public vw.b a(DataInput var1, vw var2, vi var3) throws IOException;

    default public void b(DataInput $$0, vw $$1, vi $$2) throws IOException {
        switch ($$1.b(this)) {
            case a: {
                this.a($$0, $$1, $$2);
                break;
            }
            case c: {
                break;
            }
            case b: {
                this.b($$0, $$2);
            }
        }
    }

    public void a(DataInput var1, int var2, vi var3) throws IOException;

    public void b(DataInput var1, vi var2) throws IOException;

    public String a();

    public String b();

    public static wb<vb> a(final int $$0) {
        return new wb<vb>(){

            private IOException c() {
                return new IOException("Invalid tag id: " + $$0);
            }

            public vb a(DataInput $$02, vi $$1) throws IOException {
                throw this.c();
            }

            @Override
            public vw.b a(DataInput $$02, vw $$1, vi $$2) throws IOException {
                throw this.c();
            }

            @Override
            public void a(DataInput $$02, int $$1, vi $$2) throws IOException {
                throw this.c();
            }

            @Override
            public void b(DataInput $$02, vi $$1) throws IOException {
                throw this.c();
            }

            @Override
            public String a() {
                return "INVALID[" + $$0 + "]";
            }

            @Override
            public String b() {
                return "UNKNOWN_" + $$0;
            }

            @Override
            public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
                return this.a(dataInput, vi2);
            }
        };
    }

    public static interface b<T extends vz>
    extends wb<T> {
        @Override
        default public void a(DataInput $$0, int $$1, vi $$2) throws IOException {
            for (int $$3 = 0; $$3 < $$1; ++$$3) {
                this.b($$0, $$2);
            }
        }
    }

    public static interface a<T extends vz>
    extends wb<T> {
        @Override
        default public void b(DataInput $$0, vi $$1) throws IOException {
            $$0.skipBytes(this.c());
        }

        @Override
        default public void a(DataInput $$0, int $$1, vi $$2) throws IOException {
            $$0.skipBytes(this.c() * $$1);
        }

        public int c();
    }
}

