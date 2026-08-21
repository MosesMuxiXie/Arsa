/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FreeType
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;

public record gom(amo c, float d, float e, a f, String g) implements goj
{
    private static final Codec<String> h = Codec.withAlternative((Codec)Codec.STRING, (Codec)Codec.STRING.listOf(), $$0 -> String.join((CharSequence)"", $$0));
    public static final MapCodec<gom> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("file").forGetter(gom::c), (App)Codec.FLOAT.optionalFieldOf("size", (Object)Float.valueOf(11.0f)).forGetter(gom::d), (App)Codec.FLOAT.optionalFieldOf("oversample", (Object)Float.valueOf(1.0f)).forGetter(gom::e), (App)gom$a.b.optionalFieldOf("shift", (Object)gom$a.a).forGetter(gom::f), (App)h.optionalFieldOf("skip", (Object)"").forGetter(gom::g)).apply((Applicative)$$0, gom::new));

    @Override
    public gok a() {
        return gok.b;
    }

    @Override
    public Either<goj.b, goj.c> b() {
        return Either.left(this::a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private fwq a(baz $$0) throws IOException {
        FT_Face $$1 = null;
        ByteBuffer $$2 = null;
        try (InputStream $$3 = $$0.open(this.c.f("font/"));){
            $$2 = TextureUtil.readResource($$3);
            Object object = goi.a;
            synchronized (object) {
                try (MemoryStack $$4 = MemoryStack.stackPush();){
                    PointerBuffer $$5 = $$4.mallocPointer(1);
                    goi.a(FreeType.FT_New_Memory_Face((long)goi.a(), (ByteBuffer)$$2, (long)0L, (PointerBuffer)$$5), "Initializing font face");
                    $$1 = FT_Face.create((long)$$5.get());
                }
                String $$6 = FreeType.FT_Get_Font_Format((FT_Face)$$1);
                if (!"TrueType".equals($$6)) {
                    throw new IOException("Font is not in TTF format, was " + $$6);
                }
                goi.a(FreeType.FT_Select_Charmap((FT_Face)$$1, (int)FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
                fws fws2 = new fws($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
                return fws2;
            }
        }
        catch (Exception $$7) {
            Object object = goi.a;
            synchronized (object) {
                if ($$1 != null) {
                    FreeType.FT_Done_Face($$1);
                }
            }
            MemoryUtil.memFree((Buffer)$$2);
            throw $$7;
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gom.class, "location;size;oversample;shift;skip", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gom.class, "location;size;oversample;shift;skip", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gom.class, "location;size;oversample;shift;skip", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public static final class a
    extends Record {
        final float c;
        final float d;
        public static final a a = new a(0.0f, 0.0f);
        public static final Codec<a> b = Codec.floatRange((float)-512.0f, (float)512.0f).listOf().comapFlatMap($$02 -> bhs.a($$02, 2).map($$0 -> new a(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue())), $$0 -> List.of(Float.valueOf($$0.c), Float.valueOf($$0.d)));

        public a(float $$0, float $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "x;y", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "x;y", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "x;y", "c", "d"}, this, $$0);
        }

        public float a() {
            return this.c;
        }

        public float b() {
            return this.d;
        }
    }
}

