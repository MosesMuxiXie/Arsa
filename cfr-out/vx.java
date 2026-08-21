/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record vx(String b) implements vq
{
    private final String b;
    private static final int c = 36;
    public static final wb<vx> a = new wb.b<vx>(){

        public vx a(DataInput $$0, vi $$1) throws IOException {
            return vx.a(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static String d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(36L);
            String $$2 = $$0.readUTF();
            $$1.a(2L, $$2.length());
            return $$2;
        }

        @Override
        public void b(DataInput $$0, vi $$1) throws IOException {
            vx.a($$0);
        }

        @Override
        public String a() {
            return "STRING";
        }

        @Override
        public String b() {
            return "TAG_String";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    private static final vx v = new vx("");
    private static final char w = '\"';
    private static final char x = '\'';
    private static final char y = '\\';
    private static final char z = '\u0000';

    public static void a(DataInput $$0) throws IOException {
        $$0.skipBytes($$0.readUnsignedShort());
    }

    public static vx a(String $$0) {
        if ($$0.isEmpty()) {
            return v;
        }
        return new vx($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeUTF(this.b);
    }

    @Override
    public int a() {
        return 36 + 2 * this.b.length();
    }

    @Override
    public byte b() {
        return 8;
    }

    public wb<vx> c() {
        return a;
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    public vx e() {
        return this;
    }

    @Override
    public Optional<String> p_() {
        return Optional.of(this.b);
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    public static String b(String $$0) {
        StringBuilder $$1 = new StringBuilder();
        vx.a($$0, $$1);
        return $$1.toString();
    }

    public static void a(String $$0, StringBuilder $$1) {
        int $$2 = $$1.length();
        $$1.append(' ');
        int $$3 = 0;
        for (int $$4 = 0; $$4 < $$0.length(); ++$$4) {
            int $$5 = $$0.charAt($$4);
            if ($$5 == 92) {
                $$1.append("\\\\");
                continue;
            }
            if ($$5 == 34 || $$5 == 39) {
                if ($$3 == 0) {
                    int n2 = $$3 = $$5 == 34 ? 39 : 34;
                }
                if ($$3 == $$5) {
                    $$1.append('\\');
                }
                $$1.append((char)$$5);
                continue;
            }
            String $$6 = vt.a((char)$$5);
            if ($$6 != null) {
                $$1.append('\\');
                $$1.append($$6);
                continue;
            }
            $$1.append((char)$$5);
        }
        if ($$3 == 0) {
            $$3 = 34;
        }
        $$1.setCharAt($$2, (char)$$3);
        $$1.append((char)$$3);
    }

    public static String c(String $$0) {
        StringBuilder $$1 = new StringBuilder();
        vx.b($$0, $$1);
        return $$1.toString();
    }

    public static void b(String $$0, StringBuilder $$1) {
        block3: for (int $$2 = 0; $$2 < $$0.length(); ++$$2) {
            char $$3 = $$0.charAt($$2);
            switch ($$3) {
                case '\"': 
                case '\'': 
                case '\\': {
                    $$1.append('\\');
                    $$1.append($$3);
                    continue block3;
                }
                default: {
                    String $$4 = vt.a($$3);
                    if ($$4 != null) {
                        $$1.append('\\');
                        $$1.append($$4);
                        continue block3;
                    }
                    $$1.append($$3);
                }
            }
        }
    }

    @Override
    public vw.b a(vw $$0) {
        return $$0.a(this.b);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vx.class, "value", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vx.class, "value", "b"}, this, $$0);
    }

    public String k() {
        return this.b;
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }
}

