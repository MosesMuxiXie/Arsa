/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Bitmap
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FT_GlyphSlot
 *  org.lwjgl.util.freetype.FT_Vector
 *  org.lwjgl.util.freetype.FreeType
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public class fws
implements fwq {
    private @Nullable ByteBuffer b;
    private @Nullable FT_Face c;
    final float d;
    private final gnn<b> e = new gnn(b[]::new, $$0 -> new b[$$0][]);

    public fws(ByteBuffer $$02, FT_Face $$1, float $$2, float $$3, float $$4, float $$5, String $$6) {
        this.b = $$02;
        this.c = $$1;
        this.d = $$3;
        IntArraySet $$7 = new IntArraySet();
        $$6.codePoints().forEach(arg_0 -> ((IntSet)$$7).add(arg_0));
        int $$8 = Math.round($$2 * $$3);
        FreeType.FT_Set_Pixel_Sizes((FT_Face)$$1, (int)$$8, (int)$$8);
        float $$9 = $$4 * $$3;
        float $$10 = -$$5 * $$3;
        try (MemoryStack $$11 = MemoryStack.stackPush();){
            int $$15;
            FT_Vector $$12 = goi.a(FT_Vector.malloc((MemoryStack)$$11), $$9, $$10);
            FreeType.FT_Set_Transform((FT_Face)$$1, null, (FT_Vector)$$12);
            IntBuffer $$13 = $$11.mallocInt(1);
            int $$14 = (int)FreeType.FT_Get_First_Char((FT_Face)$$1, (IntBuffer)$$13);
            while (($$15 = $$13.get(0)) != 0) {
                if (!$$7.contains($$14)) {
                    this.e.a($$14, new b($$15));
                }
                $$14 = (int)FreeType.FT_Get_Next_Char((FT_Face)$$1, (long)$$14, (IntBuffer)$$13);
            }
        }
    }

    @Override
    public @Nullable fwt a(int $$0) {
        b $$1 = this.e.a($$0);
        return $$1 != null ? this.a($$0, $$1) : null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private fwt a(int $$0, b $$1) {
        fwt $$2 = $$1.b;
        if ($$2 == null) {
            FT_Face $$3;
            FT_Face fT_Face = $$3 = this.b();
            synchronized (fT_Face) {
                $$2 = $$1.b;
                if ($$2 == null) {
                    $$1.b = $$2 = this.a($$0, $$3, $$1.a);
                }
            }
        }
        return $$2;
    }

    private fwt a(int $$0, FT_Face $$1, int $$2) {
        FT_GlyphSlot $$4;
        int $$3 = FreeType.FT_Load_Glyph((FT_Face)$$1, (int)$$2, (int)0x400008);
        if ($$3 != 0) {
            goi.a($$3, String.format(Locale.ROOT, "Loading glyph U+%06X", $$0));
        }
        if (($$4 = $$1.glyph()) == null) {
            throw new NullPointerException(String.format(Locale.ROOT, "Glyph U+%06X not initialized", $$0));
        }
        float $$5 = goi.a($$4.advance());
        FT_Bitmap $$6 = $$4.bitmap();
        int $$7 = $$4.bitmap_left();
        int $$8 = $$4.bitmap_top();
        int $$9 = $$6.width();
        int $$10 = $$6.rows();
        if ($$9 <= 0 || $$10 <= 0) {
            return new god($$5 / this.d);
        }
        return new a($$7, $$8, $$9, $$10, $$5, $$2);
    }

    FT_Face b() {
        if (this.b == null || this.c == null) {
            throw new IllegalStateException("Provider already closed");
        }
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        if (this.c != null) {
            Object object = goi.a;
            synchronized (object) {
                goi.b(FreeType.FT_Done_Face((FT_Face)this.c), "Deleting face");
            }
            this.c = null;
        }
        MemoryUtil.memFree((Buffer)this.b);
        this.b = null;
    }

    @Override
    public IntSet a() {
        return this.e.b();
    }

    static class b {
        final int a;
        volatile @Nullable fwt b;

        b(int $$0) {
            this.a = $$0;
        }
    }

    class a
    implements fwt {
        final int b;
        final int c;
        final float d;
        final float e;
        private final fwp f;
        final int g;

        a(float $$0, float $$1, int $$2, int $$3, float $$4, int $$5) {
            this.b = $$2;
            this.c = $$3;
            this.f = fwp.a($$4 / fws.this.d);
            this.d = $$0 / fws.this.d;
            this.e = $$1 / fws.this.d;
            this.g = $$5;
        }

        @Override
        public fwp a() {
            return this.f;
        }

        @Override
        public goa a(fwt.a $$0) {
            return $$0.a(this.f, new fwo(){

                @Override
                public int a() {
                    return a.this.b;
                }

                @Override
                public int b() {
                    return a.this.c;
                }

                @Override
                public float d() {
                    return fws.this.d;
                }

                @Override
                public float i() {
                    return a.this.d;
                }

                @Override
                public float j() {
                    return a.this.e;
                }

                @Override
                public void a(int $$0, int $$1, GpuTexture $$2) {
                    FT_Face $$3 = fws.this.b();
                    try (fyh $$4 = new fyh(fyh.a.d, a.this.b, a.this.c, false);){
                        if ($$4.a($$3, a.this.g)) {
                            RenderSystem.getDevice().createCommandEncoder().writeToTexture($$2, $$4, 0, 0, $$0, $$1, a.this.b, a.this.c, 0, 0);
                        }
                    }
                }

                @Override
                public boolean c() {
                    return false;
                }
            });
        }
    }
}

