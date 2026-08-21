/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UTFDataFormatException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jspecify.annotations.Nullable;

public class vm {
    private static final OpenOption[] a = new OpenOption[]{StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};

    public static uz a(Path $$0, vi $$1) throws IOException {
        try (InputStream $$2 = Files.newInputStream($$0, new OpenOption[0]);){
            uz uz2;
            try (bfn $$3 = new bfn($$2);){
                uz2 = vm.a($$3, $$1);
            }
            return uz2;
        }
    }

    private static DataInputStream a(InputStream $$0) throws IOException {
        return new DataInputStream(new bfn(new GZIPInputStream($$0)));
    }

    private static DataOutputStream a(OutputStream $$0) throws IOException {
        return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$0)));
    }

    public static uz a(InputStream $$0, vi $$1) throws IOException {
        try (DataInputStream $$2 = vm.a($$0);){
            uz uz2 = vm.a($$2, $$1);
            return uz2;
        }
    }

    public static void a(Path $$0, vw $$1, vi $$2) throws IOException {
        try (InputStream $$3 = Files.newInputStream($$0, new OpenOption[0]);
             bfn $$4 = new bfn($$3);){
            vm.a($$4, $$1, $$2);
        }
    }

    public static void a(InputStream $$0, vw $$1, vi $$2) throws IOException {
        try (DataInputStream $$3 = vm.a($$0);){
            vm.a((DataInput)$$3, $$1, $$2);
        }
    }

    public static void a(uz $$0, Path $$1) throws IOException {
        try (OutputStream $$2 = Files.newOutputStream($$1, a);
             BufferedOutputStream $$3 = new BufferedOutputStream($$2);){
            vm.a($$0, $$3);
        }
    }

    public static void a(uz $$0, OutputStream $$1) throws IOException {
        try (DataOutputStream $$2 = vm.a($$1);){
            vm.a($$0, (DataOutput)$$2);
        }
    }

    public static void b(uz $$0, Path $$1) throws IOException {
        try (OutputStream $$2 = Files.newOutputStream($$1, a);
             BufferedOutputStream $$3 = new BufferedOutputStream($$2);
             DataOutputStream $$4 = new DataOutputStream($$3);){
            vm.a($$0, (DataOutput)$$4);
        }
    }

    public static @Nullable uz a(Path $$0) throws IOException {
        if (!Files.exists($$0, new LinkOption[0])) {
            return null;
        }
        try (InputStream $$1 = Files.newInputStream($$0, new OpenOption[0]);){
            uz uz2;
            try (DataInputStream $$2 = new DataInputStream($$1);){
                uz2 = vm.a($$2, vi.c());
            }
            return uz2;
        }
    }

    public static uz a(DataInput $$0) throws IOException {
        return vm.a($$0, vi.c());
    }

    public static uz a(DataInput $$0, vi $$1) throws IOException {
        vz $$2 = vm.c($$0, $$1);
        if ($$2 instanceof uz) {
            return (uz)$$2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(uz $$0, DataOutput $$1) throws IOException {
        vm.c($$0, $$1);
    }

    public static void a(DataInput $$0, vw $$1, vi $$2) throws IOException {
        wb<?> $$3 = wc.a($$0.readByte());
        if ($$3 == vb.a) {
            if ($$1.b(vb.a) == vw.b.a) {
                $$1.a();
            }
            return;
        }
        switch ($$1.b($$3)) {
            case c: {
                break;
            }
            case b: {
                vx.a($$0);
                $$3.b($$0, $$2);
                break;
            }
            case a: {
                vx.a($$0);
                $$3.a($$0, $$1, $$2);
            }
        }
    }

    public static vz b(DataInput $$0, vi $$1) throws IOException {
        byte $$2 = $$0.readByte();
        if ($$2 == 0) {
            return vb.b;
        }
        return vm.a($$0, $$1, $$2);
    }

    public static void a(vz $$0, DataOutput $$1) throws IOException {
        $$1.writeByte($$0.b());
        if ($$0.b() == 0) {
            return;
        }
        $$0.a($$1);
    }

    public static void b(vz $$0, DataOutput $$1) throws IOException {
        $$1.writeByte($$0.b());
        if ($$0.b() == 0) {
            return;
        }
        $$1.writeUTF("");
        $$0.a($$1);
    }

    public static void c(vz $$0, DataOutput $$1) throws IOException {
        vm.b($$0, new a($$1));
    }

    @VisibleForTesting
    public static vz c(DataInput $$0, vi $$1) throws IOException {
        byte $$2 = $$0.readByte();
        if ($$2 == 0) {
            return vb.b;
        }
        vx.a($$0);
        return vm.a($$0, $$1, $$2);
    }

    private static vz a(DataInput $$0, vi $$1, byte $$2) {
        try {
            return wc.a($$2).c($$0, $$1);
        }
        catch (IOException $$3) {
            m $$4 = m.a($$3, "Loading NBT data");
            n $$5 = $$4.a("NBT Tag");
            $$5.a("Tag type", $$2);
            throw new vr($$4);
        }
    }

    public static class a
    extends bff {
        public a(DataOutput $$0) {
            super($$0);
        }

        @Override
        public void writeUTF(String $$0) throws IOException {
            try {
                super.writeUTF($$0);
            }
            catch (UTFDataFormatException $$1) {
                bhs.a("Failed to write NBT String", (Throwable)$$1);
                super.writeUTF("");
            }
        }
    }
}

