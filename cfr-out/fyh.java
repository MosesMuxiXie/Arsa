/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.MemoryPool
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.stb.STBIWriteCallback
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.stb.STBImageResize
 *  org.lwjgl.stb.STBImageWrite
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Bitmap
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FT_GlyphSlot
 *  org.lwjgl.util.freetype.FreeType
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBIWriteCallback;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public final class fyh
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final MemoryPool b = TracyClient.createMemoryPool((String)"NativeImage");
    private static final Set<StandardOpenOption> c = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    private final a d;
    private final int e;
    private final int f;
    private final boolean g;
    private long h;
    private final long i;

    public fyh(int $$0, int $$1, boolean $$2) {
        this(fyh$a.a, $$0, $$1, $$2);
    }

    public fyh(a $$0, int $$1, int $$2, boolean $$3) {
        if ($$1 <= 0 || $$2 <= 0) {
            throw new IllegalArgumentException("Invalid texture size: " + $$1 + "x" + $$2);
        }
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.i = (long)$$1 * (long)$$2 * (long)$$0.a();
        this.g = false;
        this.h = $$3 ? MemoryUtil.nmemCalloc((long)1L, (long)this.i) : MemoryUtil.nmemAlloc((long)this.i);
        b.malloc(this.h, (int)this.i);
        if (this.h == 0L) {
            throw new IllegalStateException("Unable to allocate texture of size " + $$1 + "x" + $$2 + " (" + $$0.a() + " channels)");
        }
    }

    public fyh(a $$0, int $$1, int $$2, boolean $$3, long $$4) {
        if ($$1 <= 0 || $$2 <= 0) {
            throw new IllegalArgumentException("Invalid texture size: " + $$1 + "x" + $$2);
        }
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = (long)$$1 * (long)$$2 * (long)$$0.a();
    }

    public String toString() {
        return "NativeImage[" + String.valueOf((Object)this.d) + " " + this.e + "x" + this.f + "@" + this.h + (this.g ? "S" : "N") + "]";
    }

    private boolean c(int $$0, int $$1) {
        return $$0 < 0 || $$0 >= this.e || $$1 < 0 || $$1 >= this.f;
    }

    public static fyh a(InputStream $$0) throws IOException {
        return fyh.a(fyh$a.a, $$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static fyh a(@Nullable a $$0, InputStream $$1) throws IOException {
        ByteBuffer $$2 = null;
        try {
            $$2 = TextureUtil.readResource($$1);
            fyh fyh2 = fyh.a($$0, $$2);
            return fyh2;
        }
        finally {
            MemoryUtil.memFree((Buffer)$$2);
            IOUtils.closeQuietly((InputStream)$$1);
        }
    }

    public static fyh a(ByteBuffer $$0) throws IOException {
        return fyh.a(fyh$a.a, $$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static fyh a(byte[] $$0) throws IOException {
        MemoryStack $$1 = MemoryStack.stackGet();
        int $$2 = $$1.getPointer();
        if ($$2 < $$0.length) {
            ByteBuffer $$3 = MemoryUtil.memAlloc((int)$$0.length);
            try {
                fyh fyh2 = fyh.a($$3, $$0);
                return fyh2;
            }
            finally {
                MemoryUtil.memFree((Buffer)$$3);
            }
        }
        try (MemoryStack $$4 = MemoryStack.stackPush();){
            ByteBuffer $$5 = $$4.malloc($$0.length);
            fyh fyh3 = fyh.a($$5, $$0);
            return fyh3;
        }
    }

    private static fyh a(ByteBuffer $$0, byte[] $$1) throws IOException {
        $$0.put($$1);
        $$0.rewind();
        return fyh.a($$0);
    }

    public static fyh a(@Nullable a $$0, ByteBuffer $$1) throws IOException {
        if ($$0 != null && !$$0.t()) {
            throw new UnsupportedOperationException("Don't know how to read format " + String.valueOf((Object)$$0));
        }
        if (MemoryUtil.memAddress((ByteBuffer)$$1) == 0L) {
            throw new IllegalArgumentException("Invalid buffer");
        }
        bgo.a($$1);
        try (MemoryStack $$2 = MemoryStack.stackPush();){
            IntBuffer $$3 = $$2.mallocInt(1);
            IntBuffer $$4 = $$2.mallocInt(1);
            IntBuffer $$5 = $$2.mallocInt(1);
            ByteBuffer $$6 = STBImage.stbi_load_from_memory((ByteBuffer)$$1, (IntBuffer)$$3, (IntBuffer)$$4, (IntBuffer)$$5, (int)($$0 == null ? 0 : $$0.e));
            if ($$6 == null) {
                throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }
            long $$7 = MemoryUtil.memAddress((ByteBuffer)$$6);
            b.malloc($$7, $$6.limit());
            fyh fyh2 = new fyh($$0 == null ? fyh$a.a($$5.get(0)) : $$0, $$3.get(0), $$4.get(0), true, $$7);
            return fyh2;
        }
    }

    private void i() {
        if (this.h == 0L) {
            throw new IllegalStateException("Image is not allocated.");
        }
    }

    @Override
    public void close() {
        if (this.h != 0L) {
            if (this.g) {
                STBImage.nstbi_image_free((long)this.h);
            } else {
                MemoryUtil.nmemFree((long)this.h);
            }
            b.free(this.h);
        }
        this.h = 0L;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public a c() {
        return this.d;
    }

    private int d(int $$0, int $$1) {
        if (this.d != fyh$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelRGBA only works on RGBA images; have %s", new Object[]{this.d}));
        }
        if (this.c($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.e, this.f));
        }
        this.i();
        long $$2 = ((long)$$0 + (long)$$1 * (long)this.e) * 4L;
        return MemoryUtil.memGetInt((long)(this.h + $$2));
    }

    public int a(int $$0, int $$1) {
        return bel.r(this.d($$0, $$1));
    }

    public void a(int $$0, int $$1, int $$2) {
        if (this.d != fyh$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelRGBA only works on RGBA images; have %s", new Object[]{this.d}));
        }
        if (this.c($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.e, this.f));
        }
        this.i();
        long $$3 = ((long)$$0 + (long)$$1 * (long)this.e) * 4L;
        MemoryUtil.memPutInt((long)(this.h + $$3), (int)$$2);
    }

    public void b(int $$0, int $$1, int $$2) {
        this.a($$0, $$1, bel.q($$2));
    }

    public fyh a(IntUnaryOperator $$0) {
        if (this.d != fyh$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", new Object[]{this.d}));
        }
        this.i();
        fyh $$1 = new fyh(this.e, this.f, false);
        int $$2 = this.e * this.f;
        IntBuffer $$3 = MemoryUtil.memIntBuffer((long)this.h, (int)$$2);
        IntBuffer $$4 = MemoryUtil.memIntBuffer((long)$$1.h, (int)$$2);
        for (int $$5 = 0; $$5 < $$2; ++$$5) {
            int $$6 = bel.r($$3.get($$5));
            int $$7 = $$0.applyAsInt($$6);
            $$4.put($$5, bel.q($$7));
        }
        return $$1;
    }

    public int[] d() {
        if (this.d != fyh$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixels only works on RGBA images; have %s", new Object[]{this.d}));
        }
        this.i();
        int[] $$0 = new int[this.e * this.f];
        MemoryUtil.memIntBuffer((long)this.h, (int)(this.e * this.f)).get($$0);
        return $$0;
    }

    public int[] e() {
        int[] $$0 = this.d();
        for (int $$1 = 0; $$1 < $$0.length; ++$$1) {
            $$0[$$1] = bel.r($$0[$$1]);
        }
        return $$0;
    }

    public byte b(int $$0, int $$1) {
        if (!this.d.o()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "no luminance or alpha in %s", new Object[]{this.d}));
        }
        if (this.c($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.e, this.f));
        }
        int $$2 = ($$0 + $$1 * this.e) * this.d.a() + this.d.s() / 8;
        return MemoryUtil.memGetByte((long)(this.h + (long)$$2));
    }

    @Deprecated
    public int[] f() {
        if (this.d != fyh$a.a) {
            throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
        }
        this.i();
        int[] $$0 = new int[this.a() * this.b()];
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            for (int $$2 = 0; $$2 < this.a(); ++$$2) {
                $$0[$$2 + $$1 * this.a()] = this.a($$2, $$1);
            }
        }
        return $$0;
    }

    public void a(File $$0) throws IOException {
        this.a($$0.toPath());
    }

    public boolean a(FT_Face $$0, int $$1) {
        if (this.d.a() != 1) {
            throw new IllegalArgumentException("Can only write fonts into 1-component images.");
        }
        if (goi.b(FreeType.FT_Load_Glyph((FT_Face)$$0, (int)$$1, (int)4), "Loading glyph")) {
            return false;
        }
        FT_GlyphSlot $$2 = Objects.requireNonNull($$0.glyph(), "Glyph not initialized");
        FT_Bitmap $$3 = $$2.bitmap();
        if ($$3.pixel_mode() != 2) {
            throw new IllegalStateException("Rendered glyph was not 8-bit grayscale");
        }
        if ($$3.width() != this.a() || $$3.rows() != this.b()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Glyph bitmap of size %sx%s does not match image of size: %sx%s", $$3.width(), $$3.rows(), this.a(), this.b()));
        }
        int $$4 = $$3.width() * $$3.rows();
        ByteBuffer $$5 = Objects.requireNonNull($$3.buffer($$4), "Glyph has no bitmap");
        MemoryUtil.memCopy((long)MemoryUtil.memAddress((ByteBuffer)$$5), (long)this.h, (long)$$4);
        return true;
    }

    public void a(Path $$0) throws IOException {
        if (!this.d.t()) {
            throw new UnsupportedOperationException("Don't know how to write format " + String.valueOf((Object)this.d));
        }
        this.i();
        try (SeekableByteChannel $$1 = Files.newByteChannel($$0, c, new FileAttribute[0]);){
            if (!this.a($$1)) {
                throw new IOException("Could not write image to the PNG file \"" + String.valueOf($$0.toAbsolutePath()) + "\": " + STBImage.stbi_failure_reason());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(WritableByteChannel $$0) throws IOException {
        b $$1 = new b($$0);
        try {
            int $$2 = Math.min(this.b(), Integer.MAX_VALUE / this.a() / this.d.a());
            if ($$2 < this.b()) {
                a.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", (Object)this.b(), (Object)$$2);
            }
            if (STBImageWrite.nstbi_write_png_to_func((long)$$1.address(), (long)0L, (int)this.a(), (int)$$2, (int)this.d.a(), (long)this.h, (int)0) == 0) {
                boolean bl2 = false;
                return bl2;
            }
            $$1.a();
            boolean bl3 = true;
            return bl3;
        }
        finally {
            $$1.free();
        }
    }

    public void a(fyh $$0) {
        if ($$0.c() != this.d) {
            throw new UnsupportedOperationException("Image formats don't match.");
        }
        int $$1 = this.d.a();
        this.i();
        $$0.i();
        if (this.e == $$0.e) {
            MemoryUtil.memCopy((long)$$0.h, (long)this.h, (long)Math.min(this.i, $$0.i));
        } else {
            int $$2 = Math.min(this.a(), $$0.a());
            int $$3 = Math.min(this.b(), $$0.b());
            for (int $$4 = 0; $$4 < $$3; ++$$4) {
                int $$5 = $$4 * $$0.a() * $$1;
                int $$6 = $$4 * this.a() * $$1;
                MemoryUtil.memCopy((long)($$0.h + (long)$$5), (long)(this.h + (long)$$6), (long)$$2);
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$1; $$5 < $$1 + $$3; ++$$5) {
            for (int $$6 = $$0; $$6 < $$0 + $$2; ++$$6) {
                this.b($$6, $$5, $$4);
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, boolean $$6, boolean $$7) {
        this.a(this, $$0, $$1, $$0 + $$2, $$1 + $$3, $$4, $$5, $$6, $$7);
    }

    public void a(fyh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8) {
        for (int $$9 = 0; $$9 < $$6; ++$$9) {
            for (int $$10 = 0; $$10 < $$5; ++$$10) {
                int $$11 = $$7 ? $$5 - 1 - $$10 : $$10;
                int $$12 = $$8 ? $$6 - 1 - $$9 : $$9;
                int $$13 = this.d($$1 + $$10, $$2 + $$9);
                $$0.a($$3 + $$11, $$4 + $$12, $$13);
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, fyh $$4) {
        this.i();
        if ($$4.c() != this.d) {
            throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
        }
        int $$5 = this.d.a();
        STBImageResize.nstbir_resize_uint8((long)(this.h + (long)(($$0 + $$1 * this.a()) * $$5)), (int)$$2, (int)$$3, (int)(this.a() * $$5), (long)$$4.h, (int)$$4.a(), (int)$$4.b(), (int)0, (int)$$5);
    }

    public void g() {
        fxy.a(this.h);
    }

    public long h() {
        return this.h;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(4, true, true, true, false, true, 0, 8, 16, 255, 24, true);
        public static final /* enum */ a b = new a(3, true, true, true, false, false, 0, 8, 16, 255, 255, true);
        public static final /* enum */ a c = new a(2, false, false, false, true, true, 255, 255, 255, 0, 8, true);
        public static final /* enum */ a d = new a(1, false, false, false, true, false, 0, 0, 0, 0, 255, true);
        final int e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;
        private final boolean p;
        private static final /* synthetic */ a[] q;

        public static a[] values() {
            return (a[])q.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, int $$6, int $$7, int $$8, int $$9, int $$10, boolean $$11) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
            this.j = $$5;
            this.k = $$6;
            this.l = $$7;
            this.m = $$8;
            this.n = $$9;
            this.o = $$10;
            this.p = $$11;
        }

        public int a() {
            return this.e;
        }

        public boolean b() {
            return this.f;
        }

        public boolean c() {
            return this.g;
        }

        public boolean d() {
            return this.h;
        }

        public boolean e() {
            return this.i;
        }

        public boolean f() {
            return this.j;
        }

        public int g() {
            return this.k;
        }

        public int h() {
            return this.l;
        }

        public int i() {
            return this.m;
        }

        public int j() {
            return this.n;
        }

        public int k() {
            return this.o;
        }

        public boolean l() {
            return this.i || this.f;
        }

        public boolean m() {
            return this.i || this.g;
        }

        public boolean n() {
            return this.i || this.h;
        }

        public boolean o() {
            return this.i || this.j;
        }

        public int p() {
            return this.i ? this.n : this.k;
        }

        public int q() {
            return this.i ? this.n : this.l;
        }

        public int r() {
            return this.i ? this.n : this.m;
        }

        public int s() {
            return this.i ? this.n : this.o;
        }

        public boolean t() {
            return this.p;
        }

        static a a(int $$0) {
            switch ($$0) {
                case 1: {
                    return d;
                }
                case 2: {
                    return c;
                }
                case 3: {
                    return b;
                }
            }
            return a;
        }

        private static /* synthetic */ a[] u() {
            return new a[]{a, b, c, d};
        }

        static {
            q = fyh$a.u();
        }
    }

    static class b
    extends STBIWriteCallback {
        private final WritableByteChannel a;
        private @Nullable IOException b;

        b(WritableByteChannel $$0) {
            this.a = $$0;
        }

        public void invoke(long $$0, long $$1, int $$2) {
            ByteBuffer $$3 = fyh$b.getData((long)$$1, (int)$$2);
            try {
                this.a.write($$3);
            }
            catch (IOException $$4) {
                this.b = $$4;
            }
        }

        public void a() throws IOException {
            if (this.b != null) {
                throw this.b;
            }
        }
    }
}

