/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.io.IOException;

public class bff
implements DataOutput {
    private final DataOutput a;

    public bff(DataOutput $$0) {
        this.a = $$0;
    }

    @Override
    public void write(int $$0) throws IOException {
        this.a.write($$0);
    }

    @Override
    public void write(byte[] $$0) throws IOException {
        this.a.write($$0);
    }

    @Override
    public void write(byte[] $$0, int $$1, int $$2) throws IOException {
        this.a.write($$0, $$1, $$2);
    }

    @Override
    public void writeBoolean(boolean $$0) throws IOException {
        this.a.writeBoolean($$0);
    }

    @Override
    public void writeByte(int $$0) throws IOException {
        this.a.writeByte($$0);
    }

    @Override
    public void writeShort(int $$0) throws IOException {
        this.a.writeShort($$0);
    }

    @Override
    public void writeChar(int $$0) throws IOException {
        this.a.writeChar($$0);
    }

    @Override
    public void writeInt(int $$0) throws IOException {
        this.a.writeInt($$0);
    }

    @Override
    public void writeLong(long $$0) throws IOException {
        this.a.writeLong($$0);
    }

    @Override
    public void writeFloat(float $$0) throws IOException {
        this.a.writeFloat($$0);
    }

    @Override
    public void writeDouble(double $$0) throws IOException {
        this.a.writeDouble($$0);
    }

    @Override
    @x(a="Delegation is not use")
    public void writeBytes(String $$0) throws IOException {
        this.a.writeBytes($$0);
    }

    @Override
    public void writeChars(String $$0) throws IOException {
        this.a.writeChars($$0);
    }

    @Override
    public void writeUTF(String $$0) throws IOException {
        this.a.writeUTF($$0);
    }
}

