/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class bcm {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public bcm(int $$0) {
        this.a = new ByteArrayOutputStream($$0);
        this.b = new DataOutputStream(this.a);
    }

    public void a(byte[] $$0) throws IOException {
        this.b.write($$0, 0, $$0.length);
    }

    public void a(String $$0) throws IOException {
        this.b.write($$0.getBytes(StandardCharsets.UTF_8));
        this.b.write(0);
    }

    public void a(int $$0) throws IOException {
        this.b.write($$0);
    }

    public void a(short $$0) throws IOException {
        this.b.writeShort(Short.reverseBytes($$0));
    }

    public void b(int $$0) throws IOException {
        this.b.writeInt(Integer.reverseBytes($$0));
    }

    public void a(float $$0) throws IOException {
        this.b.writeInt(Integer.reverseBytes(Float.floatToIntBits($$0)));
    }

    public byte[] a() {
        return this.a.toByteArray();
    }

    public void b() {
        this.a.reset();
    }
}

