/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import java.util.function.Supplier;
import org.joml.Matrix4f;

public class iju {
    public static final double a = 8.0;
    private final String f;
    private final Supplier<Matrix4f> g;
    public static final iju b = new iju("default_texturing", Matrix4f::new);
    public static final iju c = new iju("glint_texturing", () -> iju.a(8.0f));
    public static final iju d = new iju("entity_glint_texturing", () -> iju.a(0.5f));
    public static final iju e = new iju("armor_entity_glint_texturing", () -> iju.a(0.16f));

    public iju(String $$0, Supplier<Matrix4f> $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public Matrix4f a() {
        return this.g.get();
    }

    public String toString() {
        return "TexturingStateShard[" + this.f + "]";
    }

    private static Matrix4f a(float $$0) {
        long $$1 = (long)((double)bhs.c() * gfj.V().k.aE().b() * 8.0);
        float $$2 = (float)($$1 % 110000L) / 110000.0f;
        float $$3 = (float)($$1 % 30000L) / 30000.0f;
        Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0f);
        $$4.rotateZ(0.17453292f).scale($$0);
        return $$4;
    }

    public static final class a
    extends iju {
        public a(float $$0, float $$1) {
            super("offset_texturing", () -> new Matrix4f().translation($$0, $$1, 0.0f));
        }
    }
}

