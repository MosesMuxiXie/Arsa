/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.bytes.ByteList
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class gon
implements fwq {
    static final Logger b = LogUtils.getLogger();
    private static final int c = 16;
    private static final int d = 2;
    private static final int e = 32;
    private static final int f = 64;
    private static final int g = 96;
    private static final int h = 128;
    private final gnn<d> i;

    gon(gnn<d> $$0) {
        this.i = $$0;
    }

    @Override
    public @Nullable fwt a(int $$0) {
        return this.i.a($$0);
    }

    @Override
    public IntSet a() {
        return this.i.b();
    }

    @VisibleForTesting
    static void a(IntBuffer $$0, int $$1, int $$2, int $$3) {
        int $$4 = 32 - $$2 - 1;
        int $$5 = 32 - $$3 - 1;
        for (int $$6 = $$4; $$6 >= $$5; --$$6) {
            if ($$6 >= 32 || $$6 < 0) {
                $$0.put(0);
                continue;
            }
            boolean $$7 = ($$1 >> $$6 & 1) != 0;
            $$0.put($$7 ? -1 : 0);
        }
    }

    static void a(IntBuffer $$0, f $$1, int $$2, int $$3) {
        for (int $$4 = 0; $$4 < 16; ++$$4) {
            int $$5 = $$1.a($$4);
            gon.a($$0, $$5, $$2, $$3);
        }
    }

    @VisibleForTesting
    static void a(InputStream $$0, h $$1) throws IOException {
        int $$2 = 0;
        ByteArrayList $$3 = new ByteArrayList(128);
        while (true) {
            boolean $$4 = gon.a($$0, (ByteList)$$3, 58);
            int $$5 = $$3.size();
            if ($$5 == 0 && !$$4) break;
            if (!$$4 || $$5 != 4 && $$5 != 5 && $$5 != 6) {
                throw new IllegalArgumentException("Invalid entry at line " + $$2 + ": expected 4, 5 or 6 hex digits followed by a colon");
            }
            int $$6 = 0;
            for (int $$7 = 0; $$7 < $$5; ++$$7) {
                $$6 = $$6 << 4 | gon.a($$2, $$3.getByte($$7));
            }
            $$3.clear();
            gon.a($$0, (ByteList)$$3, 10);
            int $$8 = $$3.size();
            f $$9 = switch ($$8) {
                case 32 -> a.a($$2, (ByteList)$$3);
                case 64 -> gon$i.a($$2, (ByteList)$$3);
                case 96 -> gon$e.b($$2, (ByteList)$$3);
                case 128 -> gon$e.a($$2, (ByteList)$$3);
                default -> throw new IllegalArgumentException("Invalid entry at line " + $$2 + ": expected hex number describing (8,16,24,32) x 16 bitmap, followed by a new line");
            };
            $$1.accept($$6, $$9);
            ++$$2;
            $$3.clear();
        }
    }

    static int a(int $$0, ByteList $$1, int $$2) {
        return gon.a($$0, $$1.getByte($$2));
    }

    private static int a(int $$0, byte $$1) {
        return switch ($$1) {
            case 48 -> 0;
            case 49 -> 1;
            case 50 -> 2;
            case 51 -> 3;
            case 52 -> 4;
            case 53 -> 5;
            case 54 -> 6;
            case 55 -> 7;
            case 56 -> 8;
            case 57 -> 9;
            case 65 -> 10;
            case 66 -> 11;
            case 67 -> 12;
            case 68 -> 13;
            case 69 -> 14;
            case 70 -> 15;
            default -> throw new IllegalArgumentException("Invalid entry at line " + $$0 + ": expected hex digit, got " + (char)$$1);
        };
    }

    private static boolean a(InputStream $$0, ByteList $$1, int $$2) throws IOException {
        int $$3;
        while (($$3 = $$0.read()) != -1) {
            if ($$3 == $$2) {
                return true;
            }
            $$1.add((byte)$$3);
        }
        return false;
    }

    public static interface f {
        public int a(int var1);

        public int a();

        default public int c() {
            int $$0 = 0;
            for (int $$1 = 0; $$1 < 16; ++$$1) {
                $$0 |= this.a($$1);
            }
            return $$0;
        }

        default public int d() {
            int $$5;
            int $$4;
            int $$0 = this.c();
            int $$1 = this.a();
            if ($$0 == 0) {
                boolean $$2 = false;
                int $$3 = $$1;
            } else {
                $$4 = Integer.numberOfLeadingZeros($$0);
                $$5 = 32 - Integer.numberOfTrailingZeros($$0) - 1;
            }
            return gon$c.a($$4, $$5);
        }
    }

    record a(byte[] a) implements f
    {
        private final byte[] a;

        @Override
        public int a(int $$0) {
            return this.a[$$0] << 24;
        }

        static f a(int $$0, ByteList $$1) {
            byte[] $$2 = new byte[16];
            int $$3 = 0;
            for (int $$4 = 0; $$4 < 16; ++$$4) {
                byte $$7;
                int $$5 = gon.a($$0, $$1, $$3++);
                int $$6 = gon.a($$0, $$1, $$3++);
                $$2[$$4] = $$7 = (byte)($$5 << 4 | $$6);
            }
            return new a($$2);
        }

        @Override
        public int a() {
            return 8;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contents", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contents", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contents", "a"}, this, $$0);
        }

        public byte[] b() {
            return this.a;
        }
    }

    record i(short[] a) implements f
    {
        private final short[] a;

        @Override
        public int a(int $$0) {
            return this.a[$$0] << 16;
        }

        static f a(int $$0, ByteList $$1) {
            short[] $$2 = new short[16];
            int $$3 = 0;
            for (int $$4 = 0; $$4 < 16; ++$$4) {
                short $$9;
                int $$5 = gon.a($$0, $$1, $$3++);
                int $$6 = gon.a($$0, $$1, $$3++);
                int $$7 = gon.a($$0, $$1, $$3++);
                int $$8 = gon.a($$0, $$1, $$3++);
                $$2[$$4] = $$9 = (short)($$5 << 12 | $$6 << 8 | $$7 << 4 | $$8);
            }
            return new i($$2);
        }

        @Override
        public int a() {
            return 16;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "contents", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "contents", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "contents", "a"}, this, $$0);
        }

        public short[] b() {
            return this.a;
        }
    }

    record e(int[] a, int b) implements f
    {
        private final int[] a;
        private final int b;
        private static final int c = 24;

        @Override
        public int a(int $$0) {
            return this.a[$$0];
        }

        static f b(int $$0, ByteList $$1) {
            int[] $$2 = new int[16];
            int $$3 = 0;
            int $$4 = 0;
            for (int $$5 = 0; $$5 < 16; ++$$5) {
                int $$6 = gon.a($$0, $$1, $$4++);
                int $$7 = gon.a($$0, $$1, $$4++);
                int $$8 = gon.a($$0, $$1, $$4++);
                int $$9 = gon.a($$0, $$1, $$4++);
                int $$10 = gon.a($$0, $$1, $$4++);
                int $$11 = gon.a($$0, $$1, $$4++);
                int $$12 = $$6 << 20 | $$7 << 16 | $$8 << 12 | $$9 << 8 | $$10 << 4 | $$11;
                $$2[$$5] = $$12 << 8;
                $$3 |= $$12;
            }
            return new e($$2, 24);
        }

        public static f a(int $$0, ByteList $$1) {
            int[] $$2 = new int[16];
            int $$3 = 0;
            int $$4 = 0;
            for (int $$5 = 0; $$5 < 16; ++$$5) {
                int $$14;
                int $$6 = gon.a($$0, $$1, $$4++);
                int $$7 = gon.a($$0, $$1, $$4++);
                int $$8 = gon.a($$0, $$1, $$4++);
                int $$9 = gon.a($$0, $$1, $$4++);
                int $$10 = gon.a($$0, $$1, $$4++);
                int $$11 = gon.a($$0, $$1, $$4++);
                int $$12 = gon.a($$0, $$1, $$4++);
                int $$13 = gon.a($$0, $$1, $$4++);
                $$2[$$5] = $$14 = $$6 << 28 | $$7 << 24 | $$8 << 20 | $$9 << 16 | $$10 << 12 | $$11 << 8 | $$12 << 4 | $$13;
                $$3 |= $$14;
            }
            return new e($$2, 32);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "contents;bitWidth", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "contents;bitWidth", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "contents;bitWidth", "a", "b"}, this, $$0);
        }

        public int[] b() {
            return this.a;
        }

        @Override
        public int a() {
            return this.b;
        }
    }

    @FunctionalInterface
    public static interface h {
        public void accept(int var1, f var2);
    }

    static final class d
    extends Record
    implements fwt {
        final f a;
        final int b;
        final int c;

        d(f $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public int b() {
            return this.c - this.b + 1;
        }

        @Override
        public fwp a() {
            return new fwp(){

                @Override
                public float getAdvance() {
                    return this.b() / 2 + 1;
                }

                @Override
                public float b() {
                    return 0.5f;
                }

                @Override
                public float a() {
                    return 0.5f;
                }
            };
        }

        @Override
        public goa a(fwt.a $$0) {
            return $$0.a(this.a(), new fwo(){

                @Override
                public float d() {
                    return 2.0f;
                }

                @Override
                public int a() {
                    return this.b();
                }

                @Override
                public int b() {
                    return 16;
                }

                @Override
                public void a(int $$0, int $$1, GpuTexture $$2) {
                    IntBuffer $$3 = MemoryUtil.memAllocInt((int)(this.b() * 16));
                    gon.a($$3, a, b, c);
                    $$3.rewind();
                    RenderSystem.getDevice().createCommandEncoder().writeToTexture($$2, MemoryUtil.memByteBuffer((IntBuffer)$$3), fyh.a.a, 0, 0, $$0, $$1, this.b(), 16);
                    MemoryUtil.memFree((Buffer)$$3);
                }

                @Override
                public boolean c() {
                    return true;
                }
            });
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "contents;left;right", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "contents;left;right", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "contents;left;right", "a", "b", "c"}, this, $$0);
        }

        public f c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.c;
        }
    }

    public static class b
    implements goj {
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amo.a.fieldOf("hex_file").forGetter($$0 -> $$0.c), (App)gon$g.a.listOf().optionalFieldOf("size_overrides", List.of()).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, b::new));
        private final amo c;
        private final List<g> d;

        private b(amo $$0, List<g> $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public gok a() {
            return gok.d;
        }

        @Override
        public Either<goj.b, goj.c> b() {
            return Either.left(this::a);
        }

        private fwq a(baz $$0) throws IOException {
            try (InputStream $$1 = $$0.open(this.c);){
                gon gon2 = this.a($$1);
                return gon2;
            }
        }

        private gon a(InputStream $$02) throws IOException {
            gnn<f> $$12 = new gnn<f>(f[]::new, $$0 -> new f[$$0][]);
            h $$22 = $$12::a;
            try (ZipInputStream $$3 = new ZipInputStream($$02);){
                ZipEntry $$4;
                while (($$4 = $$3.getNextEntry()) != null) {
                    String $$5 = $$4.getName();
                    if (!$$5.endsWith(".hex")) continue;
                    b.info("Found {}, loading", (Object)$$5);
                    gon.a(new bfn($$3), $$22);
                }
                gnn<d> $$6 = new gnn<d>(d[]::new, $$0 -> new d[$$0][]);
                for (g $$7 : this.d) {
                    int $$8 = $$7.b;
                    int $$9 = $$7.c;
                    c $$10 = $$7.d;
                    for (int $$11 = $$8; $$11 <= $$9; ++$$11) {
                        f $$122 = (f)$$12.b($$11);
                        if ($$122 == null) continue;
                        $$6.a($$11, new d($$122, $$10.c, $$10.d));
                    }
                }
                $$12.a((int $$1, T $$2) -> {
                    int $$3 = $$2.d();
                    int $$4 = gon$c.a($$3);
                    int $$5 = gon$c.b($$3);
                    $$6.a($$1, new d((f)$$2, $$4, $$5));
                });
                gon gon2 = new gon($$6);
                return gon2;
            }
        }
    }

    public static final class c
    extends Record {
        final int c;
        final int d;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.fieldOf("left").forGetter(c::b), (App)Codec.INT.fieldOf("right").forGetter(c::c)).apply((Applicative)$$0, c::new));
        public static final Codec<c> b = a.codec();

        public c(int $$0, int $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public int a() {
            return gon$c.a(this.c, this.d);
        }

        public static int a(int $$0, int $$1) {
            return ($$0 & 0xFF) << 8 | $$1 & 0xFF;
        }

        public static int a(int $$0) {
            return (byte)($$0 >> 8);
        }

        public static int b(int $$0) {
            return (byte)$$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "left;right", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "left;right", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "left;right", "c", "d"}, this, $$0);
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }
    }

    static final class g
    extends Record {
        final int b;
        final int c;
        final c d;
        private static final Codec<g> e = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.N.fieldOf("from").forGetter(g::a), (App)bfm.N.fieldOf("to").forGetter(g::b), (App)gon$c.a.forGetter(g::c)).apply((Applicative)$$0, g::new));
        public static final Codec<g> a = e.validate($$0 -> {
            if ($$0.b >= $$0.c) {
                return DataResult.error(() -> "Invalid range: [" + $$0.b + ";" + $$0.c + "]");
            }
            return DataResult.success((Object)$$0);
        });

        private g(int $$0, int $$1, c $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "from;to;dimensions", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "from;to;dimensions", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "from;to;dimensions", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public c c() {
            return this.d;
        }
    }
}

