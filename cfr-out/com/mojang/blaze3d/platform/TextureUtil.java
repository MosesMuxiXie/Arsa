/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
package com.mojang.blaze3d.platform;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@fwa
public class TextureUtil {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final int MIN_MIPMAP_LEVEL = 0;
    private static final int DEFAULT_IMAGE_BUFFER_SIZE = 8192;
    private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static ByteBuffer readResource(InputStream $$0) throws IOException {
        ReadableByteChannel $$1 = Channels.newChannel($$0);
        if ($$1 instanceof SeekableByteChannel) {
            SeekableByteChannel $$2 = (SeekableByteChannel)$$1;
            return TextureUtil.readResource($$1, (int)$$2.size() + 1);
        }
        return TextureUtil.readResource($$1, 8192);
    }

    private static ByteBuffer readResource(ReadableByteChannel $$0, int $$1) throws IOException {
        ByteBuffer $$2 = MemoryUtil.memAlloc((int)$$1);
        try {
            while ($$0.read($$2) != -1) {
                if ($$2.hasRemaining()) continue;
                $$2 = MemoryUtil.memRealloc((ByteBuffer)$$2, (int)($$2.capacity() * 2));
            }
            $$2.flip();
            return $$2;
        }
        catch (IOException $$3) {
            MemoryUtil.memFree((Buffer)$$2);
            throw $$3;
        }
    }

    public static void writeAsPNG(Path $$0, String $$1, GpuTexture $$2, int $$3, IntUnaryOperator $$4) {
        RenderSystem.assertOnRenderThread();
        long $$5 = 0L;
        for (int $$6 = 0; $$6 <= $$3; ++$$6) {
            $$5 += (long)$$2.getFormat().pixelSize() * (long)$$2.getWidth($$6) * (long)$$2.getHeight($$6);
        }
        if ($$5 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Exporting textures larger than 2GB is not supported");
        }
        GpuBuffer $$7 = RenderSystem.getDevice().createBuffer(() -> "Texture output buffer", 9, $$5);
        CommandEncoder $$8 = RenderSystem.getDevice().createCommandEncoder();
        Runnable $$9 = () -> {
            try (GpuBuffer.MappedView $$7 = $$8.mapBuffer($$7, true, false);){
                int $$8 = 0;
                for (int $$9 = 0; $$9 <= $$3; ++$$9) {
                    int $$10 = $$2.getWidth($$9);
                    int $$11 = $$2.getHeight($$9);
                    try (fyh $$12 = new fyh($$10, $$11, false);){
                        for (int $$13 = 0; $$13 < $$11; ++$$13) {
                            for (int $$14 = 0; $$14 < $$10; ++$$14) {
                                int $$15 = $$7.data().getInt($$8 + ($$14 + $$13 * $$10) * $$2.getFormat().pixelSize());
                                $$12.a($$14, $$13, $$4.applyAsInt($$15));
                            }
                        }
                        Path $$16 = $$0.resolve($$1 + "_" + $$9 + ".png");
                        $$12.a($$16);
                        LOGGER.debug("Exported png to: {}", (Object)$$16.toAbsolutePath());
                    }
                    catch (IOException $$17) {
                        LOGGER.debug("Unable to write: ", (Throwable)$$17);
                    }
                    $$8 += $$2.getFormat().pixelSize() * $$10 * $$11;
                }
            }
            $$7.close();
        };
        AtomicInteger $$10 = new AtomicInteger();
        int $$11 = 0;
        for (int $$12 = 0; $$12 <= $$3; ++$$12) {
            $$8.copyTextureToBuffer($$2, $$7, $$11, () -> {
                if ($$10.getAndIncrement() == $$3) {
                    $$9.run();
                }
            }, $$12);
            $$11 += $$2.getFormat().pixelSize() * $$2.getWidth($$12) * $$2.getHeight($$12);
        }
    }

    public static Path getDebugTexturePath(Path $$0) {
        return $$0.resolve("screenshots").resolve("debug");
    }

    public static Path getDebugTexturePath() {
        return TextureUtil.getDebugTexturePath(Path.of(".", new String[0]));
    }

    public static void solidify(fyh $$0) {
        int $$1 = $$0.a();
        int $$2 = $$0.b();
        int[] $$3 = new int[$$1 * $$2];
        int[] $$4 = new int[$$1 * $$2];
        Arrays.fill($$4, Integer.MAX_VALUE);
        IntArrayFIFOQueue $$5 = new IntArrayFIFOQueue();
        for (int $$6 = 0; $$6 < $$1; ++$$6) {
            for (int $$7 = 0; $$7 < $$2; ++$$7) {
                int $$8 = $$0.a($$6, $$7);
                if (bel.b($$8) == 0) continue;
                int $$9 = TextureUtil.pack($$6, $$7, $$1);
                $$4[$$9] = 0;
                $$3[$$9] = $$8;
                $$5.enqueue($$9);
            }
        }
        while (!$$5.isEmpty()) {
            int $$10 = $$5.dequeueInt();
            int $$11 = TextureUtil.x($$10, $$1);
            int $$12 = TextureUtil.y($$10, $$1);
            for (int[] $$13 : DIRECTIONS) {
                int $$14 = $$11 + $$13[0];
                int $$15 = $$12 + $$13[1];
                int $$16 = TextureUtil.pack($$14, $$15, $$1);
                if ($$14 < 0 || $$15 < 0 || $$14 >= $$1 || $$15 >= $$2 || $$4[$$16] <= $$4[$$10] + 1) continue;
                $$4[$$16] = $$4[$$10] + 1;
                $$3[$$16] = $$3[$$10];
                $$5.enqueue($$16);
            }
        }
        for (int $$17 = 0; $$17 < $$1; ++$$17) {
            for (int $$18 = 0; $$18 < $$2; ++$$18) {
                int $$19 = $$0.a($$17, $$18);
                if (bel.b($$19) == 0) {
                    $$0.b($$17, $$18, bel.f(0, $$3[TextureUtil.pack($$17, $$18, $$1)]));
                    continue;
                }
                $$0.b($$17, $$18, $$19);
            }
        }
    }

    public static void fillEmptyAreasWithDarkColor(fyh $$0) {
        int $$1 = $$0.a();
        int $$2 = $$0.b();
        int $$3 = -1;
        int $$4 = Integer.MAX_VALUE;
        for (int $$5 = 0; $$5 < $$1; ++$$5) {
            for (int $$6 = 0; $$6 < $$2; ++$$6) {
                int $$11;
                int $$10;
                int $$9;
                int $$12;
                int $$7 = $$0.a($$5, $$6);
                int $$8 = bel.b($$7);
                if ($$8 == 0 || ($$12 = ($$9 = bel.c($$7)) + ($$10 = bel.d($$7)) + ($$11 = bel.e($$7))) >= $$4) continue;
                $$4 = $$12;
                $$3 = $$7;
            }
        }
        int $$13 = 3 * bel.c($$3) / 4;
        int $$14 = 3 * bel.d($$3) / 4;
        int $$15 = 3 * bel.e($$3) / 4;
        int $$16 = bel.b(0, $$13, $$14, $$15);
        for (int $$17 = 0; $$17 < $$1; ++$$17) {
            for (int $$18 = 0; $$18 < $$2; ++$$18) {
                int $$19 = $$0.a($$17, $$18);
                if (bel.b($$19) != 0) continue;
                $$0.b($$17, $$18, $$16);
            }
        }
    }

    private static int pack(int $$0, int $$1, int $$2) {
        return $$0 + $$1 * $$2;
    }

    private static int x(int $$0, int $$1) {
        return $$0 % $$1;
    }

    private static int y(int $$0, int $$1) {
        return $$0 / $$1;
    }
}

