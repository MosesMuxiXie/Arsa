/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.vertex.VertexFormat;
import org.jspecify.annotations.Nullable;

public class fzo {
    private static final int a = 786432;
    private final fzi b;
    private static @Nullable fzo c;

    public static void a() {
        if (c != null) {
            throw new IllegalStateException("Tesselator has already been initialized");
        }
        c = new fzo();
    }

    public static fzo b() {
        if (c == null) {
            throw new IllegalStateException("Tesselator has not been initialized");
        }
        return c;
    }

    public fzo(int $$0) {
        this.b = new fzi($$0);
    }

    public fzo() {
        this(786432);
    }

    public fzh a(VertexFormat.b $$0, VertexFormat $$1) {
        return new fzh(this.b, $$0, $$1);
    }

    public void c() {
        this.b.b();
    }
}

